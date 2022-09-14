package com.example.payme.model;

import java.util.Scanner;

public class Member {
    private String name;
    private Balance balance;
    private boolean isAssigned;
    private int phoneNumber;
    //private List<Balance> balance; ??

    public Member(String name, Balance balance, int phoneNumber){
        this.name = name;
        this.balance = new Balance(0);
        this.isAssigned = false;
        this.phoneNumber = 0;
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

    public boolean getIsAssigned() {
        return this.isAssigned;
    }

    public void isAssigned(){
        this.isAssigned = true;
    }

    public void isNotAssigned() {
        this.isAssigned = false;
    }

    public int getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setPhoneNumber(){

    }

//    public int calculateBalance(Balance balance){
//
//    }
}
