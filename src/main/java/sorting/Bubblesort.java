package sorting;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] array = {1, 5, 0, 7, 3, 4, 2, 9, 6};
        bubblesort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void bubblesort(int[] array) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int a = 0; a < array.length - 1; a++)
                if (array[a] > array[a + 1]) {
                    int temp = array[a];
                    array[a] = array[a + 1];
                    array[a + 1] = temp;
                    sorted = false;
                }
        }
    }
}
