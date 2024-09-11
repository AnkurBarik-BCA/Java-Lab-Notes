import java.util.Scanner;

public class CheckPerfectNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int f=0;
        System.out.print("Enter the number: ");
        n=sc.nextInt();
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                f +=i;
            }
        }
        if (f==n) {
            System.out.printf("%d is a perfect number", n);
        } else {
            System.out.printf("%d is not a perfect number", n);
        }
    }
}
