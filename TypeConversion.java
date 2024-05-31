package udemycourseL;

public class TypeConversion {

    public static void main(String[] args) {

        int ants = 2000;
        int purchasedBlocksOfCheese = 1;

        System.out.println("There are " + ants + " ants, and " + purchasedBlocksOfCheese + " block of cheese.");
        System.out.println("Each ant carried " + (purchasedBlocksOfCheese / ants) + " from the total cheese amount"); 

        double salary = 5423.94;
        System.out.println("Mortgage Broker: What is your monthly salary in dollars?");
        System.out.println("My monthly salary is: " + salary);
    }

}

/*
#if we want to store floating values in place of any primitive data type(int,double,char,boolean)
## We can use any data type with curly brackets before variable for e.g : (int)salary ; ((double)purchasedBlockOfCheese / ants)
||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
int ants = 2000;
System.out.println("Each ant carried " + ((double)purchasedBlocksOfCheese / ants) + " from the total cheese amount")
||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
double salary = 5423.94;
int roundSalary = (int)salary;
 System.out.println("My monthly salary is: " + roundSalary);
||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
 */
