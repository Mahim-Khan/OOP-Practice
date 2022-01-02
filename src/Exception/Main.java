
package Exception;


public class Main {
    public static void main(String[] args) {
        try{
            int[] a =new int[5];
             a[5]= 10; 
        
        }catch(Exception e){
            System.out.println("Exception :"+e);
        }
        finally{
         System.out.println("Hello");
    }
        
       
        
        
    }
    
}
