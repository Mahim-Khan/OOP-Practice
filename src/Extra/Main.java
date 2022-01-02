
package Extra;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);  
         System.out.println("Enter the number: ");  
       int num=input.nextInt();
       int P,result=0;
       int pal=num;    
       while(num>0)
       {    
       P=num%10;    
       result=(result*10)+P;    
       num=num/10;    
       }    
        if(pal==result) {   
        System.out.println("The entered number "+pal+" is a palindrome number ");    
        }
        else    {
        System.out.println("The entered number "+pal+" is not a palindrome"); 
        }
    }
}
