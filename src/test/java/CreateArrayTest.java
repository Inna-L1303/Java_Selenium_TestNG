import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateArrayTest {
    //написать в этом классе метод createIntArray(), который принимает на вход 5 целых чисел,  и возвращает массив
    // из этих же чисел.
    //Например, createIntArray(1, 2, 3, 4, 5) -> {1, 2, 3, 4, 5}

    @Test
    public void testCreateArray(){
        int[] ExpectedResult = {1, 2, 3, 4, 5};
        int[] ActualResult = new CreateArray().createIntArray(1,2, 3, 4, 5);
        Assert.assertEquals(ActualResult, ExpectedResult);
    }

    //Написать метод createDoubleArray(), который принимает на вход 5 чисел типа double, и возвращает массив
    // из этих же чисел
    //Например, createDoubleArray(1.1, 2.5, 3.7, 4.0, 5.5) -> {1.1, 2.5, 3.7, 4.0, 5.5}
    @Test
    public void testCreateDoubleArray(){
        double[] ExpectedResult = {1.1, 2.5, 3.7, 4.0, 5.5};
        double[] ActualResult = new CreateArray().createDoubleArray(1.1, 2.5, 3.7, 4.0, 5.5);
        Assert.assertEquals(ActualResult, ExpectedResult);
    }

    //Написать метод createStringArray(), который принимает на вход 5 слов, и возвращает массив из этих слов
    //Например, createStringArray(“It”, “was”, “an”, “apple”, “pie”) -> {“It”, “was”, “an”, “apple”, “pie”}
    @Test
    public void testCreateStringArray(){
        String[] ExpectedResult = {"It", "was", "an", "apple", "pie"};
        String[] ActualResult = new CreateArray().createStringArray("It", "was", "an", "apple", "pie");
        Assert.assertEquals(ActualResult, ExpectedResult);
    }
    //Написать метод createArrayFromText(), который принимает на вход предложение из нескольких слов и возвращает
    // массив из этих слов. String split()
    //Например, createArrayFromText(“It was an apple pie”) -> {“It”, “was”, “an”, “apple”, “pie”}
    @Test
    public void testCreateArrayFromText(){
        String[] ExpectedResult = {"It", "was", "an", "apple", "pie"};
        String[] ActualResult = new CreateArray().createArrayFromText("It was an apple pie");
        Assert.assertEquals(ActualResult, ExpectedResult);
    }


}
