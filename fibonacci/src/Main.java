import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //fibonacci 0,1,1,2,3,5,8,13,21...
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = scanner.nextInt();
        int a = 0;
        int b = 1;
        int sum;
        System.out.println(n + " Series of the number :");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + ",");
            sum = a + b;
            a = b;
            b = sum;
        }
    }
}