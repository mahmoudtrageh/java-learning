package com.mahmoudtaha;

public class Main {

    public static void main(String[] args) {
        System.out.println("sum of the digit number is = " + sumDigits(125));

    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;

        while (number > 0) {
            int digit = number % 10; // 5 ... 12
            sum += digit;

            number /= 10;
            
        }
        return sum;
    }
}
