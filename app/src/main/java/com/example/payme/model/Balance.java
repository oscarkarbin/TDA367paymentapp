package com.example.payme.model;

import java.util.List;

public class Balance {
    private double balanceValue;
    private List<Member> members;
    public Balance(int balancevalue, List<Member> memberList) {
        this.balanceValue = balancevalue;
        this.members = memberList;

    }
    public double getCredit(){
        return balanceValue;
    }

    public void resetCredit() {
        balanceValue = 0;
    }

    public void uptadeCredit(double credit){
        balanceValue+=credit;
    }

    void updateBalance(Member memberThatPays, double amountToPay, Member memberToPay){
        memberThatPays.getBalance().uptadeCredit(-amountToPay);
        memberToPay.getBalance().uptadeCredit(amountToPay);
    }


}
