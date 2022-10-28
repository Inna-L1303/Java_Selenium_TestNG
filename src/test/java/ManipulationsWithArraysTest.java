import org.testng.Assert;
import org.testng.annotations.Test;

public class ManipulationsWithArraysTest {
    // Написать метод multiplуArrayByNumber(), который принимает на вход массив целых чисел и число int number.
    // Метод возвращает массив тех же чисел, умноженных на number
    //Например, multiplуArrayByNumber()({1, 2, 3, 4, 5}, 3) -> {3, 6, 9, 12, 15}
    @Test
    public void testMultiplyArrayByNumberPositiveNumbers(){

        int[] array = {1, 2, 3, 4, 5};
        int number = 3;

        int[] ExpectedResult = {3, 6, 9, 12, 15};
        int[] ActualResult = new ManipulationsWithArrays().multiplyArrayByNumber(array, number);
        Assert.assertEquals(ActualResult, ExpectedResult);
    }
    @Test
    public void testMultiplyArrayByNumberNegativeNumbers(){

        int[] array = {-1, -2, -3, -4, -5};
        int number = 3;

        int[] ExpectedResult = {-3, -6, -9, -12, -15};
        int[] ActualResult = new ManipulationsWithArrays().multiplyArrayByNumber(array, number);
        Assert.assertEquals(ActualResult, ExpectedResult);
    }
    @Test
    public void testMultiplyArrayZero(){

        int[] array = {0, 0, 0, 0};
        int number = 1;

        int[] ExpectedResult = {0, 0, 0, 0};
        int[] ActualResult = new ManipulationsWithArrays().multiplyArrayByNumber(array, number);
        Assert.assertEquals(ActualResult, ExpectedResult);
    }

}
