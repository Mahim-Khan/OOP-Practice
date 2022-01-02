
package Lab4;


public class Main {
    public static void main(String[] args) {
        
        Grade std1 = new Grade("Mahim");
        std1.AddSubWithMarks("OOP",65);
        std1.AddSubWithMarks("PPS",85.5);
        std1.AddSubWithMarks("DS",70);
        System.out.println("Name: "+std1.getname());
        System.out.println("SGPA: "+std1.sqpa());

    }
        
}

          

        //System.out.println("Sum from 1 to 10 = "+sum(1,10));
        //System.out.println("Sum from 20 to 30 = "+sum(20,30));
       // System.out.println("Sum from 35 to 45 = "+sum(35,45));



/*private static int sum(int start,int end){
         int sum = 0;
        for(int i=start;i<=end;i++){
            sum+=i;
        }
        return sum;
    }
