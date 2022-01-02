
package Company;

public class Main {
    public static void main(String[] args) {
        Company c1 =new Company("Mahim",58990,"Course");
        c1.displayfunction();
        Employee em1 = new Employee();
        
        HourlyEmployee hr1 = new HourlyEmployee(10000,10000);
        hr1.salaryPayment();
        System.out.println("Salary"+hr1.salaryPayment());
        
        SalariedEmployee sr1 =new SalariedEmployee();
        
        
    }
    
}
