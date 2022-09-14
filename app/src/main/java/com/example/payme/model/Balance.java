package com.example.payme.model;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Balance {
    private Map<String, Double> balanceMap = new HashMap<>();
    public Balance(List<Member> memberList) {
        for(Member m : memberList) {
            balanceMap.put(m.getName(), 0.0);
        }
    }

    public void updateBalanceMap(double amountToPay, Member memberToGetPaid){
        try {
            double oldBalance = balanceMap.get(memberToGetPaid.getName());
            balanceMap.put(memberToGetPaid.getName(), oldBalance + amountToPay);
        }
        catch (NullPointerException e) {
            throw new NullPointerException();
        }

    }


}
