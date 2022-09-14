package com.example.payme;

import com.example.payme.model.Event;
import com.example.payme.model.Factory;
import com.example.payme.model.Group;
import com.example.payme.model.Member;
import com.example.payme.model.PaySplit;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class GroupTest {
    @Test
    public void CreatGroup(){
        Member Anton = new Member("Anton", "076258015");
        Member Jihad = new Member("jihad", "072827822");
        Member Oskar = new Member("Oskar", "072827822");
        List<Member> list = new ArrayList<Member>();
        list.add(Anton);
        list.add(Jihad);
        list.add(Oskar);
        Group group = Factory.createGroup("Grupp10", list);
        assertEquals(group.getGroupMembers().size(),3);
    }

    @Test
    public void CreateEvent(){
        Member Anton = new Member("Anton", "076258015");
        Member Jihad = new Member("jihad", "072827822");
        Member Oskar = new Member("Oskar", "072827822");
        List<Member> list = new ArrayList<Member>();
        list.add(Anton);
        list.add(Jihad);
        list.add(Oskar);
        Event event = new Event("middag",list, new PaySplit());
        event.markEventAsDone();
        assertFalse(event.isActive());
    }
}
