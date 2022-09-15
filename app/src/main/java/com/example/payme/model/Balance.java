package com.example.payme.model;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Balance {
    private Map<String, Double> balanceMap = new HashMap<>();
    private List<Member> members = new ArrayList<>();
    public Balance(Member member, List<Member> memberList) {
        this.members = memberList;
        for(Member m : memberList) {
            if(m != member)
                balanceMap.put(m.getName(), 0.0);
        }
    }
    public void resetBalances() {
        for(Member m : members)
            balanceMap.put(m.getName(), 0.0);
    }
    public double getTotalBalance() {
        double totalBalance = 0;
        for(Member m : members)
            totalBalance += balanceMap.get(m.getName());
        return totalBalance;
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
