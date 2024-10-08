import org.example.Digits;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitsTest {

    @BeforeEach
    public void digitsTestBefore(){
        System.out.println("This is print appears before any tests.");
    }

    @Test
    public void digitsTest(){
        Digits digits = new Digits();
        double expectedResult =digits.digitNumbersAverage(4983);
        double actualResult = 6;
        assertEquals(expectedResult,actualResult);
    }
}
