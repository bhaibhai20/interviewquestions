public class SumLinkedLists {
    public static void main(String[] args) {
        System.out.println(sum(new BigNum(3, new BigNum(7)), new BigNum(4, new BigNum(9))));
    }

    static class BigNum {
        final int value;
        final BigNum next;

        BigNum(int value, BigNum next) {
            this.value = value;
            this.next = next;
        }

        BigNum(int value) {
            this(value, null);
        }

        public String toString() {
            return value + (next == null ? "" : next.toString());
        }
    }

    static BigNum sum(BigNum x, BigNum y) {
        if (x.next != null && y.next != null) {
            BigNum sumOfSmallerUnits = sum(x.next, y.next);
            return new BigNum(x.value + y.value + sumOfSmallerUnits.value / 10, new BigNum(sumOfSmallerUnits.value % 10, sumOfSmallerUnits.next));
        }

        if (x.next == null && y.next != null) {
            return new BigNum(x.value + y.value, y.next);
        }

        return new BigNum(x.value + y.value, x.next);
    }
}
