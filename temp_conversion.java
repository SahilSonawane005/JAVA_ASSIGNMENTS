package JAVA_ASSIGNMENTS;

import java.util.Scanner;

public class temp_conversion {
      public static void main(String[] args) {
        System.out.println("Enter temprature in degree celcius:");
        try (Scanner in = new Scanner(System.in)) {
            float tempC = in.nextFloat();
            float tempF = (tempC * 9/5) + 32;
            System.out.println("temprature in farhanite: "+ tempF);
        }
    }
}
