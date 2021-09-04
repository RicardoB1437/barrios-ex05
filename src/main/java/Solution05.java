import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Ricardo Barrios
 */

public class Solution05
{
    //prompt user for first number and read in using standard input
    //prompt user for second number and read in using standard input
    //print the sum, difference, product, and quotient of those numbers

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("What is the first number? ");
        int num1 = input.nextInt();

        System.out.print("What is the second number? ");
        int num2 = input.nextInt();

        System.out.printf("%d + %d = %d\n", num1, num2, num1+num2);
        System.out.printf("%d - %d = %d\n", num1, num2, num1-num2);
        System.out.printf("%d * %d = %d\n", num1, num2, num1*num2);
        System.out.printf("%d / %d = %d\n", num1, num2, num1/num2);
    }
}
