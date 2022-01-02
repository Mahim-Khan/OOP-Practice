package Classwork;

import java.util.Scanner;

class Lab1 {
    String Color;
    String PlateNo;
    String Owner;

    public Lab1 (){
    }
    public Lab1 (String color,String plateNo,String owner){
        this.Color = color;
        PlateNo = plateNo;
        Owner = owner;
        
    }
    public void info(){
        System.out.println("Color: "+Color);
        System.out.println("Plate No: "+PlateNo);
        System.out.println("Owner: "+Owner);
    }
    public void forward(){
        System.out.println("Forward");
    }
    public void backward(){
        System.out.println("Backward");
    }
    public void turnleft(){
        System.out.println("Turn Left");
    }
    public void turnright(){
        System.out.println("Turn Right");
    }
}
    public class Main {
        public  static int getArea( int h, int w){
            int area = w*h; 
            return area;
        }
        public static void main(String[] arg) {
            Scanner input = new Scanner(System.in);
            
            
            //System.out.println("Enter Color: ");
           // String color = input.nextLine();
            
           // System.out.println("Enter Plate No: ");
           // String pn = input.nextLine();
            
           // System.out.println("Enter Owner: ");
           // String own = input.nextLine();
            
           Lab1 car1 = new Lab1("Red","1234","Ali");
            
            //car1.info();
            //double a =  2.685;
           // System.out.println("Answer: "+Math.round(a));
            int area1 = getArea(4,5);
            System.out.println("Area: "+area1);
        }
        


}