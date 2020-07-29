package com.mahmoudtaha;

public class Main {

    public static void main(String[] args) {
//	    int count = 1;
//        while (count != 6) {
//            System.out.println("number is = " + count);
//            count++;
//        }
//
//
//        count = 1;
//        do{
//            System.out.println("new number is " + count);
//            count++;
//        } while (count != 3);

        int number = 4;
        int finishNumber = 20;
        int sum = 0;
        int totanEven = 0;
        while (number <= finishNumber){
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }

            totanEven++;
            sum += number;

            System.out.println("even number found is = " + number);

            if (totanEven == 5 ) {
                break;

            }


        }

        System.out.println("total of even numbers are = " + totanEven);
        System.out.println("sum of even numbers are = " + sum);


    }

    public static boolean isEvenNumber (int number){

        if(number % 2 == 0) {
            return true;
        } else {

            return false;
        }
    }
}
