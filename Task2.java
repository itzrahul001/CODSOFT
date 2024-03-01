import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter the marks for 5 subject");
        int[] marks = new int[5];
        int totalmarks = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------");

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the marks for subject " + (i + 1) + ":");
            marks[i] = sc.nextInt();

            totalmarks += marks[i];
        }
        System.out.println("Your total marks is " + totalmarks);
        double averageMarks = totalmarks / 5;

        System.out.println("Your average marks is " + averageMarks);
        char grade = 'F';

        if (averageMarks >= 90) {
            grade = 'A';
        } else if (averageMarks >= 80) {
            grade = 'B';
        } else if (averageMarks >= 70) {
            grade = 'C';
        } else if (averageMarks >= 60) {
            grade = 'D';
        } else if (averageMarks >= 50) {
            grade = 'E';
        }
        System.out.println("Your grade is: " + grade);

    }
}
