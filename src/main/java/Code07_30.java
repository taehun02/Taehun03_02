import java.util.Scanner;

    public class Code07_30 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            System.out.println("Sum: " + (a + b));
            sc.close();
        }
    }

