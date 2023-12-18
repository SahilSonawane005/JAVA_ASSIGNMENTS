package JAVA_ASSIGNMENTS;

import java.util.Scanner;

public class convert_datatype {
// You are given an integer , you have to convert it into a string.
// Please complete the partially completed code in the editor. If your code successfully converts  into a string  the code will print "Good job". Otherwise it will print "Wrong answer".can range between -100 to 100 inclusive
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            String s = "";
            if (n>=-100 && n <=100) {
                 s = Integer.toString(n);
                
            }
            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer");
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        
    }

   
    }

