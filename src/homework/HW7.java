package homework;

import java.util.Arrays;

public class HW7 {

    static char subTask = 'a';
    static int tcNumber = 1;
    static String tab = "\t\t\t\t\t\t";
    static String line = "*********************************************************";

    public static void printTCNumber() {
        System.out.println(line + '\n' + tab + "Задание " + tcNumber++ + '\n' + line);
    }

    public static void main(String[] args) {

//        1.Прочитать ссылку про оператор switch в документации Oracle, посмотреть видео
//        (ссылки в презентации), и переписать  методы returnMonth(), returnDayOfTheWeek()
//        с помощью оператора switch.
        printTCNumber();

//        2.Написать универсальный метод для построения последовательности, которая начинается
//        с числа start, заканчивается числом end (оба включительно). Все числа в этой
//        последовательности должны быть кратны числу step. Этот метод должен высчитывать
//        первое кратное число в диапазоне [start, end] и строить последовательность (возрастающую или убывающую)
//        от вычисленного первого кратного числа с шагом step.
        printTCNumber();

//        3.Создать массив catsNames[], заполнить его любыми своими значениями (не такими, как были на уроке).

        printTCNumber();
        String[] catsNames;
        catsNames = new String[8];
        catsNames = new String[]{"Белый", "Дымок", "Туман", "Серый", "Питон", "Андрей", "Мурчик", "Сопелька"};
        System.out.println(Arrays.toString(catsNames));

//        4.В массиве catsNames[] изменить значение элемента с индексом 4 на “Рыжик”,  а значение
//        элемента с индексом 1 на “Черныш”.

        printTCNumber();
        catsNames[4] = "Рыжик";
        catsNames[1] = "Черныш";
        System.out.println(Arrays.toString(catsNames));

//        5.Создать массив catsColors[] и заполнить его значениями (см картинку в презентации)
        printTCNumber();
        String[] catsColors;
        catsColors = new String[8];
        catsColors = new String[]{"Серый", "Черный", "Серый", "Серый", "Рыжий",
                "Серый", "Рыжый", "Дымчатый"};
        System.out.println(Arrays.toString(catsColors));

//        6.Создать массив catsAges[] и заполнить его любыми целочисленными валидными значениями.
        printTCNumber();
        int[] catsAges = new int[8];

        catsAges[0] = 1;
        catsAges[1] = 2;
        catsAges[2] = 3;
        catsAges[3] = 4;
        catsAges[4] = 5;
        catsAges[5] = 6;
        catsAges[6] = 15;
        catsAges[7] = 12;

        System.out.println(Arrays.toString(catsAges));

//        7.Создать массив isCatRed[] и заполнить его соответствующими значениями
//        (см картинку в презентации. Red = рыжий)

        printTCNumber();
        boolean[] isCatRed;
        isCatRed = new boolean[8];
        isCatRed[4] = true;
        isCatRed[6] = true;
        System.out.println(Arrays.toString(isCatRed));

//        8.Распечатать для массивов catsNames[] и catsColors[]:
//        имя кота в коробке с номером 6
//        имена котов из коробок с четными индексами
//        имена котов из коробок, чьи индексы кратны 4
//        цвет котов из коробок с нечетными индексами
//        цвет котов из коробок, чьи индексы кратны 3, но не кратны 2

        printTCNumber();
        System.out.println(catsNames[6]);

        for (int i = 0; i < catsNames.length; i += 2) {
            System.out.println(i);
        }

        for (int i = 0; i < catsNames.length; i += 4) {
            System.out.println(i);
        }

        for (int i = 0; i < catsColors.length; i++) {
            if (i % 2 != 0) {
                System.out.println(catsColors[i]);
            }
        }

        for (int i = 0; i < catsColors.length; i++) {
            if (i % 3 == 0 && i % 2 != 0) {
                System.out.println(catsColors[i]);
            }
        }

//        9.Распечатать “Накорми кота!” для всех серых котов
        printTCNumber();
        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("Серый")) {
                System.out.println("Накорми кота");
            }
        }

//        10.Распечатать “Дай коту воды!” для всех котов со значениями true из массива isCatRed[]
        printTCNumber();
        for (int i = 0; i < isCatRed.length; i++) {
            if (isCatRed[i]) {
                System.out.println("Дай коту воды!");
            }
        }

////      11.Распечатать “Отнеси кота на прививку!”, если возраст кота меньше 2 лет
        printTCNumber();
        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] < 2) {
                System.out.println("Отнеси кота на прививку!");
            }
        }

//        12.Для кота в последней коробке распечатать имя, цвет, возраст
        printTCNumber();
        for (int i = 0; i < catsNames.length; i++) {
            if (i != 8 && i > 6) {
                System.out.println(catsNames[i] + " " + catsColors[i] + " " + catsAges[i]);
            }
        }

//        13.Распечатать имя, цвет, возраст котов в двух серединных коробках
        printTCNumber();
        if ((catsNames.length == catsColors.length) && (catsColors.length == catsAges.length)) {
            int k = catsAges.length / 2;

            System.out.println(catsAges[k - 1] + " " + catsAges);
            System.out.println(catsColors[k - 1] + " " + catsColors);
            System.out.println(catsNames[k - 1] + " " + catsNames);
        }

//        14.Распечатать имена всех котов, чей возраст больше 2 лет
        printTCNumber();
        for (int i = 0; i < catsNames.length; i++) {
            if (catsAges[i] > 2)
                System.out.println(catsNames[i]);
        }

//        15.Распечатать “Накорми … !” , где … - имя кота, а значение isCatRed == true
        printTCNumber();
        if (catsNames.length == isCatRed.length) ;
        for (int i = 0; i < catsNames.length; i++) {
            if (isCatRed[i]) {
                System.out.println("Накорми " + catsNames[i] + "а!");
            }
        }

//        16.Распечатать средний возраст котов из массива catsAges[]
        printTCNumber();
        for (int i = 0; i < catsAges.length; ) {
            int sumAges = (catsAges[1] + catsAges[2] + catsAges[3] + catsAges[4] + catsAges[5]
                    + catsAges[6] + catsAges[7] + catsAges[0]) / 7;
            System.out.println(sumAges);
            break;
        }

//        17.Распечатать возраст самого молодого кота
        printTCNumber();
        int min = 30;
        for (int i = 0; i < catsAges.length; i++) {
            if (min > catsAges[i]) {
                min = catsAges[i];
            }
        }
        System.out.println(min + " ");

//        18.Распечатать возраст самого старого кота
        printTCNumber();

//        19.Распечатать количество серых котов и количество рыжих котов
        printTCNumber();
        int grayCount = 0;
        int redCount = 0;

        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("Серый")) {
                grayCount++;
            }
            System.out.println(grayCount + " ");
            if (catsColors[i].equals("Рыжий")) {
                redCount++;
            }
            System.out.println(redCount + " ");
        }

//        20.Распечатать имя кота, если кот находится в коробке с нечетным индексом
//        и его возраст не больше 2 лет.
        printTCNumber();
        if (catsNames.length == catsAges.length) {
            for (int i = 1; i < catsAges.length; i += 2) {
                if (catsAges[i] <= 2)
                    System.out.println(catsNames[i] + " ");
            }
        }
    }
}
