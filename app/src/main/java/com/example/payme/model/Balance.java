package com.example.payme.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Balance {
    private double balanceValue;
    private List<Member> members;
    private Map<String, Double> balanceMap = new HashMap<>();
    private double totalBalance;
    public Balance(int balancevalue, List<Member> memberList) {
        this.balanceValue = balancevalue;
        this.members = memberList;
        this.totalBalance = 0;
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

    public void updateBalance(double credit){
        balanceValue+=credit;
    }


    public void updateBalanceMap(double amountToPay, Member memberToGetPaid){
        balanceMap.put(memberToGetPaid.getName(), balanceValue + amountToPay);
    }


}
