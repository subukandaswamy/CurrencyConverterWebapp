package org.cpts422.transaction;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import org.cpts422.currencies.Curr;

@Entity
@DiscriminatorValue("ToUSDTransaction")
public class ToUSDTransaction extends Transaction {
    public ToUSDTransaction(Curr curr, double initAmount) {
        super(curr, initAmount);
        double rawAmount = initAmount / curr.getRate();
        this.comm = rawAmount * curr.getBroker().getComm();
        this.finalAmount = rawAmount - this.comm;
    }

    protected ToUSDTransaction() {
        super();
    }
}
