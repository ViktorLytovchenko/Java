package school;

public class Teacher extends Person {

    public static void main(String[] args) {

//          Teacher teacher1;
//          int a = 3;
//          String world = "hello";

//        System.out.println("First name: Maria, " +
//                "Middle name: Ivanovna," +
//                "Last name: Petrova");

//        System.out.println("First name: Maria, ");
//        System.out.println("Middle name: Ivanovna, ");
//        System.out.println("Last name: Petrova");

//        System.out.println("First name: Maria, ");
////        System.out.println("Middle name: Ivanovna,");
////        System.out.println("Lastname: Petrova");

//        System.out.println(
//                "First name: Maria, \n" +
//                "Middle name: Ivanovna, \n" +
//                "Last name: Petrova, \n" +
//                "Age: 35 y.o. \n" +
//                "Subject: Russian Literature"
//     );

        int age = 35;
        String firstName = "Maria";
        String middleName = "Ivanovna";
        String lastName = "Petrovna";
        String subject = "Russian Literature";

        System.out.println("**********************************");
        System.out.println(
                "First name: \t"
                        + firstName
                        + ", \n"
                        + "Middle name: \t"
                        + middleName
                        + ", \n"
                        + "Last name: \t\t"
                        + lastName
                        + ", \n"
                        + "Age: \t\t\t"
                        + age
                        + " y.o. \n"
                        + "Subject: \t\t"
                        + subject
        );
        System.out.println("**********************************");

        int age1 = 55;
        String firstName1 = "Ivan";
        String lastName1 = "Petrovich";
        String middleName1 = "Serebryakov";
        String subject1 = "Mathematica";

        System.out.println("**********************************");
        System.out.println(
                "First name: \t"
                        + firstName1
                        + ", \n"
                        + "Middle name: \t"
                        + middleName1
                        + ", \n"
                        + "Last name: \t\t"
                        + lastName1
                        + ", \n"
                        + "Age: \t\t\t"
                        + age1
                        + " y.o. \n"
                        + "Subject: \t\t"
                        + subject1
        );
        System.out.println("**********************************");
    }
}

