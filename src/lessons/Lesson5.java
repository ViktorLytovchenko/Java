package lessons;

public class Lesson5 {

    static int k = 20;
    static int l = 10;
    static int m = 5;
    public static String return14KLM(int parameter1, int parameter2, String varName1, String varName2) {

        int quotient = parameter1 / parameter2;
        int remainder = parameter1 % parameter2;

        String result = ("Результат деления " + varName1 + " на " + varName2 + " = " + quotient
                + ", а остаток от деления = " + remainder);
        return result;
    }

    public static int doubleTheValue(int a) {
        int result = a * 2;
        return result;
    }

    public static int tripleTheValue(int a) {
        int result = a * 3;
        return result;
    }

    public static int countAveSpeed(double distance, double time) {
        int result = (int) (distance / time);

        return result;
    }

//|||||||||||||||||||||||||||||||||||||Part 2|||||||||||||||||||||||||||||||||||||||||||||||||||||

    //Найти максимальное значение и протестировать работу методов.

    public static int findMaxOutTwo(int a, int b) {
        int max;

        if (a >= b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }

    public static int findMaxOutTwo1(int a, int b) {

        return Math.max(a, b);
    }

    public static int findMaxOutTwo2(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    static int tcNumber = 1;
    public static void printTCNumber() {
        System.out.print("TC_" + tcNumber++ + "\t -- \t");
    }

    public static void printTestResult(String value) {
        System.out.println(value);
    }

    public static String verifyEquals(int expectedResult, int actualResult) {

        if (expectedResult == actualResult) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static String verifyEquals(String expectedResult, String actualResult) {

        if (expectedResult.equals(actualResult)) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static String verifyEquals(double expectedResult, double actualResult) {

        if (expectedResult == actualResult) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static int findMaxOutFour(int a, int b, int c, int d) {
        int max;
        int max1;

        if (a >= b) {
            max = a;
        } else {
            max = b;
        }
        if (c >= d) {
            max1 = c;
        } else {
            max1 = d;
        }
        if (max >= max1) {
            return max;
        } else {
            return max1;
        }
    }

    public static int findMaxOutFour1(int a, int b, int c, int d) {
        int max;

        if (a >= b) {
            max = a;
        } else {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        if (max < d) {
            max = d;
        }
        return max;
    }

    public static int findMaxOutFour2(int a, int b, int c, int d) {

        return Math.max(a, Math.max(b, Math.max(c, d)));
    }

    public static int findMaxOutFour4(int a, int b, int c, int d) {

        return findMaxOutTwo(a, findMaxOutTwo(b, findMaxOutTwo(c, d)));
    }

    // Написать метод, который принимает на вход число от 1 до 12 и возвращает название месяца

    public static String returnMonth(int number) {
        if (number > 0 && number < 13) {  // проверка на валидность
            if (number == 1) {
                return "January";
            }
            if (number == 2) {
                return "February";
            }
            if (number == 3) {
                return "March";
            }
            if (number == 4) {
                return "April";
            }
            if (number == 5) {
                return "May";
            }
            if (number == 6) {
                return "June";
            }
            if (number == 7) {
                return "July";
            }
            if (number == 8) {
                return "August";
            }
            if (number == 9) {
                return "September";
            }
            if (number == 10) {
                return "October";
            }
            if (number == 11) {
                return "November";
            }
            if (number == 12) {
                return "December";
            }
        }
        return "Error";
    }

    // написать метод, который получает на вход растояние.....

    public static String evaluateDistance(double distance) {
        int km = (int) distance;
        int m = (int) ((distance - km) * 1000);

        return "" + km + " км. " + m + " м.";
    }

    public static void main(String[] args) {

//        System.out.println(doubleTheValue(6));
//
//        int b = doubleTheValue(6);
//        System.out.println(b);
//
//        System.out.println(tripleTheValue(5));
//        int sum = doubleTheValue(6) + tripleTheValue(5);
//        System.out.println(sum);
//
//        System.out.println(return14KLM(k,l,"k","l"));
//
//        String text2 = return14KLM(k,l,"k","l") + doubleTheValue(6);
//        System.out.println(text2);
//
//
//        int total = countAveSpeed(200.45, 1.5) + countAveSpeed(12.5, 2.75);
//
//        System.out.println(total);

//|||||||||||||||||||||||||||||||||||||Part 2|||||||||||||||||||||||||||||||||||||||||||||||||||||

//        System.out.println(findMaxOutTwo(10,200));
//        System.out.println(findMaxOutTwo(3,3));
//        System.out.println(findMaxOutTwo(9,5));
//
//        System.out.println(findMaxOutTwo1(9,5));
//        System.out.println(findMaxOutTwo1(3,3));
//        System.out.println(findMaxOutTwo1(5,9));
//
//        System.out.println(findMaxOutTwo2(10,2));
//        System.out.println(findMaxOutTwo2(5,5));
//        System.out.println(findMaxOutTwo2(2,10));

        printTCNumber();

        //Auto Test 1
        //TC_1
        //ААА - triple "A" правило для создания автоматизированого тесткейса

        //A - arrange (объявить все данные, которые нам известны)
        int a = 5;
        int b = 9;
        int expectedResult = 9;

        //Act - произвести какие - то действия (н-р вызвать метод) для получения actual result

        int actualResult = findMaxOutTwo(a, b);

        //A = assert - сравнение expectedResult с actualResult и вывод о том, прошел тест или упал.

        verifyEquals(expectedResult, actualResult);

        //ОТЧЕТ (report)
        printTestResult(verifyEquals(expectedResult, actualResult));

        //Auto Test 2
        //TC_2
        a = 3;
        b = 3;
        expectedResult = 3;

        actualResult = findMaxOutTwo(a, b);

        verifyEquals(expectedResult, actualResult);

        //ОТЧЕТ (report)
        printTCNumber();
        printTestResult(verifyEquals(expectedResult, actualResult));

        //Auto Test 3
        //TC_3
        a = 10;
        b = 5;
        expectedResult = 10;

        actualResult = findMaxOutTwo(a, b);

        verifyEquals(expectedResult, actualResult);

        //ОТЧЕТ (report)
        printTCNumber();
        printTestResult(verifyEquals(expectedResult, actualResult));

        verifyEquals("hi", "hi"); //Pass
        verifyEquals(3.3, 3.3); // Pass
        verifyEquals(4, 5); // Fail

        //TC_4
        int number = 5;
        String expectedResultString = "May";

        String actualResultString = returnMonth(number);

        verifyEquals(expectedResultString, actualResultString);

        //ОТЧЕТ (report)
        printTCNumber();
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        //TC_5
        number = 13;
        expectedResultString = "Error";

        actualResultString = returnMonth(number);

        verifyEquals(expectedResultString, actualResultString);

        //ОТЧЕТ (report)
        printTCNumber();
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        System.out.println(evaluateDistance(2.5));

        //TC_6

        double distance = 6.004;
        expectedResultString = "6 км. 4 м.";

        actualResultString = evaluateDistance(distance);

        verifyEquals(expectedResultString, actualResultString);

        //ОТЧЕТ (report)
        printTCNumber();
        printTestResult(verifyEquals(expectedResultString, actualResultString));

        System.out.println(evaluateDistance(distance));
    }
}