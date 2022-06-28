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
public class ShopDelivery extends Payment{

    public ShopDelivery() {
    }

    public ShopDelivery(int id, int orderId, String cardNumber, String ccvNumber, String expMonth, String expYear) {
        super(id, orderId, cardNumber, ccvNumber, expMonth, expYear);
    }

    public ShopDelivery(int id, String cardNumber, String ccvNumber, String expMonth, String expYear) {
        super(id, cardNumber, ccvNumber, expMonth, expYear);
    }
    
}
