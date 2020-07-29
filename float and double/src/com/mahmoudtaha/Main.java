package com.mahmoudtaha;

public class Main {

    public static void main(String[] args) {
	    float myMinFloatValue = Float.MIN_VALUE;
	    float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("my min float value = " + myMinFloatValue);
        System.out.println("my max float value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("my min double value = " + myMinDoubleValue);
        System.out.println("my max double value = " + myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;

        System.out.println("my int value is = " + myIntValue);
        System.out.println("my float value is = " + myFloatValue);
        System.out.println("my double value is = " + myDoubleValue);

        double poundValue = 200d;
        double kilogramValue = poundValue * 0.45359237;

        System.out.println("the result is = " + kilogramValue);
    }
}
