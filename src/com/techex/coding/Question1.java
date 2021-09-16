package com.techex.coding;


public class Question1 {
    public static int [] fibo(int degrees){
        int prev1 = 0;
        int prev2 = 1;
        int count =2;
        int newNum;
        int [] seriesArray = new int[degrees];
        seriesArray[0]= prev1;
        seriesArray[1] = prev2;
        // TODO Cleanup < 3 degrees
        if(degrees < 3){

            if(degrees == 1){
                seriesArray[0] = prev1;
            }
            if(degrees == 2){
                seriesArray[0] = prev1;
                seriesArray[1] = prev2;
            }
            return seriesArray;
        }
        for(int i = 2; i < degrees; i++){
            newNum = prev1 +prev2;
            seriesArray[i] = newNum;
            prev1 = prev2;
            prev2 = newNum;
        }

    return seriesArray;

    }
    // Calculate the Fibonacci Series Iteratively
    // 0,1,1,2,3,5,8,13,21
    // track last 2 digits
    //if numbers greater than 1...
    //Take in how long series run
    //return full series[array]




}
