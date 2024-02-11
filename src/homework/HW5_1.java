package homework;

public class HW5_1 {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static String verifyEquals(double expectedResult, double actualResult) {

        if (expectedResult == actualResult) {

            return "Pass";
        }

        return "Fail";
    }

    public static String lettersABC(double a, double b, double c) {
        double sum;
        sum = (a * b) - c;

        if (sum > 0) {

            return "" + sum;
        }
        if (sum <= 0) {

        }
        return null;
    }

    public static void main(String[] args) {

        for (int i = 0; i <= 9; i++) {
            System.out.print(i);
            System.out.println();
        }

        for (int i = 9; i >= 0; i--) {
            System.out.print(i);
        }

        for (int i = 50; i <= 55; i += 2) {
            System.out.println();
            System.out.println(i);
        }

        int beginning = 327 - 1;
        int end = 300 + 1;
        int start = beginning - beginning % 7;
//        System.out.println(326 % 7);

        for (int i = start; i >= end; i -= 7) {
            System.out.println(i);
        }

        for (int i = 326; i > 300; i--) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }

        for (double i = 12.0; i <= 13.0; i += 0.1) {
            i = Math.ceil(i * 100) / 100;
            System.out.println(i + "");
        }

        int number1 = 215;
        int number2 = 237;
        int start1 = number1 + number2 % 2;

        for (int i = start1; i <= number2; i += 2) {
            System.out.println(i + "");
        }

        int beginning2 = 7 + 1;
        int stop = 14 - 1;
        int step = 7;
        int start3 = beginning2 + (step - beginning2 % step);

        if (start3 < end) {

            for (int i = start3; i <= stop; i += step) {
                System.out.println(i);
            }
        }

        short a = Short.MIN_VALUE;
        short b = Short.MAX_VALUE;
        int c = a % 15001;
        int d = a - c;
        for (int i = d; i <= b; i += 15001) {
            System.out.println(i);
        }

        for (int i = -10; i <= 34; i++) {

            if (i % 11 == 0 && i != 0) {
                System.out.println(ANSI_BLUE + i + "" + ANSI_RESET);
            } else if (i % 12 == 0 && i != 0) {
                System.out.println(i + " ");
            } else if (i == 0) {
                System.out.println("ZERO");
            } else {
                System.out.println(i + " ");
            }
        }

//          actualResult = 10;
//          expectedResult = lettersABC(7,2,4);
//          verifyEquals(expectedResult, actualResult);

    }
}

//        int a = 2;
//        int b = 3;
//        if (a >= b) {
//
//            System.out.println("Pass");
//        } else {
//
//            System.out.println("Fail");
//



