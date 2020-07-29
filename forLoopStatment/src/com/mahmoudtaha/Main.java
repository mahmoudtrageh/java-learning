package com.mahmoudtaha;

public class Main {

    public static void main(String[] args) {


//        for (double i=2; i<9; i++ ) {
//            System.out.println("loop 10000.0 %" + i + " = " + String.format("%.3f", calculateIncrementRate(10000.0, i)));
//        }
//
//        System.out.println("^^^^^^^^^^^^^");
//
//        for (double i=8; i>1; i-- ) {
//            System.out.println("loop 10000.0 %" + i + " = " + String.format("%.3f", calculateIncrementRate(10000.0, i)));
//        }

        int count = 0;
        for (int i=10; i<50;i++) {
            if(isPrime(i)){
                count++;
                System.out.println("number" + i + "is prime number");
                if(count == 5){
                    System.out.println("exiting the loop");
                    break;
                }
            }
        }

    }



//    public static double calculateIncrementRate(double acount, double interestRate) {
//
//        return acount*(interestRate/100);
//    }

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

        for (int i=2; i<= (long) Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
