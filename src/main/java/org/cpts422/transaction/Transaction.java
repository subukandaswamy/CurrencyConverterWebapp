package org.cpts422.transaction;

import org.cpts422.currencies.Curr;

import java.sql.Timestamp;

public abstract class Transaction {
    protected final Curr curr;

    protected final double initAmount;

    protected double comm;

    protected double finalAmount;

    protected Timestamp created;


    protected Transaction(Curr curr, double initAmount) {
        this.curr = curr;
        this.initAmount = initAmount;
        this.created = new Timestamp(System.currentTimeMillis());
    }

    public Curr getCurr() {
        return curr;
    }

    public double getInitAmount() {
        return initAmount;
    }

    public double getComm() {
        return comm;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    public double getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(double finalAmount) {
        this.finalAmount = finalAmount;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "curr=" + curr +
                ", initAmount=" + initAmount +
                ", comm=" + comm +
                ", finalAmount=" + finalAmount +
                ", created=" + created +
                '}';
    }
}
