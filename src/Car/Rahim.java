
package Car;

public class Rahim extends customer implements Buy{
     public String email;
      public String cellno;

    public Rahim(String email, String cellno, String ID) {
        super(ID);
        this.email = email;
        this.cellno = cellno;
    }

    public void display(){
        System.out.println("email :"+email);
       System.out.println("cellno :"+cellno);
       System.out.println("ID :"+ID);
    }
      
      
     @Override
   public void buy() {
   }
   
}
