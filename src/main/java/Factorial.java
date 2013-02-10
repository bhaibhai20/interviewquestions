public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(10));
        System.out.println(iterativeFactorial(10));
    }

    private static int iterativeFactorial(int x) {
        int result = 1;
        while (x > 2) {
            result = result * x--;
        }
        return result * x;
    }

    private static int factorial(int x) {
        return x < 2 ? x : x * factorial(x - 1);
    }
}
