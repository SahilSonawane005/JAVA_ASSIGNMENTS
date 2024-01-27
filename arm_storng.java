package JAVA_ASSIGNMENTS;

import java.util.Scanner;

public class arm_storng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int orignal = num;
        int rem = 0;
        int sum =0;
        while (num!=0) {
            rem = num%10;
            sum = sum +rem*rem*rem;
            num = num/10;
        }
        System.out.println(sum);
        if (sum == orignal) {
            System.out.println("armstrong number");
        }
        else{
            System.out.println("not armstrong number");

        }
    }
}
