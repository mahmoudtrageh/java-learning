package com.mahmoudtaha;

public class Main {

    public static void main(String[] args) {
	    int myValue = 1000;

	    int myMinIntNumber = Integer.MIN_VALUE;
	    int myMaxIntNumber = Integer.MAX_VALUE;
        System.out.println("my minimum number is = " + myMinIntNumber);
        System.out.println("my maximum number is = " + myMaxIntNumber);
        System.out.println("busted max value = " + (myMaxIntNumber + 1));
        System.out.println("busted min value = " + (myMinIntNumber - 1));

        int intMaxValueTest = 2_147_483_647;


        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("my minimum byte is = " + myMinByteValue);
        System.out.println("my maximum byte is = " + myMaxByteValue);


        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("my minimum Short is = " + myMinShortValue);
        System.out.println("my maximum Short is = " + myMaxShortValue);

        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("my minimum long is = " + myMinLongValue);
        System.out.println("my maximum long is = " + myMaxLongValue);

        long testLongNumber = 2_147_483_647_234L;
        System.out.println(testLongNumber);
        short bigShortLateralValue = 32767;

        int myTotal = (myMaxIntNumber / 2 );

        // casting
        byte myNewByteValue = (byte) (myMaxByteValue / 2);


        byte firstByte = 40;

        short firstShort = 30;

        int firstInt = 20;

        long firstLong = 50000L + 10L * (firstByte + firstInt + firstShort);

        System.out.println(firstLong);
    }
}
