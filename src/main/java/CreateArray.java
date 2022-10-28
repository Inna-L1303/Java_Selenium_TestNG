
public class CreateArray {
    //написать в этом классе метод createIntArray(), который принимает на вход 5 целых чисел,  и возвращает массив
    // из этих же чисел.
    //Например, createIntArray(1, 2, 3, 4, 5) -> {1, 2, 3, 4, 5}

    public int[] createIntArray(int  a, int b, int c, int d, int e) {

        return new int[] {a, b, c, d, e};
    }
    //Написать метод createDoubleArray(), который принимает на вход 5 чисел типа double, и возвращает массив
    // из этих же чисел
    //Например, createDoubleArray(1.1, 2.5, 3.7, 4.0, 5.5) -> {1.1, 2.5, 3.7, 4.0, 5.5}
    public double[] createDoubleArray(double a, double b, double c, double d, double e){

        return new double[] {a, b, c, d, e};
    }
    //Написать метод createStringArray(), который принимает на вход 5 слов, и возвращает массив из этих слов
    //Например, createStringArray(“It”, “was”, “an”, “apple”, “pie”) -> {“It”, “was”, “an”, “apple”, “pie”}
    public String[] createStringArray(String str1, String str2, String str3, String str4, String str5){

        return new String[] {str1, str2, str3, str4, str5};
    }
    //Написать метод createArrayFromText(), который принимает на вход предложение из нескольких слов и возвращает
    // массив из этих слов. String split()
    //Например, createArrayFromText(“It was an apple pie”) -> {“It”, “was”, “an”, “apple”, “pie”}
    public String[] createArrayFromText( String str ){

       String[] result =  str.split(" ");

        return result;

    }




}

