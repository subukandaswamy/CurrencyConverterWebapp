package org.cpts422.brokers;

public class Broker {

    private final String name;

    private final double comm;

    Broker(String name, double comm) {
        this.name = name;
        this.comm = comm;
    }

    public String getName() {
        return name;
    }

    public double getComm() {
        return comm;
    }

    @Override
    public String toString() {
        return "Broker{" +
                "name='" + name + '\'' +
                ", comm=" + comm +
                '}';
    }
}
