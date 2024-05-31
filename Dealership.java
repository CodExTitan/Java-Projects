package udemycourseL;

import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" - Welcome to the Java Dealership");
        System.out.println(" - Select option 'a' to buy a car");
        System.out.println(" - Select option 'b' to sell a car");
        String option = scan.nextLine();

        switch (option) {
            case "A":
                System.out.println("You have selected " + option);

                System.out.println("What's your budget? ");
                double budget = scan.nextInt();

                if (budget >= 25000) {
                    System.out.println("Great! You have enough to buy the car!");
                    System.out.println("Do you have insurance? Yes or No");
                    scan.nextLine();
                    String insurance = scan.nextLine();
                    System.out.println("Do you have license? Yes or No");
                    scan.nextLine();
                    String license = scan.nextLine();
                    System.out.println("What is your credit score?");
                    int creditScore = scan.nextInt();

                    if (insurance.equals("Yes") && license.equals("Yes") && creditScore >= 600) {
                        System.out.println("You are eligible to purchase the car!");
                    } else {
                        System.out.println("We cannot sell you a car!");
                    }

                } else {
                    System.out.println("We are sorry. You are not eligible to purchase the car!");
                }


                break;

            case "B":
                System.out.println("You have selected" + option);
                System.out.println("Which car do you want to sell?");
                String car = scan.nextLine();
                System.out.println("How old is your car?");
                int carAge = scan.nextInt();
                if (carAge >= 5) {
                    System.out.println("You are eligible to sell the car!");
                    System.out.println("Whats your selling price?");
                    double sellingPrice = scan.nextDouble();
                    if (sellingPrice >= 15000) {
                        System.out.println("You can sell it to us!");
                    } else {
                        System.out.println("Your car is too old to sell!");
                    }
                }


                break;

        }




        scan.close();
    }
}
