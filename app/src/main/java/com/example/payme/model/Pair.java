package com.example.payme.model;

import java.nio.channels.FileLock;

public class Pair<A extends Member,B extends Float> {
    private final A member;
    private final B payedAmount;

    public Pair(A member, B amount){
        this.payedAmount = amount;
        this.member = member;
    }

    public A getFirst() {
        return member;
    }
    public B getSecond() {
        return payedAmount;
    }

}
