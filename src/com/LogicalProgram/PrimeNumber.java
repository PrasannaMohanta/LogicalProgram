package com.LogicalProgram;

import java.util.Scanner;
/**
 *
 * @author Prasanna
 *
 */
public class PrimeNumber {
    /**
     *
     * @param args
     */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n =sc.nextInt();
        int i;
        if(n==1)

            System.out.println("Prime starts from 2");

        for(i=2;i<n;i++)
        {
            if(n%i==0)
                System.out.println("not a prime");
            break;
        }
        if(n==i)
            System.out.println("prime");
    }

}

