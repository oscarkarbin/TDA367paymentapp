package com.example.payme.model;

import java.util.List;

public class Factory {
    public static Group createGroup(String name, List<Member> members) {
        return new Group(name, members);
    }
    public static Event createEvent(String eventName, List<Member> eventMembers, PaymentMethod paymentMethod) {
        return new Event(eventName, eventMembers, paymentMethod);
    }
}
