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
        List<Member> memberList = createMemberList(user1);
        Event testEvent = new Event("Test-Event", memberList, new PaySplit());
        testEvent.addMembersToPair(memberList);
        testEvent.calcEvent(user1);


        assertEquals(4, 2 + 2);
    }

    private List<Member> createMemberList(Member user1){

        Member user2 = new Member("User2", "20");
        Member user3 = new Member("User3", "30");
        List<Member> groupList = new ArrayList<>();
        groupList.add(user1);
        groupList.add(user2);
        groupList.add(user3);
        return groupList;
    }

}
