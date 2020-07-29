package com.mahmoudtaha;

public class Main {

    public static void main(String[] args) {
        double centimeters = calcFeetAndInchesToCentimeters(6, 0);
        if(centimeters < 0.0) {
            System.out.println("invalid values");
        }
        calcFeetAndInchesToCentimeters(157);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet >= 0 && (inches >= 0 && inches <= 12 )) {
            double centimeter = feet * 12 * 2.54 + inches * 2.54;
            System.out.println(inches + " Inches and " + feet + " feets have " + centimeter + " centimeters");
        }

        System.out.println("invalid");
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches >= 0) {
            double feet = (int) inches / 12;
            double remainingFeet = (int) inches % 12;
            System.out.println(inches + " Inches have " + feet + " feets and the remaining is " + remainingFeet );
            return calcFeetAndInchesToCentimeters(feet, remainingFeet);
        }

        return -1;
    }
}
