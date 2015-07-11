/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.view.pos;

import java.util.ArrayList;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.inventory.Batch;

/**
 *
 * @author Shehan
 */
public class SelectPriceDialog extends javax.swing.JDialog {

    private final InvoiceInternalInterface parent;
    private final int productCode;
    private final ArrayList<Batch> batches;
    private Batch selectedBatch;
    private Map<Integer, Batch> batchMap;

    /**
     * Creates new form SelectPrice
     *
     * @param parent
     * @param modal
     * @param productCode
     * @param batches
     */
    public SelectPriceDialog(InvoiceInternalInterface parent, boolean modal, int productCode, ArrayList<Batch> batches) {
        super(JOptionPane.getFrameForComponent(parent), modal);
        initComponents();

        itemPriceTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                if (itemPriceTable.getSelectedRow() > -1) {
                    // print first column value from selected row
                    System.out.println(itemPriceTable.getValueAt(itemPriceTable.getSelectedRow(), 0).toString());
                }
            }
        });

        setLocationRelativeTo(null);
        this.parent = parent;
        this.productCode = productCode;
        this.batches = batches;
//        for (Batch batch : batches) {
//            batchMap.put(batch.getBatchId(), batch);
//
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        containerPanel = new javax.swing.JPanel();
        lblItemCodeVal = new javax.swing.JLabel();
        lblItemCode = new javax.swing.JLabel();
        itemPriceContainerPanel = new javax.swing.JPanel();
        itemPriceSP = new javax.swing.JScrollPane();
        itemPriceTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Select Price");
        setName("selectPriceDialog"); // NOI18N

        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setShowLeftShadow(true);
        dropShadowBorder1.setShowTopShadow(true);
        containerPanel.setBorder(dropShadowBorder1);

        lblItemCodeVal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblItemCodeVal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblItemCodeVal.setText("<Code>");
        lblItemCodeVal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblItemCode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblItemCode.setText("Code");

        itemPriceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Batch", "Exp. Date", "Qty", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        itemPriceSP.setViewportView(itemPriceTable);

        javax.swing.GroupLayout itemPriceContainerPanelLayout = new javax.swing.GroupLayout(itemPriceContainerPanel);
        itemPriceContainerPanel.setLayout(itemPriceContainerPanelLayout);
        itemPriceContainerPanelLayout.setHorizontalGroup(
            itemPriceContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(itemPriceSP, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        itemPriceContainerPanelLayout.setVerticalGroup(
            itemPriceContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(itemPriceSP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout containerPanelLayout = new javax.swing.GroupLayout(containerPanel);
        containerPanel.setLayout(containerPanelLayout);
        containerPanelLayout.setHorizontalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemPriceContainerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(containerPanelLayout.createSequentialGroup()
                        .addComponent(lblItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblItemCodeVal, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 125, Short.MAX_VALUE)))
                .addContainerGap())
        );
        containerPanelLayout.setVerticalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblItemCodeVal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itemPriceContainerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel containerPanel;
    private javax.swing.JPanel itemPriceContainerPanel;
    private javax.swing.JScrollPane itemPriceSP;
    private javax.swing.JTable itemPriceTable;
    private javax.swing.JLabel lblItemCode;
    private javax.swing.JLabel lblItemCodeVal;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the selectedBatch
     */
    public Batch getSelectedBatch() {
        return selectedBatch;
    }
}
