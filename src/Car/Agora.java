
package Car;


public class Agora extends Item{
    public String email;
      public String cellno;

    public Agora(String email, String cellno, String itemId, String name, String Price) {
        super(itemId, name, Price);
        this.email = email;
        this.cellno = cellno;
    }

   public void display(){
       System.out.println("email :"+email);
       System.out.println("cellno :"+cellno);
       System.out.println("itemId :"+itemId);
       System.out.println("name :" +name);
       System.out.println("itemId :"+Price);
            
        }
        
    
}
