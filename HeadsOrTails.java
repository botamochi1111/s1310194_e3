import java.util.Random;

public class HeadsOrTails {

    public static void main(String[] args) {
        Random random = new Random();

        int headsCount = 0;
        int tailscount = 0;

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

        if (headsCount > tailscount) {
            System.out.println("You won!");
        }
        else {
            System.out.println("You lost!");
        }
    }
}