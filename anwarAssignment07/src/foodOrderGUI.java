
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s201076699
 */
public class foodOrderGUI extends javax.swing.JFrame {
    // The constant prices of each menu item (both small and large versions)
    final double SMALL_CABASSA_PRICE = 9.99;
    final double LARGE_CABASSA_PRICE = 13.99;
    
    final double SMALL_WATER_PRICE = 2.99;
    final double LARGE_WATER_PRICE = 3.99;
    
    final double SMALL_JAVA_SIPPED_PRICE = 4.99;
    final double LARGE_JAVA_SIPPED_PRICE = 5.99;
    
    final double SMALL_STEAK_PRICE = 12.99;
    final double LARGE_STEAK_PRICE = 16.99;
    
    // Initialize the constant tax rate
    final double TAX_RATE = 0.13;
    
    // Creates new form foodOrderGUI
    public foodOrderGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        spnSteakAmount = new javax.swing.JSpinner();
        drpCabassaSize = new javax.swing.JComboBox();
        spnCabassaAmount = new javax.swing.JSpinner();
        spnJavaSippedAmount = new javax.swing.JSpinner();
        spnWaterAmount = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        lblCabassaPrice = new javax.swing.JLabel();
        drpWaterSize = new javax.swing.JComboBox();
        drpJavaSippedSize = new javax.swing.JComboBox();
        drpSteakSize = new javax.swing.JComboBox();
        lblSteakPrice = new javax.swing.JLabel();
        lblJavaSippedPrice = new javax.swing.JLabel();
        lblWaterPrice = new javax.swing.JLabel();
        btnPurchaseItems = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblSubTotal = new javax.swing.JLabel();
        lblTaxesApplied = new javax.swing.JLabel();
        lblGrandTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Java Sipped (JS) - Fine Dining ");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Steak");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Water");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("Cabassa");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Food");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Drinks");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setText("Java-Sipped");

        drpCabassaSize.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Small", "Large" }));
        drpCabassaSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drpCabassaSizeActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaSipped.png"))); // NOI18N

        lblCabassaPrice.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCabassaPrice.setText("$9.99");

        drpWaterSize.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Small", "Large" }));
        drpWaterSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drpWaterSizeActionPerformed(evt);
            }
        });

        drpJavaSippedSize.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Small", "Large" }));
        drpJavaSippedSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drpJavaSippedSizeActionPerformed(evt);
            }
        });

        drpSteakSize.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Small", "Large" }));
        drpSteakSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drpSteakSizeActionPerformed(evt);
            }
        });

        lblSteakPrice.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblSteakPrice.setText("$12.99");

        lblJavaSippedPrice.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblJavaSippedPrice.setText("$4.99");

        lblWaterPrice.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblWaterPrice.setText("$2.99");

        btnPurchaseItems.setText("Purchase Items");
        btnPurchaseItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurchaseItemsActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Receipt");

        jLabel8.setText("Subtotal");

        jLabel15.setText("Taxes Applied (13%)");

        jLabel16.setText("Grand Total");

        lblSubTotal.setText("0.00");

        lblTaxesApplied.setText("0.00");

        lblGrandTotal.setText("0.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(329, 329, 329)
                                        .addComponent(lblJavaSippedPrice))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(6, 6, 6)
                                                        .addComponent(lblCabassaPrice)))
                                                .addGap(31, 31, 31))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(drpCabassaSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(spnCabassaAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(drpSteakSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(spnSteakAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(79, 79, 79)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblSteakPrice)
                                                    .addComponent(jLabel2))))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(90, 90, 90)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(drpWaterSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(spnWaterAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(drpJavaSippedSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(spnJavaSippedAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(26, 26, 26))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(135, 135, 135)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel4)
                                                    .addComponent(lblWaterPrice))))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(btnPurchaseItems, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel8))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSubTotal)
                                    .addComponent(lblTaxesApplied)
                                    .addComponent(lblGrandTotal)))
                            .addComponent(jLabel10))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(69, 69, 69))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSteakPrice)
                            .addComponent(lblWaterPrice))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spnSteakAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drpSteakSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnWaterAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drpWaterSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJavaSippedPrice)
                    .addComponent(lblCabassaPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnCabassaAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnJavaSippedAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drpCabassaSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drpJavaSippedSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblSubTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(lblTaxesApplied))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(lblGrandTotal)))
                    .addComponent(btnPurchaseItems, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    static void setItemPrice(String itemSize, javax.swing.JLabel label, double smallItemPrice, double largeItemPrice){
    /* 
        A method that takes in the size of an item, the (price) label, the price of the small item,
        and the price of the large item. Then it checks what the item size is and sets the label based on that.
    */
        if(itemSize.equals("Small")){
            label.setText("$" + Double.toString(smallItemPrice));
        } else{
            label.setText("$" + Double.toString(largeItemPrice));
        }
    }

    private void drpCabassaSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drpCabassaSizeActionPerformed
        // Get the Cabassa Size Dropdown (with selected size)
        String cabassaSize = drpCabassaSize.getSelectedItem().toString();
        // Call a method to set the item price (on the label)
        setItemPrice(cabassaSize, lblCabassaPrice, SMALL_CABASSA_PRICE, LARGE_CABASSA_PRICE);
    }//GEN-LAST:event_drpCabassaSizeActionPerformed

    private void drpWaterSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drpWaterSizeActionPerformed
        // Get the Water Size Dropdown (with selected size)
        String waterSize = drpWaterSize.getSelectedItem().toString();
        // Call a method to set the item price (on the label)
        setItemPrice(waterSize, lblWaterPrice, SMALL_WATER_PRICE, LARGE_WATER_PRICE);
    }//GEN-LAST:event_drpWaterSizeActionPerformed

    private void drpJavaSippedSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drpJavaSippedSizeActionPerformed
        // Get the Java-Sipped Size Dropdown (with selected size)
        String javaSippedSize = drpJavaSippedSize.getSelectedItem().toString();
        // Call a method to set the item price (on the label)
        setItemPrice(javaSippedSize, lblJavaSippedPrice, SMALL_JAVA_SIPPED_PRICE, LARGE_JAVA_SIPPED_PRICE);
    }//GEN-LAST:event_drpJavaSippedSizeActionPerformed

    private void drpSteakSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drpSteakSizeActionPerformed
        // Get the Steak Size Dropdown (with selected size)
        String steakSize = drpSteakSize.getSelectedItem().toString();
        // Call a method to set the item price (on the label)
        setItemPrice(steakSize, lblSteakPrice, SMALL_STEAK_PRICE, LARGE_STEAK_PRICE);
    }//GEN-LAST:event_drpSteakSizeActionPerformed

    private void btnPurchaseItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurchaseItemsActionPerformed
        // Declare the decimal format
        DecimalFormat df = new DecimalFormat("#.00");
        
        // Get (string) item prices (from labels), replace dollar signs and convert to double
        double steakPrice = Double.parseDouble(lblSteakPrice.getText().replace("$",""));
        double cabassaPrice = Double.parseDouble(lblCabassaPrice.getText().replace("$",""));
        double waterPrice = Double.parseDouble(lblWaterPrice.getText().replace("$",""));
        double javaSippedPrice = Double.parseDouble(lblJavaSippedPrice.getText().replace("$",""));
        
        //Multiply the price per size by the amount of items purcahased (which is taken from a jSpinner and converted to string)
        double steakTotal = steakPrice * Integer.parseInt(spnSteakAmount.getValue().toString());
        double cabassaTotal = cabassaPrice * Integer.parseInt(spnCabassaAmount.getValue().toString());
        double waterTotal = waterPrice * Integer.parseInt(spnWaterAmount.getValue().toString());
        double javaSippedTotal = javaSippedPrice * Integer.parseInt(spnJavaSippedAmount.getValue().toString());
        
        // Initialize and declare the sub-total, which is all the item totals combined
        double subTotal = steakTotal + cabassaTotal + waterTotal + javaSippedTotal;
        // Initialize and declare a variable to calculate the taxes applied
        double taxesApplied = subTotal * TAX_RATE;
        // Initialize and declare the grand total, which is the subtotal and tax combined
        double grandTotal = subTotal + taxesApplied;
        
        // Set each label to the approprate amount of money
        lblSubTotal.setText("$" + df.format(subTotal));
        lblTaxesApplied.setText("$" + df.format(taxesApplied));
        lblGrandTotal.setText("$" + df.format(grandTotal));
    }//GEN-LAST:event_btnPurchaseItemsActionPerformed

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
            java.util.logging.Logger.getLogger(foodOrderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(foodOrderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(foodOrderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(foodOrderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new foodOrderGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPurchaseItems;
    private javax.swing.JComboBox drpCabassaSize;
    private javax.swing.JComboBox drpJavaSippedSize;
    private javax.swing.JComboBox drpSteakSize;
    private javax.swing.JComboBox drpWaterSize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblCabassaPrice;
    private javax.swing.JLabel lblGrandTotal;
    private javax.swing.JLabel lblJavaSippedPrice;
    private javax.swing.JLabel lblSteakPrice;
    private javax.swing.JLabel lblSubTotal;
    private javax.swing.JLabel lblTaxesApplied;
    private javax.swing.JLabel lblWaterPrice;
    private javax.swing.JSpinner spnCabassaAmount;
    private javax.swing.JSpinner spnJavaSippedAmount;
    private javax.swing.JSpinner spnSteakAmount;
    private javax.swing.JSpinner spnWaterAmount;
    // End of variables declaration//GEN-END:variables
}
