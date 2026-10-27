import java.util.Random;
import java.util.Scanner;

public class Craps {
    static void main() {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int die1;
        int die2;
        int sum;
        int die3;
        int die4;
        int sum2;
        int point;
        String continueYN = "";
        do {
            die1 = rnd.nextInt(6) + 1;
            die2 = rnd.nextInt(6) + 1;
            sum = die1 + die2;
            System.out.println("You rolled " + die1 + " and " + die2 + " to get a sum of " + sum);
            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("You crapped out and lost! Game over.");
            } else if (sum == 7 || sum == 11) {
                System.out.println("You got a natural and won! Game over.");
            } else {
                point = sum;
                System.out.println("The point sum is " + point);
                do {
                    die3 = rnd.nextInt(6) + 1;
                    die4 = rnd.nextInt(6) + 1;
                    sum2 = die3 + die4;
                    System.out.println("You rolled " + die3 + " and " + die4 + " to get a sum of " + sum2);
                } while (sum2 != 7 && sum2 != point);
                if (sum2 == 7) {
                    System.out.println("Since you rolled a 7, you lost!");
                } else {
                    System.out.println("You made the point sum so you won!");
                }
            }
            System.out.print("Would you like to play again? [YN]: ");
            continueYN = in.nextLine();
        } while (continueYN.equalsIgnoreCase("Y"));

    }
}
