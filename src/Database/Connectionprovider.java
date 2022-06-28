/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.*;

/**
 *
 * @author Hanas
 */
public class Connectionprovider {
    
    private static Connection con=null;
      public static Connection getCon(){
        try{
             Class.forName("org.apache.derby.jdbc.ClientDriver");
             con=DriverManager.getConnection("jdbc:derby://localhost:1527/COFFEESHOP","coffeeshop","coffeeshop");
            return con;
        }
        catch(Exception e){
            return null;
        }
    }
      
      public static void closeConnection()
      {
          try {
              con.close();
          } catch (Exception e) {
          }
      }
}
