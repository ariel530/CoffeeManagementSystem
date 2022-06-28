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
public class Payment {

    private int id;
    private int orderId;
    private String cardNumber;
    private String ccvNumber;
    private String expMonth;
    private String expYear;

    public Payment() {
    }

    public Payment(int id, int orderId, String cardNumber, String ccvNumber, String expMonth, String expYear) {
        this.id = id;
        this.orderId = orderId;
        this.cardNumber = cardNumber;
        this.ccvNumber = ccvNumber;
        this.expMonth = expMonth;
        this.expYear = expYear;
    }

    
    public Payment(int id, String cardNumber, String ccvNumber, String expMonth, String expYear) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.ccvNumber = ccvNumber;
        this.expMonth = expMonth;
        this.expYear = expYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCcvNumber() {
        return ccvNumber;
    }

    public void setCcvNumber(String ccvNumber) {
        this.ccvNumber = ccvNumber;
    }

    public String getExpMonth() {
        return expMonth;
    }

    public void setExpMonth(String expMonth) {
        this.expMonth = expMonth;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    

    public String getExpYear() {
        return expYear;
    }

    public void setExpYear(String expYear) {
        this.expYear = expYear;
    }

}
