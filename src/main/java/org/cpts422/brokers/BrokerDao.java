package org.cpts422.brokers;

public interface BrokerDao {

    Broker createBroker(String name, double comm);

    Broker getBroker(String name);

    Iterable<Broker> getAllBrokers();
}
