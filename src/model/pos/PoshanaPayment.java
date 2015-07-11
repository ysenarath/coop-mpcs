/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.pos;

/**
 *
 * @author Shehan
 */
public class PoshanaPayment extends Payment {

    private String stampId;
    private String customerName;

    public PoshanaPayment(int billId, int paymentId, String stampId, String customerName, double amount) {
        super(billId, paymentId, amount);
        this.stampId = stampId;
        this.customerName = customerName;
    }

    /**
     * @return the stampId
     */
    public String getStampId() {
        return stampId;
    }

    /**
     * @param stampId the stampId to set
     */
    public void setStampId(String stampId) {
        this.stampId = stampId;
    }

    /**
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

}
