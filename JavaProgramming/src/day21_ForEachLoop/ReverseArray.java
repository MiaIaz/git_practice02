package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50,60,70,80};

       int[] reversed = new int[numbers.length]; //{50,40,30,20,10}

     /*
        reversed[0] = numbers[numbers.length-1];
        reversed[1] = numbers[numbers.length-1];
        reversed[2] = numbers[numbers.length-1];
        reversed[3] = numbers[numbers.length-1];
      */

        for (int i = numbers.length-1, j=0; i >=0; i--, j++) {
            reversed[j] = numbers[i];
        }

        System.out.println(Arrays.toString(reversed) );

    }
}