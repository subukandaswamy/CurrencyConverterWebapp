package org.cpts422.transaction;

import org.cpts422.currencies.Curr;

public class TransactionRepositoryImpl {


    public Transaction createFromUSDTransaction(Curr curr, double initAmount) {
        return new FromUSDTransaction(curr, initAmount);
    }


    public Transaction createToUSDTransaction(Curr curr, double initAmount) {
        return new ToUSDTransaction(curr, initAmount);
    }
}
