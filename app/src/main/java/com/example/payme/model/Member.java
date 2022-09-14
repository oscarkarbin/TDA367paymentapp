package com.example.payme.model;

import java.util.Scanner;

public class Member {
    private String name;
    private Balance balance;
    private boolean isAssigned;
    //private List<Balance> balance; ??

    public Member(String name, Balance balance, boolean isAssigned){
        this.name = name;
        this.balance = new Balance(0);
        this.isAssigned = false;
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

    public void updateBalance(){
        // Updates a users balance
    }

    public void resetBalance(){
        balance.resetBalance();

    }

    public void isAssigned(){
        this.isAssigned = false;
    }

//    public int calculateBalance(Balance balance){
//
//    }
}
