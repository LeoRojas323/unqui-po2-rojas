package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCounter {

    private Counter counter;
    
    @BeforeEach
    public void setUp() throws Exception {
        counter = new Counter();

        counter.addNumber(1);
        counter.addNumber(3);
        counter.addNumber(5);
        counter.addNumber(7);
        counter.addNumber(9);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(4);
    }
    
    @Test
    public void testEvenNumbers() {
        int amount = counter.getEvenOcurrences();

        assertEquals(1, amount);
    }

    @Test
    public void testOddNumbers() {
        int amount = counter.getOddOcurrences();

        assertEquals(9, amount);
    }
    
    @Test
    public void testMultiplesOfThree() {
        int amount = counter.getMultOcurrences(3);

        assertEquals(2, amount);
    }
}
