public class App {
    public static void main(String[] args) throws Exception {
        
        int[] listOfIntegers = {1, 2, 3, 4, 5};
        int sumOfIntegers = sum(listOfIntegers);
        System.out.println(sumOfIntegers);

        int productOfIntegers = product(listOfIntegers);
        System.out.println(productOfIntegers);



    }

    public static int sum(int[] addends) {
        int result = 0;
        for (int i = 0; i < addends.length; i++) {
            result += addends[i];
        }
        return result;
    }

    public static int product(int[] factors) {
        int result = 1;
        for (int i = 0; i < factors.length; i++) {
            result *= factors[i];
        }
        return result;
    }
}
