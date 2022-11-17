package pl.sda.mg.wdt.testowanie.fibonacci;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {

    @Test
    void shouldReturnZeroForZeroElement() {
        assertEquals(0, Fibonacci.getValue(0));
    }

    @Test
    void shouldReturnOneForFirstElement() {
        assertEquals(1, Fibonacci.getValue(1));
    }

    @Test
    void shouldReturnValue() {
        assertEquals(8, Fibonacci.getValue(6));
        assertEquals(144, Fibonacci.getValue(12));
        assertEquals(987, Fibonacci.getValue(16));
    }
}
