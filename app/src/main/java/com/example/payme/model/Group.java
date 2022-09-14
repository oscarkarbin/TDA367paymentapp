package com.example.payme.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author anton
 */
class Group {
    private List<Member> groupMembers = new ArrayList<>();
    private List<Event> groupEvents = new ArrayList<>();
    private String groupName;
    private HashMap<String,String> memember;


    Group(String name, List<Member> members) {
        this.groupName = name;
        this.groupMembers = members;
        this.memember = new HashMap<>();
    }

    public String getGroupName() {
        return groupName;
    }
    public List<Member> getGroupMembers() {
        return new ArrayList<>(groupMembers);
    }
    public void resetDebts() {
        for(Member m : groupMembers) {
            m.resetBalance();
        }
        setAllEventsInactive();
    }
    private void setAllEventsInactive() {
        for(Event e : groupEvents) {
            if(e.isActive()) {
                e.markEventAsDone();
            }
        }
    }
    public void createEvent(String eventName) {
        List<Member> eventMembers = new ArrayList<>();
        for(Member m : groupMembers) {
            if(m.getIsAssigned()) {
                eventMembers.add(m);
                m.isNotAssigned();
            }
        }
        Event e = Factory.createEvent(eventName, eventMembers);
        groupEvents.add(e);
    }
    public void addNewMember(String name, String phoneNumber) {
        groupMembers.add(new Member(name, phoneNumber));
    }
    public void removeMember(Member member) {
        groupMembers.remove(member);
    }
}