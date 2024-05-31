package udemycourseL;

public class Wallet {
    public static void main(String[] args) {

        double balance = 100.00;
        double coffee = 2.5;
        System.out.println("\n --------------- Can you buy me a coffee? ----------------");
        if (coffee <= balance) {
            System.out.println("* Sure I can");
            balance -= coffee;
        } else {
            System.out.println("Not enough money");
        }
        {
            System.out.println("After the purchase you have "+ balance + "amount left.");
        }
        double Shoes = 157.80;
        System.out.println("\n* Can you buy me this shoes?");
        if (Shoes <= balance) {
            System.out.println("Sure I can");
        } else {
            System.out.println("Oh no, I have only " + balance + " Euros!!");
        }

        {
            System.out.println("-----------------------------------------------------------");
            System.out.println("\nAfter the purchase you have "+ balance + "amount left.");
        }

    }
}
