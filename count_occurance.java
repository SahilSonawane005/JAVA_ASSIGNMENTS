package JAVA_ASSIGNMENTS;

import java.util.Scanner;

public class count_occurance {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter number:");
            int n = sc.nextInt();
            System.out.println("enter number for occurance check:");
            int m = sc.nextInt();
            int count = 0;
            while (n > 0) {
                int rem = n % 10;
                if (rem == m) {
                    count++;
                }
                n = n / 10;
            }

            System.out.println(count);
        }
    }
}
