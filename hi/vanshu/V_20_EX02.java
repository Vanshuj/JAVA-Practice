package hi.vanshu;

import java.util.Random;
import java.util.Scanner;

public class V_20_EX02 {
    public static void main(String[] args) {
        // 0 for Rock
        // 1 for Paper
        // 2 for Scissor
        String playAgain;
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter 0 for Rock, 1 for Paper, 2 for Scissor ");
            int userInput = sc.nextInt();

            Random random = new Random();
            int computerInput = random.nextInt(3);

            if (userInput == computerInput) {
                System.out.println("Draw");
            } else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0
                    || userInput == 2 && computerInput == 1) {
                System.out.println("You Win!");
            } else {
                System.out.println("Computer Win!");
            }
            // System.out.println("Computer choice: " + computerInput);
            if (computerInput == 0) {
                System.out.println("Computer choice: Rock");
            } else if (computerInput == 1) {
                System.out.println("Computer choice: Paper");
            } else if (computerInput == 2) {
                System.out.println("Computer choice: Scissors");
            }
            System.out.println("Do you want to play again? (yes/no): ");
            playAgain = scanner.next();
        } while (playAgain.equalsIgnoreCase("yes"));
    }
}
