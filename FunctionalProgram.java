
package newtask;


import java.util.Arrays;
import java.util.function.IntPredicate;

    
public class FunctionalProgram {

    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }

    public static void processNumbers(int[] arr, IntPredicate func) {
        Arrays.stream(arr).forEach(num -> System.out.println(num + " is odd: " + func.test(num)));
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide an integer array as a command line argument.");
            return;
        }

        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }

        processNumbers(numbers, FunctionalProgram::isOdd);
    }
}


