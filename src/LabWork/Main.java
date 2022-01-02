
package LabWork;


public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("MahimKhan","Dhaka","mmm@gmail.com","123","hsd");
        c1.register(102,"Mahim","123");
        Customer c2 = new Customer("Ajoy","Dhaka","ajj@gmail.com","124","hssd");
        c2.register(103,"Ajoy","124");
        Admin a1 = new Admin();
        
       a1.setEmail("mahim@gmail.com");
        System.out.println(a1.email()+"\n");
        c1.login("Mahim", "123");
        
        c2.login("Ajoy", "124");
    }
    
}
