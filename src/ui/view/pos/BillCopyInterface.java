/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.view.pos;

import java.awt.CardLayout;
import org.apache.log4j.Logger;

/**
 *
 * @author Shehan
 */
public class BillCopyInterface extends javax.swing.JInternalFrame {

    private static final Logger logger = Logger.getLogger(BillCopyInterface.class);

    /**
     * Creates new form BillCopyInterface
     */
    public BillCopyInterface() {
        initComponents();
    }

    //Print a copy of the bill
    private void billCopy_printBill() {
        logger.warn("billCopy_printBill not implemented");
    }

    //Cancel bill copy and show the welcome screen
    private void billCopy_cancel() {
        logger.debug("billCopy_cancel invoked");
        this.dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        interfaceContainerPanel = new javax.swing.JPanel();
        cardPanel = new javax.swing.JPanel();
        billCopyPanel = new javax.swing.JPanel();
        billInfoPanel = new javax.swing.JPanel();
        lblBill1 = new javax.swing.JLabel();
        txtSearchBillNO = new javax.swing.JTextField();
        lblBillDateVal = new javax.swing.JLabel();
        lblBillDateDisplay = new javax.swing.JLabel();
        lblBillTimeDisplay = new javax.swing.JLabel();
        lblBillTimeVal = new javax.swing.JLabel();
        lblBillCashierDisplay = new javax.swing.JLabel();
        lblBillCashierVal = new javax.swing.JLabel();
        billItemPanel = new javax.swing.JPanel();
        billItemSP = new javax.swing.JScrollPane();
        printItemTable = new javax.swing.JTable();
        billPaymentSummeryPanel = new javax.swing.JPanel();
        lblOtherAmountDisplay = new javax.swing.JLabel();
        lblCashAmountDisplay = new javax.swing.JLabel();
        lblCardAmountDisplay = new javax.swing.JLabel();
        lblChangeCashDisplay = new javax.swing.JLabel();
        lblCashAmountVal = new javax.swing.JLabel();
        lblCardAmountVal = new javax.swing.JLabel();
        lblOtherAmountVal = new javax.swing.JLabel();
        lblChangeCashVal = new javax.swing.JLabel();
        lblSubTotalDisplay = new javax.swing.JLabel();
        lblSubTotalVal = new javax.swing.JLabel();
        lblDiscountAmountDisplay = new javax.swing.JLabel();
        lblDiscountAmountVal = new javax.swing.JLabel();
        lblNetTotalDisplay = new javax.swing.JLabel();
        lblNetTotalVal = new javax.swing.JLabel();
        btnCancelPrint = new javax.swing.JButton();
        btnPrintBill = new javax.swing.JButton();
        lblBillPrintDateDisplay = new javax.swing.JLabel();
        lblBillPrintDate = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Bill Copy");
        setMinimumSize(new java.awt.Dimension(926, 630));
        setPreferredSize(null);

        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setShowLeftShadow(true);
        dropShadowBorder1.setShowTopShadow(true);
        interfaceContainerPanel.setBorder(dropShadowBorder1);

        cardPanel.setLayout(new java.awt.CardLayout());

        lblBill1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBill1.setText("Bill Number : ");

        txtSearchBillNO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSearchBillNO.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSearchBillNO.setText("<Bill No>");

        lblBillDateVal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBillDateVal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBillDateVal.setText("<date>");
        lblBillDateVal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblBillDateDisplay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBillDateDisplay.setText("Date : ");

        lblBillTimeDisplay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBillTimeDisplay.setText("Time : ");

        lblBillTimeVal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBillTimeVal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBillTimeVal.setText("<time>");
        lblBillTimeVal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblBillCashierDisplay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBillCashierDisplay.setText("Cashier : ");

        lblBillCashierVal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBillCashierVal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBillCashierVal.setText("<Cashier name>");
        lblBillCashierVal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout billInfoPanelLayout = new javax.swing.GroupLayout(billInfoPanel);
        billInfoPanel.setLayout(billInfoPanelLayout);
        billInfoPanelLayout.setHorizontalGroup(
            billInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBill1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSearchBillNO, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                .addComponent(lblBillDateDisplay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBillDateVal, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBillTimeDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBillTimeVal, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBillCashierDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBillCashierVal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        billInfoPanelLayout.setVerticalGroup(
            billInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(billInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBill1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchBillNO, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBillCashierVal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBillCashierDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBillTimeVal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBillTimeDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBillDateVal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBillDateDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        printItemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Description", "Price", "Qty", "Sub total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        printItemTable.setRowHeight(21);
        printItemTable.getTableHeader().setReorderingAllowed(false);
        billItemSP.setViewportView(printItemTable);

        javax.swing.GroupLayout billItemPanelLayout = new javax.swing.GroupLayout(billItemPanel);
        billItemPanel.setLayout(billItemPanelLayout);
        billItemPanelLayout.setHorizontalGroup(
            billItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(billItemSP)
        );
        billItemPanelLayout.setVerticalGroup(
            billItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(billItemSP, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
        );

        billPaymentSummeryPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblOtherAmountDisplay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOtherAmountDisplay.setText("Other ");

        lblCashAmountDisplay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCashAmountDisplay.setText("Cash Amount");

        lblCardAmountDisplay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCardAmountDisplay.setText("Card Amount");

        lblChangeCashDisplay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblChangeCashDisplay.setText("Change Cash");

        lblCashAmountVal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCashAmountVal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCashAmountVal.setText("<Amount>");
        lblCashAmountVal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCardAmountVal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCardAmountVal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCardAmountVal.setText("<Amount>");
        lblCardAmountVal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblOtherAmountVal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOtherAmountVal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOtherAmountVal.setText("<Amount>");
        lblOtherAmountVal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblChangeCashVal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblChangeCashVal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblChangeCashVal.setText("<Amount>");
        lblChangeCashVal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblSubTotalDisplay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSubTotalDisplay.setText("Sub Total");

        lblSubTotalVal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSubTotalVal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSubTotalVal.setText("<Amount>");
        lblSubTotalVal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblDiscountAmountDisplay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDiscountAmountDisplay.setText("Discount Amount");

        lblDiscountAmountVal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDiscountAmountVal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDiscountAmountVal.setText("<Amount>");
        lblDiscountAmountVal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNetTotalDisplay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNetTotalDisplay.setText("Net Total");

        lblNetTotalVal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNetTotalVal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNetTotalVal.setText("<Amount>");
        lblNetTotalVal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCancelPrint.setText("Cancel");
        btnCancelPrint.setToolTipText("");
        btnCancelPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelPrintActionPerformed(evt);
            }
        });

        btnPrintBill.setText("Print");
        btnPrintBill.setToolTipText("");
        btnPrintBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintBillActionPerformed(evt);
            }
        });

        lblBillPrintDateDisplay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBillPrintDateDisplay.setText("Bill Date");

        lblBillPrintDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBillPrintDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBillPrintDate.setText("<date>");
        lblBillPrintDate.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout billPaymentSummeryPanelLayout = new javax.swing.GroupLayout(billPaymentSummeryPanel);
        billPaymentSummeryPanel.setLayout(billPaymentSummeryPanelLayout);
        billPaymentSummeryPanelLayout.setHorizontalGroup(
            billPaymentSummeryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billPaymentSummeryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(billPaymentSummeryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(billPaymentSummeryPanelLayout.createSequentialGroup()
                        .addComponent(lblChangeCashDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblChangeCashVal, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(billPaymentSummeryPanelLayout.createSequentialGroup()
                        .addGroup(billPaymentSummeryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(billPaymentSummeryPanelLayout.createSequentialGroup()
                                .addComponent(lblCardAmountDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblCardAmountVal, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(billPaymentSummeryPanelLayout.createSequentialGroup()
                                .addComponent(lblOtherAmountDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblOtherAmountVal, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(billPaymentSummeryPanelLayout.createSequentialGroup()
                                .addGroup(billPaymentSummeryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCashAmountDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblBillPrintDateDisplay))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(billPaymentSummeryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblBillPrintDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblCashAmountVal, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))))
                        .addGap(45, 45, 45)
                        .addGroup(billPaymentSummeryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(billPaymentSummeryPanelLayout.createSequentialGroup()
                                .addComponent(lblSubTotalDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblSubTotalVal, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(billPaymentSummeryPanelLayout.createSequentialGroup()
                                .addComponent(lblDiscountAmountDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblDiscountAmountVal, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(billPaymentSummeryPanelLayout.createSequentialGroup()
                                .addComponent(lblNetTotalDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblNetTotalVal, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrintBill, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        billPaymentSummeryPanelLayout.setVerticalGroup(
            billPaymentSummeryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billPaymentSummeryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(billPaymentSummeryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(billPaymentSummeryPanelLayout.createSequentialGroup()
                        .addGroup(billPaymentSummeryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBillPrintDateDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBillPrintDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(billPaymentSummeryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(billPaymentSummeryPanelLayout.createSequentialGroup()
                                .addGroup(billPaymentSummeryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCashAmountDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCashAmountVal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(billPaymentSummeryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCardAmountDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCardAmountVal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(billPaymentSummeryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblOtherAmountDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblOtherAmountVal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(billPaymentSummeryPanelLayout.createSequentialGroup()
                                .addGroup(billPaymentSummeryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblSubTotalDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSubTotalVal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(billPaymentSummeryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblDiscountAmountDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDiscountAmountVal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(billPaymentSummeryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblNetTotalDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNetTotalVal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(billPaymentSummeryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblChangeCashDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblChangeCashVal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, billPaymentSummeryPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(billPaymentSummeryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPrintBill, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout billCopyPanelLayout = new javax.swing.GroupLayout(billCopyPanel);
        billCopyPanel.setLayout(billCopyPanelLayout);
        billCopyPanelLayout.setHorizontalGroup(
            billCopyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billCopyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(billCopyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(billInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(billItemPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(billPaymentSummeryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        billCopyPanelLayout.setVerticalGroup(
            billCopyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billCopyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(billInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(billItemPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(billPaymentSummeryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cardPanel.add(billCopyPanel, "billCopyCard");

        javax.swing.GroupLayout interfaceContainerPanelLayout = new javax.swing.GroupLayout(interfaceContainerPanel);
        interfaceContainerPanel.setLayout(interfaceContainerPanelLayout);
        interfaceContainerPanelLayout.setHorizontalGroup(
            interfaceContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        interfaceContainerPanelLayout.setVerticalGroup(
            interfaceContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(interfaceContainerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(interfaceContainerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelPrintActionPerformed
        // TODO add your handling code here:
        billCopy_cancel();
    }//GEN-LAST:event_btnCancelPrintActionPerformed

    private void btnPrintBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintBillActionPerformed
        // TODO add your handling code here:
        billCopy_printBill();
    }//GEN-LAST:event_btnPrintBillActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel billCopyPanel;
    private javax.swing.JPanel billInfoPanel;
    private javax.swing.JPanel billItemPanel;
    private javax.swing.JScrollPane billItemSP;
    private javax.swing.JPanel billPaymentSummeryPanel;
    private javax.swing.JButton btnCancelPrint;
    private javax.swing.JButton btnPrintBill;
    private javax.swing.JPanel cardPanel;
    private javax.swing.JPanel interfaceContainerPanel;
    private javax.swing.JLabel lblBill1;
    private javax.swing.JLabel lblBillCashierDisplay;
    private javax.swing.JLabel lblBillCashierVal;
    private javax.swing.JLabel lblBillDateDisplay;
    private javax.swing.JLabel lblBillDateVal;
    private javax.swing.JLabel lblBillPrintDate;
    private javax.swing.JLabel lblBillPrintDateDisplay;
    private javax.swing.JLabel lblBillTimeDisplay;
    private javax.swing.JLabel lblBillTimeVal;
    private javax.swing.JLabel lblCardAmountDisplay;
    private javax.swing.JLabel lblCardAmountVal;
    private javax.swing.JLabel lblCashAmountDisplay;
    private javax.swing.JLabel lblCashAmountVal;
    private javax.swing.JLabel lblChangeCashDisplay;
    private javax.swing.JLabel lblChangeCashVal;
    private javax.swing.JLabel lblDiscountAmountDisplay;
    private javax.swing.JLabel lblDiscountAmountVal;
    private javax.swing.JLabel lblNetTotalDisplay;
    private javax.swing.JLabel lblNetTotalVal;
    private javax.swing.JLabel lblOtherAmountDisplay;
    private javax.swing.JLabel lblOtherAmountVal;
    private javax.swing.JLabel lblSubTotalDisplay;
    private javax.swing.JLabel lblSubTotalVal;
    private javax.swing.JTable printItemTable;
    private javax.swing.JTextField txtSearchBillNO;
    // End of variables declaration//GEN-END:variables
}