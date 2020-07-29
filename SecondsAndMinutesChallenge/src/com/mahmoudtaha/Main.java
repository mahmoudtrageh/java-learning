package com.mahmoudtaha;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 9));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-41));
    }

    public static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static String getDurationString(int minutes, int seconds) {
        if(minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }

        int hours = minutes / 60;
         minutes = minutes % 60;

         String hoursString = hours + "h";
         if (hours < 10 ) {
             hoursString = "0" + hoursString;
         }

        String minutesString = minutes + "m";
        if (minutes < 10 ) {
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "s";
        if (seconds < 10 ) {
            secondsString = "0" + secondsString;
        }
         return hoursString + " " + minutesString + " " + secondsString;
    }


    public static String  getDurationString(int seconds) {
        if(seconds < 0 ) {
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        System.out.println(seconds + " seconds have " + minutes + " minutes and remaining seconds are " + remainingSeconds );
        return getDurationString(minutes, remainingSeconds);
    }
}
