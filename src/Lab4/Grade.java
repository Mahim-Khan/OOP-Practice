
package Lab4;

public class Grade {
    private String name;
    private String[] subject = new String[10];
   private double[] marks = new double[10];
    
    public Grade(String stdname){
        this.name = stdname;
        
    }
    public String getname(){
        return this.name;
    }
    public void AddSubWithMarks(String Sub,double mark){
        for(int i = 0; i < this.subject.length; i++){
            if(this.subject[i] == null){
                this.subject[i] = Sub;
                this.marks [i]= mark;
                return;
            }   
        }
    }
    public double sqpa(){
        double result =0;
        int cnt = 0;
         for(int i = 0; i < this.subject.length; i++){
            if(this.subject[i] != null){
                result += this.marks[i];
                cnt++;
            } else{
                break;
            }
                
        }
        return (result/cnt);
    }
    
}
