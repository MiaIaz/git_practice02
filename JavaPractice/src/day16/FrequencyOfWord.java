package day16;

import java.util.Scanner;

public class FrequencyOfWord {
    public static void main(String[] args) {
        System.out.println("Enter a sentence: ");
        String sentence = new Scanner(System.in).nextLine();

        int count = 0;
        for (int i = 0; i <= sentence.length()-4 ; i++) {
            if(sentence.substring(i, i+4).equals("Java"))
            count += 1;
        }
        System.out.println(count);



    }
}
/*
4. write a program that can return the frequency of a word Java from
the sentence
Ex:
sentence = "Java Java";
output:
2
 */