package com.example.payme.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Member {
    private String name;
    private Balance balance;
    private boolean isAssigned;
    private String phoneNumber;
    //private List<Balance> balance; ??

    public Member(String name, String phoneNumber){
        this.name = name;
        this.isAssigned = false;
        this.phoneNumber = phoneNumber;
    }

    public void initBalance(List<Member> members) {
        List<Member> balanceMembers = new ArrayList<>();
        for(Member m : members) {
            if(!(m == this))
                balanceMembers.add(m);
        }
        this.balance = new Balance(0, balanceMembers);
    }
    public String getName(String name){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of member ");
        this.name = sc.nextLine();
        return this.name;
    }

    public Balance getBalance(Balance balance) {
        return balance;
    }

    public void updateBalance(Member memberThatPays, float amountToPay, Member memberToPay){
            balance.updateBalance(memberThatPays, amountToPay, memberToPay);
    }

    public void resetBalance(){
        balance.resetBalance();

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

    }

//    public int calculateBalance(Balance balance){
//
//    }
}
