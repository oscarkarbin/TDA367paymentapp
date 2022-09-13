package com.example.payme.model;

import java.util.Scanner;

public class Member {
    private String name;
    private Balance balance;

    public Member(String name, Balance balance){
        this.name = name;
        this.balance = new Balance(0);
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

    }

    public void resetBalance(){
        balance.resetBalance();

    }

//    public int calculateBalance(Balance balance){
//
//    }
}
