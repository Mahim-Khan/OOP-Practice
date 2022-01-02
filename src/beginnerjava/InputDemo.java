package beginnerjava;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        int number;
        Scanner input= new Scanner(System.in);
        double num1;
        System.out.print("Enter any double value : ");
        num1 =input.nextDouble();
        System.out.println(num1);
    }
}
