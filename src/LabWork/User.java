
package LabWork;


public class User {
    private int User_id;
    private String User_name;
    private String password;
    private Boolean login_status;
    
    public Boolean verify_login(String u,String p){
        if(u.equals(this.User_name) && p.equals(this.password)){
            return true;
        }else{
            return false;
        }
        
    }
    public int User_id(){
     return this.User_id;
    }
    public void create_User(int ui,String un,String pas){
        this.User_id=ui;
        this.User_name=un;
        this.password=pas;
    }
    
    
}
