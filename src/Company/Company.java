
package Company;


public class Company {
    String name;
    int reg_no;
    String type;
    Company(String n,int reg,String t ){
        name =n;
        reg_no =reg;
        type = t;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReg_no() {
        return reg_no;
    }

    public void setReg_no(int reg_no) {
        this.reg_no = reg_no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public void displayfunction(){
        System.out.println("Name :"+name);
        System.out.println("Reg No :"+reg_no);
        System.out.println("Type :"+type);
    }
    
    
}
