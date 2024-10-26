import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int a = new Scanner(System.in).nextInt();
        boolean isNegative = a<0;
        System.out.println(isNegative);
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        boolean isPositive =checkPositiveInteger(a);
        System.out.println(isPositive);
    }
    static boolean checkPositiveInteger(int num){
        return num >0;
    }
}