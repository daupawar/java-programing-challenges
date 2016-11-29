import java.util.Arrays;

/**
 * Created by Rohan on 09/05/16.
 */
class SelectionSort {

    /**
     * Write selection sort.

     Selection sort loops over positions in the array. For each position, it finds the index of the minimum value in the subarray starting at that position. Then it swaps the values at the position and at the minimum index. Write selection sort, making use of the swap and indexOfMinimum functions.

     Once implemented, uncomment the Program.assertEqual() at the bottom to verify that the test assertion passes.

     */
    void doSelectionSort(){
        int[] array = {22, 11, 99, 88, 9, 7, 42};
        for (int i=0;i<array.length;i++){
            int indexofMin=indexOfMinimum(array,i);
            swap(array,indexofMin,i);
        }
        System.out.print(Arrays.toString(array));
    }

    /**
     *
     Swap function
     Hint (What's this?)

     A key step in many sorting algorithms (including selection sort) is swapping the location of two items in an array. Here's a swap function that looks like it might work, but doesn't:
     -the code prints out [9, 9, 4] when it should print out [9, 7, 4].

     Fix the swap function.

     Hint: Work through the code line by line, writing down the values of items in the array after each step. Could you use an extra temporary variable to solve the problem that shows up?

     Once implemented, uncomment the Program.assertEqual() at the bottom to verify that the test assertion passes.
     * @param array int
     * @param firstIndex int
     * @param secondIndex int
     */
    private void swap(int[] array,int firstIndex,int secondIndex){
        int temp=array[firstIndex];
        array[firstIndex]=array[secondIndex];
        array[secondIndex]=temp;
    }

    /**
     *
     Find index of minimum value in a subarray

     Finish writing the function indexOfMinimum, which takes an array and a number startIndex, and returns the index of the smallest value that occurs with index startIndex or greater. If this smallest value occurs more than once in this range, then return the index of the leftmost occurrence within this range.

     Once implemented, uncomment the Program.assertEqual() at the bottom to verify that the test assertion passes.

     */
    private int indexOfMinimum(int[] array,int startIndex){
        int minValue=array[startIndex];
        int minIndex=startIndex;
        for(int i=minIndex + 1;i<array.length;i++){
            if(array[i]<minValue){
                minIndex=i;
                minValue=array[i];
            }
        }
        return minIndex;
    }
}
