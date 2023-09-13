import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a list of numbers separated by spaces, press enter when list is complete.");

        
        //get raw input
        String[] input = in.nextLine().split(" ");
        
        //turn input string into array of integers
        ArrayList<Integer> listOfIntegers = new ArrayList<Integer>();
        for (int i = 0; i < input.length; i++) {
            int inputInt = Integer.parseInt(input[i]);
            listOfIntegers.add(i, inputInt);
        }

        //calculate sum
        int sumOfIntegers = sum(listOfIntegers);
        System.out.println("Sum: " + sumOfIntegers);

        //calculate product
        int productOfIntegers = product(listOfIntegers);
        System.out.println("Product: " + productOfIntegers);

        //This was supposed to be added in a separate commit than the last one, I got ahead of myself. Adding this comment instead.
        ArrayList<Integer> listOfReversedIntegers = reverse(listOfIntegers);
        System.out.print("Reversed: ");
        for (int i = 0; i < listOfReversedIntegers.size(); i++) {
            System.out.print(listOfReversedIntegers.get(i) + " ");
        }
        System.out.println("");

        in.close();

    }

    public static int sum(ArrayList<Integer> addends) {
        int result = 0;
        for (int i = 0; i < addends.size(); i++) {
            result += addends.get(i);
        }
        return result;
    }

    public static int product(ArrayList<Integer> factors) {
        int result = 1;
        for (int i = 0; i < factors.size(); i++) {
            result *= factors.get(i);
        }
        return result;
    }

    public static ArrayList<Integer> reverse(ArrayList<Integer> original) {
        ArrayList<Integer> reversed = new ArrayList<Integer>();
        for (int i = original.size()-1; i >= 0; i--) {
            reversed.add(original.get(i));
        }
        return reversed;
    }
}
