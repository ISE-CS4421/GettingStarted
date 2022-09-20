package com.example.project;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ComputationMethodsTest extends AbstractTestingImp{


    @Test
    void testCalculateCircleArea() {
        assertEquals(78.53981633974483, ComputationMethods.calculateCircleArea(5));

    }
    @Test
    void testCalculateFinalPosition() {
        assertEquals((float)303.84 , ComputationMethods.calculateFinalPosition((float)21.1, (float)14.4, (float)1.1));
    }
    @Test
    void testCalculateFunctionValue() {
        ComputationMethods.calculateFunctionValue(10);
        assertEquals("It is not a zero", outContent.toString());
    }

    @Test
    void testCalculatePerimeter() {
        assertEquals(12.0, ComputationMethods.calculatePerimeter(10, 15));
    }
    @Test
    void testCalculateQuadraticZeros() {
        ComputationMethods.calculateQuadraticZeros(2, 4, 6);
        String[] output = outContent.toString().split(System.lineSeparator());
        assertEquals("root1 = -1.00+1.41i", output[0]);
        assertEquals("root2 = -1.00-1.41i", output[1]);
    }
    @Test
    void testCalculateSquareArea() {
        assertEquals(25, ComputationMethods.calculateSquareArea(5));
    }
}
