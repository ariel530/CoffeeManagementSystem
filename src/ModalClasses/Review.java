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
public class Review {
    private int id;
    private int orderId;
    private String menuReview;
    private String deliveryMenu;
    private String applicationMenu;
    private String notes;

    public Review() {
    }

    public Review(int id, int orderId, String menuReview, String deliveryMenu, String applicationMenu, String notes) {
        this.id = id;
        this.orderId = orderId;
        this.menuReview = menuReview;
        this.deliveryMenu = deliveryMenu;
        this.applicationMenu = applicationMenu;
        this.notes = notes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getMenuReview() {
        return menuReview;
    }

    public void setMenuReview(String menuReview) {
        this.menuReview = menuReview;
    }

    public String getDeliveryMenu() {
        return deliveryMenu;
    }

    public void setDeliveryMenu(String deliveryMenu) {
        this.deliveryMenu = deliveryMenu;
    }

    public String getApplicationMenu() {
        return applicationMenu;
    }

    public void setApplicationMenu(String applicationMenu) {
        this.applicationMenu = applicationMenu;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    
    
}
