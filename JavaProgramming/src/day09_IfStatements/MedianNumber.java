package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 10,
                b = 20,
                c = 30;

        /*
        int medianNumber = 15
        boolean possibility1 = a <= c;
        boolean possibility2 = b <= c;
        boolean possibility3 = c <= c;
         */


        boolean aIsMedian = (a > b && a < c) || (a > c && a < b);

        boolean bIsMedian = (b > c && b < a) || (b < c && b > a);

        boolean cIsMedian = !aIsMedian && !bIsMedian;


        if(aIsMedian){
            System.out.println(a + " could be median number");
        }

        if (bIsMedian){
            System.out.println(b+ " could be median number");
        }

        if (cIsMedian){
            System.out.println(c + " could be median number");
        }



    }
}
/*
2. Create a class called MedianNumber. write a program that can find
the median number between three DIFFERENT given integers
Ex:
a = 10, b= 15, c = 20;
Output:
15 is the median number
Possibility #1: a could be median number
Possibility #2: b could be median number
Possibility #3: c could be median number
 */