
package beginnerjava;

public class IncrementDecrementDemo {
    public static void main(String[] args) {
        int x =25;
        int y;
        y = --x;//pre decrement
        System.out.println("Y = "+y);//y=24
        y = x--;//post decrement
       System.out.println("Y = "+y);//y=24
       
        y = ++x;//pre increment
        System.out.println("Y = "+y);//y=24
        y = x++;//post increment
        System.out.println("Y = "+y);//y=24
    }
    
}
