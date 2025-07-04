import java.util.Scanner;
import java.util.Random;

public class Main {
    static int botCount = 0;
    static int userCount = 0;

    public static void main(String[] args) {
        try (Scanner userInput = new Scanner(System.in)) {
            Random random = new Random();

            System.out.println("*************************************************");
            System.out.println("      Welcome to Rock, Paper and Scissors!");
            System.out.println("        If you want to quit press Q or q");

            String[] botPickUp = { "rock", "paper", "scissors" };

            while (true) {
                if (botCount == 3) {
                    System.out.printf("You lost to a machine, haha! bot: %d, user: %d%n", botCount, userCount);
                    return;
                } else if (userCount == 3) {
                    System.out.printf("You won the game! bot: %d, user: %d%n", botCount, userCount);
                    return;
                }

                System.out.println("Choose between rock, paper or scissors.");
                // user choice
                String user = userInput.nextLine();
                // bot choice
                String bot = botPickUp[random.nextInt(3)];

                // quiting playing
                if (user.toLowerCase().equals("q")) {
                    System.out.printf("The score is: User: %d, Bot: %d%n", userCount, botCount);
                    return;
                }

                // getting what the bot chose
                System.out.println(bot);

                // the use wins
                if (user.toLowerCase().equals(bot)) {
                    System.out.println("It is a draw!");
                    System.out.printf("User: %d, Bot: %d%n", userCount, botCount);
                    continue;
                } else if (user.toLowerCase().equals("rock") && bot.equals("scissors")
                        || user.toLowerCase().equals("scissors")
                                && bot.equals("paper")
                        || user.toLowerCase().equals("paper") && bot.equals("rock")) {
                    userCount++;
                    System.out.printf("User: %d, Bot: %d%n", userCount, botCount);
                    continue;
                }
                // the machine wins
                else {
                    botCount++;
                    System.out.printf("User: %d, Bot: %d%n", userCount, botCount);
                    continue;
                }
                // closing the scanner to prevent memory leaks.
            }
        }
    }
}
