
package beginnerjava;

import java.util.Scanner;

public class TemperatureDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        double celsius,fahrenheit;
        System.out.print("Fahrenheit : ");
        fahrenheit = input.nextDouble();
        
        celsius = 0.55 * fahrenheit - 32;
        System.out.println("Celsius :"+celsius);
    }
    
}
