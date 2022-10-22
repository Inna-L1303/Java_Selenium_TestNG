public class OddEven {


    //В классе OddEven создать алгоритм oddEven(), который принимает на вход целое число, возвращает “Odd”,
    // если число нечетное, и “Even”, если число четное.
    public String oddEven (int number) {

        String result;

        if (number % 2 == 0) {
            result = "Even";
        } else {
            result = "Odd";
        }
        return result;
    }
}

