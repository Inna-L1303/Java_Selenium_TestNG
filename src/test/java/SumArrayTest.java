import org.testng.Assert;
import org.testng.annotations.Test;

public class SumArrayTest {

    //Test Data:
    //{0, 1, 2, 3, 4, 5} → 15
    //{-7, -3} → -10
    @Test
    public void testSumOfArrayPositiveNumbers(){
        int[] array = {0, 1, 2, 3, 4, 5};
        int ExpectedResult = 15;
        int ActualResult = new SumArray().sumArray(array);

        Assert.assertEquals(ActualResult, ExpectedResult);
    }
    @Test
    public void testSumOfArrayNegativeNumbers(){

        int[] array = {-7, -3};
        int ExpectedResult = -10;
        int ActualResult = new SumArray().sumArray(array);

        Assert.assertEquals(ActualResult, ExpectedResult);
    }
}
