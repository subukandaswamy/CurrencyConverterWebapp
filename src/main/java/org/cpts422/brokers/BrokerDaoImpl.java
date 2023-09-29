package org.cpts422.brokers;

import java.util.HashMap;
import java.util.Map;

public class BrokerDaoImpl implements BrokerDao {

    private static final Map<String, Broker> BROKER_DB = new HashMap<>();

    @Override
    public Broker createBroker(String name, double comm) {
        Broker broker = new Broker(name, comm);
        BROKER_DB.put(name, broker);
        return broker;
    }

    @Override
    public Broker getBroker(String name) {
        if (!BROKER_DB.containsKey(name)) {
            throw new NullPointerException("BROKER_DB does not have name");
        }
        return BROKER_DB.get(name);
    }

    @Override
    public Iterable<Broker> getAllBrokers() {
        return BROKER_DB.values();
    }
}
