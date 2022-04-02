package day12;

import java.util.Scanner;

public class StokeMarket {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many total shares do you have already? ");
        int shares = scan.nextInt();

        System.out.println("Enter your total stock market:");
        double stockMarket = scan.nextDouble();

        scan.nextLine();

        System.out.println("Enter your company name:");
        String name = scan.nextLine();

        if (shares>0){
            System.out.println("Your total stock market holding is $"
                    +stockMarket+" which is made up of "+shares
                    +" shares.\n"+name+ " is your company holdings");
        }

        scan.close();


    }
}
/*
7. StockMarket task:
- Ask the user how many total shares they have already? (int)
-> If the user gives 0 or give a negative number none of the
rest condition should be executed
- Ask the user how much their total value in the stock market is
(double)
- Ask the user to enter the name of the company they have the
most shares in (String, multiple words)
- Print in the following format:
Ex:
inputs: 100, 25000, Apple INC
"Your total stock market holding is $25000 which is made up of
100 shares. Apple INC is your company holdings"
 */