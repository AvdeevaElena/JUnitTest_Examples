package numbers;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyMathTest {

    @Test
    public void add() {
        assertEquals(50, new MyMath().add(25,25));
    }

    @Test
    public void div() throws InstantiationException {
        assertEquals(50, new MyMath().div(100,2));
    }

    @Test (expected = ArithmeticException.class)
    public void divZero() throws InstantiationException {
        assertEquals(50, new MyMath().div(100,0));
    }

}