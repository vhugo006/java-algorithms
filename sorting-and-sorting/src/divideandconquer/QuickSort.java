package divideandconquer;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        /*
         * 1. Start with an array of n elements.
         * */
        int[] arr = {5, 4, 1, 0, 5, 95, 4, -100, 200, 0};
        System.out.println("Input: " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.print("Sorted array: " + Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            /*
             * 3. Recursively apply steps 1 and 2 to the left and right sub-arrays.
             * */
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        /*
         * 2. Choose a pivot element from the array (typically the first or last element).
         * */
        int pivot = arr[high];
        int i = low - 1;

        /*
         * 3. Partition the array such that all elements less than the pivot are on the left side of the pivot and
         * all elements greater than the pivot are on the right side.
         * */
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        /*
         * 5. Combine the sorted left subarray, pivot, and sorted right subarray to get the final sorted array.
         * */
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

}
