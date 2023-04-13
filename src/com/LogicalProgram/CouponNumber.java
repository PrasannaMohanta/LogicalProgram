package com.LogicalProgram;

/**
 *
 * @author Prasanna
 *
 */

public class CouponNumber {
    /*
     *  Declare all the variables
     */
    static String s = "";
    static int randomNo;

    /*
     *  Use getCoupon( ) method to generate random OTP
     */
    public static String getCoupon(int len) {
        /*
         * Use for loop to iterate 4 times and generate random coupon
         */
        for (int i = 0; i < len; i++) {
            /*
             * Generate random digit within 0-9
             */
            randomNo = new Random().nextInt(9);
            s = s.concat(Integer.toString(randomNo));
        }
        /*
         *  Return the generated coupon
         */
        return s;
    }

    public static void main(String[] args) {
        /*
         *  Calling getCoupon( ) method and display the generated coupon
         */
        System.out.println("generated coupon is " + getCoupon(4));
    }
}

