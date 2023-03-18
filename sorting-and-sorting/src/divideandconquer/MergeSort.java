package divideandconquer;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] numbers = {10, 8, 2, 7, 100, -1, 96, -78, 354};
        System.out.println("Input: " + Arrays.toString(numbers));
        mergeSort(numbers, 0, numbers.length - 1);
        System.out.println("Output: " + Arrays.toString(numbers));
    }


    // left and right parameters represents the first and last indexes of the given array
    // i.e. the beginning and ending of the array
    private static void mergeSort(int[] arr, int left, int right) {
        // Sanity checks
        if (left < 0 || right < 0) return;

        // As we are using recursion, this if clause guarantees that we have an exit point to recursion code
        if (left < right) {
            // find the middle point
            int mid = left + (right - left) / 2;

            //Sort first and second halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {

        // Create temporary arrays
        int[] leftArr = new int[mid - left + 1];
        int[] rightArr = new int[right - mid];

        // Copy data to temporary arrays
        System.arraycopy(arr, left, leftArr, 0, leftArr.length);
        System.arraycopy(arr, mid + 1, rightArr, 0, rightArr.length);

        // Merge temporary array comparing the first element of the left and right
        // arrays and pushing the smallest number at current array position
        int i = 0, j = 0, k = left;
        while (i < leftArr.length && j < rightArr.length) {

            if (leftArr[i] < rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of the left array
         if (i < leftArr.length) {
            System.arraycopy(leftArr, i, arr, k, leftArr.length - i);
        }
/*        while (i < leftArr.length) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }*/

        // Copy the remaining elements of the left array
        if (j < rightArr.length) {
            System.arraycopy(rightArr, j, arr, mid + 1 + j, rightArr.length - j);
        }
/*        while (j < rightArr.length) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }*/
    }
}
