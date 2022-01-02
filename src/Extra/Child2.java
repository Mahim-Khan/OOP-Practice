
package Extra;


public class Child2 extends Parent {
    int landd = 20;
    int land(int landsize,int childnumber){
        int total = landd + super.land(landsize,childnumber);
        return total;
    }
}
