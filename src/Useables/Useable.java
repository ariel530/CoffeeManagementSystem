/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Useables;

import ModalClasses.*;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author SSC
 */
public class Useable {

    public static User currentUser = null;
    public static ArrayList<Cart> cart = new ArrayList<>();

    public static void ShowSuccessErrorMessage(String message, String heading, int errorType) {
        JOptionPane.showConfirmDialog(null, message, heading, JOptionPane.DEFAULT_OPTION, errorType);
    }

    public static void makeImageFixToScreen(String location, JLabel label, int width, int height) {
        ImageIcon icon = new ImageIcon(location);
        Image img = icon.getImage();

        Image imgScale = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        label.setIcon(scaledIcon);

    }

}
