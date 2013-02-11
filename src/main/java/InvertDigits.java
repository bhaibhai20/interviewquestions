import list.P2;

public class InvertDigits {
    public static void main(String[] args) {
        System.out.println(f(32147));
    }

    static int f(int x) {
        return impl(x);
    }

    static int impl(int x) {
        if (x < 10)
            return x;
        int restOfNumber = impl(x / 10);
        return restOfNumber == 0 ? x : (x % 10) * (int)Math.pow(10, digitsIn(restOfNumber)) + restOfNumber;
    }

    static int digitsIn(int x) {
        return x < 10 ? 1 : 1 + digitsIn(x / 10);
    }
}
