import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

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
    //Написать метод toDoubleArray(), который принимает на вход массив целых чисел,  и возвращает массив типа
    // double[] из тех же чисел
    //Например, toDoubleArray({1, 2, 3, 4, 5}) -> {1.0, 2.0, 3.0, 4.0, 5.0}
    @Test
    public void testToDoubleArray(){
        int[] array = {1, 2, 3, 4, 5};

        double[] ExpectedResult = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] ActualResult = new ManipulationsWithArrays().toDoubleArray(array);
        Assert.assertEquals(ActualResult, ExpectedResult);
        System.out.println(Arrays.toString(ExpectedResult));
        System.out.println(Arrays.toString(ActualResult));
    }
    //Написать метод toIntArray(), который принимает на вход массив типа double[],  и возвращает массив типа int[]
    // из тех же чисел
    //Например, toIntArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {1, 2, 3, 4, 5}
    @Test
    public void testToIntArray(){
        double[] array = {1.1, 2.5, 3.7, 4.0, 5.5};

        int[] ExpectedResult = {1, 2, 3, 4, 5};
        int[] ActualResult = new ManipulationsWithArrays().toIntArray(array);
        Assert.assertEquals(ActualResult, ExpectedResult);
        System.out.println(Arrays.toString(ExpectedResult));
        System.out.println(Arrays.toString(ActualResult));
    }
    //Написать метод toStringArray(), который принимает на вход массив целых чисел,  и возвращает массив типа String[]
    // из тех же чисел (желательно не использовать метод .toString(), нужно переводить вручную)
    //Например, toStringArray({1, 2, 3, 4, 5}) -> {“1”, “2”, “3”, “4”, “5”}
    @Test
    public void testToStringArray(){
        int[] array = {1, 2, 3, 4, 5};

        String[] ExpectedResult = {"1", "2", "3", "4", "5"};
        String[] ActualResult = new ManipulationsWithArrays().toStringArray(array);
        Assert.assertEquals(ActualResult, ExpectedResult);
        System.out.println(ActualResult);
        System.out.println(ExpectedResult);
    }




}
