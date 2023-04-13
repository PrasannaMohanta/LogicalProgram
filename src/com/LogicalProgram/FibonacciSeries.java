package com.LogicalProgram;
/**
 *
 * @author Prasanna
 *
 */
public class FibonacciSeries {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        /*
         * variables
         * for loop
         */

        int n = 10, firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");
        /*
         * for loop
         */
        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            /*
             *  compute the next term
             */
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}

