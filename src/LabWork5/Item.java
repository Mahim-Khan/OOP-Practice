
package LabWork5;


public class Item {
    protected String itemcode;

    public Item(String itemcode) {
        this.itemcode = itemcode;
    }
    public void display(){
        System.out.println("Itemcode = "+itemcode);
        
    }
    
}
