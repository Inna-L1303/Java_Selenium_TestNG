import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {
    //Test Data:
    //-345 →  “Odd”
    //0 →  “Even”
    //222222 →  “Even”

    //1. Positive testing Happy path - Odd numbers
    @Test
    public void testOddNumbers_HappyPath(){

        String expectedResult = "Odd";

        String actualResult = new OddEven().oddEven(-345);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //2. Positive testing Happy path - Even numbers 0
    @Test
    public void testEvenNumbersZero_HappyPath() {

        String expectedResult = "Even";

        String actualResult = new OddEven().oddEven(0);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //2. Positive testing Happy path - Even numbers
    @Test
    public void testEvenNumbers_HappyPath() {

        String expectedResult = "Even";

        String actualResult = new OddEven().oddEven(222222);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
