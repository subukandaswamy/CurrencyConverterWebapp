package org.cpts422.currencies;

import org.cpts422.brokers.Broker;

public class Curr {

    private final String code;

    private final String name;

    private final double rate;

    private final Broker broker;

    Curr(String code, String name, double rate, Broker broker) {
        this.code = code;
        this.name = name;
        this.rate = rate;
        this.broker = broker;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public Broker getBroker() {
        return broker;
    }

    @Override
    public String toString() {
        return "Curr{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", rate=" + rate +
                ", broker=" + broker +
                '}';
    }
}
