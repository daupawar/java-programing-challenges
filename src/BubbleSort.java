/**
 * Created by Rohan on 26/07/16.
 */
public class BubbleSort {

    private static void printArray(String s, int[] x) {
        System.out.print(s + " Array: ");
        for (int i : x) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] unsorted = {1, 5, 2, 4, 3};
        bubbleSort(unsorted);
    }

    private static void bubbleSort(int[] x) {
        printArray("Initial", x);

        int lastIndex = x.length - 1;
        int swapPosition;

        while (lastIndex > 0) {
            swapPosition = 0;

            for (int i = 0; i < lastIndex; i++) {
                if (x[i] > x[i + 1]) {
                    int temp = x[i + 1];
                    x[i + 1] = x[i];
                    x[i] = temp;
                    swapPosition = i;
                }
                printArray("Current", x);
            }
            lastIndex = swapPosition;
        }

        printArray("Sorted", x);
    }

    private static void bubbleSortTwo(int[] x) {
        printArray("Initial", x);
        int totalSwaps = 0;
        for (int i = x.length - 1; i > 0; i--) {
            int numberOfSwaps = 0;
            for (int j = 0; j < i; j++) {
                if (x[j] > x[j + 1]) {
                    int temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                    numberOfSwaps++;
                    totalSwaps++;
                }
            }
            if (numberOfSwaps == 0) {
                break;
            }
        }
        System.out.println("Array is sorted in " + totalSwaps + " swaps.");
        System.out.println("First Element: " + x[0]);
        System.out.println("Last Element: " + x[x.length - 1]);

        printArray("Sorted", x);
    }


}
