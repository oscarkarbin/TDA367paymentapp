package com.example.payme.model;

public class Balance {
    private int balanceValue;
    public Balance(int balancevalue) {
        this.balanceValue = balancevalue;
    }
    public int getBalance(){
        return balanceValue;
    }

    public void resetBalance() {
        balanceValue = 0;
    }
}
