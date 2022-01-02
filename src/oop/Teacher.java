
package oop;

public class Teacher {
    String name,gender;
    int phone;
    Teacher(String n,String g,int ph){//Constractor
        name = n;
        gender = g;
        phone = ph; 
        
    }
    /*void setInfo(String n,String g,int ph){//set methode
        name = n;
        gender = g;
        phone = ph;
    }*/
    void displayInfo(){//display methode
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Phone: "+phone );
        
    }
    
}
