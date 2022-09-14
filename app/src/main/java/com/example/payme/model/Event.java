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
    private PaymentMethod paymentMethod;


    public Event(String eventName, List<Member> eventMembers){
        this.eventName = eventName;
        this.active = true;
        this.eventMembers = eventMembers;
    }

    public void getPayer(){
        
    }

    public void addMembersToPair(List<Member> eventMembers){
        for (Member member: eventMembers) {
            membersAndPayment.add(new Pair<Member, Double>(member, 0.0));
        }
    }

    public void calcEvent(Member payer){
        paymentMethod.calculateBalance(this.membersAndPayment, payer);
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

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void getCurrentDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        System.out.println(formatter.format(date));

    }
    
}
