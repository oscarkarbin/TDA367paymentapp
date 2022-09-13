package com.example.payme.model;

public class MemberCost {
    public Member member;
    public float payedAmount;

    public MemberCost(float amount, Member member){
        this.payedAmount = amount;
        this.member = member;

    }
    public float getPayedAmount() {
        return payedAmount;
    }
    public void setPayedAmount(float payedAmount) {
        this.payedAmount = payedAmount;
    }

    public Member getMember() {
        return member;
    }

    //Don't know if this is correct :3
}
