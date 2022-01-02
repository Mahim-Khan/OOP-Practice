
package Company;


public class SalariedEmployee extends Employee {
    String SalaryScale;

    public void setSalaryScale(String SalaryScale) {
        this.SalaryScale = SalaryScale;
        super.payment();
      
    }
    
    
    
}
