package lessons;

public class Lesson3 {

    public static void main(String[] args) {

        Object obj = new Object();

        Integer i = new Integer(8);
        Integer i1 = 8;
//        Integer i2 = new Integer("a");
        Integer i3 = new Integer("12");
        Object i5 = new Integer(5);

//        Integer sum = i2 + i1;
//        System.out.println(sum);

        System.out.println((i3));

        Integer sum = i1 + i3;
        System.out.println(sum);

        System.out.println(i1.MAX_VALUE);
        System.out.println(i1.MIN_VALUE);
//
        System.out.println(i3.compareTo(i1));
        System.out.println(Integer.bitCount(i3));
        System.out.println(Integer.compare(i3, i1));
        System.out.println(Integer.max(i3, i1));

    }
}
