package udemycourseL;

import javax.xml.namespace.QName;
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n                          \t Welcome to Chat Bot");
        System.out.println("\n I'm a simple chat bot, currently under development. So I could only answer to few questions!!");
        System.out.println("\n Let's start the conversation with asking your name");

        System.out.println("\n What is your name?");
        String name = sc.nextLine();

        System.out.println("Wow, what a lovely name!!, " + name + ", Where are you from ? ");
        String Location  = sc.nextLine();

        System.out.println("Damnn " + Location +  "!! isn't it Optimus Prime planet? ");
        String answerA = sc.nextLine();

        System.out.println("That's so cool!! so have you ever met with him");
        String answerB = sc.nextLine();

        System.out.println("Really wow you are so lucky!!");
        String answerC = sc.nextLine();

        System.out.println("What about his friend's have you ever met with his friend's too?");
        String answerD = sc.nextLine();

        sc.close();
    }
}
