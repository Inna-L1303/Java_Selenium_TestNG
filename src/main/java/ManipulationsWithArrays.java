public class ManipulationsWithArrays{

    // Написать метод multiplyArrayByNumber(), который принимает на вход массив целых чисел и число int number.
    // Метод возвращает массив тех же чисел, умноженных на number
    //Например, multiplyArrayByNumber()({1, 2, 3, 4, 5}, 3) -> {3, 6, 9, 12, 15}

    public int[] multiplyArrayByNumber (int[] array, int number) {
        int[] product = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            product[i] = number * array[i];
        }
        return product;
    }
    //Написать метод toDoubleArray(), который принимает на вход массив целых чисел,  и возвращает массив типа
    // double[] из тех же чисел
    //Например, toDoubleArray({1, 2, 3, 4, 5}) -> {1.0, 2.0, 3.0, 4.0, 5.0}
    public double[] toDoubleArray(int[] array){

        double[] result = new double[array.length];
        for (int i = 0; i < array.length; i++){
            result[i] = array[i];
        }

        return result;
    }
    //Написать метод toIntArray(), который принимает на вход массив типа double[],  и возвращает массив типа int[]
    // из тех же чисел
    //Например, toIntArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {1, 2, 3, 4, 5}
    public int[] toIntArray(double[] array){

        int[] result = new int[array.length];
        for( int i = 0; i < array.length; i++){
            result[i] = (int) array[i];
        }
        return result;
    }


    //Написать метод toStringArray(), который принимает на вход массив целых чисел,  и возвращает массив типа String[]
    // из тех же чисел (желательно не использовать метод .toString(), нужно переводить вручную)
    //Например, toStringArray({1, 2, 3, 4, 5}) -> {“1”, “2”, “3”, “4”, “5”}
    public String[] toStringArray( int[] array) {

        String[] result = new String[array.length];
        for( int i = 0; i < array.length; i++){
            result[i] = "" + array[i];
        }
        return result;
    }
}

