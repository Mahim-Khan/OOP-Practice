
package Classwork;


public class InstrumentCheck {
    public static void main(String[] args) {
        Instrumental obj = new Instrumental();
        
         try{
        obj.guitar();
        obj.setBrandName("Gibson");
        obj.setNoOfStrings(6);
        obj.display();
        obj.Musicplayer();
        obj.play();
        
        obj.harps();
        obj.setBrandName("Heather");
        obj.setNoOfStrings(47);
        obj.display();
        obj.Musicplayer();
        obj.play();
        
        obj.mandolin();
        obj.setBrandName("Rogue");
        obj.setNoOfStrings(4);
        obj.display();
        obj.Musicplayer();
        obj.play();
        
        obj.bass();
        obj.setBrandName("Fender");
        obj.setNoOfStrings(4);
        obj.display();
        obj.Musicplayer();
        obj.play();
        
        }catch(Exception e){
            System.out.println("Exception :"+e);
        }
        
        
        
    }
    
}
