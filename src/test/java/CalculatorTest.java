import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    /**
     * TBD:
     * - Fix the initial test which is failing on purpose
     * - Add tests for null inputs
     * - Add tests for addition of two numbers
     * - Add tests for addition of multiple numbers
     *
     */
    @Test
    public void testSumAllNumbers() {
    	//this test currently fails on purpose
        assertEquals(null, calculator.sumAllNumbers());
    }
    
    /**
     * TBD:
     * - Add tests for null inputs
     * - Add tests for multiplication of two numbers
     * - Add tests for multiplication of multiple numbers
     *
     */
    @Test
    public void testMultiplyAllNumbers() {
    	//write tests here
    }
}
