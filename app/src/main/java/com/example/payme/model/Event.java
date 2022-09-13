package com.example.payme.model;

import java.util.ArrayList;
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
}
