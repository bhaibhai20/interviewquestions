public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 6, 9, 100};
        System.out.println(array[binarySearch(array, 6, 0, array.length)]);
    }

    static int binarySearch(int[] array, int needle, int low, int highExclusive) {
        if (highExclusive - low == 1)
            return needle == array[low] ? low : -1;

        int pivot = low / 2 + highExclusive / 2;
        if (array[pivot] == needle)
            return pivot;
        int lower = binarySearch(array, needle, low, pivot);
        if (lower == -1)
            return binarySearch(array, needle, pivot, highExclusive);
        return lower;
    }
}
