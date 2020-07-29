public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            System.out.println("Invalid Value");
            return false;
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("leap");
            return true;
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year){
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
                System.out.println("Not Invalid");
                return -1;

        } else {

       if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
           switch (month) {
               case 2:
               System.out.println("29");
                   return 29;

               case 4: case 6: case 9: case 11:
               System.out.println("30");
                   return 30;

               default:
               System.out.println("31");
                   return 31;
           }
       } else {
           switch (month) {
               case 2:
               System.out.println("28");
                   return 28;

               case 4: case 6: case 9: case 11:
                   System.out.println("30");
                   return 30;

               default:
                   System.out.println("31");
                   return 31;
           }
       }
        }

    }
}
