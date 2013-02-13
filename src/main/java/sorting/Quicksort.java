package sorting;

import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        int[] array = {1, 5, 0, 7, 3, 4, 2, 9, 6};
        quicksort(array, 0, array.length - 1);

        System.out.println(Arrays.toString(array));
    }

    private static void quicksort(int[] array, int low, int high) {
        if (low >= high)
            return;

        int pivot = low / 2 + high / 2;

        int pivotValue = array[pivot];
        array[pivot] = array[high];
        array[high] = pivotValue;
        int storeIndex = low;
        for (int a = low; a <= high; a++) {
            if (array[a] < pivotValue) {
                int temp = array[storeIndex];
                array[storeIndex] = array[a];
                array[a] = temp;
                storeIndex++;
            }
        }
        int temp = array[storeIndex];
        array[storeIndex] = array[high];
        array[high] = temp;

        quicksort(array, low, storeIndex - 1);
        quicksort(array, storeIndex + 1, high);
    }
}
