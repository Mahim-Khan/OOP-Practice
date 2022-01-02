
package LabWork5;

public class Product extends Item {
    private String id;
    private String name;
    private double unitprice;

    public Product(String id, String name, double unitprice, String itemcode) {
        super(itemcode);
        this.id = id;
        this.name = name;
        this.unitprice = unitprice;
    }
    public void display(){
        super.display();
        System.out.println("Id = "+id);
        System.out.println("Name = "+name);
        System.out.println("Unit Price = "+unitprice);
        System.out.println("\n");
    }
}
