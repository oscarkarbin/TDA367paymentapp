package com.example.payme.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author anton
 */
public class Group {
    private List<Member> groupMembers = new ArrayList<>();
    private List<Event> groupEvents = new ArrayList<>();
    private String name;


    public Group(String name, List<Member> members) {
        this.name = name;
        this.groupMembers = members;
    }
}
