import java.util.Scanner;

class Grader {
    int score;

    Grader(int a) {
        score = a;
    }

    String letterGrade(){
        if(score >= 90)
            return "Grade: O";
        else if(score >= 80)
            return "Grade: E";
        else if(score >= 70)
            return "Grade: A";
        else if(score >= 60)
            return "Grade: B";
        else if(score >= 50)
            return "Grade: C";
        else
            return "Grade: F";
    }

    }

public class Sample{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = sc.nextInt();
        if(score < 0 || score > 100){
            System.out.println("Invalid score");
            return;
        }
        Grader g = new Grader(score);
        System.out.println(g.letterGrade());
}}