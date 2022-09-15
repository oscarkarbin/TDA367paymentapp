package com.example.payme;

import com.example.payme.model.Member;

import org.junit.Test;
import static org.junit.Assert.*;

public class MemberTest {
    @Test
    public void assignMember(){
        Member Jihad = new Member("jihad", "072827822");
        Jihad.isAssigned();
        assertTrue(Jihad.getIsAssigned());
        Jihad.isNotAssigned();
        assertFalse(Jihad.getIsAssigned());
    }

    @Test
    public void getNumberMember(){
        Member Jihad = new Member("jihad", "072827822");
        assertEquals(Jihad.getPhoneNumber(),"072827822");
    }

    @Test
    public void setNumberMember(){
        Member Jihad = new Member("jihad", "072827822");
        Jihad.setPhoneNumber("dood");
        assertEquals(Jihad.getPhoneNumber(),"dood");
    }
}
