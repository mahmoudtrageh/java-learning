package com.mahmoudtaha;

public class Main {

    public static void main(String[] args) {
//	    int switchValue = 3;
//        switch (switchValue){
//            case 1:
//                System.out.println("value was 1");
//                break;
//            case 2:
//                System.out.println("value was 2");
//                break;
//
//            default:
//                System.out.println("value was not 1 or 2");
//        }

//        char value = 'C';
//        switch (value) {
//            case 'A':
//                System.out.println("A is found");
//                break;
//
//            case 'B':
//                System.out.println("B is found");
//                break;
//
//            case 'C': case 'D': case 'E':
//                System.out.println(value + " is found");
//                break;
//
//            default:
//                System.out.println("A, B, c, D or E aren't found");
//                break;
//
//        }

        String month = "jANuary";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("jan");
                break;

            default:
                System.out.println("not found");
                break;
        }
    }
}
