package com.example.payme.model;

import java.util.List;

public class Factory {
    public static Group createGroup(String name, List<Member> members) {
        return new Group(name, members);
    }
}
