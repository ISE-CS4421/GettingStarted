package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringManipulationTest extends AbstractTestingImp{
    @Test
    void testAppendStrings() {
        assertEquals("jumping",StringManipulation.appendStrings("jump", "ing"));
    }

    @Test
    void testCombineStrings() {
        assertEquals("Orange Jumping Monkey", StringManipulation.combineStrings("Orange", "Jumping", "Monkey"));
    }

    @Test
    void testDoesStringContains() {
        assertEquals(true, StringManipulation.doesStringContain("qwerty", "q"));
        assertEquals(false, StringManipulation.doesStringContain("asdfg", "p"));
    }

    @Test
    void testFindIndexOfFirstInstance() {
        assertEquals(37, StringManipulation.findIndexOfFirstInstance("The quick brown fox jumps over the lazy dog", "z"));
        assertEquals(-1, StringManipulation.findIndexOfFirstInstance("input", "z"));
    }

    @Test
    void testGetRestOfSentance() {
        assertEquals("quick brown fox jumps over the lazy dog", StringManipulation.getRestOfSentance("The quick brown fox jumps over the lazy dog"));
    }

    @Test
    void testReplaceB() {
        assertEquals("aaaa", StringManipulation.replaceB("abba"));
        assertEquals("aaaa", StringManipulation.replaceB("aaaa"));
    }

    @Test
    void testReverseString() {
        assertEquals("yadseuT", StringManipulation.reverseString("Tuesday"));
    }

    @Test
    void testStringCasting() {
        assertEquals(42, StringManipulation.stringCasting("20", "22"));
    }
}
