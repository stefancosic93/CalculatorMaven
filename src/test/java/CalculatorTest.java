import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Before
    public void setUp() {
        System.out.println("Setup the Maven tests!");
    }

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

    @After
    public void tearDown() {
        System.out.println("Tear down the build!");
    }
}