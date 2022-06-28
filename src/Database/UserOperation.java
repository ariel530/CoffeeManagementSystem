package Database;

import ModalClasses.*;
import java.sql.*;

public class UserOperation {

    public static User getUserInfoByUsername(String username) {
        User data = null;
        try {
            String query = "select * from users where username = '" + username + "'";
            ResultSet rst = DBOperations.getData(query);
            if (rst != null) {
                while (rst.next()) {
                    if (rst.getString("USERTYPE").equals("CUSTOMER")) {
                        data = (new Customer(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5)));
                    } else {
                        data = (new Employee(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getDouble(6)));
                    }

                }
            }
            Connectionprovider.closeConnection();
        } catch (Exception exc) {
            System.err.println("Get User Info Username :  " + exc.getMessage());
        }
        return data;
    }

    public static User getAndValidateUserInfo(String username, String password) {
        User data = null;
        try {
            String query = "select * from users where username = '" + username + "' and password = '" + password + "'";
            ResultSet rst = DBOperations.getData(query);
            if (rst != null) {
                while (rst.next()) {
                    if (rst.getString("USERTYPE").equals("CUSTOMER")) {
                        data = (new Customer(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5)));
                    } else {
                        data = (new Employee(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5),0));
                    }

                }
            }
            Connectionprovider.closeConnection();
        } catch (Exception exc) {
            System.err.println("Get User Info Username :  " + exc.getMessage());
        }
        return data;
    }

    public static int insertCustomerData(Customer customer) {
        int insertedRows = -1;
        try {
            String query = "insert into users values ('" + customer.getUsername() + "','" + customer.getPassword() + "','" + customer.getFirstName() + "','" + customer.getLastName() + "','" + customer.getAddress() + "','" + customer.getUserType() + "',0)";
            insertedRows = DBOperations.setDataOrDelete(query);
            Connectionprovider.closeConnection();
        } catch (Exception exc) {
            System.err.println("Insert Customer  :  " + exc.getMessage());
        }
        return insertedRows;
    }
}
