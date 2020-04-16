import java.util.Arrays;

public class Calculator {

	/**
     * TBD:
     * - Add all Integers together
     * - Note: do not change method signature
     */
    public Integer sumAllNumbers(final Integer... valuesParam){
       // throw new RuntimeException("Write your code here");
       if(valuesParam.length == 0){
           return null;
       }
        Integer sum = 0;
        for (Integer value : valuesParam) {
            sum = sum + value;
        }
        return sum;
    }
    
	/**
     * TBD:
     * - Multiply all Integers together
     * - Note: do not change method signature
     */
    public Integer multiplyAllNumbers(final Integer... valuesParam){
        Integer result = 1;
        for (Integer value : valuesParam) {
            result = result + value;
        }
        return result;
    }
}
