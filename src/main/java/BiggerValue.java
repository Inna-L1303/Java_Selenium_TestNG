public class BiggerValue {
//Напишите алгоритм BiggerValue, который из двух параметров типа int возвращает бОльшее значение.
//    //Test Data:
//    //3333, 9999
//    //Expected Result = 9999

    public int biggerValue(int a, int b){

        int result = 0;

        if(a > b){
            result = a;
        }else if ( b > a) {
            result = b;
        }
        return result;
    }
}
