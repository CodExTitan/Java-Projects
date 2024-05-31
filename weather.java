package udemycourseL;

import java.util.Scanner;

public class weather {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature: ");

        int temp = sc.nextInt();
        String forecast = "";

        if (temp <= -1) {
            forecast = "\nFreezing!! Stay at home.";
        } else if (temp <= 10) {
            forecast = "\nChilly!! Wear warm clothes.";
        } else {
            forecast = "\nWarm!! Hangout possible.";
        }
        System.out.println(forecast);
        sc.close();
    }
}
