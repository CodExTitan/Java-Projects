package udemycourseL;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\t*************Javapedia*************");
        System.out.println("How many historical figures will you register?");

        int people = sc.nextInt();
        System.out.println(people);


        String[][] database = new String[people][3];

        sc.nextLine();
        for (int i = 0; i < database.length; i++) {
            System.out.println("\n\t Figure No: " + (i + 1));
            System.out.print("\t Name: ");
            database[i][0] = sc.nextLine();
            System.out.print("\t Date of Birth: ");
            database[i][1] = sc.nextLine();
            System.out.print("\t Occupation: ");
            database[i][2] = sc.nextLine();
            System.out.print("\n");
        }

        System.out.println("These are the values you stored:");
        print2DArray(database);

        System.out.println("\nWho's information would you like to see?");
        String information = sc.nextLine();
        for (int i = 0; i < database.length; i++) {
            if (database[i][0].equals(information)) {
                System.out.println("\tName: " + database[i][0]);
                System.out.println("\tDate of birth: " + database[i][1]);
                System.out.println("\tOccupation: " + database[i][2]);
            }
        }


        sc.close();

    }

    /**
     * Function name: print2DArray
     *
     * @param array (String[][])
     *              <p>
     *              Inside the function
     *              1. print the database
     *              - a tab of space precedes each row.
     *              - each value in database has one space from the other value.
     */

    public static void print2DArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("\t");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.print("\n");
        }

    }
}
