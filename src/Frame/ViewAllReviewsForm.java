/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import Database.ReviewOperation;
import ModalClasses.Review;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author SSC
 */
public class ViewAllReviewsForm extends javax.swing.JFrame {

    /**
     * Creates new form ReviewsForm
     */
    
    ArrayList<Review> reviewData = new ArrayList<>();
    public ViewAllReviewsForm() {
        initComponents();
     Useables.Useable.makeImageFixToScreen("src//Images//treebg.jpg", backgroundImage, backgroundImage.getWidth(), backgroundImage.getHeight() + 1000);
        reviewData = ReviewOperation.getAlIReviews();
        viewOrderButton.setEnabled(false);
        displayTableData(reviewData);
    }

    void displayTableData(ArrayList<Review> reviews) {
        reviewTable.removeAll();
        Object[][] data = new Object[reviews.size()][];
        for (int i = 0; i < reviews.size(); i++) {
            data[i] = new Object[]{(i + 1),
                reviews.get(i).getOrderId(), reviews.get(i).getMenuReview(), reviews.get(i).getDeliveryMenu(), reviews.get(i).getApplicationMenu(), reviews.get(i).getNotes()};
        };
        String[] columns = {
            "SNo", "Order Id", "Menu Review", "Deliv. Review", "App. Review", "Notes"
        };
        DefaultTableModel tmodel = new DefaultTableModel(data, columns) {
            @Override
            public Class getColumnClass(int column) {
                return getValueAt(0, column).getClass();
            }
        };
        reviewTable.setModel(tmodel);
        reviewTable.getColumn("SNo").setMaxWidth(35);
        reviewTable.setRowHeight(30);
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
        viewOrderButton = new javax.swing.JButton();
        menuViewTable = new javax.swing.JScrollPane();
        reviewTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reviews");
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 303, Short.MAX_VALUE)
                .addComponent(menuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reviewsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutButton)
                .addContainerGap())
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

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 50));

        viewOrderButton.setBackground(new java.awt.Color(255, 255, 255));
        viewOrderButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        viewOrderButton.setForeground(Color.BLACK);
        viewOrderButton.setText("View Order");
        viewOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrderButtonActionPerformed(evt);
            }
        });
        getContentPane().add(viewOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 210, -1));

        reviewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "SNo", "Order Id", "Menu Review", "Deliv. Review", "App Review", "Note"
            }
        ));
        reviewTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reviewTableMouseClicked(evt);
            }
        });
        menuViewTable.setViewportView(reviewTable);

        getContentPane().add(menuViewTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 630, 250));

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(135, 103, 82));
        jLabel2.setText("Review");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, -1));

        backgroundImage.setText("jLabel1");
        getContentPane().add(backgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 52, 690, 440));

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
        AddItemForm itemsForm = new AddItemForm();
        itemsForm.setVisible(true);
    }//GEN-LAST:event_menuButtonActionPerformed

    private void viewOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrderButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = reviewTable.getSelectedRow();
        new ViewCartDataOfOrder(reviewData.get(selectedRow).getOrderId()).setVisible(true);
    }//GEN-LAST:event_viewOrderButtonActionPerformed

    private void reviewTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reviewTableMouseClicked
        // TODO add your handling code here:
        viewOrderButton.setEnabled(true);
    }//GEN-LAST:event_reviewTableMouseClicked

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
            java.util.logging.Logger.getLogger(ViewAllReviewsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAllReviewsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAllReviewsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAllReviewsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAllReviewsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton menuButton;
    private javax.swing.JScrollPane menuViewTable;
    private javax.swing.JButton orderButton;
    private javax.swing.JTable reviewTable;
    private javax.swing.JButton reviewsButton;
    private javax.swing.JButton viewOrderButton;
    // End of variables declaration//GEN-END:variables
}