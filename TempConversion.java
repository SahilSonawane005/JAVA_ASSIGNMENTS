import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {
        System.out.println("enter temp in degree celcius");
        Scanner sc = new Scanner(System.in);
        float temp = sc.nextFloat();
        float convert = (temp*9/5)+32;
        System.out.println("temprature in farhanhite ");
        System.out.println(convert);

    }
}
