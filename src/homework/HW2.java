package homework;

public class HW2 {
    public static void main(String[] args) {
        String line = "_________________________________";
        String task = "Задание №";
        int number = 3;
        char subTask = 'a';

        System.out.println(line);
        System.out.println(task + ++number);
//        System.out.println(++subTask);

        int x = 1;
        int y = 2;
        int z = 3;

        System.out.println((subTask++) + "." + "  " + x + "\n" + "\t" + y + "\n" + "\t" + z);
        System.out.println((subTask++) + "." + "\t" + x + "\t" + y + "\t" + z);
        System.out.println((subTask) + "." + "\t" + "int x = " + x);
        System.out.println("\t" + "int y = " + y);
        System.out.println("\t" + "int z = " + z);

        System.out.println(line);

        System.out.println(task + ++number);
        System.out.println(x + ", " + y + ", " + z);

        /*Распечатать следующие выражения, где вместо … будет выведен результат арифметической операции:
        Sum of x and y = …
        x * z = …
        Разность переменных y и z = …*/

        System.out.println(line);
        System.out.println(task + ++number);

        String sum = "Sum of x and y = ";
        String mult = "x * z = ";
        String div = "The difference between the variables y and z = ";
        System.out.println(sum + (x + y));
        System.out.println(mult + (x * z));
        System.out.println(div + (y - z));
        System.out.println(line);

        System.out.println(task + ++number);
//        Создать переменные apple и student и присвоить им значения 40 и 6 соотетственно. Распечатать выражение, где
//        вместо … - результаты математических вычислений:
//        Если … яблок поделить на … учеников, то каждый ученик получит по … яблок(a), и … яблок(а) останется учителю.
        int apple = 40;
        int student = 6;
        int divAppleStudent = apple / student;
        int remAppleStudent = apple % student;
        System.out.println("Если " + apple + " яблок поделить на \n"
                + student + " учеников, то каждый ученик \n получит по "
                + divAppleStudent + " яблок и " + remAppleStudent + " яблока \n останется учителю." );
        System.out.println(line);
        System.out.println(task + ++number);
        apple = 100;
        student = 21;
        divAppleStudent = apple / student;
        remAppleStudent = apple % student;
        System.out.println("Если " + apple + " яблок поделить на \n"
                + student + " учеников, то каждый ученик \n получит по "
                + divAppleStudent + " яблока и " + remAppleStudent + " яблок \n останется учителю." );
        System.out.println(line);

        System.out.println(task + ++number);

        int weightLemon = 6;
        int weightApple = weightLemon + 24;
        int weightPear = weightApple - 12;
        int weightAllFruits;
        weightAllFruits = weightLemon + weightApple + weightPear;
//        System.out.println(weightApple);
//        System.out.println(weightPear);
        System.out.println(weightAllFruits);
        System.out.println(line);

        System.out.println(task + ++number);

//        Распечатать выражение с помощью переменных и вычислений:
//        У сороконожки заболели ножки:
//        8 ноют, 5 гудят,
//        7 хромают, 2 болят.
//        Помоги сороконожке
//        Посчитать здоровые ножки.
//                Ответ:

        int legsAreBuzz = 5;
        int legsAreLame = 7;
        int legsAreHurts = 2;
        int legsAreWhip = 8;
        int legsAll = 40;

        int legsAreHealthy;
        legsAreHealthy = legsAll - (legsAreBuzz + legsAreLame + legsAreHurts + legsAreWhip);
        System.out.println("У сороконожки заболели ножки: " + legsAreWhip + " ноют," + legsAreBuzz + " гудят,"
                + legsAreLame + " хромают," + legsAreHurts + " болят. Помоги сороканожке посчитать здоровые ножки."
                + " Ответ:" + legsAreHealthy);

        /* Во сколько раз 35 больше, чем 7
        Во сколько раз меньше 8, чем 48?
        На сколько 54 больше, чем 6?
         */
        System.out.println(line);
        System.out.println(task + ++number);

        int a = 35;
        int b = 7;
        int c = 8;
        int d = 48;
        int e = 54;
        int f = 6;

        System.out.println(a + " больше, чем " + b + " в " + (a / b) + " раз ");
        System.out.println(c + "  меньше, чем " + d + " в " + (d / c) + " раз ");
        System.out.println(e + " больше, чем " + f + " на " + (e - f));
        System.out.println(line);

        /*
        Объяснить:
        a. почему число 48 кратно 8
        b. что оба числа - четные.
        c. что числа 47 и 49 - нечетные.
        d. только одно из всех чисел кратно 7
        */


        System.out.println(task + ++number);
        System.out.println( "a." + " 48 кратно 8, потому что остаток деления = " + (48 % 8));
        System.out.println("b." + " 48 и 8 четные, потому что остаток = " + (48 % 2) + " и " + (8 % 2));
        System.out.println("c." + " числа 47 и 49 - нечетные, потому что при делении остаток " + (47 % 2)
                + " и " + (49 % 2));
        System.out.println("d." + " только одно из всех чисел кратно 7, потому что остаток при делении = " + (49 / 7));

        /*Распечатать следующую таблицу,  где результат рассчитывается
        с помощью применения арифметических и унарных операторов:
        */

        System.out.println(line);
        System.out.println(task + ++number);

        int k = 5;
        int l = 10;
        int m = 15;

        line = "\t________________________________________________________________________________\n";
        String vLine = "\t|\t";
        String endLine = "\t|";
        String tab = "\t";

        System.out.println(
                line
                        + vLine + tab
                        + vLine + "+10"
                        + vLine + "-5"
                        + vLine + "*100"
                        + vLine + "/2"
                        + vLine + "%2"
                        + vLine + "^2"
                        + vLine + "++"
                        + vLine + "--"
                        + endLine
        );
        System.out.print(
                line
                        + vLine + "k = " + k
                        + vLine + (k + 10)
                        + vLine + (k - 5)
                        + vLine + (k * 100) + " "
                        + vLine + (k / 2)
                        + vLine + (k % 2)
                        + vLine + (k * k++)
                        + vLine + (k--)
        );

        k--;
        System.out.println(vLine + k + endLine);

        k = l;

        System.out.print(
                line
                        + vLine + "l = " + l
                        + vLine + (k + 10)
                        + vLine + (k - 5)
                        + vLine + (k * 100)
                        + vLine + (k / 2)
                        + vLine + (k % 2)
                        + vLine + (k * k++)
                        + vLine + (k--)
        );

        k--;

        System.out.println(vLine + k + endLine);

        k = m;

        System.out.print(
                line
                        + vLine + "m = 15"
                        + vLine + (k + 10)
                        + vLine + (k - 5)
                        + vLine + (k * 100)
                        + vLine + (k / 2)
                        + vLine + (k % 2)
                        + vLine + (k * k++)
                        + vLine + (k--)
        );

        k--;

        System.out.println(vLine + k + endLine);
        System.out.println(line);

        System.out.println(task + ++number);

//   14.  Вычислить результат:
//   xⁿ ((5x + 7y) / (8x + 10y)) / ((3x - y)/(x + y))
//   если x = 7
//        y = 18
//        n = 3
//   Распечатать результат в следующем виде:
//        If
//        x = 7
//        y = 18
//        n = 3
//        then
//   xⁿ((5x + 7y) / (8x + 10y)) / ((3x - y)/(x + y)) = …
//
//   *if-else здесь не нужны!

        int xy = 7;
        int yx = 18;
        int zx = xy * xy * xy;
        double result = zx * ((5 * xy + 7 * yx) / (8 * xy + 18 * yx)) / ((3 * xy - yx) / (double) (xy + yx));
        System.out.println( "If \n x = 7 \n y = 18 \n n = 3 \n then \n x((5x + 7y) " +
                "/ (8x + 18y)) / ((3x - y) / (x + y)) = "
                + result);

        System.out.println(task + ++number);
        //15. Записать условия в виде формулы и вычислить ответ:
        //В мастерской за 5 дней сшили 15 костюмов, поровну за каждый день.
        //За сколько дней при той-же ежедневной средней выработке сошьют 69 костюмов.

        int day = 5;
        int suit = 15;
        int suitOfDay = 69 / (suit / day);
        System.out.println("За " + suitOfDay + " дней при той-же средней выработке сошьют 69 костюмов.");

        System.out.println(task + ++number);
//    Декларировать и инициализировать переменные a, b, c. Распечатать выражение и результаты вычислений:
//    Сумма чисел a, b, c++ и sumABC-- = …, а разность b++ и  sumCBA = …
//    Вычислить выражения, если d = 4:


        System.out.println(task + ++number);

//        (x + 3)²










    }
}



























