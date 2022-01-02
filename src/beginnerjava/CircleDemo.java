
package beginnerjava;

import java.util.Scanner;

public class CircleDemo {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double radius,area;
        System.out.print("Enter Radius : ");
        radius = input.nextDouble();
        area = 3.1416 * radius * radius;
        
         System.out.println("Area Of Circle : "+area);
    }
    
}
