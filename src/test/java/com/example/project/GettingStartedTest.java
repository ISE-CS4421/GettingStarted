package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class GettingStartedTest {


    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;


    // Setup console streams
    @BeforeEach
    public void setupStreams(){
        System.setOut(new PrintStream(outContent));
    }
    // Revert Setup
    @AfterEach
    public void restoreStreams() {
        outContent.reset();
        System.setOut(originalOut);
    }



    @Test
    void testHelloWorld() {
        GettingStarted.helloWorld();   
        assertEquals("Hello World!", outContent.toString());


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
