import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testNullInputs() {
        assertEquals(new Integer(1),calculator.sumAllNumbers(0,1).get());
    }
    
}
