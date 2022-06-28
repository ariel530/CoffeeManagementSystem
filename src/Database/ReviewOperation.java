/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import ModalClasses.Review;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author SSC
 */
public class ReviewOperation {

    public static int insertReviewData(int orderId, String menuReview, String deliveryReview, String applicationReview, String notes) {
        int insertedRows = -1;
        try {
            String query = "insert into REVIEWS values (default," + orderId + ",'" + menuReview + "','" + deliveryReview + "','" + applicationReview + "','" + notes + "')";
            insertedRows = DBOperations.setDataOrDelete(query);
            Connectionprovider.closeConnection();
        } catch (Exception exc) {
            System.err.println("Insert Review  :  " + exc.getMessage());
        }
        return insertedRows;
    }

    public static ArrayList<Review> getAlIReviewsByCurrentUser() {
        ArrayList<Review> data = new ArrayList<Review>();
        try {
            String query = "select * from REVIEWS where ORDERID in (select ID from orders where USERNAME='" + Useables.Useable.currentUser.getUsername() + "')";
            ResultSet rst = DBOperations.getData(query);
            if (rst != null) {
                while (rst.next()) {
                    data.add(new Review(rst.getInt(1), rst.getInt(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6)));
                }
            }
            Connectionprovider.closeConnection();
        } catch (Exception exc) {
            System.err.println("Get All Reviews :  " + exc.getMessage());
        }
        return data;
    }

    public static ArrayList<Review> getAlIReviews() {
        ArrayList<Review> data = new ArrayList<Review>();
        try {
            String query = "select * from REVIEWS";
            ResultSet rst = DBOperations.getData(query);
            if (rst != null) {
                while (rst.next()) {
                    data.add(new Review(rst.getInt(1), rst.getInt(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6)));
                }
            }
            Connectionprovider.closeConnection();
        } catch (Exception exc) {
            System.err.println("Get All Reviews :  " + exc.getMessage());
        }
        return data;
    }
}
