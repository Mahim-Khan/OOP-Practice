
package Inheritance;

public class Square extends Rectangle{
    public Square(int w,int h){
        super(w,h);
    }
    public int getArea(){
       return 2;
   }  
    public void display(){
        System.out.println(super.getArea());
    }
}
