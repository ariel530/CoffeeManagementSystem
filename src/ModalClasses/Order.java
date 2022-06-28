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
public class Order {

    private int id;
    private String name;
    private double totalPrice;
    private String Date;

    public Order() {
    }

    public Order(int id, String name, double totalPrice, String Date) {
        this.id = id;
        this.name = name;
        this.totalPrice = totalPrice;
        this.Date = Date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

}
