import java.util.Random;
import java.util.Scanner;

public class  NumberGame {

    public static void main (String[] args) {
        java.util.Scanner Scanner = new Scanner(System.in);
        java.util.Random Random = new Random();
        int NumberToGuess = Random.nextInt(10);
        int NumberOfTries = 0;
        boolean HasGussCorrectly = false;

        System.out.println("I Have a Number in Mind Can you Guess it ?");
        System.out.println("Hint - Its Between 0 to 10 (˶•ᴗ•˶) ");
        System.out.println("You Only Have 5 Tries!!");

        while (!HasGussCorrectly) {
            System.out.println("Enter your Guess :");
            int UserGuess = Scanner.nextInt();
            NumberOfTries++;

            if (NumberOfTries > 5) {
                System.out.println(" Sorry!! Number of Tries Exceeded (╥﹏╥) ");
                System.out.println("The Number Was " + NumberToGuess);
                System.out.println("Better Luck Next Time!! •ᴗ•");
                break;
            } else if (UserGuess > NumberToGuess) {
                System.out.println("Wrong Guess!!");
                System.out.println("Hint - Try a Smaller Number!! ");
            } else if (UserGuess < NumberToGuess) {
                System.out.println("Wrong Guess!!");
                System.out.println("Hint - Try a Larger Number!! ");
            } else {
                HasGussCorrectly = true;
                System.out.println("Congratulations! You guessed the number " + NumberToGuess + " in " + NumberOfTries + " tries.");
            }

        }
        Scanner.close();
    }
}
