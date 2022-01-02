
package Final;


public class ClassTest {
    public static void main(String[] args) {
         try{
            int x,y,Result;
            x =1000;
            y= 0;
           Result = x/y;
        System.out.println("The Result is : "+Result); 
        
        }catch(Exception e){
            System.out.println("Exception :"+e);
        }
        finally{
            System.out.println("Ok");

    }
       
    }
    
}
