/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import ModalClasses.Cart;
import ModalClasses.Customer;
import ModalClasses.HomeDelivery;
import ModalClasses.Menu;
import ModalClasses.Order;
import ModalClasses.Payment;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author SSC
 */
public class OrderPaymentOperation {

    public static int insertPaymentData(Payment payment) {
        int insertedRows = -1;
        int orderId = insertOrderCartDetails();
        if (orderId <= 0) {
            return orderId;
        }
        try {
            String address="";
            if(payment.getClass().getSimpleName().equals("HomeDelivery"))
            {
                address=((HomeDelivery)(payment)).getAddress();
            }
            String query = "insert into ORDERPAYMENT values (default," + orderId + ",'" + payment.getCardNumber() + "','" + payment.getCcvNumber() + "','" + payment.getExpMonth() + "','" + payment.getExpYear() + "','" +address + "')";
            insertedRows = DBOperations.setDataOrDelete(query);
            Connectionprovider.closeConnection();
        } catch (Exception exc) {
            System.err.println("Insert Customer  :  " + exc.getMessage());
        }
        return orderId;
    }

    public static double calculateTotalCartPrice() {
        double total = 0;
        for (Cart temp : Useables.Useable.cart) {
            total += temp.getPrice();
        }
        return total;
    }

    public static int insertOrderDetails() {
        int insertedRows = -1;
        try {
            String query = "insert into ORDERS values(default,'" + Useables.Useable.currentUser.getUsername() + "'," + calculateTotalCartPrice() + ",'" + new Date(new java.util.Date().getTime()).toString() + "')";
            insertedRows = DBOperations.setDataOrDelete(query);
            Connectionprovider.closeConnection();

            insertedRows = getMaxOrderId();
        } catch (Exception e) {
            System.out.println("Insert Order Error :  " + e.getMessage());
        }
        return insertedRows;
    }

    public static int getMaxOrderId() {
        int orderId = -1;
        try {
            String query = "select max(Id) from orders";

            ResultSet rst = DBOperations.getData(query);
            while (rst.next()) {
                orderId = rst.getInt(1);
            }
            Connectionprovider.closeConnection();
        } catch (SQLException e) {
            System.out.println("Get Max Order Id Error :  " + e.getMessage());
        }
        return orderId;
    }

    public static int insertOrderCartDetails() {
        int orderId = -1;
        try {
            orderId = insertOrderDetails();
            if (orderId == -1) {
                return orderId;
            }
            for (Cart cart : Useables.Useable.cart) {
                String query = "insert into ORDERDETAILS values(default," + orderId + "," + cart.getMenu().getId() + "," + cart.getQty() + ",'" + cart.getSize() + "'," + cart.getPrice() + ")";
                DBOperations.setDataOrDelete(query);
                Connectionprovider.closeConnection();

            }

        } catch (Exception e) {
            System.out.println("Insert Order Cart Error :  " + e.getMessage());
        }
        return orderId;
    }

    public static ArrayList<Order> getAlIOrder() {
        ArrayList<Order> data = new ArrayList<Order>();
        try {
            String query = "select * from ORDERS";
            ResultSet rst = DBOperations.getData(query);
            if (rst != null) {
                while (rst.next()) {
                    data.add(new Order(rst.getInt(1), rst.getString(2), rst.getDouble(3), rst.getString(4)));
                }
            }
            Connectionprovider.closeConnection();
        } catch (Exception exc) {
            System.err.println("Get All Order :  " + exc.getMessage());
        }
        return data;
    }

    public static ArrayList<Order> getAlIOrderForCurrentUser() {
        ArrayList<Order> data = new ArrayList<Order>();
        try {
            String query = "select * from ORDERS where USERNAME='" + Useables.Useable.currentUser.getUsername() + "'";
            ResultSet rst = DBOperations.getData(query);
            if (rst != null) {
                while (rst.next()) {
                    data.add(new Order(rst.getInt(1), rst.getString(2), rst.getDouble(3), rst.getString(4)));
                }
            }
            Connectionprovider.closeConnection();
        } catch (Exception exc) {
            System.err.println("Get All Order For Current User :  " + exc.getMessage());
        }
        return data;
    }

    public static ArrayList<Cart> getOrderDetailByOrderId(int orderId) {
        ArrayList<Cart> data = new ArrayList<Cart>();
        try {
            String query = "select * from ORDERDETAILS where ORDERID=" + orderId;
            ResultSet rst = DBOperations.getData(query);
            if (rst != null) {
                while (rst.next()) {

                    data.add(new Cart(rst.getInt(1), MenuOperation.getSpecificMenu(rst.getInt(3)), rst.getString(5), rst.getInt(4), rst.getDouble(6)));
                }
            }
            Connectionprovider.closeConnection();
        } catch (Exception exc) {
            System.err.println("Get All Order :  " + exc.getMessage());
        }
        return data;
    }

}
