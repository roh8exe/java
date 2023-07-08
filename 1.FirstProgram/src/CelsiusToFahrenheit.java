import java.util.Scanner;
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter temp in Celsius:- ");
        float tempC = in.nextFloat();
        float tempF = (tempC * 9/5) + 32 ;
        System.out.print("The given temp in Fahrenheit is:- ");
        System.out.print(tempF);
    }

}
