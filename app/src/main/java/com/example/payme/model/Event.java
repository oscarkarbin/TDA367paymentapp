package com.example.payme.model;


import android.os.Build;

import androidx.annotation.RequiresApi;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Event {
    private List<Member> eventMembers = new ArrayList<>();
    private List<Pair<Member, Double>> membersAndPayment;
    private Pair pairAmountMember ;
    private String eventName;
    private boolean active;
    private String date;
    private PaymentMethod paymentMethod;


    @RequiresApi(api = Build.VERSION_CODES.O)
    public Event(String eventName, List<Member> eventMembers, PaymentMethod paymentMethod){
        this.eventName = eventName;
        this.active = true;
        this.eventMembers = eventMembers;
        this.membersAndPayment = new ArrayList<>();
        this.paymentMethod = paymentMethod;
        this.date = getCurrentDate();
    }

    public void getPayer(){
        //Get input from gui;
        //identify the person who payed;
        //return Member payer;
    }
    public List<Member> getMembers() {
        return new ArrayList<>(eventMembers);
    }
    public String getEventDate() {
        return this.date;
    }

    //Ful metod för temporärt test
    public void addMembersToPair(List<Pair<Member, Double>> memberAndPayment){
        this.membersAndPayment = memberAndPayment;
    }


    public void calcEvent(Member payer){
        paymentMethod.calculateBalance(this.membersAndPayment, payer);
    }

    public void addMemberToPair2(Member member, double paidAmoint){
        //Get input from gui;
        membersAndPayment.add(new Pair<Member, Double>(member, paidAmoint));

    }

    public void setEventName(String name){
        eventName = name;
    }

    public boolean isActive() {
        return active;
    }

    public void markEventAsDone() {
        active = false;
    }

    //@RequiresApi(api = Build.VERSION_CODES.O)
    private String getCurrentDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        return formatter.format(date);
    }
}
