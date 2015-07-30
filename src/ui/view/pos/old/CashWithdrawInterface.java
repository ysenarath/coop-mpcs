/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.view.pos.old;

import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import org.apache.log4j.Logger;
import ui.view.pos.POSMDIInterface;

/**
 *
 * @author Shehan
 */
public class CashWithdrawInterface extends javax.swing.JInternalFrame {

    private static final Logger logger = Logger.getLogger(CashWithdrawInterface.class);
    private final POSMDIInterface parent;
    private final JDesktopPane desktopPane;

    /**
     * Creates new form CashWithdrawInterface
     *
     * @param parent
     * @param desktopPane
     */
    public CashWithdrawInterface(POSMDIInterface parent, JDesktopPane desktopPane) {
        initComponents();
        this.parent = parent;
        this.desktopPane = desktopPane;

        Dimension desktopSize = desktopPane.getSize();
        Dimension jInternalFrameSize = this.getSize();
        this.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                (desktopSize.height - jInternalFrameSize.height) / 2);
    }

    private void cancelWithdraw() {
        logger.warn("cancelWithdraw invoked");
        this.dispose();
    }

    private void withdrawCash() {
        logger.warn("Not implemented");
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cashWithdrawalPanel = new javax.swing.JPanel();
        cashWithdrawalInfoPanel = new javax.swing.JPanel();
        lblCashWithrawalNoDisplay = new javax.swing.JLabel();
        lblCashWithrawalNoVal = new javax.swing.JLabel();
        lblCounterDisplay = new javax.swing.JLabel();
        lblCounter = new javax.swing.JLabel();
        infoPanel = new javax.swing.JPanel();
        lblWithdrawAmountDisplay = new javax.swing.JLabel();
        lblCashierName = new javax.swing.JLabel();
        lblNameDisplay = new javax.swing.JLabel();
        lblCashierID = new javax.swing.JLabel();
        lblCashierPassDisplay = new javax.swing.JLabel();
        lblDateDisplay = new javax.swing.JLabel();
        lblSignOnDate = new javax.swing.JLabel();
        lblTimeDisplay = new javax.swing.JLabel();
        lblSignOnTime = new javax.swing.JLabel();
        lblSignOn = new javax.swing.JLabel();
        lblCW = new javax.swing.JLabel();
        lblCWDate = new javax.swing.JLabel();
        lblCWTime = new javax.swing.JLabel();
        lblCashierIDDisplay = new javax.swing.JLabel();
        txtCashierPassword = new javax.swing.JPasswordField();
        lblInitialAmountDisplay = new javax.swing.JLabel();
        lblInitialAmount = new javax.swing.JLabel();
        lblChiefCashierIDDisplay = new javax.swing.JLabel();
        lblChiefCashierID = new javax.swing.JLabel();
        lblChiefCashierPasswordDisplay = new javax.swing.JLabel();
        txtChiefCashierPassword = new javax.swing.JPasswordField();
        btnCancel = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();
        lblCurrentAmountDisplay = new javax.swing.JLabel();
        lblCurrentAmountVal = new javax.swing.JLabel();
        lblShiftDisplay = new javax.swing.JLabel();
        lblShiftVal = new javax.swing.JLabel();
        txtWithdrawalAmountVal = new javax.swing.JFormattedTextField();

        setClosable(true);
        setTitle("Cash Withdraw");

        cashWithdrawalPanel.setPreferredSize(new java.awt.Dimension(475, 600));

        lblCashWithrawalNoDisplay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCashWithrawalNoDisplay.setText("Cash Withrawal No");

        lblCashWithrawalNoVal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCashWithrawalNoVal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCashWithrawalNoVal.setText("<Withdrawal No>");
        lblCashWithrawalNoVal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCounterDisplay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCounterDisplay.setText("Counter");
        lblCounterDisplay.setToolTipText("");

        lblCounter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCounter.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCounter.setText("<counter>");
        lblCounter.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout cashWithdrawalInfoPanelLayout = new javax.swing.GroupLayout(cashWithdrawalInfoPanel);
        cashWithdrawalInfoPanel.setLayout(cashWithdrawalInfoPanelLayout);
        cashWithdrawalInfoPanelLayout.setHorizontalGroup(
            cashWithdrawalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cashWithdrawalInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCashWithrawalNoDisplay)
                .addGap(47, 47, 47)
                .addComponent(lblCashWithrawalNoVal, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(lblCounterDisplay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        cashWithdrawalInfoPanelLayout.setVerticalGroup(
            cashWithdrawalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cashWithdrawalInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cashWithdrawalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cashWithdrawalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCounterDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cashWithdrawalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCashWithrawalNoVal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCashWithrawalNoDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setShowLeftShadow(true);
        dropShadowBorder1.setShowTopShadow(true);
        infoPanel.setBorder(dropShadowBorder1);

        lblWithdrawAmountDisplay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblWithdrawAmountDisplay.setText("Withdraw Amount (Rs.)");

        lblCashierName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCashierName.setText("<Cashier Name>");
        lblCashierName.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNameDisplay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNameDisplay.setText("Name");

        lblCashierID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCashierID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCashierID.setText("<Cashier ID>");
        lblCashierID.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCashierPassDisplay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCashierPassDisplay.setText("Cashier Password");

        lblDateDisplay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDateDisplay.setText("Date");

        lblSignOnDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSignOnDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSignOnDate.setText("<date>");
        lblSignOnDate.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTimeDisplay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTimeDisplay.setText("Time");

        lblSignOnTime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSignOnTime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSignOnTime.setText("<time>");
        lblSignOnTime.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblSignOn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSignOn.setText("Sign On");

        lblCW.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCW.setText("Cash Withdrawal");

        lblCWDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCWDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCWDate.setText("<date>");
        lblCWDate.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCWTime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCWTime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCWTime.setText("<time>");
        lblCWTime.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCashierIDDisplay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCashierIDDisplay.setText("Cashier ID");

        txtCashierPassword.setBackground(new java.awt.Color(255, 255, 0));
        txtCashierPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblInitialAmountDisplay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblInitialAmountDisplay.setText("Initial Amount (Rs.) ");

        lblInitialAmount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblInitialAmount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblInitialAmount.setText("<Amount>");
        lblInitialAmount.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblChiefCashierIDDisplay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblChiefCashierIDDisplay.setText("Chief Cashier  ID");

        lblChiefCashierID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblChiefCashierID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblChiefCashierID.setText("<Cashier ID>");
        lblChiefCashierID.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblChiefCashierPasswordDisplay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblChiefCashierPasswordDisplay.setText("Cashier Password");

        txtChiefCashierPassword.setBackground(new java.awt.Color(255, 255, 0));
        txtChiefCashierPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        lblCurrentAmountDisplay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCurrentAmountDisplay.setText("Current Amount (Rs.) ");

        lblCurrentAmountVal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCurrentAmountVal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCurrentAmountVal.setText("<Amount>");
        lblCurrentAmountVal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblShiftDisplay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblShiftDisplay.setText("Shift");
        lblShiftDisplay.setToolTipText("");

        lblShiftVal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblShiftVal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblShiftVal.setText("<Shift>");
        lblShiftVal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtWithdrawalAmountVal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));
        txtWithdrawalAmountVal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtWithdrawalAmountVal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSignOn)
                        .addGap(106, 106, 106)
                        .addComponent(lblCW)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(infoPanelLayout.createSequentialGroup()
                                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNameDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTimeDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDateDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCashierIDDisplay)
                                    .addComponent(lblInitialAmountDisplay))
                                .addGap(34, 34, 34)
                                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCashierName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(infoPanelLayout.createSequentialGroup()
                                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblSignOnDate, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                            .addComponent(lblSignOnTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, Short.MAX_VALUE)
                                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblCWTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblCWDate, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)))
                                    .addGroup(infoPanelLayout.createSequentialGroup()
                                        .addComponent(lblInitialAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(infoPanelLayout.createSequentialGroup()
                                        .addComponent(lblCashierID, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblShiftDisplay)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblShiftVal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(infoPanelLayout.createSequentialGroup()
                                .addComponent(lblChiefCashierPasswordDisplay)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtChiefCashierPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(infoPanelLayout.createSequentialGroup()
                                .addComponent(lblChiefCashierIDDisplay)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblChiefCashierID, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPanelLayout.createSequentialGroup()
                                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCashierPassDisplay)
                                    .addComponent(lblWithdrawAmountDisplay))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCashierPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                    .addComponent(txtWithdrawalAmountVal))))))
                .addContainerGap())
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCurrentAmountDisplay)
                .addGap(18, 18, 18)
                .addComponent(lblCurrentAmountVal, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblShiftDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblShiftVal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCashierID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCashierIDDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNameDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCashierName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSignOn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCW, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDateDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSignOnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCWDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTimeDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSignOnTime, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCWTime, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInitialAmountDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInitialAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCurrentAmountDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCurrentAmountVal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWithdrawAmountDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWithdrawalAmountVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCashierPassDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCashierPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChiefCashierIDDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblChiefCashierID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChiefCashierPasswordDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtChiefCashierPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 19, Short.MAX_VALUE)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout cashWithdrawalPanelLayout = new javax.swing.GroupLayout(cashWithdrawalPanel);
        cashWithdrawalPanel.setLayout(cashWithdrawalPanelLayout);
        cashWithdrawalPanelLayout.setHorizontalGroup(
            cashWithdrawalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cashWithdrawalInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(infoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        cashWithdrawalPanelLayout.setVerticalGroup(
            cashWithdrawalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cashWithdrawalPanelLayout.createSequentialGroup()
                .addComponent(cashWithdrawalInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cashWithdrawalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cashWithdrawalPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        cancelWithdraw();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        // TODO add your handling code here:
        withdrawCash();
    }//GEN-LAST:event_btnOkActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOk;
    private javax.swing.JPanel cashWithdrawalInfoPanel;
    private javax.swing.JPanel cashWithdrawalPanel;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JLabel lblCW;
    private javax.swing.JLabel lblCWDate;
    private javax.swing.JLabel lblCWTime;
    private javax.swing.JLabel lblCashWithrawalNoDisplay;
    private javax.swing.JLabel lblCashWithrawalNoVal;
    private javax.swing.JLabel lblCashierID;
    private javax.swing.JLabel lblCashierIDDisplay;
    private javax.swing.JLabel lblCashierName;
    private javax.swing.JLabel lblCashierPassDisplay;
    private javax.swing.JLabel lblChiefCashierID;
    private javax.swing.JLabel lblChiefCashierIDDisplay;
    private javax.swing.JLabel lblChiefCashierPasswordDisplay;
    private javax.swing.JLabel lblCounter;
    private javax.swing.JLabel lblCounterDisplay;
    private javax.swing.JLabel lblCurrentAmountDisplay;
    private javax.swing.JLabel lblCurrentAmountVal;
    private javax.swing.JLabel lblDateDisplay;
    private javax.swing.JLabel lblInitialAmount;
    private javax.swing.JLabel lblInitialAmountDisplay;
    private javax.swing.JLabel lblNameDisplay;
    private javax.swing.JLabel lblShiftDisplay;
    private javax.swing.JLabel lblShiftVal;
    private javax.swing.JLabel lblSignOn;
    private javax.swing.JLabel lblSignOnDate;
    private javax.swing.JLabel lblSignOnTime;
    private javax.swing.JLabel lblTimeDisplay;
    private javax.swing.JLabel lblWithdrawAmountDisplay;
    private javax.swing.JPasswordField txtCashierPassword;
    private javax.swing.JPasswordField txtChiefCashierPassword;
    private javax.swing.JFormattedTextField txtWithdrawalAmountVal;
    // End of variables declaration//GEN-END:variables

}
