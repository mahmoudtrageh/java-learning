package com.mahmoudtaha;

public class Main {

    public static void main(String[] args) {
//        char myCharValue = 'D';
//        char myUnicodeValue = '\u0044';
//        System.out.println(myCharValue);
//        System.out.println(myUnicodeValue);
//
//        String myString = "this is my string";
//        System.out.println("and is my string " + myString);
//        myString = myString + ", and this is more";
//        System.out.println("and is my string " + myString);
//        myString = myString + "\u00A9 2019";
//        System.out.println("and is my string " + myString);
//
//        int firstNumber = 50;
//        int secondNumber = 60;
//
//        if ((firstNumber < secondNumber) && (firstNumber < 100)) {
//            System.out.println("this is true!");
//        }
//
//        boolean myCar = false;
//        if (!myCar) {
//            System.out.println("this is car!");
//        }

        double myFirstValue = 20d;
        double mySecondValue = 80d;
        double result = (myFirstValue + mySecondValue) * 100d;
        System.out.println("my total value is = " + result);
        double remainderValue = result % 40d;
        System.out.println("remainder value is = " + remainderValue);
        boolean isRemainder = (remainderValue == 0) ? true : false;
        System.out.println("is remainder = " + isRemainder);
        if(!isRemainder) {
            System.out.println("got some remainder");
        }

    }
}
