import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {

    //Напишите алгоритм BiggerValue, который из двух параметров типа int возвращает бОльшее значение.
    //Test Data:
    //3333, 9999
    //Expected Result = 9999

    @Test
    public void testBiggerValueOfNumbers(){

        int ExpectedResult = 9999;
        int ActualResult = new BiggerValue().biggerValue(3333, 9999);

        Assert.assertEquals(ActualResult, ExpectedResult);


    }


}
