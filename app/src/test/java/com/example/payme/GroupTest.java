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
    public void testCreateGroup(){
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
    public void testCreateEvent(){
        Member Anton = new Member("Anton", "076258015");
        Member Jihad = new Member("jihad", "072827822");
        Member Oskar = new Member("Oskar", "072827822");
        List<Member> list = new ArrayList<Member>();
        list.add(Anton);
        list.add(Jihad);
        list.add(Oskar);
        Group g = new Group("grupp1", list);
        g.createEvent("middag", new PaySplit());

        assertEquals(g.getGroupEvents().size(), 1);
    }
    @Test
    public void testRemoveMember() {
        Member Anton = new Member("Anton", "076258015");
        Member Jihad = new Member("jihad", "072827822");
        Member Oskar = new Member("Oskar", "072827822");
        List<Member> list = new ArrayList<Member>();
        list.add(Anton);
        list.add(Jihad);
        list.add(Oskar);
        Group g = new Group("grupp1", list);
        g.removeMember(Anton);
        assertFalse(g.getGroupMembers().contains(Anton));
    }
    @Test
    public void testAddMember() {
        Member Anton = new Member("Anton", "076258015");
        Member Jihad = new Member("jihad", "072827822");

        List<Member> list = new ArrayList<Member>();
        list.add(Anton);
        list.add(Jihad);
        Group g = new Group("grupp1", list);
        g.addNewMember("Oskar", "072827822");
        assertEquals(g.getGroupMembers().size(), 3);
    }
    @Test
    public void testCreateEventWithMemberAssigned() {
        Member Anton = new Member("Anton", "076258015");
        Member Jihad = new Member("jihad", "072827822");
        List<Member> list = new ArrayList<Member>();
        list.add(Anton);
        list.add(Jihad);
        Group g = new Group("grupp1", list);
        g.getGroupMembers().get(0).isAssigned();
        g.createEvent("event", new PaySplit());
        Event e = g.getGroupEvents().get(0);

        assertEquals(e.getMembers().size(), 1);
    }
    @Test
    public void testResetDebts() {
        Member Anton = new Member("Anton", "076258015");
        Member Jihad = new Member("jihad", "072827822");
        List<Member> list = new ArrayList<Member>();
        list.add(Anton);
        list.add(Jihad);
        Group g = new Group("grupp1", list);
        g.createEvent("event", new PaySplit());
        g.resetDebts();
        assertFalse(g.getGroupEvents().get(0).isActive());
    }
    @Test
    public void testGetGroupName() {
        Member Anton = new Member("Anton", "076258015");
        Member Jihad = new Member("jihad", "072827822");
        List<Member> list = new ArrayList<Member>();
        list.add(Anton);
        list.add(Jihad);
        Group g = new Group("grupp1", list);
        assertEquals(g.getGroupName(), "grupp1");
    }
}
