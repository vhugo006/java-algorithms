package bruteforce.ascending;

import java.util.Arrays;

public class SelectionSort {
    private static void findMin(int[] numbers) {

        /*
         * The input array are divided in two virtual parts:
         *   1. a sublist of already-sorted elements
         *   2. a sublist of the remaining elements that need to be sorted
         *
         * The algorithm proceeds by finding the smallest element (or largest, depending on sorting order)
         * in the unsorted sublist, exchanging (swapping) it with the leftmost unsorted element.
         *
         * The time complexity of this code is in O(n²)
         * because the method findMin() iterates over the entire array for each element.
         *
         * This quadratic time complexity makes it impractical for large inputs.
         * */
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
            System.out.println("Loop " + i + " Result:" + Arrays.toString(numbers));
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 8, 2, 7};
        System.out.println("Input: " + Arrays.toString(arr));

        findMin(arr);
        System.out.println("Output: " + Arrays.toString(arr));
    }
}