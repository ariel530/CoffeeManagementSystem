/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import Database.DBOperations;
import Database.ItemCategoryOperations;
import Database.MenuOperation;
import ModalClasses.ItemCategory;
import ModalClasses.Menu;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author SSC
 */
public class AddItemForm extends javax.swing.JFrame {

    /**
     * Creates new form AddItemForm
     */
    private ArrayList<ItemCategory> itemCategorys = new ArrayList<>();
    private String imageName = "";

    public AddItemForm() {
        initComponents();
        Useables.Useable.makeImageFixToScreen("src//Images//background.jpg", backgroundImage, backgroundImage.getWidth(), backgroundImage.getHeight() + 1000);

        itemCategoryCombobox.removeAllItems();
        itemCategorys = ItemCategoryOperations.getAllItemCategory();
        if (itemCategorys.isEmpty()) {
            Useables.Useable.ShowSuccessErrorMessage("Item Category Required To Add Item", "Item Category Required", JOptionPane.ERROR_MESSAGE);
            this.dispose();
            new AdminHome().setVisible(true);
        } else {
            for (ItemCategory items : itemCategorys) {
                itemCategoryCombobox.addItem(items.getName());
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        reviewsButton = new javax.swing.JButton();
        orderButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        menuButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        menuImage = new javax.swing.JLabel();
        Category = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        smallSizePrice = new javax.swing.JTextField();
        mendiumSizePrize = new javax.swing.JTextField();
        largeSizePrize = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        menuName = new javax.swing.JTextField();
        chooseImageButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        itemCategoryCombobox = new javax.swing.JComboBox<>();
        addItemButton = new javax.swing.JButton();
        backgroundImage = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Menu");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        reviewsButton.setBackground(new java.awt.Color(255, 255, 255));
        reviewsButton.setForeground(Color.BLACK);
        reviewsButton.setText("Review");
        reviewsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reviewsButtonActionPerformed(evt);
            }
        });

        orderButton.setBackground(new java.awt.Color(255, 255, 255));
        orderButton.setText("Order");
        orderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderButtonActionPerformed(evt);
            }
        });

        logoutButton.setBackground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        homeButton.setBackground(new java.awt.Color(255, 255, 255));
        homeButton.setText("Home");
        homeButton.setToolTipText("");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        menuButton.setBackground(new java.awt.Color(255, 255, 255));
        menuButton.setForeground(Color.BLACK);
        menuButton.setText("Menu");
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 317, Short.MAX_VALUE)
                .addComponent(menuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(reviewsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutButton)
                .addGap(22, 22, 22))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoutButton)
                    .addComponent(homeButton)
                    .addComponent(reviewsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(orderButton)
                    .addComponent(menuButton))
                .addGap(77, 77, 77))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 50));

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 70)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(135, 103, 82));
        jLabel1.setText("ADD MENU");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        menuImage.setText("                MENU IMAGE");
        getContentPane().add(menuImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 150, 150));

        Category.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        Category.setText("Name:");
        Category.setToolTipText("Login");
        getContentPane().add(Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Size Price", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 1, 24))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel4.setText("Medium");
        jLabel4.setToolTipText("Login");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 92, -1));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel5.setText("Small ");
        jLabel5.setToolTipText("Login");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 81, -1));

        smallSizePrice.setToolTipText("Login");
        smallSizePrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smallSizePriceActionPerformed(evt);
            }
        });
        jPanel2.add(smallSizePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 62, 30));

        mendiumSizePrize.setToolTipText("Login");
        mendiumSizePrize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mendiumSizePrizeActionPerformed(evt);
            }
        });
        jPanel2.add(mendiumSizePrize, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 62, 30));

        largeSizePrize.setToolTipText("Login");
        largeSizePrize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                largeSizePrizeActionPerformed(evt);
            }
        });
        jPanel2.add(largeSizePrize, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 62, 30));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel8.setText("Large");
        jLabel8.setToolTipText("Login");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 72, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 310, 110));

        menuName.setToolTipText("Login");
        menuName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNameActionPerformed(evt);
            }
        });
        getContentPane().add(menuName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 210, 30));

        chooseImageButton.setBackground(new java.awt.Color(255, 255, 255));
        chooseImageButton.setForeground(Color.BLACK);
        chooseImageButton.setText("Choose Image");
        chooseImageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseImageButtonActionPerformed(evt);
            }
        });
        getContentPane().add(chooseImageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 120, -1));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel9.setText("Name:");
        jLabel9.setToolTipText("Login");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        itemCategoryCombobox.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        itemCategoryCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(itemCategoryCombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 220, -1));

        addItemButton.setBackground(new java.awt.Color(255, 255, 255));
        addItemButton.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        addItemButton.setForeground(Color.BLACK);
        addItemButton.setText("Add Menu");
        addItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addItemButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 140, 30));

        backgroundImage.setText("jLabel3");
        getContentPane().add(backgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 700, 490));

        jLabel13.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 51, 51));
        jLabel13.setText("Note* : Price with 0 considered not available");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        jLabel22.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(135, 103, 82));
        jLabel22.setText("Coffee House ");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void reviewsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reviewsButtonActionPerformed
        // TODO add your handling code here:
        ViewAllReviewsForm viewAllReviewsForm = new ViewAllReviewsForm();
        this.setVisible(false);
        viewAllReviewsForm.setVisible(true);
    }//GEN-LAST:event_reviewsButtonActionPerformed

    private void orderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        OrdersHistoryForAdminForm ordersHistoryForm = new OrdersHistoryForAdminForm();
        ordersHistoryForm.setVisible(true);
    }//GEN-LAST:event_orderButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        this.setVisible(false);
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        AdminHome home = new AdminHome();
        home.setVisible(true);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ViewMenuItemsForm itemsForm = new ViewMenuItemsForm();
        itemsForm.setVisible(true);
    }//GEN-LAST:event_menuButtonActionPerformed

    private void smallSizePriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smallSizePriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_smallSizePriceActionPerformed

    private void menuNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuNameActionPerformed

    private void largeSizePrizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_largeSizePrizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_largeSizePrizeActionPerformed

    private void mendiumSizePrizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mendiumSizePrizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mendiumSizePrizeActionPerformed

    private void chooseImageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseImageButtonActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            File f = chooser.getSelectedFile();
            imageName = f.getAbsolutePath();
            Useables.Useable.makeImageFixToScreen(imageName, menuImage, menuImage.getWidth(), menuImage.getHeight());
            String date = new java.util.Date().toString().replace(' ', '_').replace(',', '_').replace(':', '_');
            imageName = "src\\images\\" + date + "_" + f.getName();
            File file = new File(imageName);
            BufferedImage image = ImageIO.read(f.getAbsoluteFile());
            ImageIO.write(image, f.getName().substring(f.getName().indexOf(".") + 1), file);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_chooseImageButtonActionPerformed

    public double getAndValidatePrice(String val, String errorFieldName) {
        double price = -1;
        try {
            price = Double.parseDouble(val);
            if (price < 0) {
                JOptionPane.showConfirmDialog(null, errorFieldName + " should be greater than 0", errorFieldName + " Error", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
                price = -1;
            }
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Enter valid " + errorFieldName, errorFieldName + " Error", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
        }
        return price;
    }

    private void addItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemButtonActionPerformed
        // TODO add your handling code here:
        if (menuName.getText().equals("")) {
            Useables.Useable.ShowSuccessErrorMessage("Menu Name required", "Menu Name Error", JOptionPane.ERROR_MESSAGE);
        } else if (getAndValidatePrice(smallSizePrice.getText(), "Small Size Price ") < 0 || getAndValidatePrice(mendiumSizePrize.getText(), "Medium Size Price ") < 0 || getAndValidatePrice(largeSizePrize.getText(), "Large Size Price ") < 0) {

        } else if ("".equals(imageName)) {
            Useables.Useable.ShowSuccessErrorMessage("Image required", "Image Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (MenuOperation.insertMenuData(new Menu(0, menuName.getText(), getAndValidatePrice(smallSizePrice.getText(), "Price"), getAndValidatePrice(mendiumSizePrize.getText(), "Price"), getAndValidatePrice(largeSizePrize.getText(), "Price"), imageName, itemCategorys.get(itemCategoryCombobox.getSelectedIndex()).getId())) > 0) {
                Useables.Useable.ShowSuccessErrorMessage("Menu Added Successful", "Insertion Successful", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                new ViewMenuItemsForm().setVisible(true);
            } else {
                Useables.Useable.ShowSuccessErrorMessage("Menu Not Added Successful", "Insertion Failed", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_addItemButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddItemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddItemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddItemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddItemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddItemForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Category;
    private javax.swing.JButton addItemButton;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JButton chooseImageButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JComboBox<String> itemCategoryCombobox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField largeSizePrize;
    private javax.swing.JButton logoutButton;
    private javax.swing.JTextField mendiumSizePrize;
    private javax.swing.JButton menuButton;
    private javax.swing.JLabel menuImage;
    private javax.swing.JTextField menuName;
    private javax.swing.JButton orderButton;
    private javax.swing.JButton reviewsButton;
    private javax.swing.JTextField smallSizePrice;
    // End of variables declaration//GEN-END:variables
}
