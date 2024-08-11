import java.util.Scanner;
import java.lang.System;
public class Fibonacci_Number {
    public static void main(String[] args) {
        System.out.println("Fibonacci Series");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length for fibonacci series");
        int n = sc.nextInt();
        int temp = 0;
        int a = 0;
        int b = 0;
        for (int i = 0; i < n; i++) {
            temp = a+b;
            a= b;
            b =temp;
            System.out.println(temp);

        }

    }
}
