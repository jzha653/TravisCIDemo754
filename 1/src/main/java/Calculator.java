import java.util.Arrays;
import java.util.Optional;

public class Calculator {

    public Optional<Integer> sumAllNumbers(final Integer... valuesParam){
        return  Optional.of(Arrays.stream(valuesParam).reduce(0,(a,b) -> a + b));
        }
}

