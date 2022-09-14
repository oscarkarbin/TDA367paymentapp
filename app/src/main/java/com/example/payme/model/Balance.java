package com.example.payme.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Balance {
    private double balanceValue;
    private List<Member> members;
    private Map<String, Double> balanceMap = new HashMap<>();
    public Balance(int balancevalue, List<Member> memberList) {
        this.balanceValue = balancevalue;
        this.members = memberList;
        for(Member m : memberList) {
            balanceMap.put(m.getName(), 0.0);
        }
    }
    public double getCredit(){
        return balanceValue;
    }

    public void resetCredit() {
        balanceValue = 0;
    }

    public void updateCredit(double credit){
        balanceValue+=credit;
    }

    void updateBalance(Member memberThatPays, double amountToPay, Member memberToPay){
        memberThatPays.getBalance().updateCredit(-amountToPay);
        memberToPay.getBalance().updateCredit(amountToPay);
    }


}
