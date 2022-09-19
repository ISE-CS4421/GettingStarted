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

    @Test
    void testCalculateCircleArea() {
        assertEquals(78.53981633974483, GettingStarted.calculateCircleArea(5));

    }
    @Test
    void testCalculateFinalPosition() {
        assertEquals((float)303.84 , GettingStarted.calculateFinalPosition((float)21.1, (float)14.4, (float)1.1));
    }
    @Test
    void testCalculateFunctionValue() {
        GettingStarted.calculateFunctionValue(10);
        assertEquals("It is not a zero", outContent.toString());
    }

    @Test
    void testCalculatePerimeter() {
        assertEquals(12.0, GettingStarted.calculatePerimeter(10, 15));
    }
    @Test
    void testCalculateQuadraticZeros() {
        GettingStarted.calculateQuadraticZeros(2, 4, 6);
        String[] output = outContent.toString().split(System.lineSeparator());
        assertEquals("root1 = -1.00+1.41i", output[0]);
        assertEquals("root2 = -1.00-1.41i", output[1]);
    }
    @Test
    void testCalculateSquareArea() {
        assertEquals(25, GettingStarted.calculateSquareArea(5));
    }
}
