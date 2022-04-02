package week07;

import java.util.Scanner;

public class EqualsJavaPython {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int countJava = 0;
        int countPython = 0;

        for(int i = 0; i<sentence.length()-3; i++){
            if(sentence.substring(i,i+4).equals("java")){
                countJava++;
            }
        }
        for(int i = 0; i<sentence.length()-5; i++){
            if(sentence.substring(i,i+6).equals("python")){
                countPython++;
            }
        }
        if(countJava == countPython){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
/*
Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to the number of appearances of "python" anywhere in the string (case sensitive).

Example:

input: We study java not python
​
output: true
input: We study java not python

output: true
Example:

input: What's the difference between java, javascript and python?
​
output: false
 */
