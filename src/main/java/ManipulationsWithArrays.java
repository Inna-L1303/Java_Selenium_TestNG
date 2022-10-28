public class ManipulationsWithArrays{

    // Написать метод multiplуArrayByNumber(), который принимает на вход массив целых чисел и число int number.
    // Метод возвращает массив тех же чисел, умноженных на number
    //Например, multiplуArrayByNumber()({1, 2, 3, 4, 5}, 3) -> {3, 6, 9, 12, 15}

    public int[] multiplyArrayByNumber (int[] array, int number) {
        int[] product = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            product[i] = number * array[i];
        }
        return product;
    }
}
