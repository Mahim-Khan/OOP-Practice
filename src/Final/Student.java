
package Final;


public class Student {
    private String name;
    private String dept;
    private int id;

    public Student(String name, String dept, int id) {
        this.name = name;
        this.dept = dept;
        this.id = id;
    }
      public void display(){
          System.out.println("Name :"+name);
          System.out.println("Dept :"+dept);
          System.out.println("ID :"+id);
      
    }
    
}
