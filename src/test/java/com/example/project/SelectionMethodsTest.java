package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SelectionMethodsTest {

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
    void testCanSleepIn() {
        assertEquals(true, SelectionMethods.canSleepIn(true, false, 10));
        assertEquals(true, SelectionMethods.canSleepIn(false, false, 12));
        assertEquals(false, SelectionMethods.canSleepIn(false, false, 9));
        assertEquals(false, SelectionMethods.canSleepIn(false, true, 9));
        assertEquals(false, SelectionMethods.canSleepIn(true, true, 12));
    }

    @Test
    void testCanSubmitPaper() {
        assertEquals(true, SelectionMethods.canSubmitPaper(7000, false, false));
        assertEquals(true, SelectionMethods.canSubmitPaper(7000, true, true));
        assertEquals(false, SelectionMethods.canSubmitPaper(5000, true, true));
        assertEquals(false, SelectionMethods.canSubmitPaper(4000, false, false));
        assertEquals(false, SelectionMethods.canSubmitPaper(11000, false, false));
    }

    @Test
    void testDayOfWeek() {
        assertEquals("Monday", SelectionMethods.dayOfWeek(0));
        assertEquals("Tuesday", SelectionMethods.dayOfWeek(1));
        assertEquals("9 is not in the range for days of the week", SelectionMethods.dayOfWeek(9));
    }

    @Test
    void testGradingStudents() {
        assertEquals("A1", SelectionMethods.gradingStudents(50, 90, true));
        assertEquals("C3", SelectionMethods.gradingStudents(20, 40, true));
        assertEquals("B2", SelectionMethods.gradingStudents(50, 40, true));
        assertEquals("F", SelectionMethods.gradingStudents(10, 20, true));
        assertEquals("B1", SelectionMethods.gradingStudents(50, 45, true));
    }

    @Test
    void testIsAbleToVote() {
        assertEquals(true, SelectionMethods.isAbleToVote(18, true, true, 5.5));
        assertEquals(true, SelectionMethods.isAbleToVote(50, true, true, 17.4));
        assertEquals(true, SelectionMethods.isAbleToVote(50, true, true, 5.5));
        assertEquals(false, SelectionMethods.isAbleToVote(18, false, false, 15.5));
        assertEquals(false, SelectionMethods.isAbleToVote(17, true, false, 15.5));
        assertEquals(false, SelectionMethods.isAbleToVote(50, true, false, 15.5));
    }

    @Test
    void testTruncateString() {
        assertEquals("Lorem ipsum dolor sit amet consectetur a...", SelectionMethods.truncateString("Lorem ipsum dolor sit amet consectetur adipiscing elit Maecenas tincidunt", 40));
        assertEquals("This is a short sentence", SelectionMethods.truncateString("This is a short sentence", 30));
    }

    @Test
    void testTypeOfCard() {
        assertEquals("Master Card", SelectionMethods.typeOfCard("1234560888"));
        assertEquals("Visa Card", SelectionMethods.typeOfCard("1234561200"));
        assertEquals("Invalid Card", SelectionMethods.typeOfCard("1234568888"));
    }
}
