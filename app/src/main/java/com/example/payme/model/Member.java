package com.example.payme.model;

import java.util.Scanner;

public class Member {
    private String name;
    private Balance balance;

    public Member(){
        this.name = name;

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

    public void resetBalance(){

    }

//    public int calculateBalance(Balance balance){
//
//    }
}
