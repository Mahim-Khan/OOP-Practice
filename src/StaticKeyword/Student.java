/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaticKeyword;

/**
 *
 * @author USER
 */
public class Student {
    String name;
    int id;
    static String UniversityName="DIU";
    
    Student(String n,int i){
        name = n;
        id = i;
            
    }
     void displayInformation(){
         System.out.println("Name:"+name);
         System.out.println("ID:"+id);
         System.out.println("University Name:"+UniversityName);
    }
    
}
