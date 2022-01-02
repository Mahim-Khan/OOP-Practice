
package Classwork;


public class Test {
    public static void main(String[] args) {
        COMPUTER_TOWER c1 = new COMPUTER_TOWER("intel(R)Corei5","8GB","1TB");
        System.out.println("Abdullah Al Fahim");
        System.out.println("173-15-10430");
        c1.display();
        System.out.println("MONITOR DETAILS:");
        c1.resolution();
        c1.screen_size();
        c1.aspect_ratio();
        System.out.println("KEYBOARD DETAILS:");
        c1.layout();
        c1.hight();
        System.out.println("MOUSE DETAILS:");
        c1.sensor();
        c1.CPI();
        c1.DPI();
        c1.poll_rate();
        System.out.println("SOUNDBOX DETAILS:");
        c1.Brand();
        c1.color();
        c1.battery_life();
        c1.model_name();
        
    }
    
}
