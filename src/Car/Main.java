
package Car;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String C,P,O;
        System.out.println("Enter Color :");
        C =input.nextLine();
        System.out.println("Enter PlateNo :");
        P =input.nextLine();
        System.out.println("Enter Owner :");
        O =input.nextLine();
        Car c1 =new Car(C,P,O);
        c1.info();
        
    }
    
}
