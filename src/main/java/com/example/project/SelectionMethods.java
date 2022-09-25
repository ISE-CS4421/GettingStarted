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


public class SelectionMethods {

    // Exercise 1: Given a input sentence, if the length of the string is longer than the input limit
    // Then replace the end of the string with "..." and return the new string. The new length of the string will be equal to (limit + "...")
    // If the sentences lenght is less that the limit, then return the orginal sentences.
    // EXAMPLE: inputs = {sentence = "This is a rather long sentence", limit = 16}
    // The expected output:   This is a rather...
    // EXAMPLE: inputs = {sentence = "This is a short sentence", limit = 30}
    // The expected output: This is a short sentence
    public static String truncateString(String sentence, int limit ){
        return "";
    }


    // Exercise 2: In this exercise, we're going to determine if a person is able to vote! 
    // This exercise will take in a number of parameters and depending on the person situation, you are to return a boolean value on if they are able to vote. 
    // RULES
    // A person would be allowed to vote if they are over the age of 18
    // A person must have a valid form of ID to vote. 
    // If a person is over 15KM from a polling station AND are above the age of 50, then they will require transport to the polling station
    // If a person requires transport to the polling station, then they will need to already have transportation.
    public static boolean isAbleToVote(int age, boolean hasID, boolean hasTransport, double distanceFromPoll){
        // FILL IN THE BLANKS
        return true;
    }



    // Exercise 3: Given a number ranging from 0 - 6, print out the corresponding day of the week
    // Mapping: 0 - Monday, 1 - Tuesday, 2 - Wednesday, 3 - Thursday, 4 - Friday, 5 - Saturday, 6 - Sunday
    // If the day is outside the 0 to 6 range, return day" is not in the range for days of the week"
    // Example: day = 9, expected output: "9 is not in the range for days of the week"
    // Constraint: [0 >= day <= 10]
    // NOTE: There is a number of different approaches to solving this problem, after solving, think "is there another way I could go about this"
    public static String dayOfWeek(int day){
        // FILL IN THE BLANKS
        return " ";
    }


    // Exercise 4: For this exercise, you will be given a card number and you are to return the type of card.
    // The type of card is defined in the last 4 digits of the card number
    // You will need to get the last 4 digits of the card number and use a switch case to return the type of card.
    // RULES:
    // If a card number ends between 0001 - 0999, return "Master Card"
    // If a card number ends between 1000 - 1500, return "Visa Card"
    // If a card number ends between 2000 - 3500, return "Credit-Building Card"
    // If a card number falls outside all of the above ranges, return "Invalid Card"
    public static String typeOfCard(String cardnumber){
        return "";
    }

    // Exercise 5: For this exercise, we are going to see if a developer can sleep in!
    // So a developer can sleep in if its the weekend
    // They can also sleep in if they its a weekday but and they don't have a meeting before 11 in the morning
    // BUT if there is a deployement, then a developer isn't even able to sleep in on any day!
    // Taking the rules above, return true if a developer can sleep in or false if they can't
    public static boolean canSleepIn(boolean isWeekend, boolean isThereADeployment, int timeOfFirstMeeting) {
        return false;
    }

    // Exercise 6: In this Exercise we are going to check going to check if a paper can be submitted.
    // A paper can be submitted if the word count is within an acceptable range (5000 >= wordCount <= 10000)
    // The lecturer will ONLY accept a late submission if the student has a sicknote and the wordCount is above 6000 words.
    // Return true if the lecture will accept the submission and false if the lecture will not accept it. 
    public static boolean canSubmitPaper(int wordCount, boolean hasSickNote, boolean lateSubmission){
        return false; 
    }


    // Exercise 7: For this Exercise, you are going to calcuate what grade a student got in the module
    // You will sum up the student grades to get a total grade and return the appropriate grade
    // The max score possible will be 100 and the sum of the accumulatedAssessment and examScores will not exceed that. [(accumulatedAssessment + examScores) <= 150]
    // You will need to convert the total score of the student to a representation of a percentage(decimal between 0.01 and 0.99) of the max score possible 
    // If a student is within 3% of their next grade and have a perfect attendance, then increase that studnet grade(it is not possible to recieve a grade above an A1). 
    // If the student does not have perfect attendance, then do not raise the grade.
    // Below you will find a mapping for percentage to grade
    // Grade Percentage_band
    // A1 75% or more
    // A2 70%
    // B1 65%
    // B2 60%
    // B3 55%
    // C1 50%
    // C2 45%
    // C3 40%
    // D1 35%
    // D2 30%
    // F Less than 30%
    public static String gradingStudents(int accumulatedAssessment, int examScores, boolean attendance){
        return " ";
    }
}
