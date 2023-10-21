package org.cpts422.transaction;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import org.cpts422.currencies.Curr;


@Entity
@DiscriminatorValue("FromUSDTransaction")
public class FromUSDTransaction extends Transaction {
    public FromUSDTransaction(Curr curr, double initAmount) {
        super(curr, initAmount);
        this.comm = initAmount * this.curr.getBroker().getComm();
        this.finalAmount = (initAmount - this.comm) * this.curr.getRate();
    }

    protected FromUSDTransaction() {
        super();
    }
}
