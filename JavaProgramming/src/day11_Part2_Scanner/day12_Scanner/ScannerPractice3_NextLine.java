package day11_Part2_Scanner.day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println("Entre your Programming Language:");
        String programming = scan.nextLine();

        System.out.println("Enter your age:");
        int age = scan.nextInt();

        scan.nextLine();

        System.out.println("Entre you school name:");
        String schoolName = scan.nextLine();

        System.out.println("fullName ="+ fullName);
       System.out.println("programming ="+ programming);
        System.out.println("age= "+ age);
        System.out.println("school name= "+ schoolName);

        scan.close();

    }
}
