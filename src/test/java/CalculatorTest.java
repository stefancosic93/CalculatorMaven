import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void add() throws Exception{
        assertEquals(4, Calculator.add(2, 2));
    }

    @Test
    public void sub() {
        assertEquals(0, Calculator.sub(2, 2));
    }

    @Test
    public void mul() {
        assertEquals(4, Calculator.mul(2, 2));
    }

    @Test
    public void div() {
        assertEquals(1, Calculator.div(2, 2), 0.212121);
    }
    
}