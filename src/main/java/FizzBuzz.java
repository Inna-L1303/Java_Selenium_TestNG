public class FizzBuzz {

    public String[] fizzBuzz (int start, int end) {
        if (start <= end) {
            String[] result = new String[end - start + 1];

            for (int i = 0; i < result.length && start <= end; i++) {
                if(start % 15 == 0) {
                    result[i] = "FizzBuzz";
                } else if (start % 3 == 0) {
                    result[i] = "Fizz";
                } else if (start % 5 == 0) {
                    result[i] = "Buzz";
                } else {
                    result[i] = String.valueOf(start);
                }
                start++;
            }
            return result;
        }
        return new String[0];
    }
}
