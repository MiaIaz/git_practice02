package day13_Part01;

import java.util.Scanner;

public class ThreeLetterWord {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in) ;

        System.out.println("Enter a three letter word");
        String word= scan.next();
        scan.close();


        if (word.length()==3){
            if (word.charAt(1)=='a'){
                System.out.println("Cool word");
            } else{
                System.out.println( "Okay word");
            }

        }else{
            if(word.length()>3){
                System.out.println("Word is too long");
            }else{
                System.out.println("Word is too short");
            }
        }



    }
}
/*
L6. write a program that asks the user enter a threeLetter word. Check if
the middle character of the given word is 'a'. In the case it is
print: "Cool word", but in the case the middle letter is not 'a'
print: "Okay word".
- If the user does not enter a 3letter word tell them:
If the word is less than 3 letters: "Word is too short"
If the word is too long: "Word is too long"
 */