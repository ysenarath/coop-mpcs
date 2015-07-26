package ui.view.pos;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import org.apache.log4j.Logger;

public class BillRefundInternalInterface extends javax.swing.JInternalFrame {

// <editor-fold defaultstate="collapsed" desc="Variables">
    private static final Logger logger = Logger.getLogger(BillRefundInternalInterface.class);
    private final POSMDIInterface parent;
    private final JDesktopPane desktopPane;

    //KeyMaps
    private InputMap inputMap;
    private ActionMap actionMap;

    //Glass pane
    private final JPanel glassPanel;
    private final JLabel padding;

    // </editor-fold>
    //
    //
    //
// <editor-fold defaultstate="collapsed" desc="Constructor">
    public BillRefundInternalInterface(POSMDIInterface parent, JDesktopPane desktopPane) {
        logger.debug("BillRefundInternalInterface constructor invoked");
        initComponents();
        this.parent = parent;
        this.desktopPane = desktopPane;

        Dimension desktopSize = desktopPane.getSize();
        Dimension jInternalFrameSize = this.getSize();
        this.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                (desktopSize.height - jInternalFrameSize.height) / 2);

        this.glassPanel = new JPanel(new GridLayout(0, 1));
        this.padding = new JLabel();

        glassPanel.setOpaque(false);
        glassPanel.add(padding);

        glassPanel.addMouseListener(
                new MouseAdapter() {
                });
        glassPanel.addMouseMotionListener(
                new MouseMotionAdapter() {
                });
        glassPanel.addKeyListener(
                new KeyAdapter() {
                });

        // make sure the focus won't leave the glass pane
        glassPanel.setFocusCycleRoot(true);
        setGlassPane(glassPanel);
        performKeyBinding();
    }

    // </editor-fold>
    //
    //
    //
// <editor-fold defaultstate="collapsed" desc="Key Bindings "> 
    private void performKeyBinding() {

        inputMap = interfaceContainerPanel.getInputMap(JPanel.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        actionMap = interfaceContainerPanel.getActionMap();

        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "doEscapeAction");
        actionMap.put("doEscapeAction", new keyBindingAction("Escape"));

    }

    private class keyBindingAction extends AbstractAction {

        private final String cmd;

        public keyBindingAction(String cmd) {
            this.cmd = cmd;
        }

        @Override
        public void actionPerformed(ActionEvent tf) {
            if (cmd.equalsIgnoreCase("Escape")) {
                logger.debug("BillRefundInternal Interface - Escape Pressed ");
                cancelRefund();
            }
        }
    }

    // </editor-fold>
    //
    //
    //
// <editor-fold defaultstate="collapsed" desc="Methods">
    //Disable the glassPanel pane
    public void disableGlassPane() {
        logger.debug("disableGlassPane invoked");

        glassPanel.setVisible(false);
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "doEscapeAction");
        actionMap.put("doEscapeAction", new keyBindingAction("Escape"));
    }

    //Enable the glassPanel pane
    public void enableGlassPane() {
        logger.debug("enableGlassPane invoked");

        inputMap.remove(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0));
        actionMap.remove("doEscapeAction");
        
        glassPanel.setVisible(true);//Disable this UI
        padding.requestFocus();  // required to trap key events
    }

    //Create a new bill from refund
    private void makeNewBill() {
        logger.warn("refund_newBill not implemented");
    }

    //Cancel a refund
    private void cancelRefund() {
        logger.debug("refund_cancel invoked");
        parent.setIsMainActivityRunning(false);
        parent.setIsBillRefundRunning(false);

        this.dispose();
    }
    // </editor-fold>
    //
    //
    //
// <editor-fold defaultstate="collapsed" desc="Netbeans generated Code">  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        interfaceContainerPanel = new javax.swing.JPanel();
        cardPanel = new javax.swing.JPanel();
        refundPanel = new javax.swing.JPanel();
        billPaymentSummeryPanel1 = new javax.swing.JPanel();
        lblRefundOtherAmountDisplay = new javax.swing.JLabel();
        lblRefundCashAmountDisplay = new javax.swing.JLabel();
        lblRefundCardAmountDisplay = new javax.swing.JLabel();
        lblRefundChangeCashDisplay = new javax.swing.JLabel();
        lblRefundCashAmountVal = new javax.swing.JLabel();
        lblRefundCardAmountVal = new javax.swing.JLabel();
        lblRefundOtherAmountVal = new javax.swing.JLabel();
        lblRefundChangeCashVal = new javax.swing.JLabel();
        lblRefundDiscountAmountDisplay = new javax.swing.JLabel();
        lblRefundDiscountAmountVal = new javax.swing.JLabel();
        lblRefundNetTotalDisplay = new javax.swing.JLabel();
        lblRefundNetTotalVal = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JButton();
        lblRefundCancelDiscountAmountDisplay = new javax.swing.JLabel();
        javax.swing.JLabel lblRefundCancelDiscountAmountVal = new javax.swing.JLabel();
        lblRefundCancelNetTotalDisplay = new javax.swing.JLabel();
        lblRefundCancelNetTotalVal = new javax.swing.JLabel();
        lblBillRefundDateDisplay = new javax.swing.JLabel();
        lblBillDate = new javax.swing.JLabel();
        billRefundItemPanel = new javax.swing.JPanel();
        billItemSP1 = new javax.swing.JScrollPane();
        billRefunditemTable = new javax.swing.JTable();
        javax.swing.JPanel billRefundInfoPanel = new javax.swing.JPanel();
        lblBill3 = new javax.swing.JLabel();
        txtSearchBillNO1 = new javax.swing.JTextField();
        lblBillRefundNoVal = new javax.swing.JLabel();
        lblBillRefundNoDisplay = new javax.swing.JLabel();

        setMaximizable(true);
        setResizable(true);
        setTitle("Bill Refund");
        setMinimumSize(new java.awt.Dimension(934, 598));

        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setShowLeftShadow(true);
        dropShadowBorder1.setShowTopShadow(true);
        interfaceContainerPanel.setBorder(dropShadowBorder1);

        cardPanel.setLayout(new java.awt.CardLayout());

        billPaymentSummeryPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblRefundOtherAmountDisplay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRefundOtherAmountDisplay.setText("Other ");

        lblRefundCashAmountDisplay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRefundCashAmountDisplay.setText("Cash Amount");

        lblRefundCardAmountDisplay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRefundCardAmountDisplay.setText("Card Amount");

        lblRefundChangeCashDisplay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRefundChangeCashDisplay.setText("Change Cash");

        lblRefundCashAmountVal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRefundCashAmountVal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRefundCashAmountVal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblRefundCardAmountVal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRefundCardAmountVal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRefundCardAmountVal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblRefundOtherAmountVal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRefundOtherAmountVal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRefundOtherAmountVal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblRefundChangeCashVal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRefundChangeCashVal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRefundChangeCashVal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblRefundDiscountAmountDisplay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRefundDiscountAmountDisplay.setText("Discount Amount");

        lblRefundDiscountAmountVal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRefundDiscountAmountVal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRefundDiscountAmountVal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblRefundNetTotalDisplay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRefundNetTotalDisplay.setText("Net Total");

        lblRefundNetTotalVal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRefundNetTotalVal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRefundNetTotalVal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnConfirm.setText("Confirm");
        btnConfirm.setToolTipText("");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        lblRefundCancelDiscountAmountDisplay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRefundCancelDiscountAmountDisplay.setText("Cancel Discount Amount");

        lblRefundCancelDiscountAmountVal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRefundCancelDiscountAmountVal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRefundCancelDiscountAmountVal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblRefundCancelNetTotalDisplay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRefundCancelNetTotalDisplay.setText("Cancel Net Total");

        lblRefundCancelNetTotalVal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblRefundCancelNetTotalVal.setForeground(new java.awt.Color(204, 0, 51));
        lblRefundCancelNetTotalVal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRefundCancelNetTotalVal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblBillRefundDateDisplay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBillRefundDateDisplay.setText("Bill Date : ");

        lblBillDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBillDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBillDate.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout billPaymentSummeryPanel1Layout = new javax.swing.GroupLayout(billPaymentSummeryPanel1);
        billPaymentSummeryPanel1.setLayout(billPaymentSummeryPanel1Layout);
        billPaymentSummeryPanel1Layout.setHorizontalGroup(
            billPaymentSummeryPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billPaymentSummeryPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(billPaymentSummeryPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, billPaymentSummeryPanel1Layout.createSequentialGroup()
                        .addComponent(lblRefundCardAmountDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblRefundCardAmountVal, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, billPaymentSummeryPanel1Layout.createSequentialGroup()
                        .addComponent(lblRefundOtherAmountDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblRefundOtherAmountVal, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, billPaymentSummeryPanel1Layout.createSequentialGroup()
                        .addGroup(billPaymentSummeryPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRefundCashAmountDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBillRefundDateDisplay))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(billPaymentSummeryPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblBillDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblRefundCashAmountVal, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(billPaymentSummeryPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(billPaymentSummeryPanel1Layout.createSequentialGroup()
                        .addGroup(billPaymentSummeryPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(billPaymentSummeryPanel1Layout.createSequentialGroup()
                                .addComponent(lblRefundDiscountAmountDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblRefundDiscountAmountVal, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(billPaymentSummeryPanel1Layout.createSequentialGroup()
                                .addComponent(lblRefundNetTotalDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblRefundNetTotalVal, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(billPaymentSummeryPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, billPaymentSummeryPanel1Layout.createSequentialGroup()
                                .addGroup(billPaymentSummeryPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblRefundCancelNetTotalDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblRefundCancelDiscountAmountDisplay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(billPaymentSummeryPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRefundCancelDiscountAmountVal, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRefundCancelNetTotalVal, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnConfirm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(billPaymentSummeryPanel1Layout.createSequentialGroup()
                        .addComponent(lblRefundChangeCashDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblRefundChangeCashVal, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        billPaymentSummeryPanel1Layout.setVerticalGroup(
            billPaymentSummeryPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, billPaymentSummeryPanel1Layout.createSequentialGroup()
                .addGroup(billPaymentSummeryPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(billPaymentSummeryPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(billPaymentSummeryPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(billPaymentSummeryPanel1Layout.createSequentialGroup()
                                .addComponent(lblBillRefundDateDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, billPaymentSummeryPanel1Layout.createSequentialGroup()
                                .addComponent(lblBillDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(billPaymentSummeryPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(billPaymentSummeryPanel1Layout.createSequentialGroup()
                                .addGroup(billPaymentSummeryPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblRefundCashAmountDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRefundCashAmountVal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(billPaymentSummeryPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRefundCardAmountVal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRefundCardAmountDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(billPaymentSummeryPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblRefundOtherAmountDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRefundOtherAmountVal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(billPaymentSummeryPanel1Layout.createSequentialGroup()
                                .addGroup(billPaymentSummeryPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblRefundChangeCashDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRefundChangeCashVal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(billPaymentSummeryPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblRefundDiscountAmountDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRefundDiscountAmountVal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(billPaymentSummeryPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblRefundNetTotalDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRefundNetTotalVal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(billPaymentSummeryPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(billPaymentSummeryPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRefundCancelDiscountAmountDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRefundCancelDiscountAmountVal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(billPaymentSummeryPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRefundCancelNetTotalDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRefundCancelNetTotalVal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        billRefunditemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Code", "Description", "Price", "Original Qty", "Refundable Qty", "Value", "Disc", "Change Qty", "Change value", "Change Dis", "Sub total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Object.class, java.lang.Double.class, java.lang.Double.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        billRefunditemTable.setRowHeight(21);
        billRefunditemTable.getTableHeader().setReorderingAllowed(false);
        billItemSP1.setViewportView(billRefunditemTable);
        if (billRefunditemTable.getColumnModel().getColumnCount() > 0) {
            billRefunditemTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            billRefunditemTable.getColumnModel().getColumn(1).setPreferredWidth(150);
            billRefunditemTable.getColumnModel().getColumn(2).setPreferredWidth(50);
            billRefunditemTable.getColumnModel().getColumn(3).setPreferredWidth(50);
            billRefunditemTable.getColumnModel().getColumn(4).setPreferredWidth(50);
            billRefunditemTable.getColumnModel().getColumn(5).setPreferredWidth(50);
            billRefunditemTable.getColumnModel().getColumn(6).setPreferredWidth(50);
            billRefunditemTable.getColumnModel().getColumn(7).setPreferredWidth(50);
            billRefunditemTable.getColumnModel().getColumn(8).setPreferredWidth(50);
            billRefunditemTable.getColumnModel().getColumn(9).setPreferredWidth(50);
        }

        javax.swing.GroupLayout billRefundItemPanelLayout = new javax.swing.GroupLayout(billRefundItemPanel);
        billRefundItemPanel.setLayout(billRefundItemPanelLayout);
        billRefundItemPanelLayout.setHorizontalGroup(
            billRefundItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(billItemSP1)
        );
        billRefundItemPanelLayout.setVerticalGroup(
            billRefundItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(billItemSP1, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
        );

        lblBill3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBill3.setText("Bill Number : ");

        txtSearchBillNO1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSearchBillNO1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        lblBillRefundNoVal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBillRefundNoVal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBillRefundNoVal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblBillRefundNoDisplay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBillRefundNoDisplay.setText("Bill refund No :");

        javax.swing.GroupLayout billRefundInfoPanelLayout = new javax.swing.GroupLayout(billRefundInfoPanel);
        billRefundInfoPanel.setLayout(billRefundInfoPanelLayout);
        billRefundInfoPanelLayout.setHorizontalGroup(
            billRefundInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billRefundInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBill3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSearchBillNO1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblBillRefundNoDisplay)
                .addGap(18, 18, 18)
                .addComponent(lblBillRefundNoVal, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        billRefundInfoPanelLayout.setVerticalGroup(
            billRefundInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billRefundInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(billRefundInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBill3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchBillNO1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBillRefundNoVal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBillRefundNoDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout refundPanelLayout = new javax.swing.GroupLayout(refundPanel);
        refundPanel.setLayout(refundPanelLayout);
        refundPanelLayout.setHorizontalGroup(
            refundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(refundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(refundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(billRefundInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(billRefundItemPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(billPaymentSummeryPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        refundPanelLayout.setVerticalGroup(
            refundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(refundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(billRefundInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(billRefundItemPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(billPaymentSummeryPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cardPanel.add(refundPanel, "refundCard");

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
            .addGap(0, 918, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(interfaceContainerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(interfaceContainerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        logger.warn("refund_newBill not implemented - show the invoice ui with a (-)ve balance");
        makeNewBill();
    }//GEN-LAST:event_btnConfirmActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane billItemSP1;
    private javax.swing.JPanel billPaymentSummeryPanel1;
    private javax.swing.JPanel billRefundItemPanel;
    private javax.swing.JTable billRefunditemTable;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JPanel cardPanel;
    private javax.swing.JPanel interfaceContainerPanel;
    private javax.swing.JLabel lblBill3;
    private javax.swing.JLabel lblBillDate;
    private javax.swing.JLabel lblBillRefundDateDisplay;
    private javax.swing.JLabel lblBillRefundNoDisplay;
    private javax.swing.JLabel lblBillRefundNoVal;
    private javax.swing.JLabel lblRefundCancelDiscountAmountDisplay;
    private javax.swing.JLabel lblRefundCancelNetTotalDisplay;
    private javax.swing.JLabel lblRefundCancelNetTotalVal;
    private javax.swing.JLabel lblRefundCardAmountDisplay;
    private javax.swing.JLabel lblRefundCardAmountVal;
    private javax.swing.JLabel lblRefundCashAmountDisplay;
    private javax.swing.JLabel lblRefundCashAmountVal;
    private javax.swing.JLabel lblRefundChangeCashDisplay;
    private javax.swing.JLabel lblRefundChangeCashVal;
    private javax.swing.JLabel lblRefundDiscountAmountDisplay;
    private javax.swing.JLabel lblRefundDiscountAmountVal;
    private javax.swing.JLabel lblRefundNetTotalDisplay;
    private javax.swing.JLabel lblRefundNetTotalVal;
    private javax.swing.JLabel lblRefundOtherAmountDisplay;
    private javax.swing.JLabel lblRefundOtherAmountVal;
    private javax.swing.JPanel refundPanel;
    private javax.swing.JTextField txtSearchBillNO1;
    // End of variables declaration//GEN-END:variables
// </editor-fold>
}
