/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import ModalClasses.*;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author SSC
 */
public class ItemCategoryOperations {

    public static ArrayList<ItemCategory> getAllItemCategory() {
        ArrayList<ItemCategory> data = new ArrayList<ItemCategory>();
        try {
            String query = "select * from itemcategory";
            ResultSet rst = DBOperations.getData(query);
            if (rst != null) {
                while (rst.next()) {
                    data.add(new ItemCategory(rst.getInt(1), rst.getString(2)));

                }
            }
            Connectionprovider.closeConnection();
        } catch (Exception exc) {
            System.err.println("Get All Item Category :  " + exc.getMessage());
        }
        return data;
    }

    public static ItemCategory getItemCategoryById(int id) {
        ItemCategory data = new ItemCategory();
        try {
            String query = "select * from itemcategory where id=" + id;
            ResultSet rst = DBOperations.getData(query);
            if (rst != null) {
                while (rst.next()) {
                    data = (new ItemCategory(rst.getInt(1), rst.getString(2)));
                }
            }
            Connectionprovider.closeConnection();
        } catch (Exception exc) {
            System.err.println("Ge Item Category By Id :  " + exc.getMessage());
        }
        return data;
    }

    public static ItemCategory getItemCategoryByName(String name) {
        ItemCategory data = new ItemCategory();
        try {
            String query = "select * from itemcategory where name='" + name + "'";
            ResultSet rst = DBOperations.getData(query);
            if (rst != null) {
                while (rst.next()) {
                    data = (new ItemCategory(rst.getInt(1), rst.getString(2)));
                }
            }
            Connectionprovider.closeConnection();
        } catch (Exception exc) {
            System.err.println("Ge Item Category By Id :  " + exc.getMessage());
        }
        return data;
    }
}
