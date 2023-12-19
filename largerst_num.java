package JAVA_ASSIGNMENTS;

import java.util.Scanner;

public class largerst_num {
    public static void main(String[] args) {
        try (Scanner num = new Scanner(System.in)) {
            int a = num.nextInt();
            int b = num.nextInt();
            int c = num.nextInt();

            if (a>b && a>c) {
                    System.out.println("a is greater" + a);            
            }
            else if (b>a && b>c) {
                System.out.println("B is greater"+ b); 
            }
            else{
               System.out.println("c in greater"+ c);
            }
        }
    }
}
