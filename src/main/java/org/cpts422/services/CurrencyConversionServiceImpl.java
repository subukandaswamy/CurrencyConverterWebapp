package org.cpts422.services;

import org.cpts422.currencies.Curr;
import org.cpts422.currencies.CurrencyRepository;
import org.cpts422.exceptions.CurrencyNotSupportedException;
import org.cpts422.transaction.FromUSDTransaction;
import org.cpts422.transaction.ToUSDTransaction;
import org.cpts422.transaction.Transaction;
import org.cpts422.transaction.TransactionRepository;
import org.springframework.stereotype.Service;

@Service
public class CurrencyConversionServiceImpl implements CurrencyConversionService {

    private final CurrencyRepository currencyRepository;

    private final TransactionRepository transactionRepository;

    public CurrencyConversionServiceImpl(CurrencyRepository currencyRepository, TransactionRepository transactionRepository) {
        this.currencyRepository = currencyRepository;
        this.transactionRepository = transactionRepository;
    }

    @Override
    public Transaction convertCurrencyToUSD(String fromCurrCode, double amount) {
        Curr curr = currencyRepository.findById(fromCurrCode).orElseThrow(() -> new CurrencyNotSupportedException());
        Transaction toUSDTransaction = new ToUSDTransaction(curr, amount);
        return transactionRepository.save(toUSDTransaction);
    }

    @Override
    public Transaction convertCurrencyFromUSD(String toCurrCode, double amount) {
        Curr curr = currencyRepository.findById(toCurrCode).orElseThrow(() -> new CurrencyNotSupportedException());
        Transaction fromUSDTransaction = new FromUSDTransaction(curr, amount);
        return transactionRepository.save(fromUSDTransaction);
    }

    @Override
    public Iterable<Curr> getAllSupportedCurrency() {
        return currencyRepository.findAll();
    }
}
