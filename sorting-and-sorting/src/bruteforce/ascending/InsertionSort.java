package bruteforce.ascending;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = {10, 8, 2, 7};
        System.out.println("Input: " + Arrays.toString(arr));

        insertionSort(arr);
    }

    /*
     * Insertion sort works the way you would naturally sort items in real life.
     *
     * It iterates over the given array, figures out what the correct position of every element is,
     * and insert each element in its place
     *
     * The algorithm is in O(n²), which makes it a poor choice for large input sizes.
     * However, notice that the complexity is actually n² only when the input array is sorted in reverse.
     *
     * So, the ‘best-case’ complexity (when the array is already sorted in the correct order) is Ω(n).
     * */
    private static void insertionSort(int[] numbers) {
        /* the outer loop is responsible to identify the element to be inserted and always begin
         * from the second position of the unsorted array
         * */
        for (int i = 1; i < numbers.length; i++) {

            int ele = numbers[i];
            int j = i - 1;

            // the loop to shift the elements following the order rule
            while (j >= 0 && numbers[j] > ele) {
                numbers[j + 1] = numbers[j];
                j = j - 1;
            }
            numbers[j + 1] = ele;

            System.out.println("Loop " + i + " Result:" + Arrays.toString(numbers));
        }
        System.out.println("Output: " + Arrays.toString(numbers));
    }
}
