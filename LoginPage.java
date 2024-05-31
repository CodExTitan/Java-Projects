package udemycourseL;

import java.util.Scanner;

public class LoginPage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Thank you for joining");

        System.out.print("\tEnter your First Name: ");
        String firstName = sc.nextLine();

        System.out.print("\tEnter your Last Name: ");
        String lastName = sc.nextLine();

        System.out.print("\tEnter your age: ");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.print("\tEnter your User Name: ");
        String userName = sc.nextLine();

        System.out.print("\tEnter your City Name: ");
        String city = sc.nextLine();

        System.out.print("\tEnter your Country Name: ");
        String country = sc.nextLine();



        sc.close();

        int maxLength = Math.max(Math.max("First Name: ".length(), "Last Name: ".length()), Math.max("User Name: ".length(), Math.max("City Name: ".length(), "Country Name: ".length())));

        // Print user input aligned with prompts
        System.out.println("\n\tThank you for joining. Here's your information:");
        System.out.printf("\t%-"+maxLength+"s%s\n", "First Name: ", firstName);
        System.out.printf("\t%-"+maxLength+"s%s\n", "Last Name: ", lastName);
        System.out.printf("\t%-"+maxLength+"s%d\n", "Age: ", age);
        System.out.printf("\t%-"+maxLength+"s%s\n", "User Name: ", userName);
        System.out.printf("\t%-"+maxLength+"s%s\n", "City Name: ", city);
        System.out.printf("\t%-"+maxLength+"s%s\n", "Country Name: ", country);

    }
}
