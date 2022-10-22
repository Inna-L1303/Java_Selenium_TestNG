import org.testng.Assert;
import org.testng.annotations.Test;

public class AreNumbersEqualTest {
    //Напишите алгоритм AreNumbersEqual, который принимает на вход 2 любых int числа, и возвращает
    //0, если числа равны
    //-1, если первое число меньше второго
    //1, если первое число больше второго
    //Test Data:
    //89, 89
    //Expected result: 0
    //-89, 89
    //Expected result: -1
    //89, -89
    //Expected result: 1

    @Test
    public void testNumbersAreEqual(){
        int ExpectedResult = 0;
        int ActualResult = new AreNumbersEqual().areNumbersEqual(89,89);
        Assert.assertEquals(ActualResult,ExpectedResult);
    }
    @Test
    public void testFirstNumberLessThanSecondNumber(){
        int ExpectedResult = -1;
        int ActualResult = new AreNumbersEqual().areNumbersEqual(-89,89);
        Assert.assertEquals(ActualResult,ExpectedResult);
    }
    @Test
    public void testFirstNumberLargerThanSecondNumber(){
        int ExpectedResult = 1;
        int ActualResult = new AreNumbersEqual().areNumbersEqual(89,-89);
        Assert.assertEquals(ActualResult,ExpectedResult);
    }


}
