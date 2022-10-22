import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveNumberTest {
    //Напишите алгоритм IsPositiveNumber, который возвращает true, если численный  параметр больше или равен нулю,
    // и возвращает false, если параметр меньше 0.
    //Проверьте работу метода на числах 555, 0 и -555.

    @Test
    public void testPositiveNumber(){
        boolean ExpectedResult = true;
        boolean ActualResult = new IsPositiveNumber().isPositiveNumber(555);
        Assert.assertEquals(ActualResult, true);

    }
    @Test
    public void testPositiveZeroNumber(){
        boolean ExpectedResult = true;
        boolean ActualResult = new IsPositiveNumber().isPositiveNumber(0);
        Assert.assertEquals(ActualResult, true);

    }

    @Test
    public void testNegativeNumber(){
        boolean ExpectedResult = false;
        boolean ActualResult = new IsPositiveNumber().isPositiveNumber(-555);
        Assert.assertEquals(ActualResult, false);

    }
}
