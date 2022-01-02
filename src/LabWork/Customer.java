
package LabWork;

public class Customer extends User {
    private String customer_name;
    private String address;
    private String email;
    private String credit_card_info;
    private String shipping_info;
    Customer(String cn,String ad,String e,String cr,String s){
       this.customer_name =cn;
        this.address=ad;
        this.email=e;
        this.credit_card_info=cr;
        this.shipping_info=s; 
    }
    public String Customer_name(){
      return this.customer_name;
    }
     public String setCustomername(String cn){
      return this.customer_name=cn;
    }
    public String address(){
        return this.address;
    }
     public String setAddress(String ad){
      return this.address=ad;
     }
      public String email(){
        return this.email;
    }
    
     public String setEmail(String e){
      return this.email=e;
    }
      
     public void bill(){
    }
     public void register(int ui,String un,String pas){
         super.create_User(ui, un, pas);
        
    }
     public void login(String un,String p){
         if(super.verify_login(un, p)){
             System.out.println("Successfully login");
         }else{
             System.out.println("Worng Information");
         }
        
    }
     public void update_profile(){
        
    }
        private void calculate_next_bill_amount(){
             
         }
        private void generate_invoice_pdf_version(){
             
         }
        
       public void display(){
           
           
       } 
}
