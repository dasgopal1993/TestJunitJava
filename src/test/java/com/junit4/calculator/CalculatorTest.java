package com.junit4.calculator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalculatorTest {

    private Calculator calculator;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            { 2, 3, 5 },
            { 5, 2, 7 },
            { 4, 3, 7 },
            { 10, 2, 12 }
        });
    }

    private int a;
    private int b;
    private int expected;

    public CalculatorTest(int a, int b, int expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testArithmeticOperations() {
        int result = calculator.add(a, b);
        assertEquals(expected, result);
    }
    
    
}
