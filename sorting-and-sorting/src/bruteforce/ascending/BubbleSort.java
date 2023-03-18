package bruteforce.ascending;

import java.util.Arrays;

/*
 * Sinking Sort
 * */
public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {10, 8, 2, 7};
        System.out.println("Input: " + Arrays.toString(arr));
        bubbleSort(arr);
    }

    /*
     * The bubble sort algorithm works by comparing adjacent pairs of elements and swapping them
     * if they are in the wrong order. This is repeated until the array is sorted.
     *
     * Tip: a bubble passes over the array and "catches" the maximum (or minimum) element
     * and brings it over to the right side.
     *
     * The time complexity of the above code is in O(n²), which means this algorithm is not very efficient.
     * */
    private static void bubbleSort(int[] numbers) {

        for (int i = 0; i < numbers.length - 1; i++) {

            /* At bubble sort algorithm the last right element will always be ordered from the first executions,
             * that's why we don't need to iterate it after again
             */
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
            System.out.println("Loop " + i + " Result:" + Arrays.toString(numbers));
        }
        System.out.println("Output: " + Arrays.toString(numbers));
    }
}
