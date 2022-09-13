package com.example.payme.model;

import java.util.Scanner;

public class Member {
    private String name;
    private Balance balance;

    public Member(){
        this.name = name;

    }

    public void getName(String name){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of member ");
        this.name = sc.nextLine();
    }

    public Balance getBalance(Balance balance) {
        return balance;
    }

//    public int calculateBalance(Balance balance){
//
//    }
}
