package homework;

public class HW3 {



    public static void main(String[] args) {

        String line = "__________________________________";
        String task = "Задание №";
        int number = 1;
        char subTask = 'a';

        System.out.println(line);
        System.out.println(task + ++number);

//   2.Создать переменные a и b типа byte, присвоить им значения из допустимого диапазона.
        byte a = 34;
        byte b = 50;

        System.out.println(line);
        System.out.println(task + ++number);

//   3.Создать переменные s и t типа short, присвоить им значения с разницей 60000.

        short s = 30000;
        short t = -30000;
        int delta = s - t;
        System.out.println(delta);

//    Создать переменную i типа int и присвоить ей минимально
//    возможное значение этого типа. Затем присвоить максимально
//    возможное значение этого типа. Распечатать оба значения в виде таблицы:
//   int min значение i
//   int max значение i

        System.out.println(line);
        System.out.println(task + ++number);

        System.out.println(line);
        int i = Integer.MIN_VALUE;
        System.out.println("|  int min    | \t" + i + "|");
        i = Integer.MAX_VALUE;
        System.out.println("|  int max    | \t" + i + " |");
        System.out.println(line);

        System.out.println(task + ++number);
//   Создать переменную phoneNumber и присвоить
//   ей значение номера телефона с кодом страны и города
//   (можно ненастоящий номер телефона, например, 18009998877)

        long phoneNumber = 79169031471L;
        System.out.println(phoneNumber);

        System.out.println(line);
        System.out.println(task + ++number);
        System.out.println(line);
//   Создать переменную f типа float и присвоить ей
//   значение 100.101101. Создать переменную d типа double и присвоить ей значение 100.101101.
//   Распечатать результат в виде таблицы:
//   float f = 100.101101
//   значение f
//   double d = 100.101101
//   значение d
        float f = 100.101101F;
        double d = 100.101101D;
        System.out.println("| float f = 100.101101 " + f + "|" + "\n"
                + "|double d = 100.101101 " + d + "|");
        System.out.println(line);

        System.out.println(task + ++number);
        System.out.println(subTask++ + ".");
        Double dd = new Double(10.09999 + 20.099999);
        System.out.println("результатом суммы чисел 10.09999 и 20.099999 = " + dd);
        Float ff = new Float(10.09999F + 20.099999F);
        System.out.println(subTask++ + ".");
        System.out.println("результатом суммы чисел 10.09999 и 20.099999 = " + ff);

//   a) Создать переменную типа Double с именем dd  и инициализировать её
//   результатом суммы чисел 10.09999 и 20.099999.
//   b) Создать переменную типа Float с именем ff  и инициализировать её
//   результатом суммы чисел 10.09999 и 20.099999.
//   Распечатать результаты.

        System.out.println(line);
        System.out.println(task + ++number);
//   Создать переменную float ff и присвоить ей значение выражения 10 / 3.

//        Float ff = new Float(10 \ 3);
        int n = 40;

        if ((n % 2 != 0) && (n % 3 == 0)) {
            n = 0;
        } else if ((n % 2 != 0) && (n % 3 != 0)) {
            n = 10;
        } else if ((n % 2 == 0) && (100 % n == 0)) {
            n = 100;
        }

        //Test
        int expectedResult = 100;
        int actualResult = n;

        if (actualResult == expectedResult) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }























        }
}
