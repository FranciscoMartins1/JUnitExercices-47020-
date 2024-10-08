import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void sumTest(){
        Calculator calculator = new Calculator();
        int expectedValue = calculator.sum(2, 5);
        int actualValue = 2+7;
        assertEquals(expectedValue,actualValue);
    }
}
