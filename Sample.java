import java.util.Scanner;

class Grader {
    int score;

    // Constructor
    public Grader(int score) {
        this.score = score;
    }

    // Method to determine letter grade
    public char letterGrade() {
        if (score >= 90) {
            return 'O';
        } else if (score >= 80) {
            return 'E';
        } else if (score >= 70) {
            return 'A';
        } else if (score >= 60) {
            return 'B';
        } else if (score >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }
}

public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score;

        do {
            System.out.print("Enter the score (0-100): ");
            score = sc.nextInt();

            if (score < 0 || score > 100) {
                System.out.println("Invalid score. Please enter a value between 0 and 100.");
            }
        } while (score < 0 || score > 100);

        Grader grader = new Grader(score);
        char grade = grader.letterGrade();
        System.out.println("The letter grade is: " + grade);
    }
}