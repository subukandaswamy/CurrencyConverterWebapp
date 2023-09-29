package org.cpts422.currencies;

import org.cpts422.brokers.Broker;

public interface CurrencyDao {

    Curr createCurrency(String code, String name, double rate, Broker broker);

    Curr getCurrency(String code);

    Iterable<Curr> getAllCurrencies();

}
