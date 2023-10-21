package org.cpts422.currencies;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import org.cpts422.brokers.Broker;

@Entity
@Table(name = "Currencies")
public class Curr {

    @Id
    private String code;

    private String name;

    private double rate;

    @ManyToOne
    private Broker broker;

    public Curr(String code, String name, double rate, Broker broker) {
        this.code = code;
        this.name = name;
        this.rate = rate;
        this.broker = broker;
    }

    public Curr() {

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
