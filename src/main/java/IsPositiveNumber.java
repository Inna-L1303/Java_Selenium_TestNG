public class IsPositiveNumber {
    //Напишите алгоритм IsPositiveNumber, который возвращает true, если численный  параметр больше или равен нулю,
    // и возвращает false, если параметр меньше 0.
    //Проверьте работу метода на числах 555, 0 и -555.

    public boolean isPositiveNumber(int number){

        boolean result;

        if(number >= 0){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
