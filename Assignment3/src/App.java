public class App {
    public static void main(String[] args) throws Exception {
        
        int[] listOfIntegers = {1, 2, 3, 4, 5};
        int sumOfIntegers = sum(listOfIntegers);
        System.out.println(sumOfIntegers);
    }

    public static int sum(int[] addends) {
        int result = 0;
        for (int i = 0; i < addends.length; i++) {
            result += addends[i];
        }
        return result;
    }
}
