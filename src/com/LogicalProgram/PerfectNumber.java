package com.LogicalProgram;

import java.util.Scanner;

/**
 *
 * @author Prasanna
 *
 */

public class PerfectNumber {
    /**
     *
     * @param args
     */

    public static void main(String[] args) {
        /*
         * input
         *
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        int sum=1;
        for(int i=2;i<=number/2;i++)
        {
            if (number%i==0)
                sum=sum+i;
        }
        if(sum==number)
        {
            System.out.println(number+" number is a perfect number");
        }
        else
        {
            System.out.println(number+" number is not perfect number");
        }
        sc.close();
    }
}
