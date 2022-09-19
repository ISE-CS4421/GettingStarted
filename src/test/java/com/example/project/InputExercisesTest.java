package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InputExercisesTest {

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
    void testGuessTheInput() {
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream((3 + System.lineSeparator() + 40 + System.lineSeparator() + 20 + System.lineSeparator() + 15).getBytes()));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        PrintStream stdout = System.out;
        System.setOut(ps);
        InputExercises.guessTheInput(15);
        System.setIn(stdin);
        System.setOut(stdout);
        String outputText[] = byteArrayOutputStream.toString().split(System.lineSeparator());
        assertEquals("To low!", outputText[0]);
        assertEquals("To high!", outputText[1]);
        assertEquals("To high!", outputText[2]);
        assertEquals("You guessed correctly!", outputText[3]);   
        System.setIn(stdin);
        System.setOut(stdout);
    }
    
    @Test
    void testReadConsoleInput() {
        
        // "Your name is: " + name + ", you are " + age + " years old and your favourite colour is: " + favouriteColour
    }

    @Test
    void testReadFile() {

    }
}
