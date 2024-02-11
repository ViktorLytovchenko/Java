package lessons;

public class Lesson2 {
    public static void main(String[] args) {
        String line = "__________________________________";
        String task = "Задание № ";
        int count = 1;

        System.out.println(line);
        System.out.println(task + count);

        int boxOfCandies = 4;
        int weightForONEBoxOfCandies = 9;
        int boxCookies = 3;
        int weightForOneBoxOfCookies = 8;

        int weightForAllBoxes;
        weightForAllBoxes = boxOfCandies * weightForONEBoxOfCandies + boxCookies * weightForOneBoxOfCookies;
        System.out.println(weightForAllBoxes + " килограммов конфет и печений привезли в детский сад");

        /* условия задания
        вечный commit
         */
//        System.out.println(line);
//        System.out.println(task + ++ count);

        int a = +5;
        int b = -5;
        int c = 5;
        int tempB = b;

        System.out.println(a + b);
        System.out.println(line);

        int sumAB = a + b;
        System.out.println(sumAB);

        int sumBC = b + c;
        System.out.println(sumBC);
        System.out.println(line);

        String s = "+ 5";
        System.out.println(a);
        System.out.println(b);
        System.out.println(s);
        System.out.println(line);

        int subAB = a - b;
        int subBA = b - a;

        int task3Solution = sumBC + subAB;
        int task4Solution = sumBC + subBA;

        System.out.println(line);

        System.out.println("task3Solution = " + task3Solution);
        System.out.println("task4Solution = " + task4Solution);

        int multiAB = a * b;
        int divAB = a / b;

        System.out.println(line);

        System.out.println("multiAB = " + multiAB);
        System.out.println("divAB = " + divAB);

        System.out.println(line);

        int remAB = a % b;

        System.out.println(remAB);
        System.out.println(line);

        System.out.println(25 / 5);
        System.out.println(25 % 5);

        System.out.println(11 / 5);
        System.out.println(11 % 5);

        System.out.println(100 / 99);
        System.out.println(100 % 99);

        System.out.println(4 / 2);
        System.out.println(5 / 2);

        System.out.println(4 % 2);
        System.out.println(5 % 2);

        System.out.println(49764792 % 7);
        System.out.println(49764791 % 7);

        System.out.println(line);

        System.out.println(b++);
        System.out.println(c++);

        System.out.println(line);
        System.out.println(++b);
        System.out.println(++c);

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println(tempB);
        System.out.println(b);
    }
}
