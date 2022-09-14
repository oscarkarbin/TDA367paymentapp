package com.example.payme.model;

import java.util.List;

public class Balance {
    private int balanceValue;
    private List<Member> members;
    public Balance(int balancevalue, List<Member> memberList) {
        this.balanceValue = balancevalue;
        this.members = memberList;

    }
    public int getBalance(){
        return balanceValue;
    }

    public void resetBalance() {
        balanceValue = 0;
    }
}
