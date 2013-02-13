package sorting;

import java.util.Arrays;

public class Mergesort {
    public static void main(String[] args) {
        int[] array = {1, 0, 6, 3, 2, 7, 9, 4};

        mergesort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    private static void mergesort(int[] array, int low, int high) {
        if (low >= high)
            return;
        if (low == high - 1) {
            if (array[low] > array[high]) {
                int temp = array[low];
                array[low] = array[high];
                array[high] = temp;
            }
            return;
        }

        int pivot = low / 2 + high / 2;
        mergesort(array, low, pivot);

        if (!isSorted(array, low, pivot))
            throw new IllegalStateException(Arrays.toString(array) + ", " + low + ", " + pivot);

        mergesort(array, pivot + 1, high);

        if (!isSorted(array, pivot + 1, high))
            throw new IllegalArgumentException(Arrays.toString(array) + ", " + (pivot + 1) + ", " + high);

        int[] first = new int[pivot - low + 1];
        System.arraycopy(array, low, first, 0, first.length);
        int[] second = new int[high - pivot];
        System.arraycopy(array, pivot + 1, second, 0, second.length);
        int a = 0;
        int b = 0;
        int destIndex = low;
        while (a < first.length && b < second.length) {
            if (first[a] < second[b]) {
                array[destIndex++] = first[a++];
            } else {
                array[destIndex++] = second[b++];
            }
        }
        if (a < first.length - 1)
            System.arraycopy(first, a, array, destIndex, first.length - a);
        if (b < second.length - 1) {
            System.arraycopy(second, b, array, destIndex, second.length - b);
        }
        if (!isSorted(array, low, high))
            throw new IllegalStateException(Arrays.toString(array) + ", " + low + ", " + high);
    }

    private static boolean isSorted(int[] array, int low, int high) {
        for (int a = low; a < high; a++)
            if (array[a] > array[a + 1])
                return false;
        return true;
    }
}
