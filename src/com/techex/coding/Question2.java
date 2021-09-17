package com.techex.coding;

// Return a Reversed String
public class Question2 {

    public static int[] reverseArray(int[] arrayToReverse) {

        // arrayToReverse [1,2,3,4,5,6,7]
        // returnReversed [7,0,0,0,0,0,0]
        //for loop
        var returnReversed = new int[arrayToReverse.length];
        for(int i = arrayToReverse.length - 1; i >= 0; i--)
        {
            // arrayToReverse[4]
            // returnReversed[7 - 4 - 1] = 2
            returnReversed[arrayToReverse.length - i - 1] = arrayToReverse[i];
        }

        return returnReversed;
    }
}
