import java.util.*;

public class calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The calculator is ready to perform");
        double a, b, x;
        char c;
        a = sc.nextDouble();
        c = sc.next().charAt(0);
        b = sc.nextDouble();

        switch (c) {
            case '+':
                x = a + b;
                System.out.printf("%.2f + %.2f = %.2f", a, b, x);
                break;
            case '-':
                x = a - b;
                System.out.printf("%.2f - %.2f = %.2f", a, b, Math.abs(x));
                break;
            case '*':
                x = a * b;
                System.out.printf("%.2f * %.2f = %.2f", a, b, x);
                break;
            case '/':
                x = a / b;
                System.out.printf("%.2f / %.2f = %.2f", a, b, x);
                break;
            default:
                System.out.println("ERROR");
                break;
        }
    }
}