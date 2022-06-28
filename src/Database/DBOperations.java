/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Hanas
 */
public class DBOperations {

    public static int setDataOrDelete(String Query) {
        int updatedRow = -1;
        try {
            //call connection
            Connection con = Connectionprovider.getCon();
            Statement st = con.createStatement();
            updatedRow = st.executeUpdate(Query);
            //con.close();
        } catch (Exception e) {
            System.out.println("DB Operation Save Data: " + e.getMessage());
        }
        return updatedRow;
    }

    public static ResultSet getData(String query) {
        try {
            Connection con = Connectionprovider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
         //   con.close();
            return rs;
        } catch (Exception e) {
            System.out.println("DB Operation Get Data: " + e.getMessage());
            return null;
        }
    }

}
