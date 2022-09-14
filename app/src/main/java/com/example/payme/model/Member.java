package com.example.payme.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Member {
    private String name;
    private Balance balance;
    private boolean isAssigned;
    private String phoneNumber;
    private Map<Member, Float> balanceMap = new HashMap<>();


    public Member(String name, String phoneNumber){
        this.name = name;
        this.isAssigned = false;
        this.phoneNumber = phoneNumber;
    }
    public void initMemberBalance(List<Member> members) {
        this.balance = new Balance(0, members);
    }
    public String getName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of member ");
        this.name = sc.nextLine();
        return this.name;
    }

    public Balance getBalance() {
        return balance;
    }

    public void updateBalance(Member memberThatPays, double amountToPay, Member memberToPay){
            balance.updateBalance(memberThatPays, amountToPay, memberToPay);
    }

    public void resetBalance(){
        balance.resetCredit();

    }

    public boolean getIsAssigned() {
        return this.isAssigned;
    }

    public void isAssigned(){
        this.isAssigned = true;
    }

    public void isNotAssigned() {
        this.isAssigned = false;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setPhoneNumber(){
        //input from user in a text field
    }

//    public int calculateBalance(Balance balance){
//
//    }
}
