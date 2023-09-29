package org.cpts422.transaction;

import org.cpts422.currencies.Curr;

public class FromUSDTransaction extends Transaction {
    protected FromUSDTransaction(Curr curr, double initAmount) {
        super(curr, initAmount);
        this.comm = initAmount * this.curr.getBroker().getComm();
        this.finalAmount = (initAmount - this.comm) * this.curr.getRate();
    }
}
