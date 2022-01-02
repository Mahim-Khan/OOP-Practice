
package Car;

public class Car {
    String Color;
    String PlateNo;
    String Owner;
    Car(){
        
    }

    public Car(String Color, String PlateNo, String Owner) {
        this.Color = Color;
        this.PlateNo = PlateNo;
        this.Owner = Owner;
    }
    public void info(){
        System.out.println("Color: "+Color);
        System.out.println("PlateNo: "+PlateNo);
        System.out.println("Owner: "+Owner);
        System.out.println("\n");
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
