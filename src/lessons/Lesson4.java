package lessons;

public class Lesson4 {

    public static void main(String[] args) {
        //Андрей старше Светы и Наташа старше Светы

//        int ageA;
//        int ageN;
//        int ageS;
//
//        (ageA > ageS) && (ageN > ageS)

//        int a = 0;
//        int b = 7;

//        System.out.println(5 > 7);
//        System.out.println((a >= b) || (a < b));
//
//        System.out.println(a != b);
//        System.out.println(!(a == b));

//        if-then
//        if () {
//
//        }
//        если a = b, то сложить a и b

//         if (a == b) {
//             System.out.println(a + b);
//         }


//        if-else
//        if () {
//
//        } else {
//
//        }

//        если a = b, то сложить a и b а иначе вычесть из a значение b

//        if (a == b) {
//            System.out.println(a + b);
//        } else  {
//            System.out.println(a - b);
//        }



//        если a = b, то сложить a и b если же a > b, то присвоить a значение b а иначе вычесть из a значение b

//        if (a == b) {
//            System.out.println(a + b);
//        } else if (a > b) {
//            a = b;
//            System.out.println(a);
//        } else {
//            System.out.println(a - b);
//        }
//        if - else if - else
//        if () {
//
//        } else if () {
//
//        }
//        Если a > b или b <

//         a = 0;
//         b = 77;
//        int c = 25;
//
//        if ((a > b) || (b < c)) {
//            a = 7;
//            int sum = b + c;
//            System.out.println(" a = " +a);
//            System.out.println("sum = " + sum);
//        } else {
//            a = 10;
//            System.out.println("a = " + a);
//        }

        int n = 20;

        if ((n % 2 != 0) && (n % 3 == 0)) {
            n = 0;
        } else if ((n % 2 != 0) && (n % 3 != 0)) {
            n = 10;
        } else if ((n % 2 == 0) && (100 % n == 0)) {
            n = 100;
        }
//        Test
        int expectedResult = 100;
        int actualResult = n;

        if (actualResult == expectedResult) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        Integer x = 12;
        Integer y = 20;
        System.out.println(x.equals(y));
        System.out.println(!(x.equals(y)));

        String hi1 = "Hi";
        String hi2 = "Hi";
        System.out.println(hi1.equals(hi2));

//        int k = 5;
//        int l = 10;
//        int m = 15;
//
//        String line = "\t________________________________________________________________________________\n";
//        String vLine = "\t|\t";
//        String endLine = "\t|";
//        String tab = "\t";
//
//        System.out.println(
//                line
//                        + vLine + tab
//                        + vLine + "+10"
//                        + vLine + "-5"
//                        + vLine + "*100"
//                        + vLine + "/2"
//                        + vLine + "%2"
//                        + vLine + "^2"
//                        + vLine + "++"
//                        + vLine + "--"
//                        + endLine
//        );
//        System.out.print(
//                line
//                        + vLine + "k = " + k
//                        + vLine + (k + 10)
//                        + vLine + (k - 5)
//                        + vLine + (k * 100) + " "
//                        + vLine + (k / 2)
//                        + vLine + (k % 2)
//                        + vLine + (k * k++)
//                        + vLine + (k--)
//        );
//
//        k--;
//
//        System.out.println(vLine + k + endLine);
//
//        k = l;
//
//        System.out.print(
//                line
//                        + vLine + "l = " + l
//                        + vLine + (k + 10)
//                        + vLine + (k - 5)
//                        + vLine + (k * 100)
//                        + vLine + (k / 2)
//                        + vLine + (k % 2)
//                        + vLine + (k * k++)
//                        + vLine + (k--)
//        );
//
//        k--;
//
//        System.out.println(vLine + k + endLine);
//
//        k = m;
//
//        System.out.print(
//                line
//                        + vLine + "m = 15"
//                        + vLine + (k + 10)
//                        + vLine + (k - 5)
//                        + vLine + (k * 100)
//                        + vLine + (k / 2)
//                        + vLine + (k % 2)
//                        + vLine + (k * k++)
//                        + vLine + (k--)
//        );
//
//        k--;
//
//        System.out.println(vLine + k + endLine);
//        System.out.println(line);
    }
}


