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
public class Menu {

    private int id;
    private String name;
    private double smallSizePrice;
    private double mediumSizePrice;
    private double largeSizePrice;
    private String imagePath;
    private int itemCategoryId;

    public Menu() {
    }

    
    public Menu(int id, String name, double smallSizePrice, double mediumSizePrice, double largeSizePrice, String imagePath, int itemCategoryId) {
        this.id = id;
        this.name = name;
        this.smallSizePrice = smallSizePrice;
        this.mediumSizePrice = mediumSizePrice;
        this.largeSizePrice = largeSizePrice;
        this.imagePath = imagePath;
        this.itemCategoryId = itemCategoryId;
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

    public double getSmallSizePrice() {
        return smallSizePrice;
    }

    public void setSmallSizePrice(double smallSizePrice) {
        this.smallSizePrice = smallSizePrice;
    }

    public double getMediumSizePrice() {
        return mediumSizePrice;
    }

    public void setMediumSizePrice(double mediumSizePrice) {
        this.mediumSizePrice = mediumSizePrice;
    }

    public double getLargeSizePrice() {
        return largeSizePrice;
    }

    public void setLargeSizePrice(double largeSizePrice) {
        this.largeSizePrice = largeSizePrice;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getItemCategoryId() {
        return itemCategoryId;
    }

    public void setItemCategoryId(int itemCategoryId) {
        this.itemCategoryId = itemCategoryId;
    }

    
    
}
