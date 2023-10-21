package org.cpts422.brokers;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Broker")
public class Broker {

    private String name;

    private double comm;

    @Id
    @GeneratedValue
    private Long id;

    public Broker(String name, double comm) {
        this.name = name;
        this.comm = comm;
    }

    public Broker() {

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
