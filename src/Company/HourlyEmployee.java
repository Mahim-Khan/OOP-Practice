
package Company;


public class HourlyEmployee extends Employee {
    int hours_worked;
    int hourly_payment;
    HourlyEmployee(int hw,int hp){
        hours_worked = hw;
        hourly_payment = hp;
    }
    

    public int getHours_worked() {
        return hours_worked;
    }

    public void setHours_worked(int hours_worked) {
        this.hours_worked = hours_worked;
    }

    public int getHourly_payment() {
        return hourly_payment;
    }

    public void setHourly_payment(int hourly_payment) {
        this.hourly_payment = hourly_payment;
    }
    
     public  int salaryPayment(){
         
         return hours_worked*hourly_payment;
     }
    
}
