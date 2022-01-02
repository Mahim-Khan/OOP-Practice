
package LabWork5;


public class Buy {
    private int qyt;
    private String date;
   Customer c1 = new Customer("1234","xyz@gmail.com","0193333333","22222","0000");
   Product p1 = new Product("1234","Mahim",400,"125");
    
    public Buy(int qyt, String date) {
        this.qyt = qyt;
        this.date = date;
    }

    public void display(){
        c1.display();
        p1.display();
        System.out.println("Quantity = "+qyt);
        System.out.println("Date = "+date);
        System.out.println("\n");
    }
}
