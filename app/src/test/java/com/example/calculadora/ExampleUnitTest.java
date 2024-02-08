package com.example.calculadora;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    MainActivity main = new MainActivity():
    
    @Test
    public void addition_isCorrect() {
        assertEquals(2432902008176640000, main.Factorial(20));
        assertEquals(21, main.Fibonacci(8));
    }
}
