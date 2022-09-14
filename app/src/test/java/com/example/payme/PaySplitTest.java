package com.example.payme;

import org.junit.Test;

import static org.junit.Assert.*;
import  com.example.payme.model.*;

import java.security.acl.Group;
import java.util.ArrayList;
import java.util.List;

public class PaySplitTest {
    @Test
    public void splitPayment() {


        Member user1 = new Member("User1", "10");
        Member user2 = new Member("User2", "20");
        Member user3 = new Member("User3", "30");
        Pair<Member, Double> pair1 = new Pair<Member, Double>(user1, 50.0);
        Pair<Member, Double> pair2 = new Pair<Member, Double>(user2, 50.0);
        Pair<Member, Double> pair3 = new Pair<Member, Double>(user3, 50.0);

        List<Member> memberList = new ArrayList<>();
        List<Pair<Member, Double>> memberAndPayment = new ArrayList<>();
        memberAndPayment.add(pair1);
        memberAndPayment.add(pair2);
        memberAndPayment.add(pair3);
        memberList.add(user1);
        memberList.add(user2);
        memberList.add(user3);


        Event testEvent = new Event("TestEvent",memberList, new PaySplit());
        testEvent.addMembersToPair(memberAndPayment);
        testEvent.calcEvent(user1);


        //assertEquals(100.0, balance);
    }


}
