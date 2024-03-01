import java.util.Scanner;
import java.lang.Math;

public class Task1 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 100);

        System.out.println("Guess the number");

        Scanner scanner = new Scanner(System.in);
        int count = 1;

        while (true) {
            int input = scanner.nextInt();
            if (input == a) {
                System.out.println("Congratulations! You guessed right.");
                break;
            } else if (input > a) {
                System.out.println("Please enter a lower number:");
            } else {
                System.out.println("Please enter a higher number:");
            }
            count++;
        }

        System.out.println("You guessed the answer in " + count + "th time");
    }

}