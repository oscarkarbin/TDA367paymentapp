package com.example.payme;

import com.example.payme.model.Event;
import com.example.payme.model.PayDetail;
import com.example.payme.model.PaySplit;

import static org.junit.Assert.*;

import org.junit.Test;

public class EventTest {

    @Test
    public void testEventActive(){
        Event eventTest = new Event("testEvent", null, new PayDetail());
        assertTrue(eventTest.isActive());
    }
    @Test
    public void testEventDisabled(){
        Event eventTest = new Event("testEvent", null, new PayDetail());
        eventTest.markEventAsDone();
        assertFalse(eventTest.isActive());
    }

    @Test
    public void testNameSet(){
        String name = "random";
        Event eventTest = new Event("random", null, new PaySplit());
        eventTest.setEventName("random");
        assertEquals(name, "random" );
    }
}
