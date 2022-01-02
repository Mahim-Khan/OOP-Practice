
package Classwork;


public class COMPUTER_TOWER implements MONITOR,KEYBOARD,MOUSE,SOUNDBOX {
    public String processor;
    public String memory;
    public String storage;
    
    public COMPUTER_TOWER(String processor, String memory, String storage) {
        this.processor = processor;
        this.memory = memory;
        this.storage = storage;
    }
    public void display(){
        System.out.println("Processor :"+processor);
        System.out.println("Installed Memory :"+memory);
        System.out.println("Storage: "+storage);
    }
    
    public void storedata(){
        
    }
    @Override
     public void sensor(){
          System.out.println("Sensor :MAX BC3332-A 10K Sensor");
     }
    @Override
     public void DPI(){
        System.out.println("DPI :800DPI");
     }
    @Override
     public  void CPI(){
          System.out.println("CPI :100~10,000 CPI ");
     }
    @Override
     public void poll_rate(){
         System.out.println("Polling Rate :1000Hz ");
     }
    @Override
     public void resolution(){
         System.out.println("Brightness :70");
     }
    @Override
     public void screen_size(){
         System.out.println("Screen Size :23");
     }
    @Override
     public  void aspect_ratio(){
         System.out.println("Aspect Ratio :Position H-62 V-72 ");
     }
    @Override
     public void layout(){
         System.out.println("Layout :30cm");
     }
    @Override
     public  void hight(){
         System.out.println("Hight :10cm");
     }
    @Override
     public  void Brand(){
          System.out.println("Brand :Microlab");
     }
    @Override
     public  void color(){
         System.out.println("Color :Black&White");
     }
    @Override
     public  void battery_life(){
         System.out.println("Battery Life :Power");
     }
    @Override
     public  void model_name(){
         System.out.println("Model Name:Microlab M-100");
     }
    
    
}
