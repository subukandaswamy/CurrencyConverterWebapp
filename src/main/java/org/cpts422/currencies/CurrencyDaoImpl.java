package org.cpts422.currencies;

import org.cpts422.brokers.Broker;

import java.util.HashMap;

public class CurrencyDaoImpl implements CurrencyDao {

    private static final HashMap<String, Curr> CURR_DB = new HashMap<>();

    @Override
    public Curr createCurrency(String code, String name, double rate, Broker broker) {
        Curr currency = new Curr(code, name, rate, broker);
        CURR_DB.put(code, currency);
        return currency;
    }

    @Override
    public Curr getCurrency(String code) {
        if (!CURR_DB.containsKey(code)) {
            throw new NullPointerException("CURR_DB does not have code");
        }
        return CURR_DB.get(code);
    }

    @Override
    public Iterable<Curr> getAllCurrencies() {
        return CURR_DB.values();
    }
}
