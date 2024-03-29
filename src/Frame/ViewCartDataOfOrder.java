/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import Database.OrderPaymentOperation;
import ModalClasses.Cart;
import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SSC
 */
public class ViewCartDataOfOrder extends javax.swing.JFrame {

    /**
     * Creates new form ViewCartDataOfOrderForCustomer
     */
    public ViewCartDataOfOrder(int oderId) {
        initComponents();
     Useables.Useable.makeImageFixToScreen("src//Images//treebg.jpg", backgroundImage, backgroundImage.getWidth(), backgroundImage.getHeight() + 1000);
     
        displayTableData(OrderPaymentOperation.getOrderDetailByOrderId(oderId));
    }
    
    public Object[] getObjectArray(int id, String name, String size, int qty, double price,
            String location) {
        ImageIcon icon = new ImageIcon(location);
        JLabel label = new JLabel();
        Useables.Useable.makeImageFixToScreen(location, label, 30, 30);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(70, 50, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        return new Object[]{
            id, name, size, qty, scaledIcon, ("₪: " + price)
        };
    }
    
    void displayTableData(ArrayList<Cart> menuData) {
        cartTable.removeAll();
        Object[][] data = new Object[menuData.size()][];
        for (int i = 0; i < menuData.size(); i++) {
            data[i] = getObjectArray((i + 1),
                    menuData.get(i).getMenu().getName(), menuData.get(i).getSize(), menuData.get(i).getQty(), menuData.get(i).getPrice(), menuData.get(i).getMenu().getImagePath());
        }
        String[] columns = {
            "Id", "Name", "Size", "Qty", "Image", "Price"
        };
        DefaultTableModel tmodel = new DefaultTableModel(data, columns) {
            @Override
            public Class getColumnClass(int column) {
                return getValueAt(0, column).getClass();
            }
        };
        cartTable.setModel(tmodel);
        cartTable.getColumn("Id").setMaxWidth(35);
        cartTable.setRowHeight(50);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        menuViewTable = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        closeButton = new javax.swing.JButton();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Order Details");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(135, 103, 82));
        jLabel2.setText("Order Details");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Size", "Qty", "Image", "Price", "Remove"
            }
        ));
        cartTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartTableMouseClicked(evt);
            }
        });
        menuViewTable.setViewportView(cartTable);

        getContentPane().add(menuViewTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 630, 200));

        closeButton.setBackground(new java.awt.Color(255, 255, 255));
        closeButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        closeButton.setForeground(Color.BLACK);
        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 210, -1));

        backgroundImage.setText("jLabel1");
        getContentPane().add(backgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cartTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartTableMouseClicked
        // TODO add your handling code here:
       // removeButton.setEnabled(true);
    }//GEN-LAST:event_cartTableMouseClicked

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ViewCartDataOfOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCartDataOfOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCartDataOfOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCartDataOfOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
           //     new ViewCartDataOfOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JTable cartTable;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane menuViewTable;
    // End of variables declaration//GEN-END:variables
}
