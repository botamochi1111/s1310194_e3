import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int headsCount = 0;
        int tailscount = 0;
        String name;

        System.out.println("Who are you?");
        name = sc.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("Tossing a coin...");

        for (int i = 1; i <= 3; i++) {
            //random.nextBoolean()がtrueのとき、head
            if (random.nextBoolean()) {
                System.out.println("Round " + i + ": Heads");
                headsCount++;
            }
            else {
                System.out.println("Round " + i + ": Tails");
                tailscount++;
            }
        }

        System.out.println("Heads: " + headsCount + ", Tails: " + tailscount);
    }
}