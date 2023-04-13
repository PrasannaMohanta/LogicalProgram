package com.LogicalProgram;

import java.util.Scanner;
/**
 *
 * @author Prasanna
 *
 */

public class ReverseNumber {
    /**
     *
     * @param args
     */

    public static void main(String[] args) {
        /*
         * input
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int number=sc.nextInt();
        int reverse=0;
        /*
         * while loop
         */
        while(number!=0)
        {
            reverse=reverse*10+(number%10);
            number=number/10;
        }
        System.out.println(reverse);
        sc.close();
    }

}
