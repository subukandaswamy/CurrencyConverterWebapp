package org.cpts422.services;

import org.cpts422.currencies.Curr;
import org.cpts422.currencies.CurrencyDao;
import org.cpts422.currencies.CurrencyDaoImpl;
import org.cpts422.transaction.Transaction;
import org.cpts422.transaction.TransactionDao;
import org.cpts422.transaction.TransactionDaoImpl;

public class CurrencyConversionServiceImpl implements CurrencyConversionService {

    private final static CurrencyDao currDao = new CurrencyDaoImpl();

    private final static TransactionDao transactionDao = new TransactionDaoImpl();

    @Override
    public Transaction convertCurrencyToUSD(String fromCurrCode, double amount) {
        return transactionDao.createToUSDTransaction(currDao.getCurrency(fromCurrCode), amount);
    }

    @Override
    public Transaction convertCurrencyFromUSD(String toCurrCode, double amount) {
        return transactionDao.createFromUSDTransaction(currDao.getCurrency(toCurrCode), amount);
    }

    @Override
    public Iterable<Curr> getAllSupportedCurrency() {
        return currDao.getAllCurrencies();
    }
}
