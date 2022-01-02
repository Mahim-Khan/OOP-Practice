
package LabWork5;


public class Customer extends User implements Shop{
     private String id;
    private String email;
    private String Cell;

    public Customer(String id, String email, String Cell, String loginid, String password) {
        super(loginid, password);
        this.id = id;
        this.email = email;
        this.Cell = Cell;
    }
     public void Customer(String id, String email, String Cell) {
        this.id = id;
        this.email = email;
        this.Cell = Cell;
    }
  
     public void display(){
         super.display();
        System.out.println("Id = "+id);
        System.out.println("Email = "+email);
        System.out.println("Cell = "+Cell);
        
    }
     @Override
    public void buy(){
         
     }
    @Override
      public void Sale(){
         
     }
    
}
 

