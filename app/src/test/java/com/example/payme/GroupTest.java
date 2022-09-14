package com.example.payme;

import androidx.constraintlayout.widget.Group;

import com.example.payme.model.Factory;
import com.example.payme.model.Member;

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
        Factory.createGroup("Grupp10", list);
        assertEquals(list.size(),3);
    }
}
