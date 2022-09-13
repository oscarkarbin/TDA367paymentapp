package com.example.payme.model;


import android.os.Build;

import androidx.annotation.RequiresApi;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Event {
    private List<Member> eventMembers = new ArrayList<>();
    private String eventName;
    private boolean active;

    public Event(String eventName, List<Member> eventMembers){
        this.eventName = eventName;
        this.active = true;
    }
    public boolean isActive() {
        return active;
    }

    public void markEventAsDone() {
        active = false;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void currentDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        System.out.println(formatter.format(date));

    }
    
}
