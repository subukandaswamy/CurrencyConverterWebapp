package org.cpts422.services;

import org.cpts422.currencies.Curr;
import org.cpts422.transaction.Transaction;

public interface CurrencyConversionService {

    Transaction convertCurrencyToUSD(String fromCurrCode, double amount);

    Transaction convertCurrencyFromUSD(String toCurrCode, double amount);

    Iterable<Curr> getAllSupportedCurrency();
}
