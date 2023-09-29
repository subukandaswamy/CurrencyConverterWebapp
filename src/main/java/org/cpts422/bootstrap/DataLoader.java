package org.cpts422.bootstrap;

import org.cpts422.brokers.Broker;
import org.cpts422.brokers.BrokerDao;
import org.cpts422.brokers.BrokerDaoImpl;
import org.cpts422.currencies.CurrencyDao;
import org.cpts422.currencies.CurrencyDaoImpl;


public class DataLoader {

    private static final BrokerDao brokerDao = new BrokerDaoImpl();

    private static final CurrencyDao currDao = new CurrencyDaoImpl();

    public static void loadData() {
        Broker broker = brokerDao.createBroker("Forex", 0.1);
        currDao.createCurrency("INR", "Indian Rupee", 80, broker);
        currDao.createCurrency("CNY", "Chinese Yuan", 8, broker);

    }


}
