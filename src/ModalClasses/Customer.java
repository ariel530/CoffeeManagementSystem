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
public class Customer extends User{

    public Customer() {
    }

    public Customer(String username, String password, String firstName, String lastName, String address) {
        super(username, password, firstName, lastName, address, "CUSTOMER");
    }
    
    
    
}
