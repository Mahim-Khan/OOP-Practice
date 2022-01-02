
package Vacation;


public class Vacation {
  private String name; 
 private int day; 
 private int numOfVacation; 
 private String month; 
 Vacation (String n, int d, int nv, String m){ 
        name = n; 
        day = d; 
        numOfVacation = nv; 
        month = m; 
 
    } 
      public String getname(){ 
        return name; 
    } 
    public int day(){ 
        return day; 
    } 
    public int numOfVacation(){ 
        return numOfVacation; 
    } 
    public String month(){ 
        return month; 
    } 
    public boolean sameName(Object obj){ 
        if(this == obj){ 
            return true; 
        } 
        Vacation v = (Vacation) obj; 
        return this.name == v.name; 
    }
    public void averageVacation(){
        
        //return this.numOfVacation*v;
              
        }
    }

