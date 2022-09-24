package com.example.project;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public abstract class AbstractTestingImp {
    

    public final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    public final PrintStream originalOut = System.out;


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
}
