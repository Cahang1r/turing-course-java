import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = n;
        int reverse_number = 0;
        while (m != 0) {
            int a = m % 10;
            reverse_number = reverse_number * 10 + a;
            m = m / 10;
        }
        if(n == reverse_number){
            System.out.println("this number is polindrom");
        }
        else{
            System.out.println("this number is not polindrom");
        }
        System.out.println(reverse_number);
    }
}