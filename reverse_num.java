package JAVA_ASSIGNMENTS;

import java.util.Scanner;

public class reverse_num {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter number:");
            int num = sc.nextInt();
            int ans = 0;
            while (num>0) {
                int rem = num %10;
                ans =10* ans + rem;
                num = num/10;
            }
            System.out.println("reverse number is : "+ans);
        }
    }
}
