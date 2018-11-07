package farenheit;

import java.util.Scanner;

public class Farenheit {

    public static void main(String[] args) {
        
        System.out.println("Give in the Celcius Value: ");
        Scanner sc = new Scanner(System.in);
        double celcius = sc.nextDouble();
        double farenheit = 9.0 / 5.0 * celcius + 32.0;
        System.out.println("Farenheit: "+farenheit);
    }
    
}