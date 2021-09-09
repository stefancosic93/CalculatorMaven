import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        assertEquals(4, Calculator.add(2, 2));
    }

    @Test
    void sub() {
        assertEquals(0, Calculator.sub(2, 2));
    }

    @Test
    void mul() {
        assertEquals(4, Calculator.mul(2, 2));
    }

    @Test
    void div() {
        assertEquals(1, Calculator.div(2, 2));
    }
}