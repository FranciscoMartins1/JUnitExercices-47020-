import org.example.Area;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaTest {
    @Test
    public void rectAreaTest(){
        Area area = new Area();
        int expectedResult = area.rectArea(3,5);
        int expectedResult2 = area.rectArea(5,8);
        int expectedResult3 = area.rectArea(2,4);
        int actualResult = 15;
        int actualResult2 = 40;
        int actualResult3 = 8;
        assertEquals(expectedResult,actualResult);
        assertEquals(expectedResult2,actualResult2);
        assertEquals(expectedResult3,actualResult3);
    }

    @Test
    public void rectPerimTest(){
        Area area = new Area();
        int expectedResult = area.rectPerim(3,5);
        int expectedResult2 = area.rectPerim(5,8);
        int expectedResult3 = area.rectPerim(2,4);

        int actualResult = 20;
        int actualResult2 = 20;
        int actualResult3 = 20;

        assertEquals(expectedResult,actualResult);
        assertEquals(expectedResult2,actualResult2);
        assertEquals(expectedResult3,actualResult3);

    }

    @Test
    public void isTriangleTest(){
        Area area = new Area();
        int expectedResult = area.isTriangle(2,1,1);
        int actualResult = 1;
        assertEquals(expectedResult,actualResult);
    }
}
