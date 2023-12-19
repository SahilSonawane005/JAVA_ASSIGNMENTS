package JAVA_ASSIGNMENTS;

import java.util.Scanner;

public class fibonaaci {
    public static void main(String[] args) {
        System.out.println("Fibonaaci Series:");
        try (Scanner sc = new Scanner(System.in)) {
        }
        int a = 0;
        int b = 1;
        int temp;

        for (int i = a; i < 10; i++) {
            temp = a+b;
            System.out.println(temp);
            a=b;
            b=temp;
        }
    }
    
}
