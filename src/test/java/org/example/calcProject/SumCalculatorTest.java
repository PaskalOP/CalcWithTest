package org.example.calcProject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    private SumCalculator calc;
    @BeforeEach
      void start(){calc = new SumCalculator();}


    @Test
    void sumWithOneN() {
        int expected = 1;
        int realResult = calc.sum(1);
        assertEquals(expected, realResult);
    }

    @Test
    void sumWithThreeN() {
        int expected = 6;
        int realResult = calc.sum(3);
        assertEquals(expected, realResult);
    }

    @Test
    void sumWithZero() {
       assertThrows(IllegalArgumentException.class, ()->calc.sum(0));
    }
    @Test
    void sumWithNegativeValue() {
       assertThrows(IllegalArgumentException.class, ()->calc.sum(-1));
    }
}