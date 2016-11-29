import java.util.Arrays;

/**
 * Created by Rohan on 05/05/16.
 */
class InsertionSort {

    void Sort() {
        int[] array = {5, 2, 4, 6, 1, 3};
        System.out.println(Arrays.toString(array));
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }


    private void insertionSort(int[] array) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }


    private void insertionSort(){

    }
}
