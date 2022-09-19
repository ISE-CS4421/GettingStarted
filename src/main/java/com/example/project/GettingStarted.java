package com.example.project;

public class GettingStarted {
    // The main method is the first entry point into a java application
    // The main method is where you will prompted each of your methods to run
    // As an example, if we wanted to test the "helloWorld" method above
    // below in the main method we would have to call this method by typing the method name below like helloWorld();
    // Try this below by uncommenting the test method below to see how this works
    public static void main(String[] args){
        // Uncomment(remove the two forwardslashes) the below line to see how to call a method you've created.
        // testingMethod();
        // Uncomment the below to see how to pass a parameter to a method
        // testingMethodWithParams(5); 
    }
    


    // Exercise 1: In the below method, you are to print a message to the screen saying "Hello World!"
    // Have a look at the example methods below to see what you need to use to output to the console.
    public static void helloWorld() {
        // FILL IN THE blanks
        System.out.print("Hello World!");
    }
    
    // Exercise 2: In the below exercise, we are going to look at some of the main different types of variables
    // We want you to look at the below variables and the notes with them to understand what the different types are for. 
    // For this exercise, lets change up some of the variables to make john not late for class
    // and let make john have 100000.99 in his bank account. 
    // Update the variables below to make john not late for class and lets make him very rich! 
    public static void understandingVariables(){
        // int - this is a variable for holding whole numbers within a range.  
        int age = 42;
        // String - This is a variable for holding text. All strings will be wrapped in "" to make them valid
        String name = "John Doe";
        // boolean - A boolean can only have two different values, true and false. 
        boolean isLate = true;
        // double - A double is an object used for storing decimal numbers within a range.
        double bankBalance = 12.99;

        System.out.println("Hi! I'm " + name + ".");
        System.out.println("I am " + age + " and have " + bankBalance + " in my bank account!");
        System.out.println("It is " + isLate + " that I was late for class!");
    }

    // Exercise 3: In this exercise, you are going to learn about creating variables, setting and updating their values
    // In the method below, you are going to set the values of the variables that are set to null below
    // You will set the persons name to Joe Black, the age to 18 and their student number to 19170123
    // The age variable has not been initialised, you are to initialise it with the detail for Joe Black
    // You are also going to create a new String variable called studentNumber and set it with the detail for Joe Black
    public static void initialisingVariables() {
        String firstName = null;
        String lastName = null;
        int age; 
        // add another variable here!

        // set the age variable to your age

        // Once you have created the new studentNumber Variable, uncomment the line below
        // System.out.println("Hi! My name is " + firstName + " " + lastName + ". I am " + age + " years old and my student number is " + studentNumber);
        
    }






    // Both of the below methods are not part of the exercise but are here as examples for you to see how calling a method works.
    public static void testingMethod() {
        System.out.println("This is a test method to show off how to call a method from the main method");
    }
    public static void testingMethodWithParams(int number){
        System.out.println("The parameter passed into this method can be accessed like this.");
        System.out.println("The value of the parameter passed in is: " + number);
    }
}
