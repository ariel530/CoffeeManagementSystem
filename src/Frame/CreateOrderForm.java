/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import Database.ItemCategoryOperations;
import Database.MenuOperation;
import ModalClasses.Cart;
import ModalClasses.Menu;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author SSC
 */
public class CreateOrderForm extends javax.swing.JFrame {

    /**
     * Creates new form OrderForm
     */
    ArrayList<Menu> drinkCategoryList = new ArrayList<Menu>();
    ArrayList<Menu> sweetCategoryList = new ArrayList<Menu>();

    public CreateOrderForm() {
        initComponents();
        drinkList.removeAllItems();
        drinkListLargeSize.removeAllItems();
        drinkListMediumSize.removeAllItems();
        drinkListSmallSize.removeAllItems();
        drinkListLargeSizeDecreament.setEnabled(false);
        drinkListMediumSizeDecreament.setEnabled(false);
        drinkListSmallSizeDecreament.setEnabled(false);
        drinkListLargeSizeIncreament.setEnabled(false);
        drinkListMediumSizeIncreament.setEnabled(false);
        drinkListSmallSizeIncreament.setEnabled(false);
        sweetList.removeAllItems();
        sweetListLargeSize.removeAllItems();
        sweetListMediumSize.removeAllItems();
        sweetListSmallSize.removeAllItems();
        sweetListLargeSizeIncreament.setEnabled(false);
        sweetListMediumSizeIncreament.setEnabled(false);
        sweetListSmallSizeIcreament.setEnabled(false);
        sweetListLargeSizeDecreament.setEnabled(false);
        sweetListMediumSizeDecreament.setEnabled(false);
        sweetListSmallSizeDecreament.setEnabled(false);

        Useables.Useable.makeImageFixToScreen("src//Images//background.jpg", backgroundImage, backgroundImage.getWidth(), backgroundImage.getHeight() + 1000);
        try {
            drinkCategoryList = MenuOperation.getAlIMenuByItemCategort(ItemCategoryOperations.getItemCategoryByName("Coffee").getId());
        } catch (Exception ex) {

        }
        try {
            sweetCategoryList = MenuOperation.getAlIMenuByItemCategort(ItemCategoryOperations.getItemCategoryByName("Sweets").getId());
        } catch (Exception ex) {

        }
        if (drinkCategoryList.isEmpty() && sweetCategoryList.isEmpty()) {
            Useables.Useable.ShowSuccessErrorMessage("No Item available to Buy", "No Item Available", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            new CustomerHome().setVisible(true);
        } else {
            for (Menu temp : drinkCategoryList) {
                drinkList.addItem(temp.getName());
                if (temp.getSmallSizePrice() > 0) {
                    drinkListSmallSizeIncreament.setEnabled(true);
                }
                if (temp.getMediumSizePrice() > 0) {
                    drinkListMediumSizeIncreament.setEnabled(true);
                }
                if (temp.getLargeSizePrice() > 0) {
                    drinkListLargeSizeIncreament.setEnabled(true);
                }
            }

            for (Menu temp : sweetCategoryList) {
                sweetList.addItem(temp.getName());
                if (temp.getSmallSizePrice() > 0) {
                    sweetListSmallSizeIcreament.setEnabled(true);
                }
                if (temp.getMediumSizePrice() > 0) {
                    sweetListMediumSizeIncreament.setEnabled(true);
                }
                if (temp.getLargeSizePrice() > 0) {
                    sweetListLargeSizeIncreament.setEnabled(true);
                }
            }

//            int selectedIndex = 0;
//            if (!drinkCategoryList.isEmpty()) {
//                Useables.Useable.makeImageFixToScreen(drinkCategoryList.get(selectedIndex).getImagePath(), DrinkImage, DrinkImage.getWidth(), DrinkImage.getHeight());
//                drinkListSmallSize.addItem("Small Size - ₪ : " + drinkCategoryList.get(selectedIndex).getSmallSizePrice());
//                drinkListMediumSize.addItem("Medium Size - ₪ : " + drinkCategoryList.get(selectedIndex).getMediumSizePrice());
//                drinkListLargeSize.addItem("Large Size - ₪ : " + drinkCategoryList.get(selectedIndex).getLargeSizePrice());
//            }
//            if (!sweetCategoryList.isEmpty()) {
//                Useables.Useable.makeImageFixToScreen(sweetCategoryList.get(selectedIndex).getImagePath(), sweetImage, sweetImage.getWidth(), sweetImage.getHeight());
//                sweetListSmallSize.addItem("Small Size - ₪ : " + sweetCategoryList.get(selectedIndex).getSmallSizePrice());
//                sweetListMediumSize.addItem("Medium Size - ₪ : " + sweetCategoryList.get(selectedIndex).getMediumSizePrice());
//                sweetListLargeSize.addItem("Large Size - ₪ : " + sweetCategoryList.get(selectedIndex).getLargeSizePrice());
//            }
            if (!drinkCategoryList.isEmpty()) {
                setDrinkListData(0);
            }
            if (!sweetCategoryList.isEmpty()) {
                setSweetListData(0);
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
        cartButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        DrinkImage = new javax.swing.JLabel();
        drinkList = new javax.swing.JComboBox<>();
        drinkListSmallSize = new javax.swing.JComboBox<>();
        drinkListSmallSizeIncreament = new javax.swing.JButton();
        drinkListSmallSizeQty = new javax.swing.JLabel();
        drinkListMediumSize = new javax.swing.JComboBox<>();
        drinkListMediumSizeIncreament = new javax.swing.JButton();
        drinkListLargeSize = new javax.swing.JComboBox<>();
        drinkListLargeSizeIncreament = new javax.swing.JButton();
        drinkListLargeSizeQty = new javax.swing.JLabel();
        drinkListMediumSizeQty = new javax.swing.JLabel();
        drinkListSmallSizeDecreament = new javax.swing.JButton();
        drinkListMediumSizeDecreament = new javax.swing.JButton();
        drinkListLargeSizeDecreament = new javax.swing.JButton();
        drinkListSmallSizePrice = new javax.swing.JLabel();
        drinkListMediumSizePrice = new javax.swing.JLabel();
        drinkListLargeSizePrice = new javax.swing.JLabel();
        sweetListSmallSizeDecreament = new javax.swing.JButton();
        sweetListMediumSizeDecreament = new javax.swing.JButton();
        sweetListLargeSizeDecreament = new javax.swing.JButton();
        sweetListSmallSizePrice = new javax.swing.JLabel();
        sweetImage = new javax.swing.JLabel();
        sweetList = new javax.swing.JComboBox<>();
        sweetListMediumSizePrice = new javax.swing.JLabel();
        sweetListLargeSizePrice = new javax.swing.JLabel();
        sweetListSmallSize = new javax.swing.JComboBox<>();
        sweetListSmallSizeIcreament = new javax.swing.JButton();
        sweetListSmallSizeQty = new javax.swing.JLabel();
        sweetListMediumSize = new javax.swing.JComboBox<>();
        sweetListMediumSizeIncreament = new javax.swing.JButton();
        sweetListLargeSize = new javax.swing.JComboBox<>();
        sweetListLargeSizeIncreament = new javax.swing.JButton();
        sweetListLargeSizeQty = new javax.swing.JLabel();
        sweetListMediumSizeQty = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        addToCart = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create Order");
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
        menuButton.setText("Create Order");
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });

        cartButton.setBackground(new java.awt.Color(255, 255, 255));
        cartButton.setForeground(Color.BLACK);
        cartButton.setText("Shoping Cart");
        cartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 721, Short.MAX_VALUE)
                .addComponent(menuButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cartButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addComponent(menuButton)
                    .addComponent(cartButton))
                .addGap(77, 77, 77))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 50));

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 70)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(135, 103, 82));
        jLabel1.setText("MENU");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 68, 171, -1));

        jLabel13.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 51, 51));
        jLabel13.setText("Note* : Only menu with qty greater than 0 will be added to cart");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 504, -1));

        jLabel14.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 153, 51));
        jLabel14.setText("Select the sweet and it's size");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(863, 158, 255, -1));

        DrinkImage.setText("                       No Drink Available");
        DrinkImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(DrinkImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 202, 237, 252));

        drinkList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  small americano -12 RS "," medium americano -14 RS", "Large Americano-16 RS" }));
        drinkList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinkListActionPerformed(evt);
            }
        });
        getContentPane().add(drinkList, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 208, 228, 37));

        drinkListSmallSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  small latte -12 RS "," medium latte -14 RS", "Large latte-16 RS"}));
        getContentPane().add(drinkListSmallSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 276, 183, 35));

        drinkListSmallSizeIncreament.setText("+");
        drinkListSmallSizeIncreament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinkListSmallSizeIncreamentActionPerformed(evt);
            }
        });
        getContentPane().add(drinkListSmallSizeIncreament, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 282, -1, -1));

        drinkListSmallSizeQty.setText("0");
        getContentPane().add(drinkListSmallSizeQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 286, 15, -1));

        drinkListMediumSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  "  small espresso -12 RS "," medium espresso -14 RS", "Large espresso -16 RS" }));
        getContentPane().add(drinkListMediumSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 183, 35));

        drinkListMediumSizeIncreament.setText("+");
        drinkListMediumSizeIncreament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinkListMediumSizeIncreamentActionPerformed(evt);
            }
        });
        getContentPane().add(drinkListMediumSizeIncreament, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 348, -1, -1));

        drinkListLargeSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  small ice tea -12 RS "," medium ice tea -14 RS", "Large ice tea -16 RS" }));
        getContentPane().add(drinkListLargeSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 183, 31));

        drinkListLargeSizeIncreament.setText("+");
        drinkListLargeSizeIncreament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinkListLargeSizeIncreamentActionPerformed(evt);
            }
        });
        getContentPane().add(drinkListLargeSizeIncreament, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 405, -1, -1));

        drinkListLargeSizeQty.setText("0");
        getContentPane().add(drinkListLargeSizeQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 409, 14, -1));

        drinkListMediumSizeQty.setText("0");
        getContentPane().add(drinkListMediumSizeQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 352, 15, -1));

        drinkListSmallSizeDecreament.setText("-");
        drinkListSmallSizeDecreament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinkListSmallSizeDecreamentActionPerformed(evt);
            }
        });
        getContentPane().add(drinkListSmallSizeDecreament, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 281, -1, 25));

        drinkListMediumSizeDecreament.setText("-");
        drinkListMediumSizeDecreament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinkListMediumSizeDecreamentActionPerformed(evt);
            }
        });
        getContentPane().add(drinkListMediumSizeDecreament, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 347, -1, 25));

        drinkListLargeSizeDecreament.setText("-");
        drinkListLargeSizeDecreament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinkListLargeSizeDecreamentActionPerformed(evt);
            }
        });
        getContentPane().add(drinkListLargeSizeDecreament, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 404, -1, 25));

        drinkListSmallSizePrice.setText("₪ : 0");
        getContentPane().add(drinkListSmallSizePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 70, -1));

        drinkListMediumSizePrice.setText("₪ : 0");
        getContentPane().add(drinkListMediumSizePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 378, 80, -1));

        drinkListLargeSizePrice.setText("₪ : 0");
        getContentPane().add(drinkListLargeSizePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 435, 80, -1));

        sweetListSmallSizeDecreament.setText("-");
        sweetListSmallSizeDecreament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sweetListSmallSizeDecreamentActionPerformed(evt);
            }
        });
        getContentPane().add(sweetListSmallSizeDecreament, new org.netbeans.lib.awtextra.AbsoluteConstraints(1147, 272, -1, 25));

        sweetListMediumSizeDecreament.setText("-");
        sweetListMediumSizeDecreament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sweetListMediumSizeDecreamentActionPerformed(evt);
            }
        });
        getContentPane().add(sweetListMediumSizeDecreament, new org.netbeans.lib.awtextra.AbsoluteConstraints(1147, 338, -1, 25));

        sweetListLargeSizeDecreament.setText("-");
        sweetListLargeSizeDecreament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sweetListLargeSizeDecreamentActionPerformed(evt);
            }
        });
        getContentPane().add(sweetListLargeSizeDecreament, new org.netbeans.lib.awtextra.AbsoluteConstraints(1146, 395, -1, 25));

        sweetListSmallSizePrice.setText("₪ : 0");
        getContentPane().add(sweetListSmallSizePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1103, 308, 90, -1));

        sweetImage.setText("                          No Sweet Available");
        sweetImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(sweetImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 197, 237, 252));

        sweetList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  small americano -12 RS "," medium americano -14 RS", "Large Americano-16 RS" }));
        sweetList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sweetListActionPerformed(evt);
            }
        });
        getContentPane().add(sweetList, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 200, 210, 37));

        sweetListMediumSizePrice.setText("₪ : 0");
        getContentPane().add(sweetListMediumSizePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1103, 369, 90, -1));

        sweetListLargeSizePrice.setText("₪ : 0");
        getContentPane().add(sweetListLargeSizePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1105, 431, 80, -1));

        sweetListSmallSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  small latte -12 RS "," medium latte -14 RS", "Large latte-16 RS"}));
        getContentPane().add(sweetListSmallSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(882, 267, 183, 35));

        sweetListSmallSizeIcreament.setText("+");
        sweetListSmallSizeIcreament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sweetListSmallSizeIcreamentActionPerformed(evt);
            }
        });
        getContentPane().add(sweetListSmallSizeIcreament, new org.netbeans.lib.awtextra.AbsoluteConstraints(1071, 273, -1, -1));

        sweetListSmallSizeQty.setText("0");
        getContentPane().add(sweetListSmallSizeQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(1122, 277, 15, -1));

        sweetListMediumSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  "  small espresso -12 RS "," medium espresso -14 RS", "Large espresso -16 RS" }));
        getContentPane().add(sweetListMediumSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 330, 183, 35));

        sweetListMediumSizeIncreament.setText("+");
        sweetListMediumSizeIncreament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sweetListMediumSizeIncreamentActionPerformed(evt);
            }
        });
        getContentPane().add(sweetListMediumSizeIncreament, new org.netbeans.lib.awtextra.AbsoluteConstraints(1071, 339, -1, -1));

        sweetListLargeSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  small ice tea -12 RS "," medium ice tea -14 RS", "Large ice tea -16 RS" }));
        getContentPane().add(sweetListLargeSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 390, 183, 31));

        sweetListLargeSizeIncreament.setText("+");
        sweetListLargeSizeIncreament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sweetListLargeSizeIncreamentActionPerformed(evt);
            }
        });
        getContentPane().add(sweetListLargeSizeIncreament, new org.netbeans.lib.awtextra.AbsoluteConstraints(1071, 396, -1, -1));

        sweetListLargeSizeQty.setText("0");
        getContentPane().add(sweetListLargeSizeQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(1122, 400, 14, -1));

        sweetListMediumSizeQty.setText("0");
        getContentPane().add(sweetListMediumSizeQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(1122, 343, 15, -1));

        jLabel22.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(135, 103, 82));
        jLabel22.setText("Coffee House ");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 467, 144, 57));

        addToCart.setBackground(new java.awt.Color(255, 255, 255));
        addToCart.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addToCart.setForeground(Color.BLACK);
        addToCart.setText("Add To Cart");
        addToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartActionPerformed(evt);
            }
        });
        getContentPane().add(addToCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 490, 333, 34));

        jLabel16.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 153, 51));
        jLabel16.setText("Select the drink and the size");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 175, 230, -1));

        backgroundImage.setText("jLabel4");
        getContentPane().add(backgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1230, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void reviewsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reviewsButtonActionPerformed
        // TODO add your handling code here:
        ViewCustomerReviews viewAllReviewsForm = new ViewCustomerReviews();
        this.setVisible(false);
        viewAllReviewsForm.setVisible(true);
    }//GEN-LAST:event_reviewsButtonActionPerformed

    private void orderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        OrderHistoryForCustomer ordersHistoryForm = new OrderHistoryForCustomer();
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
        CustomerHome home = new CustomerHome();
        home.setVisible(true);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        CreateOrderForm itemsForm = new CreateOrderForm();
        itemsForm.setVisible(true);
    }//GEN-LAST:event_menuButtonActionPerformed

    private void cartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        CartForm cartForm = new CartForm();
        cartForm.setVisible(true);
    }//GEN-LAST:event_cartButtonActionPerformed

    public void setDrinkListData(int selectedIndex) {
        drinkListLargeSize.removeAllItems();
        drinkListMediumSize.removeAllItems();
        drinkListSmallSize.removeAllItems();
        drinkListLargeSizeDecreament.setEnabled(false);
        drinkListMediumSizeDecreament.setEnabled(false);
        drinkListSmallSizeDecreament.setEnabled(false);
        drinkListLargeSizeIncreament.setEnabled(false);
        drinkListMediumSizeIncreament.setEnabled(false);
        drinkListSmallSizeIncreament.setEnabled(false);
        drinkListSmallSizeQty.setText("0");
        drinkListLargeSizeQty.setText("0");
        drinkListMediumSizeQty.setText("0");
        drinkListSmallSizePrice.setText("₪ : 0");
        drinkListMediumSizePrice.setText("₪ : 0");
        drinkListLargeSizePrice.setText("₪ : 0");

        if (drinkCategoryList.isEmpty() && sweetCategoryList.isEmpty()) {
//            Useables.Useable.ShowSuccessErrorMessage("No Item available to Buy", "No Item Available", JOptionPane.INFORMATION_MESSAGE);
//            this.dispose();
//            new CustomerHome().setVisible(true);
        } else {

            Menu temp = drinkCategoryList.get(selectedIndex);
            {
                if (temp.getSmallSizePrice() > 0) {
                    drinkListSmallSizeIncreament.setEnabled(true);
                }
                if (temp.getMediumSizePrice() > 0) {
                    drinkListMediumSizeIncreament.setEnabled(true);
                }
                if (temp.getLargeSizePrice() > 0) {
                    drinkListLargeSizeIncreament.setEnabled(true);
                }
            }

            if (!drinkCategoryList.isEmpty()) {
                Useables.Useable.makeImageFixToScreen(drinkCategoryList.get(selectedIndex).getImagePath(), DrinkImage, DrinkImage.getWidth(), DrinkImage.getHeight());
                drinkListSmallSize.addItem("Small Size - ₪ : " + drinkCategoryList.get(selectedIndex).getSmallSizePrice());
                drinkListMediumSize.addItem("Medium Size - ₪ : " + drinkCategoryList.get(selectedIndex).getMediumSizePrice());
                drinkListLargeSize.addItem("Large Size - ₪ : " + drinkCategoryList.get(selectedIndex).getLargeSizePrice());
            }
        }
    }

    public void setSweetListData(int selectedIndex) {
        sweetListLargeSize.removeAllItems();
        sweetListMediumSize.removeAllItems();
        sweetListSmallSize.removeAllItems();
        sweetListLargeSizeDecreament.setEnabled(false);
        sweetListMediumSizeDecreament.setEnabled(false);
        sweetListSmallSizeDecreament.setEnabled(false);
        sweetListLargeSizeIncreament.setEnabled(false);
        sweetListMediumSizeIncreament.setEnabled(false);
        sweetListSmallSizeIcreament.setEnabled(false);
        sweetListSmallSizeQty.setText("0");
        sweetListLargeSizeQty.setText("0");
        sweetListMediumSizeQty.setText("0");
        sweetListSmallSizePrice.setText("₪ : 0");
        sweetListMediumSizePrice.setText("₪ : 0");
        sweetListLargeSizePrice.setText("₪ : 0");

        if (sweetCategoryList.isEmpty() && sweetCategoryList.isEmpty()) {
//            Useables.Useable.ShowSuccessErrorMessage("No Item available to Buy", "No Item Available", JOptionPane.INFORMATION_MESSAGE);
//            this.dispose();
//            new CustomerHome().setVisible(true);
        } else {

            Menu temp = sweetCategoryList.get(selectedIndex);
            {
                if (temp.getSmallSizePrice() > 0) {
                    sweetListSmallSizeIcreament.setEnabled(true);
                }
                if (temp.getMediumSizePrice() > 0) {
                    sweetListMediumSizeIncreament.setEnabled(true);
                }
                if (temp.getLargeSizePrice() > 0) {
                    sweetListLargeSizeIncreament.setEnabled(true);
                }
            }

            if (!sweetCategoryList.isEmpty()) {
                Useables.Useable.makeImageFixToScreen(sweetCategoryList.get(selectedIndex).getImagePath(), sweetImage, sweetImage.getWidth(), sweetImage.getHeight());
                sweetListSmallSize.addItem("Small Size - ₪ : " + sweetCategoryList.get(selectedIndex).getSmallSizePrice());
                sweetListMediumSize.addItem("Medium Size - ₪ : " + sweetCategoryList.get(selectedIndex).getMediumSizePrice());
                sweetListLargeSize.addItem("Large Size - ₪ : " + sweetCategoryList.get(selectedIndex).getLargeSizePrice());
            }
        }
    }


    private void drinkListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drinkListActionPerformed
        // TODO add your handling code here:
        int selectedIndex = drinkList.getSelectedIndex();
        setDrinkListData(selectedIndex);
    }//GEN-LAST:event_drinkListActionPerformed

    private void drinkListMediumSizeIncreamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drinkListMediumSizeIncreamentActionPerformed
        // TODO add your handling code here:
        drinkListMediumSizeDecreament.setEnabled(true);
        int value = Integer.parseInt(drinkListMediumSizeQty.getText());
        value++;
        double tempPrice = drinkCategoryList.get(drinkList.getSelectedIndex()).getMediumSizePrice() * value;
        drinkListMediumSizeQty.setText("" + value);
        drinkListMediumSizePrice.setText("₪ : " + tempPrice);
    }//GEN-LAST:event_drinkListMediumSizeIncreamentActionPerformed

    private void drinkListSmallSizeDecreamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drinkListSmallSizeDecreamentActionPerformed
        // TODO add your handling code here:

        int value = Integer.parseInt(drinkListSmallSizeQty.getText());
        value--;
        double tempPrice = drinkCategoryList.get(drinkList.getSelectedIndex()).getSmallSizePrice() * value;
        drinkListSmallSizePrice.setText("₪ : " + tempPrice);
        drinkListSmallSizeQty.setText("" + value);
        if (value <= 0) {
            drinkListSmallSizeDecreament.setEnabled(false);
        }
    }//GEN-LAST:event_drinkListSmallSizeDecreamentActionPerformed

    private void drinkListMediumSizeDecreamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drinkListMediumSizeDecreamentActionPerformed
        // TODO add your handling code here:
        int value = Integer.parseInt(drinkListMediumSizeQty.getText());
        value--;
        double tempPrice = drinkCategoryList.get(drinkList.getSelectedIndex()).getMediumSizePrice() * value;
        drinkListMediumSizePrice.setText("₪ : " + tempPrice);
        drinkListMediumSizeQty.setText("" + value);
        if (value <= 0) {
            drinkListMediumSizeDecreament.setEnabled(false);
        }
    }//GEN-LAST:event_drinkListMediumSizeDecreamentActionPerformed

    private void drinkListLargeSizeDecreamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drinkListLargeSizeDecreamentActionPerformed
        // TODO add your handling code here:
        int value = Integer.parseInt(drinkListLargeSizeQty.getText());
        value--;
        double tempPrice = drinkCategoryList.get(drinkList.getSelectedIndex()).getLargeSizePrice() * value;
        drinkListLargeSizePrice.setText("₪ : " + tempPrice);
        drinkListLargeSizeQty.setText("" + value);

        if (value <= 0) {
            drinkListLargeSizeDecreament.setEnabled(false);
        }
    }//GEN-LAST:event_drinkListLargeSizeDecreamentActionPerformed

    private void sweetListSmallSizeDecreamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sweetListSmallSizeDecreamentActionPerformed
        // TODO add your handling code here:
        int value = Integer.parseInt(sweetListSmallSizeQty.getText());
        value--;
        double tempPrice = sweetCategoryList.get(sweetList.getSelectedIndex()).getSmallSizePrice() * value;
        sweetListSmallSizePrice.setText("₪ : " + tempPrice);
        sweetListSmallSizeQty.setText("" + value);
        if (value <= 0) {
            sweetListSmallSizeDecreament.setEnabled(false);
        }
    }//GEN-LAST:event_sweetListSmallSizeDecreamentActionPerformed

    private void sweetListMediumSizeDecreamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sweetListMediumSizeDecreamentActionPerformed
        // TODO add your handling code here:
        int value = Integer.parseInt(sweetListMediumSizeQty.getText());
        value--;
        double tempPrice = sweetCategoryList.get(sweetList.getSelectedIndex()).getMediumSizePrice() * value;
        sweetListMediumSizePrice.setText("₪ : " + tempPrice);
        sweetListMediumSizeQty.setText("" + value);
        if (value <= 0) {
            sweetListMediumSizeDecreament.setEnabled(false);
        }
    }//GEN-LAST:event_sweetListMediumSizeDecreamentActionPerformed

    private void sweetListLargeSizeDecreamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sweetListLargeSizeDecreamentActionPerformed
        // TODO add your handling code here:
        int value = Integer.parseInt(sweetListLargeSizeQty.getText());
        value--;
        double tempPrice = sweetCategoryList.get(sweetList.getSelectedIndex()).getLargeSizePrice() * value;
        sweetListLargeSizePrice.setText("₪ : " + tempPrice);
        sweetListLargeSizeQty.setText("" + value);
        if (value <= 0) {
            sweetListLargeSizeDecreament.setEnabled(false);
        }
    }//GEN-LAST:event_sweetListLargeSizeDecreamentActionPerformed

    private void sweetListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sweetListActionPerformed
        // TODO add your handling code here:
        int selectedIndex = sweetList.getSelectedIndex();
        setSweetListData(selectedIndex);
    }//GEN-LAST:event_sweetListActionPerformed

    private void sweetListMediumSizeIncreamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sweetListMediumSizeIncreamentActionPerformed
        // TODO add your handling code here:
        sweetListMediumSizeDecreament.setEnabled(true);
        int value = Integer.parseInt(sweetListMediumSizeQty.getText());
        value++;
        double tempPrice = sweetCategoryList.get(sweetList.getSelectedIndex()).getMediumSizePrice() * value;
        sweetListMediumSizePrice.setText("₪ : " + tempPrice);
        sweetListMediumSizeQty.setText("" + value);
    }//GEN-LAST:event_sweetListMediumSizeIncreamentActionPerformed

    private void addToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartActionPerformed
        // TODO add your handling code here:
        boolean isAdded = false;
        int qty = Integer.parseInt(drinkListSmallSizeQty.getText());
        if (qty > 0) {
            Useables.Useable.cart.add(new Cart(0, drinkCategoryList.get(drinkList.getSelectedIndex()), "Small", qty, qty * drinkCategoryList.get(drinkList.getSelectedIndex()).getSmallSizePrice()));
            isAdded = true;
        }
        qty = Integer.parseInt(drinkListMediumSizeQty.getText());
        if (qty > 0) {
            Useables.Useable.cart.add(new Cart(0, drinkCategoryList.get(drinkList.getSelectedIndex()), "Medium", qty, qty * drinkCategoryList.get(drinkList.getSelectedIndex()).getMediumSizePrice()));
            isAdded = true;
        }
        qty = Integer.parseInt(drinkListLargeSizeQty.getText());
        if (qty > 0) {
            Useables.Useable.cart.add(new Cart(0, drinkCategoryList.get(drinkList.getSelectedIndex()), "Large", qty, qty * drinkCategoryList.get(drinkList.getSelectedIndex()).getLargeSizePrice()));
            isAdded = true;
        }

        qty = Integer.parseInt(sweetListSmallSizeQty.getText());
        if (qty > 0) {
            Useables.Useable.cart.add(new Cart(0, sweetCategoryList.get(sweetList.getSelectedIndex()), "Small", qty, qty * sweetCategoryList.get(sweetList.getSelectedIndex()).getSmallSizePrice()));
            isAdded = true;
        }
        qty = Integer.parseInt(sweetListMediumSizeQty.getText());
        if (qty > 0) {
            Useables.Useable.cart.add(new Cart(0, sweetCategoryList.get(sweetList.getSelectedIndex()), "Medium", qty, qty * sweetCategoryList.get(sweetList.getSelectedIndex()).getMediumSizePrice()));
            isAdded = true;
        }
        qty = Integer.parseInt(sweetListLargeSizeQty.getText());
        if (qty > 0) {
            Useables.Useable.cart.add(new Cart(0, sweetCategoryList.get(sweetList.getSelectedIndex()), "Large", qty, qty * sweetCategoryList.get(sweetList.getSelectedIndex()).getLargeSizePrice()));
            isAdded = true;
        }
        if (isAdded) {
            Useables.Useable.ShowSuccessErrorMessage("Items Added To Cart", "Added", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            new CreateOrderForm().setVisible(true);
        } else {
            Useables.Useable.ShowSuccessErrorMessage("NoItem Selected To Added To Cart", "Selection Error", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_addToCartActionPerformed

    private void drinkListSmallSizeIncreamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drinkListSmallSizeIncreamentActionPerformed
        // TODO add your handling code here:
        drinkListSmallSizeDecreament.setEnabled(true);
        int value = Integer.parseInt(drinkListSmallSizeQty.getText());
        value++;
        double tempPrice = drinkCategoryList.get(drinkList.getSelectedIndex()).getSmallSizePrice() * value;
        drinkListSmallSizeQty.setText("" + value);
        drinkListSmallSizePrice.setText("₪ : " + tempPrice);

    }//GEN-LAST:event_drinkListSmallSizeIncreamentActionPerformed

    private void drinkListLargeSizeIncreamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drinkListLargeSizeIncreamentActionPerformed
        // TODO add your handling code here:
        drinkListLargeSizeDecreament.setEnabled(true);
        int value = Integer.parseInt(drinkListLargeSizeQty.getText());
        value++;
        double tempPrice = drinkCategoryList.get(drinkList.getSelectedIndex()).getLargeSizePrice() * value;
        drinkListLargeSizePrice.setText("₪ : " + tempPrice);
        drinkListLargeSizeQty.setText("" + value);
    }//GEN-LAST:event_drinkListLargeSizeIncreamentActionPerformed

    private void sweetListSmallSizeIcreamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sweetListSmallSizeIcreamentActionPerformed
        // TODO add your handling code here:
        sweetListSmallSizeDecreament.setEnabled(true);
        int value = Integer.parseInt(sweetListSmallSizeQty.getText());
        value++;
        double tempPrice = sweetCategoryList.get(sweetList.getSelectedIndex()).getSmallSizePrice() * value;
        sweetListSmallSizePrice.setText("₪ : " + tempPrice);
        sweetListSmallSizeQty.setText("" + value);

    }//GEN-LAST:event_sweetListSmallSizeIcreamentActionPerformed

    private void sweetListLargeSizeIncreamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sweetListLargeSizeIncreamentActionPerformed
        // TODO add your handling code here:
        sweetListLargeSizeDecreament.setEnabled(true);
        int value = Integer.parseInt(sweetListLargeSizeQty.getText());
        value++;
        double tempPrice = sweetCategoryList.get(sweetList.getSelectedIndex()).getLargeSizePrice() * value;
        sweetListLargeSizePrice.setText("₪ : " + tempPrice);
        sweetListLargeSizeQty.setText("" + value);
    }//GEN-LAST:event_sweetListLargeSizeIncreamentActionPerformed

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
            java.util.logging.Logger.getLogger(CreateOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateOrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateOrderForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DrinkImage;
    private javax.swing.JButton addToCart;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JButton cartButton;
    private javax.swing.JComboBox<String> drinkList;
    private javax.swing.JComboBox<String> drinkListLargeSize;
    private javax.swing.JButton drinkListLargeSizeDecreament;
    private javax.swing.JButton drinkListLargeSizeIncreament;
    private javax.swing.JLabel drinkListLargeSizePrice;
    private javax.swing.JLabel drinkListLargeSizeQty;
    private javax.swing.JComboBox<String> drinkListMediumSize;
    private javax.swing.JButton drinkListMediumSizeDecreament;
    private javax.swing.JButton drinkListMediumSizeIncreament;
    private javax.swing.JLabel drinkListMediumSizePrice;
    private javax.swing.JLabel drinkListMediumSizeQty;
    private javax.swing.JComboBox<String> drinkListSmallSize;
    private javax.swing.JButton drinkListSmallSizeDecreament;
    private javax.swing.JButton drinkListSmallSizeIncreament;
    private javax.swing.JLabel drinkListSmallSizePrice;
    private javax.swing.JLabel drinkListSmallSizeQty;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton menuButton;
    private javax.swing.JButton orderButton;
    private javax.swing.JButton reviewsButton;
    private javax.swing.JLabel sweetImage;
    private javax.swing.JComboBox<String> sweetList;
    private javax.swing.JComboBox<String> sweetListLargeSize;
    private javax.swing.JButton sweetListLargeSizeDecreament;
    private javax.swing.JButton sweetListLargeSizeIncreament;
    private javax.swing.JLabel sweetListLargeSizePrice;
    private javax.swing.JLabel sweetListLargeSizeQty;
    private javax.swing.JComboBox<String> sweetListMediumSize;
    private javax.swing.JButton sweetListMediumSizeDecreament;
    private javax.swing.JButton sweetListMediumSizeIncreament;
    private javax.swing.JLabel sweetListMediumSizePrice;
    private javax.swing.JLabel sweetListMediumSizeQty;
    private javax.swing.JComboBox<String> sweetListSmallSize;
    private javax.swing.JButton sweetListSmallSizeDecreament;
    private javax.swing.JButton sweetListSmallSizeIcreament;
    private javax.swing.JLabel sweetListSmallSizePrice;
    private javax.swing.JLabel sweetListSmallSizeQty;
    // End of variables declaration//GEN-END:variables
}
