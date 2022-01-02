/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyClockClass;


public class MyClock {
    private int hours;
    private int minutes;
    private int seconds;
    
    MyClock(){ 
    }
    public MyClock(int hours,int minutes,int seconds ){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        
        
    }
    public void setTime(int hours,int minutes,int seconds){
        
    }
    public int getHours(){
        return this.hours;
    }
    
    public int getMinutes(){
        return this.minutes;
    }
    public int getSeconds(){
        return this.seconds;
    }
    public void printTime(){
        System.out.println(+hours +minutes +seconds);
        
    }
    public void incrementSeconds(int sec){
        
    }
    public void incrementMinutes(int min){
        
    }
    public void incrementHours(int hrs){
        
    }
    //public boolean equals(Clock otherClock){
        
    //}
    //public void makeCopy(Clock otherClock){
        
    //}
    
    
}
