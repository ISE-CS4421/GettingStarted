package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class RepetitionMethodsTest extends AbstractTestingImp{
    @Test
    void testCalculateFactoral() {
        assertEquals(3628800, RepetitionMethods.calculateFactoral(10));
        assertEquals(120, RepetitionMethods.calculateFactoral(5));
    }

    @Test
    void testFibonacci() {
        assertEquals(610, RepetitionMethods.fibonacci(15));
        assertEquals(5, RepetitionMethods.fibonacci(5));
    }

    @Test
    void testInputPrinting() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        String userInput = String.format("Howdy!%sMy Name is John%This is some test input%send%s",
        System.lineSeparator(),
        System.lineSeparator(), 
        System.lineSeparator(), 
        System.lineSeparator());
        ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);
        RepetitionMethods.inputPrinting();
        String outputText[] = baos.toString().split(System.lineSeparator());
        assertEquals("What is your input?"+ System.lineSeparator(), outputText[0]);
        assertEquals("Exiting..."+ System.lineSeparator(), outputText[outputText.length - 1]);
    }

    @Test
    void testNumericTree() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        System.setOut(printStream);
        RepetitionMethods.numericTree();
        String outputText[] = baos.toString().split(System.lineSeparator());
        assertEquals("1 ", outputText[outputText.length - 5 ]);
        assertEquals("1 2 ", outputText[outputText.length - 4 ]);
        assertEquals("1 2 3 ", outputText[outputText.length - 3 ]);
        assertEquals("1 2 3 4 ", outputText[outputText.length - 2 ]);
        assertEquals("1 2 3 4 5 ", outputText[outputText.length - 1 ]);
    }

    @Test
    void testPrintNumbers() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        System.setOut(printStream);
        RepetitionMethods.printNumbers();
        String outputText[] = baos.toString().split(System.lineSeparator());
        assertEquals("1", outputText[outputText.length - 10]);
        assertEquals("2", outputText[outputText.length - 9]);
        assertEquals("3", outputText[outputText.length - 8]);
        assertEquals("4", outputText[outputText.length - 7]);
        assertEquals("5", outputText[outputText.length - 6]);
        assertEquals("6", outputText[outputText.length - 5]);
        assertEquals("7", outputText[outputText.length - 4]);
        assertEquals("8", outputText[outputText.length - 3]);
        assertEquals("9", outputText[outputText.length - 2]);
        assertEquals("10", outputText[outputText.length - 1]);
    }

    @Test
    void testPrintQuanity() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        System.setOut(printStream);
        RepetitionMethods.printQuanity(5);
        String outputText[] = baos.toString().split(System.lineSeparator());
        assertEquals("Inside a Loop!", outputText[outputText.length - 1]);
        assertEquals(5, (outputText.length-1));
    }

    @Test
    void testSumNatureNumbers() {
        assertEquals(5050, RepetitionMethods.sumNatureNumbers(100));
        assertEquals(55, RepetitionMethods.sumNatureNumbers(10));
    }

    @Test
    void testSumOfInputs() {
        String userInput = String.format("10%s10%s12%s12%s0",
            System.lineSeparator(),
            System.lineSeparator(), 
            System.lineSeparator(), 
            System.lineSeparator());
        ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(bais);
        String expected = "The sum of all inputs equals 42";
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        System.setOut(printStream);
        RepetitionMethods.sumOfInputs();
        String outputText[] = baos.toString().split(System.lineSeparator());
        assertEquals(expected, outputText[outputText.length-1]);
    }
}
