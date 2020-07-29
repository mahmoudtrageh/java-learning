public class SumOddRange {
    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        } else if (number % 2 == 0) {
            System.out.println("is not odd");
            return false;
        }

        System.out.println("is odd");
        return true;

    }

    public static int sumOdd(int start, int end) {

        int sum = 0;

        if (start < 0 || end < 0 || end < start) {
            return -1;
        } else {

            for (int i = start; i <= end; i++) {

                if (isOdd(i)) {

                    System.out.println("found odd number = " + i);
                    sum += i;

                }

            }
            System.out.println("sum are = " + sum);
            return sum;
        }
    }
}
