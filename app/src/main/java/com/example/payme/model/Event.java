package com.example.payme.model;

import java.util.ArrayList;
import java.util.List;

public class Event {
    private List<Member> eventMembers = new ArrayList<>();
    private String eventName;

    public Event(String eventName, List<Member> eventMembers){
        this.eventName = eventName;
    }
}
