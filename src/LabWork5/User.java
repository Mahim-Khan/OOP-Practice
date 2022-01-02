
package LabWork5;


public class User {
    protected String loginid;
    protected String password;

    public User(String loginid, String password) {
        this.loginid = loginid;
        this.password = password;
    }

    public void display(){
        System.out.println("loginid = "+loginid);
        System.out.println("password = "+password);
        
    }
   
     
}
