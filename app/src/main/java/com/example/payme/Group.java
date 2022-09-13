package com.example.payme;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Member> groupMembers = new ArrayList<>();
    private List<Event> groupEvents = new ArrayList<>();
    private String name;


    public Group(String name, List<Member> members) {
        this.name = name;
        this.groupMembers = members;
    }
}
