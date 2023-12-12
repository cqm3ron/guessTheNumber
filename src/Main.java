import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 1;
        int max = 100;
        int range = max - min + 1;
        int guess;
        int rand;
        int tries = 0;
        boolean win = false;

        rand = (int) (Math.random() * range) + min;
        do {
            System.out.println("Guess the number (between " + min + " and " + max + ")");
            guess = scanner.nextInt();
            if (guess == rand) {
                System.out.println("Correct!");
                win = true;
            } else if (guess > rand) {
                System.out.println("Too high.");
            } else {
                System.out.println("Too low");
            }
            tries++;
        } while (!win);
        System.out.println("You guessed the correct answer ("+rand+") in "+tries+" attempts.");
    }
}