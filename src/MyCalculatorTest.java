import org.junit.Test;

import static org.junit.Assert.*;

public class MyCalculatorTest {

    @Test
    public void calculate() {
        MyCalculator myCalculator = new MyCalculator();
        assertEquals(myCalculator.calculate(4,2,"+"),6);
        assertEquals(myCalculator.calculate(4,2,"-"),2);
        assertEquals(myCalculator.calculate(4,2,"*"),8);
        assertEquals(myCalculator.calculate(4,2,"/"),2);
    }
}