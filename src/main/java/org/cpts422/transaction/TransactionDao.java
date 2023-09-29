package org.cpts422.transaction;

import org.cpts422.currencies.Curr;

public interface TransactionDao {

    Transaction createFromUSDTransaction(Curr curr, double initAmount);

    Transaction createToUSDTransaction(Curr curr, double initAmount);

}
