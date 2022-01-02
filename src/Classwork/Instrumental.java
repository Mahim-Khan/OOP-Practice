
package Classwork;

public class Instrumental extends Istruments implements Music{
    String brandName;

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setNoOfStrings(int noOfStrings) {
        this.noOfStrings = noOfStrings;
    }

  
    public void display(){
        System.out.println("brandName :"+brandName);
        System.out.println("NoOfStrings :"+noOfStrings);
    }
    
    
    @Override
     public  void play(){
          System.out.println("play Istruments");
     }
      @Override
     public  void Musicplayer(){
          System.out.println("Play Music");
     }
    
}
