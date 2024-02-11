package homework;

public class HW6 {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    static String line = ANSI_GREEN + "____________________________________" + ANSI_RESET;
    static int taskNumber = 1;
    static char subTask = 'a';

    public static void printnumber() {
        System.out.println(line + ANSI_PURPLE + "\n\t\t\tЗадание " + ANSI_RESET + taskNumber++ + "\n" + line);
    }

    public static void numberFor(double start, double end, double step) {
        if (step != 0) {
            if (start <= end && step > 0) {
                for (double i = start; i <= end; i += step) {
                    System.out.println(i + ", ");
                }
            } else if (start >= end && step < 0) {
                for (double i = start; i >= end; i += step) {
                    System.out.println(i + ", ");
                }
            }
        }
    }

    public static void letterFor(char n, char m) {
        if ((n >= 97 && n <= 122) && (m >= 97 && m <= 122) || (n >= 65 && n <= 90) && (m >= 65 && m <= 90)) {
            if (n <= m) {
                for (char i = n; i <= m; i++) {
                    System.out.println(i + "");
                }
            } else {
                for (char i = n; i >= m; i--) {
                    System.out.println(i);
                }
            }
        }
    }

    public static void evenNumber(int l) {
        if (l > 0) {
            for (int i = 0; l > 0; i += 2, l--) {
                System.out.println(i);
            }
        }
    }

    public static void integerNumber(int n) {
        for (int i = 0; i <= n; i += 2) {
            System.out.println((int) Math.pow(i, 2));
        }
    }

    public static void printOddNumber(int n, int m, int l) {
        int countOddNumbers = 0;
        if (n % 2 != 0 || m % 2 != 0) {
            for (int i = n; countOddNumbers < l; i += m) {
                if (i % 2 != 0) {
                    countOddNumbers++;
                    System.out.println(i);
                }
            }
        }
    }

    public static void randomMethod(int n, int m, int l) {

        for (int i = 0; i < l; i++) {
            System.out.println(((int) (Math.random() * ((m - n) + 1)) + n) + " ");
        }
    }

    public static void method19(int n, int l) {
        if (n > 1) {
            for (int i = n; l > 0; i++, l--) {
                double y = Math.ceil(((Math.pow(i, 2) + 1) / (2 * n - 1) * 100) / 100);
                System.out.println(y);
            }
        }
    }

    public static void main(String[] args) {

        printnumber();
//      1.Распечатать последовательность чисел от 0 до 9 включительно.

        for (int i = 0; i <= 9; i++) {
            System.out.println(i);
        }

        printnumber();
//      2.Распечатать последовательность чисел от 10 исключительно до 0 включительно.

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        printnumber();
//      3.Распечатать последовательность чисел от 50 до 55 включительно с шагом 2.

        for (int i = 50; i <= 55; i += 2) {
            System.out.println(i);
        }

        printnumber();
//      4.Распечатать последовательность чисел, кратных 7, в промежутке (327, 300)

        for (int i = 326; i > 300; i--) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }

        printnumber();
//      5.Распечатать последовательность чисел в промежутке [12, 13] с шагом 0.1

        for (double i = 12; i <= 13; i += 0.1) {
            System.out.println(Math.round(i * 10.0) / 10.0);
        }

        printnumber();
//      6.Распечатать последовательность четных чисел от 215 до 237 включительно

        for (int i = 214; i < 238; i += 2) {

            System.out.println(i);
        }

        printnumber();
//      7.Распечатать последовательность чисел, кратных 7, в промежутке от 7 исключительно до 14 исключительно.

        for (int i = 8; i <= 13; i++) {
            if ((i % 7) == 0) {
                System.out.println(i);
            }
        }

        printnumber();
//      8.Распечатать последовательность которая начинается с минимального
//      значения типа данных short и заканчивается максимальным значением short.
//      Числа в последовательности должны быть кратны 15001.

        for (short i = Short.MIN_VALUE; i < Short.MAX_VALUE; i += 15001) {
            if (i % 15001 == 0) {
                System.out.println(i);
            }
            System.out.print("");
        }

        printnumber();
//      9.Распечатать последовательность чисел в промежутке от -10 до 34 включительно.
//      Числа, кратные 11, должны быть распечатаны синим цветом. Числа, кратные 12,
//      должны быть распечатаны красным цветом. А ноль необходимо распечатать словом ZERO.

        for (int i = 0, i1 = 0; i <= 34 && i1 <= 36; i += 11, i1 += 12) {
            if (i == 0) {
                System.out.println("ZERO");
            } else {
                System.out.println(ANSI_BLUE + i + "" + ANSI_RESET);
            }
            if (i1 == 36 || i1 == 0) {
                System.out.println("");
            } else {
                System.out.println(ANSI_RED + i1 + "" + ANSI_RESET);
            }
        }

//      10.Написать метод, который принимает на вход параметры start,  end, step, и
//      печатает последовательность десятичных  чисел, начиная с числа start, с
//      шагом step. Точка выхода из цикла - число end.

        printnumber();
        numberFor(10.0, 0, -1);

//      11.Написать метод, который принимает на вход параметры n и m типа char, и
//      выводит на печать последовательность букв английского алфавита в
//      промежутке между значениями n и m включительно.

        printnumber();
        letterFor('a', 'y');

//      12.Написать метод, который принимает параметр  и печатает  последовательность
//      четных чисел от нуля. Длина последовательности = L.

        printnumber();
        evenNumber(15);

//       13.Напишите метод, который принимает целое число n, и
//       выводит все степени числа 2 от 1 до n включительно

        printnumber();
        integerNumber(10);

//      14.Вывести последовательность 012345678900112233445566778899000…  до числа 9999 включительно.

        printnumber();
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "" + i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "" + i + i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "" + i + i + i);
        }

        printnumber();
//        15.Написать метод, который генерирует  последовательность чисел:
//        0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5
//        Метод формирует строку из сгенерированных значений, и выводит
//        результат единожды на печать. ПРотестировать этот метод.

        printnumber();
        printOddNumber(2, 30, 4);
//        16.Написать метод, который принимает параметры n, m, l, и печатает
//        последовательность нечетных чисел,  начиная с числа n, с шагом m,
//        длина последовательности.

        printnumber();
        randomMethod(-3, 18, 5);
//        18.Написать метод, который принимает на вход параметры n, m, l и генерирует
//        последовательность случайных целых чисел в промежутке от n до m  включительно.
//        Длина последовательности - . Вывести результат на печать

        printnumber();
        method19(16, 4);
//        19.Сгенерируйте и распечатайте последовательность чисел, где для каждого
//        положительного или отрицательного значения n выводится на печать значение,
//        рассчитанное по формуле:

        printnumber();
//        20.Написать метод, который принимает параметры , n, и печатает последовательность чисел по формуле

        printnumber();
//       21.Сгенерируйте последовательность целых положительных  двузначных чисел,
//       в которых разница между первой цифрой (десятки) и второй цифрой (единицы) не превышает 3.

        printnumber();
//       22.Написать метод, который вычислит значение функции:

        printnumber();
//       23.Написать метод, который генерирует последовательность простых
//       положительных чисел и выводит последовательность на печать

        printnumber();
//        24.Написать метод, который принимает на вход параметры day = “Sun”,
//        month = 10, date = 2, и выводит на печать  последовательность:
//        Sun, Oct 02
//        Mon, Oct 03
//        Tue, Oct 04
//        Wed, Oct 05
//        Thu, Oct 06
//        Fri, Oct 07
//        Sat, Oct 08
//        Sun, Oct 09

    }
}
