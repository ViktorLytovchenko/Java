package homework;

public class HW4 {



    static String line = "_________________________________________________________";
    static String task = "\nTask # ";
    static int number = 2;
    static char subTask = 'a';
    static int SubTaskNumber = 1;



    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";


    public static void printTask() {
        System.out.println(ANSI_CYAN + line + ANSI_RESET);
        System.out.print(ANSI_RED + task + ANSI_RESET);
        System.out.println(number++);

    }
    public static void weather(int temp) {
        double fah = (1.8 * temp) + 32;
        double kel = temp + 273.15;
        System.out.println("город Чернигов," + ANSI_BLUE + "U" + ANSI_YELLOW + "A " + ANSI_RESET
                + ANSI_RED + temp + " °C" + ANSI_RESET + " = " + ANSI_PURPLE + fah + " °F" + ANSI_RESET);
        System.out.println("город Чернигов," + ANSI_BLUE + "U" + ANSI_YELLOW + "A " + ANSI_RESET
                + ANSI_RED + temp + " °C" + ANSI_RESET + " = " + ANSI_PURPLE + kel + " K" + ANSI_RESET);
    }


    public static void task14( int parametr1, int parametr2, String varName1, String varName2) {
        int quotient = parametr1 / parametr2;
        int remainder = parametr1 % parametr2;

        System.out.println(
                "Результат деления " + varName1 + " на " + varName2 + " = " + quotient
                + ", а остаток от деления = " + remainder
        );


    }

    static int rab;
    static int pheas;

    public static void task15(int sumLegs, int sumHead){
        rab = (sumLegs - (sumHead * 2)) / 2;
        System.out.println(rab + " кроликов");
        pheas = sumHead - rab;
        System.out.println(pheas + " фазанов");

    }

    public static void task16(double distance, double time) {
        System.out.println(distance / time + " скорость движения");
    }

    int k = 20;
    int l = 10;
    int m = 5;

//    printtask14(k, l, "k", "l");
//    printtask14(k, m, "k", "m");
//    printtask14(l, m, "l", "m");

   // System.out.println()

    public static void letters(String text,double Num,String text2,double Num2) {

    };

    public static void task17(int apple, int student) {
        int studApple = apple / student;
        int forTeacher = apple % student;
        String chS = "";
        String chT = "";
        String chStud = "";
        String chA = "";

        if (apple == 1) {
            chA = "o";
        } else if (apple >= 2 && apple < 5) {
            chA = "a";
        } else if (apple >= 5 && apple < 21) {
            chA = "";
        } else if (apple >= 21) {
            if (apple % 10 == 1) {
                chA = "o";
            } else if (apple % 10 >= 2 && apple % 10 <= 4) {
                chA = "a";
            } else if (apple % 10 >= 5 && apple % 10 <= 9 || apple % 10 == 0) {
                chA = "";
            }
        }
        if (studApple == 1) {
            chS = "у";
        } else if (studApple >= 2 && studApple < 5) {
            chS = "a";
        } else if (studApple >= 5) {
            chS = "";
        }
        if (student >= 1 && student < 5) {
            chStud = "a";
        } else if (student >= 5 && student < 21) {
            chStud = "ов";
        } else if (student >= 21) {
            if (student % 10 == 1 || student % 10 >= 2 && student % 10 <= 4) {
                chStud = "a";
            } else if (student % 10 >= 5 && student % 10 <= 9 || student % 10 == 0) {
                chStud = "ов";
            }
        }
        if (forTeacher == 1) {
            chT = "о";
        } else if (forTeacher >= 2 && forTeacher < 5) {
            chT = "a";
        } else if (forTeacher >= 5) {
            chT = "";
        } else if (forTeacher >= 21) {
            if (forTeacher % 10 == 1) {
                chT = "o";
            } else if (forTeacher % 10 >= 2 && forTeacher % 10 <= 4) {
                chT = "a";
            } else if (forTeacher % 10 >= 5 && forTeacher % 10 <= 9 || forTeacher % 10 == 0) {
                chT = "";
            }
        }
        System.out.println("Если " + apple + " яблок" + chA + " поделить на " + student + " ученик" + chStud + ", то каждый ученик получит по " + studApple + " яблок" + chS + ",\n"
                + "и " + forTeacher + " яблок" + chT + " останется учителю.");
    }


    public static void main(String[] args) {

        printTask();

        /*3.Записать в виде кода следующие логические выражения:
        1) (2 = 2) И (7 = 7);
        2) Не(15 < 3);
        3) ("Сосна" = "Дуб") ИЛИ ("Вишня" = "Клён");
        4) Не("Сосна" = "Дуб");
        5) (Не(15 < 3)) И (10 > 20);
        6) ("Глаза даны, чтобы видеть") И ("Под третьим этажом находится второй этаж");
        7) (6/2 = 3) ИЛИ (7*5 = 20)
        */

        printTask();
        System.out.println(SubTaskNumber);
        int d = 2;
        int z = 7;
//        System.out.println("(2 = 2) && (7 = 7);");
        System.out.println((d == d) && (z == z));
        System.out.println(++SubTaskNumber);
        d = 15;
        z = 3;
//        System.out.println("!(15 < 3);");
        System.out.println(!(d < z));
        System.out.println(++SubTaskNumber);
        String str = "pine";
        String str1 = "oak";
        String str2 = "cherry";
        String str3 = "maple";
        System.out.println((str.equals(str1)) || (str2.equals(str3)));
//        char q = '\"';
//        System.out.println("(" + q + "Сосна" + q + " = " + q + "Дуб" + q + ")" + " || " + "(" + q + "Вишня"
//                + q + " = " + q + "Клён" + q + ");");
//        (2 = 2) && (7 = 7);
        System.out.println(++SubTaskNumber);
        System.out.println(!(str.equals(str1)));
        System.out.println(++SubTaskNumber);


//        System.out.println("!" + "(" + q + "Сосна" + q + " = " + q + "Дуб" + q + ");");
////        !(15 < 3);
//        System.out.println(++SubTaskNumber);
//        System.out.println("(!(15 < 3)) && (10 > 20);");
//        ("Сосна" = "Дуб") || ("Вишня" = "Клён");
        System.out.println(++SubTaskNumber);
        d = 15;
        z = 3;
        int d1 = 10;
        int d2 = 20;
        System.out.println(!(d < z) && (d1 > d2));
//        System.out.println("(" + q + "Глаза даны, чтобы видеть" + q + "&&" + q + "Под третьим этажом находится "
//                + "второй этаж" + q + ");");
//        !("Сосна" = "Дуб");
        System.out.println(++SubTaskNumber);
        d = 6;
        z = 2;
        d1 = 3;
        d2 = 7;
        int d3 = 5;
        int d4 = 20;
        System.out.println((d / z == d1) || (d2 * d3 == d4));
//        System.out.println("(6 / 2 = 3) || (7 * 5 = 20);");
//      (6 / 2 = 3) || (7 * 5 = 20)

//      4.Записать в виде кода следующие выражения:
//      а) Света младше Андрея и Наташи
//      б) На полке стоят учебники, а на столе лежат справочники.
//      в) БОльшая часть детей — девочки. Остальные - мальчики.

        printTask();
        System.out.println();
        int ageA;
        int ageN;
        int ageS;
//      Света младше Андрея и Наташи
        // (ageS < ageA) && (ageS< ageN);
        System.out.println("(ageS < ageA) && (ageS< ageN)");

        String ShelfBook;
        String tableBook;
//      ShelfBook && tableBook;
//      На полке стоят учебники, а на столе лежат справочники.
        System.out.println("ShelfBook && tableBook");

//      БОльшая часть детей — девочки. Остальные - мальчики.
        int girls;
        int boys;
//      girls > boys;
        System.out.println("girls > boys");

//      5.“Водительские права можно получить, только когда исполнится 16 лет.”
        printTask();

        int driveLis;
        int ageOk = 16;
        int ageYou = 21;
//        driveLis == ageOk;

        if (ageYou >= ageOk) {
            System.out.println("Ты можешь получить права ");
        } else if (ageYou < ageOk) {
            System.out.println("Ты не получишь права ");
        }

//      6.”Петя не едет в автобусе, но при этом читает книгу или не смотрит в окно”
        printTask();
        int petya;
        int bus;
        int readBooks;
        int watchWindow;

//      (petya != bus) && (readBooks || watchWindow);

        printTask();
//      7.“Если с другом ты, это хорошо, а когда наоборот - плохо”

        int you = 1;
        int withFriend = 1;
        int notFriend = 1;
        int good = 1;
        int poorly = 1;

        if (you == withFriend) {
            System.out.println("Если с другом ты, то это хорошо ");
        } else if (you != withFriend) {
            System.out.println("а когда наоборот - плохо");
        }
        printTask();

//      9.Проверить число x, которое может принимать значения 10, 12, -3, 5 и 0.
//      Если x больше 10, то вывести на печать “x больше 10”.
//      Если x меньше нуля, то вывести на печать “x - отрицательное число”
//      Если x = 5, то вывести на печать “Разность x и 5 равна 0”
//      Иначе вывести на печать “Число x меньше 11, больше или равно 0, но не равно 5”. Проверить,
//      соответствует ли последнее утверждение всем предыдущим утверждениям.


        int x = 0;

        if (x > 10) {
            System.out.println(x + " больше 10");
        } else if (x < 0) {
            System.out.println(x + " - отрицательное число");
        } else if (x == 5) {
            System.out.println("Разность " + x + " и 5 равна 0");
        } else {
            System.out.println("Число " + x + " меньше 11, больше или равно 0, но не равно 5");
        }

//        10.Проверьте число на четность. Если число четное, удвойте это число,
//        иначе возведите число в квадрат.
//        Выведите результат работы алгоритма на печать.Найдите в презентации,
//        какой блок схеме соответствует ваш алгоритм.

        printTask();

        int number = 17;

        if (number % 2 == 0) {
            System.out.println(number * 2);
        } else if (number % 2 != 0) {
            System.out.println(number * number);
        }


//   11.Напишите алгоритм проверки возраста на соответствие условиям (if-else):
//   a. Голосовать можно с 18 лет
//   b. Машину можно водить с 16 лет
//   c. В школу можно идти с 5 лет


        printTask();

        ageYou = 15;

        if (ageYou >= 0 && ageYou <= 150) {

            if (ageYou >= 18) {
                System.out.println(subTask++ + "." + "Ты можешь голосовать ");
            } else  {
                System.out.println(subTask++ + "." + "Ты не можешь голосовать ");
            }
            if (ageYou >= 16) {
                System.out.println(subTask++ + "." + "Ты можешь водить машину ");
            } else {
                System.out.println(subTask++ + "." + "Ты не можешь водить машину ");
            }
            if (ageYou >= 5) {
                System.out.println(subTask++ + "." + "Ты можешь идти в садик ");
            } else  {
                System.out.println(subTask++ + "." + "Ты не можешь идти в школу ");
            }
        }


        printTask();

        int great = 4;
        subTask = 'a';
        if (great >= 2 && great < 6) {
            if (great == 5) {
                System.out.println(subTask + "." + " Выдать похвальную грамоту и перевести в следующий класс");
            } else if (great == 4) {
                System.out.println(subTask++ + "." + " Перевести в следующий класс");
            } else if (great == 3) {
                System.out.println(subTask++ + "." + " Дать задание на лето и перевести в следующий класс");
            } else if (great == 2) {
                System.out.println(subTask++ + "." + "Вызвать родителей и оставить в текущем классе на второй год");
            }
        } else {
            System.out.println("Введите правильное значение");
        }


//   12.Напишите метод, который примет на вход температуру в Цельсиях, и распечатает результат температуры
//   в Цельсиях и в Фаренгейтах.


        printTask();
        weather(20);


        //  13.Напишите алгоритм программы, которая проверяет 2 числа.
//   Программа складывает числа, которые делятся на 3 без
//   остатка, и вычитает числа, которые делятся на 5 без остатка.
//   ПРограмма выводит на печать результат вычислений.
//   Программа умножает числа, которые делятся на 2 без остатка,
//   но если хотя бы одно число отрицательное, программа умножает
//   результат действия на (-1). ПРограмма выводит на печать результат
//   вычислений.
//   Если числа не прошли ни одну проверку, программа выводит на печать
        printTask();
        int g = 15;
        int h = 10;

        if ((g % 3 == 0) && (h % 3 == 0)) {
            System.out.println("g + h =  " + (g + h));
        } else if ((g % 5 == 0) && (h % 5 == 0)) {
            System.out.println("g - h = " + (g - h));
        }
        if ((g % 2 == 0) && (h % 2 == 0)) {
            System.out.println();
        } else if ((g < 0) && (h < 0)) {

        }

//   14.Распечатать следующие выражения, используя метод и параметры k, l, m:
//   Результат деления k на l = …, а остаток от деления  = …
//   Результат деления k на m = …, а остаток от деления  = …
//   Результат деления l на m = …, а остаток от деления  = …
//   Результат деления m на k = …, а остаток от деления  = …

        printTask();
//        task14();


//        15.Решить задачу
//        В клетке находятся фазаны и кролики. Известно, что у них 35 голов и 94 ноги.
//        Узнайте число фазанов и число кроликов.
//        Проверить работу вашего алгоритма тестом.

        printTask();
        task15(94, 35);

//        Test
        int expectedResult = 12;
        int expectedResult2 = 23;
        int actualResult = rab;
        int actualResult2 = pheas;

        if ((actualResult == expectedResult) && (actualResult2 == expectedResult2)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

//   Написать метод, который рассчитывает среднюю скорость движения (speedAverage) транспортного
//   средства или живого существа с разными параметрами distance и  time.
//   Протестировать метод.
//     Тестовые данные:
//   distance		 time
//     12			20 min
//     150		  2,5 hours
//     300		   1¾ hours


        printTask();
        task16(12,20);


//   17.Выполнить задание 7 и 8 из HW2 с помощью метода и параметров:
//   Написать метод так, чтобы правильные склонения слов
//   (н-р, яблок, яблоко или яблока; ученики - учеников…) печатались автоматически в зависимости от значений параметров.
//   Распечатать выражение с параметрами:
//   apple = 42, 55, 1
//   student = 42, 5, 2



        printTask();
        task17(42, 42);

//  18.Распечатать таблицу из HW3,  задание 11 с помощью методов и параметров
//  (значения f, ff, d, dd могут быть любыми).
//  Обратите внимание на то, что левая часть таблицы у вас почти такая же, как правая часть таблицы.

        printTask();




//   Напишите алгоритм программы, которая проверяет число типа short на количество разрядов,
//   и выводит результат проверки.
//   ( Например, “It’s a two-digit number.”, “It’s a five-digit number.”, etc)
//   Выведите результат проверки на печать.


        printTask();



    }



}

