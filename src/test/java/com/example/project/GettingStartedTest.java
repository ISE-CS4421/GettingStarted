package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class GettingStartedTest extends AbstractTestingImp{

    @Test
    void testHelloWorld() {
        GettingStarted.helloWorld();   
        assertEquals("Hello World!" + System.lineSeparator(), outContent.toString());


    }

    @Test
    void testInitialisingVariables() {
        GettingStarted.initialisingVariables();
        assertEquals("Hi! My name is Joe Black. I am 18 years old and my student number is 19170123" + System.lineSeparator(), outContent.toString());
    }

    @Test
    void testUnderstandingVariables() {
        GettingStarted.understandingVariables();
        assertEquals("Hi! I'm John Doe." + System.lineSeparator() +
        "I am 42 and have 100000.99 in my bank account!" + System.lineSeparator() + 
        "It is false that I was late for class!" + System.lineSeparator(), outContent.toString());
    }

   
}
