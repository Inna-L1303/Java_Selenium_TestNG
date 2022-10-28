public class MultipleOfNumber {
    //Given an integer M perform the following conditional actions:
    //If M is multiple of 7 and 9 then return "Good Number".
    //If M is only multiple of 9 and not of 7  then return "Bad Number"
    //If M is only multiple of 11 then return "Poor Number"
    //If M doesn't satisfy any of the above conditions then return "-1"

    public static void multipleOfNumber(int M) {
        if (M % 7 == 0 && M % 9 == 0) {
            System.out.println("Good Number");
        } else if (M % 9 == 0){
            System.out.println("Bad Number");
        } else if ( M % 11 == 0){
            System.out.println("Poor Number");
        } else {
            System.out.println("-1");
        }

    }

    public static void main(String[] args) {
        multipleOfNumber(110);

    }
}
