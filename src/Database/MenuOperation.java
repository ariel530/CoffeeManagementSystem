/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import ModalClasses.Customer;
import ModalClasses.Employee;
import ModalClasses.ItemCategory;
import ModalClasses.Menu;
import ModalClasses.User;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Hanas
 */
public class MenuOperation {

    public static int insertMenuData(Menu menu) {
        int insertedRows = -1;
        try {
            String query = "insert into menu values (default,'" + menu.getName() + "'," + menu.getSmallSizePrice() + "," + menu.getMediumSizePrice() + "," + menu.getLargeSizePrice() + ",'" + menu.getImagePath() + "'," + menu.getItemCategoryId() + ")";
            insertedRows = DBOperations.setDataOrDelete(query);
            Connectionprovider.closeConnection();
        } catch (Exception exc) {
            System.err.println("Insert Menu  :  " + exc.getMessage());
        }
        return insertedRows;
    }

    public static ArrayList<Menu> getAlIMenu() {
        ArrayList<Menu> data = new ArrayList<Menu>();
        try {
            String query = "select * from menu";
            ResultSet rst = DBOperations.getData(query);
            if (rst != null) {
                while (rst.next()) {
                    data.add(new Menu(rst.getInt(1), rst.getString(2), rst.getDouble(3), rst.getDouble(4), rst.getDouble(5), rst.getString(6), rst.getInt(7)));
                }
            }
            Connectionprovider.closeConnection();
        } catch (Exception exc) {
            System.err.println("Get All Menu :  " + exc.getMessage());
        }
        return data;
    }

    public static ArrayList<Menu> getAlIMenuByItemCategort(int itemCategoryId) {
        ArrayList<Menu> data = new ArrayList<Menu>();
        try {
            String query = "select * from menu where ITEMCATEGORYID=" + itemCategoryId;
            ResultSet rst = DBOperations.getData(query);
            if (rst != null) {
                while (rst.next()) {
                    data.add(new Menu(rst.getInt(1), rst.getString(2), rst.getDouble(3), rst.getDouble(4), rst.getDouble(5), rst.getString(6), rst.getInt(7)));
                }
            }
            Connectionprovider.closeConnection();
        } catch (Exception exc) {
            System.err.println("Get All Menu :  " + exc.getMessage());
        }
        return data;
    }

    public static Menu getSpecificMenu(int id) {
        Menu data = new Menu();
        try {
            String query = "select * from menu where id=" + id;
            ResultSet rst = DBOperations.getData(query);
            if (rst != null) {
                while (rst.next()) {
                    data = (new Menu(rst.getInt(1), rst.getString(2), rst.getDouble(3), rst.getDouble(4), rst.getDouble(5), rst.getString(6), rst.getInt(7)));
                }
            }
            Connectionprovider.closeConnection();
        } catch (Exception exc) {
            System.err.println("Get All Menu :  " + exc.getMessage());
        }
        return data;
    }

//    public static void saveDrinks(Drinks Drink,int Quantity, double DrinkTotal,String Username)
//    {
//        String query="insert into Drink(User_Name, Drink_Name, Ice, Price,Quantity,Total) values('"+Username+"','"+Drink.getName()+"','"+Drink.getIce()+"',"+Drink.getPrice()+","+Quantity+","+DrinkTotal+")";
//        DBOperations.setDataOrDelete(query, "Drink Added  Successfully! ");
//    }
//     public static void saveSweet(Sweets sweet,int Quantity, double sweetTotal,String Username)
//    {
//        String query="insert into Sweet(User_Name, Sweet_Name, Fruit, Price,Quantity,Total) values('"+Username+"','"+sweet.getName()+"','"+sweet.getFruitUsed()+"',"+sweet.getPrice()+","+Quantity+","+sweetTotal+")";
//        DBOperations.setDataOrDelete(query, "Sweet Added  Successfully! ");
//    }
//
//    public static ResultSet FillComboBox() {
//        String query = "select NAME,CATEGORY from Items";
//        ResultSet rs = DBOperations.getData(query);
//        return rs;
//    }
//
//    public static void insertOrder(String username, Date date) {
//        String query = "Insert into Orders (CustomerUserName, Orderdate) Values ('" + username + "','" + date + "')";
//        DBOperations.setDataOrDelete(query, "");
//    }
//
//    public static void insertOrderItem(int orderid, int itemid, int quantity) {
//        String query = "Insert into OrderItem (Order_ID,Item_ID,Quantity) Values (" + orderid + "," + itemid + "," + quantity + ")";
//        DBOperations.setDataOrDelete(query, "Item Added Successfully!");
//    }
//
//    public static ResultSet GetItem(String ItemName) {
//        String query = "Select ItemID,PRICE from Items where NAME='" + ItemName + "'";
//        ResultSet rs = DBOperations.getData(query);
//
//        return rs;
//    }
}
