package com.example.payme.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author anton
 */
public class Group {
    private List<Member> groupMembers = new ArrayList<>();
    private List<Event> groupEvents = new ArrayList<>();
    private String groupName;


    public Group(String name, List<Member> members) {
        this.groupName = name;
        this.groupMembers = members;
    }

    public String getGroupName() {
        return groupName;
    }
    public List<Member> getGroupMembers() {
        return new ArrayList<>(groupMembers);
    }
    public void resetDebts() {
        for(Event e : groupEvents) {
            if(e.isActive()) {
                e.markEventAsDone();
            }
        }
    }
}