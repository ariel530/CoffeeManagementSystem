/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModalClasses;

/**
 *
 * @author SSC
 */
public class HomeDelivery extends Payment{
    private String address;

    public HomeDelivery( int id, int orderId, String cardNumber, String ccvNumber, String expMonth, String expYear,String address) {
        super(id, orderId, cardNumber, ccvNumber, expMonth, expYear);
        this.address = address;
    }

    public HomeDelivery( int id, String cardNumber, String ccvNumber, String expMonth, String expYear,String address) {
        super(id, cardNumber, ccvNumber, expMonth, expYear);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
   
    
    
    
} 
