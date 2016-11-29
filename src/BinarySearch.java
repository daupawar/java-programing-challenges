/**
 * Created by Rohan on 11/05/16.
 * <p>
 * <p>
 * <p>
 * Implement binary search
 * <p>
 * Complete the doSearch function so that it implements a binary search, following the pseudo-code below (this pseudo-code was described in the previous article):
 * 1. Let min = 0 and max = n-1.
 * 2. If max < min, then stop: target is not present in array. Return -1.
 * 3. Compute guess as the average of max and min, rounded down (so that it is an integer).
 * 4. If array[guess] equals target, then stop. You found it! Return guess.
 * 5. If the guess was too low, that is, array[guess] < target, then set min = guess + 1.
 * 6. Otherwise, the guess was too high. Set max = guess - 1.
 * 7. Go back to step 2.
 * <p>
 * Once implemented, uncomment the Program.assertEqual() statement at the bottom to verify that the test assertion passes.
 */
class BinarySearch {

    void doBinarySearch() {
        System.out.println("Found prime at index " + doSearch(23));
    }

    private int doSearch(int targetValue) {

        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
                41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

        int min = 0;
        int max = primes.length - 1;
        int guess = 0;
        int guessTotal = 0;

        while (min<max){
            guessTotal++;

            guess=Math.round((min+max)/2);// mean of array
            System.out.println(guess);
            if(primes[guess]==targetValue){ // array value matches with targetValue return index
                System.out.println(guessTotal);
                return guess;
            }
            else if(primes[guess]<targetValue){
                    min=guess+1;//change min
            }else
            {
                max=guess-1;//change max
            }
        }
        return -1;
    }
}
