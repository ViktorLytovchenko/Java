package homework;

public class HW5 {

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

    public static String verifyEquals(double expectedResult, double actualResult) {

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

//    Number 2
//   Написать метод, который принимает на вход число от 1 до 7  и
//   возвращает день недели. В случае невалидных значений метод возвращает “Error”.
//   Протестировать метод

    public static String dayOfWeek(int day) {

        if (day > 0 && day < 8) {

            if (day == 1) {

                return "Monday";
            }
            if (day == 2) {

                return "Tuesday";
            }
            if (day == 3) {

                return "Wednesday";
            }
            if (day == 4) {

                return "Thursday";
            }
            if (day == 5) {

                return "Friday";
            }
            if (day == 6) {

                return "Saturday";
            }
            if (day == 7) {

                return "Sunday";
            }
        }
        return "Error";
    }

//    Number 3
//    Написать алгоритм вычисления среднего возраста (int) в семье из 3х человек.
//    Например,
//    int age1 = 20,
//    int age2 = 40,
//    int age3 = 60
//    Average = 40.
//    или
//    age1 = -5;
//    age2 = -30;
//    age3 = -3;
//    должно вернуть  Integer.MIN_VALUE;

    public static int averageYears(int yearsFather, int yearsMather, int yearsSun) {
        if ((yearsFather >= 0 && yearsFather <= 150) && (yearsMather >= 0 && yearsMather <= 150) &&
                (yearsSun >= 0 && yearsSun <= 150)) {
            int averageYears = (yearsFather + yearsMather + yearsSun) / 3;

            return averageYears;
        }

        return Integer.MIN_VALUE;
    }

    //    Number 4
//    Найти минимальное  значение, используя переменные (по одному методу на каждый вариант)
//    k и l
//    k, l, m
//    k, l, m, n
//    Переменные должны быть типа int
//    Happy path test data:
//    if k = 3, l = 30, m = 300, n = 3000
//    expected results:
//    a) 3
//    b) 3
//    c) 3
//    Написать тесты на каждый метод.
    public static int findMimOutTwo(int k, int l) {
        int min;

        if (k < l) {
            min = k;
        } else {
            min = l;
        }
        return min;
    }

    //    Number 4
    public static int findMimOutThree(int k, int l, int m) {

        return findMimOutTwo(k, findMimOutTwo(l, m));
//        int min;
//        if (k < l) {
//            min = k;
//        } else {
//            min = l;
//        }
//        if (min > m) {
//            min = m;
//        }
//        return min;
    }

    public static int findMimOutFour(int k, int l, int m, int n) {

        return findMimOutTwo(k, findMimOutTwo(l, findMimOutTwo(m, n)));
    }

//    Number 5
//   Написать алгоритм вычисления среднего значения из 5 показателей
//   температуры тела кота. Метод принимает и возвращает значения типа double.
//    Например,
//    t1 = 39
//    t2 = 39
//    t3 = 39
//    t4 = 39
//    t5 = 39
//    TempAverage = 39
//    Не забудьте, что температура тела ЖИВОГО кота имеет определенные границы.
//    Значения, которые не входят в эти границы считаем невалидными и выдаем ошибку.
//    В случае невалидного значения хотя бы одной из входящих температур, метод возвращает -1.

    public static String tempBodyCat(double extremeMin, double low, double normal, double max, double extremeMax) {
        if ((extremeMin < 25.0 || extremeMax > 45.0 || extremeMax < 39.5) || (low < 37.0 || low > 38.0)
                || (normal < 38.0 || normal > 39.0) || (max < 39.5 || max > 45.0)) {
            double tempBodyCat = (extremeMin + low + normal + max + extremeMax) / 5;

            return "Fail";
        } else {

            return "Pass";
        }
    }

//    Number 6
//  Написать метод, который принимает на вход количество часов (int) работы в день,
//  стоимость одного часа работы в десятичном числе, и возвращает заработную плату в месяц в целых единицах.
//  При невалидных значениях метод возвращает -1.

    public static int workSalary(int workHoursDay, double priceHours) {
        if (priceHours >= 12 && workHoursDay <= 24) {
            int workSalary = (int) (workHoursDay * priceHours * 21);

            return workSalary;
        }

        return -1;
    }

//    Number 7
//  Написать метод, который принимает на вход 2 параметра -  цену и количество товара (количество в штуках). Алгоритм возвращает сумму покупки в виде десятичного числа.
//  Например,
//  price for 1 = 25 руб 50 коп (25.5)
//  amount = 5
//  expected total = 127 руб 50 коп (127.5)
//
//    При невалидных значениях метод возвращает -1

    public static String sumPrice(double priceProduct, double amountProduct) {
        double sumPurchase;
        if (priceProduct < 0 || amountProduct < 0) {
        } else if (priceProduct > 0 && amountProduct > 0) {
            sumPurchase = priceProduct * amountProduct;
            return "" + (int) sumPurchase;
        }
        return "Error";
    }

//    Number 8
//  Написать метод, который принимает на вход необходимые параметры и возвращает
//  строку ведомости выдачи зарплаты сотрудникам.
//    Например:
//
//  “Смирнова Мария Ивановна 		70000 руб 00 коп”
//
//  если имя сотрудника придет в виде пустой строки или в виде null (String -  это референсный
//  тип данных и может принимать значение null), то в ведомости должна быть распечатана пустая строка "".
//  Если же на вход придет невалидное данное по зарплате, или зарплата будет рассчитана, как 0,
//  то в ведомости тоже должна быть распечатана пустая строка ""
//  Протестировать метод.

    public static String payRoll(String fullName, double salary) {
        if ((fullName == null) || (fullName.equals("")) || (salary <= 0)) {

            return "";
        }

        int rub = (int) salary;
        int kop = (int) ((salary - rub) * 100);
        String kop1;
        if (kop >= 0 && kop <= 9) {
            kop1 = "0" + kop;
        } else {
            kop1 = "" + kop;
        }

        return "" + fullName + "\t\t\t" + rub + " руб " + kop1 + " коп";
    }

//    Number 9
//  Создать метод, который печатает ведомость для нескольких сотрудников, используя метод из задачи 8, например:
//
//  Смирнова Мария Ивановна 		70000 руб 00 коп
//  Серебров Иван Петрович 		128059 руб 00 коп
//
//  Метод в задании 9 может принимать разные параметры, в зависимости от того, что вам нужно для печати ведомости.
//  Смысл этого метода - распечатать несколько строк ведомости одновременно. Каждая из строк должна формироваться
//  с помощью метода, написанного в задании 8.
//  На этот метод писать тесты не нужно, просто распечатать ведомость.

    public static String payRoll1(String fullName, double salary, String fullName1, double salary1) {
        if ((fullName == null) || (fullName.equals("")) || (salary <= 0) || (fullName1 == null) ||
                (fullName1.equals("")) || (salary1 <= 0)) {

            return "";
        }

        int rub = (int) salary;
        int kop = (int) (salary - rub) * 100;
        String kop1;
        if (kop >= 0 && kop < 9) {
            kop1 = "0" + kop;
        } else {
            kop1 = "" + kop;
        }

        int rub1 = (int) salary1;
        int kop2 = (int) (salary1 - rub1) * 100;
        String kop3;
        if (kop >= 0 && kop < 9) {
            kop3 = "0" + kop;
        } else {
            kop3 = "" + kop;
        }

        return "" + fullName + "\t\t\t" + rub + " руб " + kop1 + " коп\n" + fullName1 + "\t\t\t" + rub1 + " руб "
                + kop3 + " коп";
    }

    //    Number 10
    public static String x(int x) {

        if (x < 0) {

        }
        if (x > 0) {

            return "" + x + " is positive";
        }
        if (x == 0) {

            return "" + x + "is zero";
        }

        return "" + x + "is negative";
    }

    //    Number 11
//    Написать метод, который принимает на вход десятичное число (например, 10.75), и возвращает
//    строку “10 руб 75 коп”.
    public static String price(double price) {

        if (price <= 0) {

            return "Error";
        }
        int rub = (int) price;
        int kop = (int) Math.round((price - rub) * 100);

        return "" + rub + " руб " + kop + "коп";
    }

    //    Number 12
//    Написать метод, который принимает на вход десятичное
//    число (например, 10,075) и возвращает строку “10 кг 75 гр”.
    public static String weight(double totalWeight) {

        if (totalWeight <= 0) {
            return "Error";
        }
        int kg = (int) totalWeight;
        int gr = (int) Math.round((totalWeight - kg) * 1000);

        return "" + kg + " kg " + gr + " грам";
    }

//     Number 13
//        Написать метод, который принимает на вход необходимые параметры, и печатает чек.
//        Этот метод тестировать не нужно, но необходимо использовать все раннее написанные
//        методы (в задачах из Part 1 тоже могут пригодиться некоторые методы)
//        Пример чека:
//        Яблоки
//        Цена за 1 кг			50 руб 13 коп
//        Количество товара	         3 кг 400 гр
//                _______________________________________
//        Сумма к оплате		170 руб 44 коп
//
//                или
//        Хлеб
//        Цена за 1 шт		30 руб 50 коп
//        Количество товара	5 шт
//                _______________________________________
//        Сумма к оплате		152 руб 50 коп

    public static String salesReceipt(String product, String priceForWeight, double prise,
                                      String amount, double weight, String sum) {
        if ((product == null) || (product.equals("")) || (priceForWeight == null) ||
                (priceForWeight.equals("")) || (amount == null) || (amount.equals("") || (sum == null)
                || (sum.equals("") || (prise <= 0) || (weight <= 0)))) {

            return "Error";
        }
        String line = "__________________________________________";
        double sum1 = prise * weight;
        return product + "\n" + priceForWeight + "\t\t\t" + price(prise) + "\n" + amount + "\t\t" + weight(weight) + "\n"
                + line + "\n" + sum + "\t\t\t" + price(sum1);
    }

//    Number 14
//    Написать метод, который принимает на вход год рождения и возвращает
//    ваше счастливое число. Счастливое число рассчитывается по формуле: сумма всех чисел,
//    если результат больше 9, снова считается сумма всех чисел.
//    Например:
//    год рождения 1999

//    public static String happyNumber(int number) {
//        int number1;
//        int number2;
//        int number3;
//        int number4;
//        if(number < 1000) && (number > 9999) {
//
//
//        }
//
//        return "Error";
//
//    }

//    Task 15
//  а) Дано 3 числа. Необходимо рассчитать разницу между средним значением и медианой (median) значением.
//  Если разница больше 2, необходимо показать сообщение: “Среднее значение … отличается от медианы … на … “.
//  Иначе показать сообщение: “Среднее значение =  …, медиана =  … ”.
//  b) Посчитать все то же самое с помощью методов класса Math, где возможно их использовать
//  Медиана - это серединное число в отсортированном наборе чисел.
//  1, 3, 9 → медиана 3
//  12, 13, 101 → медиана 13
//  14, 2, 12 → медиана 12
//  ВСе параметры приходят в int, расчеты производим в int
//  Протестировать оба метода - a) и b)

//    public static String differnce(int difference, int a, int b, int c, int mediane) {
//
//        int a;
//        int b;
//        int c;
//        int median;
//        int mean = a + b + c / 3;
//    }

    public static void main(String[] args) {

//        TC_1
        printTCNumber();

        int day = 5;
        String expectedResult = "Friday";

        String actualResult = dayOfWeek(day);

        verifyEquals(expectedResult, actualResult);

        printTestResult(verifyEquals(expectedResult, actualResult));

//        TC_2
        printTCNumber();

        int yearsFather = 60;
        int yearsMother = 40;
        int yearsSun = 20;

        int expectedResultEX2 = 40;
        int actualResultEX2 = averageYears(60, 40, 20);

        verifyEquals(expectedResultEX2, actualResultEX2);

//        ОТЧЕТ (report)
        printTestResult(verifyEquals(expectedResultEX2, actualResultEX2));

//      TC_3
        int k = 50;
        int l = 25;

        int expectedResultEX4 = 25;

        int actualResultEX4 = findMimOutTwo(k, l);

        verifyEquals(expectedResultEX4, actualResultEX4);

//      ОТЧЕТ (report)
        printTCNumber();
        printTestResult(verifyEquals(expectedResultEX4, actualResultEX4));

        //  ОТЧЕТ (report)
        printTCNumber();
        printTestResult(verifyEquals(expectedResultEX4, actualResultEX4));

        int m = 75;

        expectedResultEX4 = 25;

        actualResultEX4 = findMimOutThree(k, l, m);

        verifyEquals(expectedResultEX4, actualResultEX4);

//      ОТЧЕТ (report)
        tcNumber = 4;
        printTCNumber();
        printTestResult(verifyEquals(expectedResultEX4, actualResultEX4));

        int n = 17;

        expectedResultEX4 = 17;

        actualResultEX4 = findMimOutFour(k, l, m, n);

        verifyEquals(expectedResultEX4, actualResultEX4);

//      ОТЧЕТ (report)
        tcNumber = 4;
        printTCNumber();
        printTestResult(verifyEquals(expectedResultEX4, actualResultEX4));

        printTCNumber();

//        tempBodyCat(35.0,37.0,38.0,39.5,41.0);
        printTestResult(tempBodyCat(35.0, 37.0, 38.0, 39.5, 41.0));

        printTCNumber();
//        workSalary(8,12);

//        int workHoursDay = 9;
//        int priceHoursDay = 12;

        int expectedResultEX6 = 2268;

        int actualResultEX6 = workSalary(9, 12);

        verifyEquals(expectedResultEX6, actualResultEX6);

//      ОТЧЕТ (report)
        printTestResult(verifyEquals(expectedResultEX6, actualResultEX6));
        printTCNumber();

        int expectedResultEX7 = 18;

        String actualResultEX7 = sumPrice(20.5, 0.9);

        verifyEquals(expectedResultEX7, Double.parseDouble(actualResultEX7));

        //ОТЧЕТ (report)
        printTestResult(verifyEquals(expectedResultEX7, Double.parseDouble(actualResultEX7)));

//        printTCNumber();
//        TC_8
        String fullName = "Смирнова Мария Ивановна";
        double salary = 70000.00;
        String expectedResultEX8 = "Смирнова Мария Ивановна\t\t\t70000 руб 00 коп";

        String actualResultEX8 = payRoll(fullName, salary);

        verifyEquals(expectedResultEX8, actualResultEX8);

//        ОТЧЕТ (report)
        printTCNumber();
        printTestResult(verifyEquals(expectedResultEX8, actualResultEX8));

        fullName = "";
        salary = 70000.00;
        expectedResultEX8 = "";

        actualResultEX8 = payRoll(fullName, salary);

        verifyEquals(expectedResultEX8, actualResultEX8);

//        ОТЧЕТ (report)
        tcNumber = 8;
        printTCNumber();
        printTestResult(verifyEquals(expectedResultEX8, actualResultEX8));

        fullName = "Смирнова Мария Ивановна";
        salary = 0;
        expectedResultEX8 = "";

        actualResultEX8 = payRoll(fullName, salary);

        verifyEquals(expectedResultEX8, actualResultEX8);

//        ОТЧЕТ (report)
        tcNumber = 8;
        printTCNumber();
        printTestResult(verifyEquals(expectedResultEX8, actualResultEX8));

        printTCNumber();

//        TC_11
        double price = 10.75;
        String expectedResultEX11 = "10 руб 75 коп";

        String actualResultEX11 = price(price);

        verifyEquals(expectedResultEX11, actualResultEX11);

//        ОТЧЕТ (report)
        tcNumber = 11;
        printTCNumber();
        printTestResult(verifyEquals(expectedResultEX11, actualResultEX11));

//         TC_11
        price = -15.2;
        expectedResultEX11 = "Error";

        actualResultEX11 = price(price);

        verifyEquals(expectedResultEX11, actualResultEX11);

//        ОТЧЕТ (report)
        tcNumber = 11;
        printTCNumber();
        printTestResult(verifyEquals(expectedResultEX11, actualResultEX11));

//        TC_12
        double totalWeight = 10.075;
        String expectedResultEX12 = "10 kg 75 грам";

        String actualResultEX12 = weight(totalWeight);

        verifyEquals(expectedResultEX12, actualResultEX12);

//        ОТЧЕТ (report)
        printTCNumber();
        printTestResult(verifyEquals(expectedResultEX12, actualResultEX12));

//        TC_13
        printTCNumber();
        printTestResult(verifyEquals(expectedResultEX12, actualResultEX12));
    }
}








