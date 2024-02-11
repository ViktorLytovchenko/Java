package school;

public class Person {
    public static void main(String[] args) {
        int yob = 1984;
        int yon = 2024;
        int age = yon - yob;
        int age2 = age - 2;
        String text1 = "Если человек родился в ";
        String text2 = " году, то его возраст ";
        String text3 = " 2 года назад был ";

        System.out.println(text1 + yob + text2 + age + " года ");
        System.out.println(text1 + yob + text2 + text3 + age2 + " лет ");
    }
}
