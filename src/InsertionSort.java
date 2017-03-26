import java.util.Arrays;
import java.util.Scanner;

/**
 * Insertion sort example
 *
 */
public class InsertionSort {

    /**
     * Insert the number at endIndex into rest of the slots to the right.
     *
     * @param array Sorted array except at endIndex
     * @param endIndex
     */
    public void insertIntoSorted(int[] array, int endIndex) {
        int unSortedNumber = array[endIndex];

        for (int i=endIndex; i>=0; --i) {
            int prev = i - 1;

            if (prev < 0) {
                array[i] = unSortedNumber;
                break;
            }

            if (array[prev] > unSortedNumber) {
                array[i] = array[prev];
            }
            else {
                array[i] = unSortedNumber;
                break;
            }
        }
    }

    /**
     * Sorts by insertion sorting.
     *
     * @param array
     */
    public void sort(int[] array) {
        for (int i=0; i<array.length-1; ++i) {
            insertIntoSorted(array, i + 1);
            printArray(array);
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i=0; i<array.length; ++i) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Original Array:");
        printArray(array);
        System.out.println();

        InsertionSort sorter = new InsertionSort();
        sorter.sort(array);
    }

    private static void printArray(int[] array) {
        for (int n : array) {
            System.out.print(n + " ");
        }

        System.out.println();
    }
}
