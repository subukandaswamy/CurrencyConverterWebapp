package org.cpts422.transaction;

import org.cpts422.currencies.Curr;

public class ToUSDTransaction extends Transaction {
    protected ToUSDTransaction(Curr curr, double initAmount) {

        super(curr, initAmount);
        double rawAmount = initAmount / curr.getRate();
        this.comm = rawAmount * curr.getBroker().getComm();
        this.finalAmount = rawAmount - this.comm;
    }
}
