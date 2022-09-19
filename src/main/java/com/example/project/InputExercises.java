package com.example.project;

import java.util.Scanner;

/* 
 Module: CS4421 (ISE)
 Lecturer: Dr. Salim Saay
 Teaching Assistants: Adam J. Doherty & Ivan Guevara
*/

/*
 * In this exercise you will fill in the blanks 
 */


public class InputExercises {
    // Exercise 3a: In this Exercise, we will use the Scanner class to take input from the console.
    // For each of the variables initialised, you will ask the user to provide the given details(i.e, print "What is your name" to the console)
    // and then capture that detail through the use of a Scanner object and the detail out to the console in the expected format below.
    // Expected output format: "Your name is: John, you are 30 years old and your favourite colour is: green"
    // Util: https://www.w3schools.com/java/java_user_input.asp
    public static void readConsoleInput(){
        String name = ""; 
        String age = ""; 
        String favouriteColour = "";
        // FILL IN THE BLANKS
    }
    
    // Exercise 3b: In this exercise, you will allow the user to guess what the value of number is.
    // If the user's guess is less than the value of number then print out "To low!"
    // If the user's guess is more than the value of number, then print out "To high!"
    // If the user guesses the correct number, then print out "You guessed correctly!"
    // A user should not be allow to guess more than 5 times.
    // Constraints: 0 >= number <= 100 
    public static void guessTheInput(int number){
        // FILL IN THE BLANKS

    }
    
    // Exercise 3c: In this exercise, we will be taking a csv file.
    // This file will contain rows of containing A) the name of a employees B) Their current salary C) a percentage increase for this year(float value between 0.01 and 1.00).
    // Your goal will be to read in the file using the file reference String as the file reference.
    // You are asked to print each person to the console with their name, current salary and the amount they're salary should be increased by
    // Example: row = Joe Black, 50000, 0.5 
    // Expected output = "Name: Joe Black, current Salary: 50000, increase: 25000" 
    public static void readFile(String fileReference){
        // FILL IN THE BLANKS
    }
}
