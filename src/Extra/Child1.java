
package Extra;


public class Child1 extends Parent {
    int landd = 14;
    int land(int landsize,int childnumber){
        int total = landd + super.land(landsize,childnumber);
        return total;
    }
    
}
