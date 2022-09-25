package com.example.project;

/* 
 Module: CS4421 (ISE)
 Lecturer: Dr. Salim Saay
 Teaching Assistants: Adam J. Doherty & Ivan Guevara
*/

/*
 * In this exercise you will fill in the blanks 
 * In the last set of exercises, there was a main method already created for you.
 * You'll need on in this file as well to test out your methods.
 * Look to "GettingStarted.java" to see the example of a main method.
 */


public class StringManipulation {
    
    // Exercise 1: For this Exercise, you are to combine the 3 inputs into a single string and return that value.
    // You should include a space between each paramter in the final message
    // Example inputs: start = "Hello", middle = "Good", end = "Morning"
    // Expected output: "Hello Good Morning"
    public static String combineStrings(String start, String middle, String end) {
        return "";
    }


    // Exercise 2: In this exercise, you are to to append the suflix to the given input.
    // Example: input = "Jump" suflix = "ing"
    // return: "Jumping" 
    public static String appendStrings(String input, String suflix) {
        return " ";
    }


    // Exercise 3: For this Exercise, you are to check if a string contains a certain character.
    // This exercise will need you to use the .contains() method to check if a string contains the specified character.
    // If the input string does contain the character, then you should return true, and false if not.
    public static Boolean doesStringContain(String input, String character) {
        return true;
    }

    // return the position of
    // Exercise 4: For this Exercise, you are given a sentence and a needle.
    // You are to return the index of the first instance of the needle but if the needle does not exsist then return -1.
    // You will need to look into how to find out where the index of a character is in a string.
    // Ref: https://www.w3schools.com/java/ref_string_indexof.asp#:~:text=The%20indexOf()%20method%20returns,(s)%20in%20a%20string.
    // Example: input = "The quick brown fox jumps over the lazy dog", needle = "z"
    // return: 37
    // Example: input = "I hate Mondays", needle = "q"
    // return: -1
    public static int findIndexOfFirstInstance(String input, String needle) {
        return 0;
    }

    // Exercise 5: For this Exercise, you are to return the reverse of the given string
    // Example : input = "Monday"
    // return: "yadnoM"
    public static String reverseString(String input) {
        return "";
    }

    // Exercise 6: For this Exercise, you are given two string that are numbers.
    // Your task is to convert these strings to integers, add both these numbers and then return the sum. 
    // You will need to learn about how to parse strings to integers via the Integer.parseint()
    // ref: https://www.tutorialspoint.com/java/number_parseint.htm
    // Assumption: You can assume that all parameters(num1, num2) will actually be integers in string format.
    // Example inputs: String num1 = "8", String num2 = "5"
    // return value: 13
    public static int stringCasting(String num1, String num2) {
        return 0; 
    }


    // Exercise 7: For this Exercise, you are to replace all instances of the letter b with the letter A instead and return the new string.
    // For this, you will need to look into the .replace() and .replaceAll() methods in java
    // ref: https://www.javatpoint.com/java-string-replace
    // Example: input = "abba" output = "aaaa"
    public static String replaceB(String input) {
        return "";
    }


    // Exercise 8: For this Exercise, you are given a sentence and you are to return a substring of this sentence, from the first space.
    // You will need to look into how the substring() method works!
    // Ref: https://beginnersbook.com/2013/12/java-string-substring-method-example/
    // Example: sentence = "The quick brown fox jumps over the lazy dog" return = "quick brown fox jumps over the lazy dog"
    public static String getRestOfSentance(String sentance) {
        return " ";
    }
    

}
