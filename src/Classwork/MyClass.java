/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classwork;

class Course{
    private String name;
    private String[] students = new String[20];
    private int numberOfStudents;
    
    public Course(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void addStudent(String studentName){
        for(int i = 0; i < this.students.length; i++){
            if(this.students[i] == null){
                this.students[i] = studentName;
                this.numberOfStudents++;
                return;
            }
        }
    }
    
    public String[] getStudents(){
        return this.students;
    }
    
    public int getNumberOfStudents(){
        return this.numberOfStudents;
    }
    
}

public class MyClass {
    public static void main(String args[]) {
      Course crs1 = new Course("C++");
      crs1.addStudent("Amir Ali");
      crs1.addStudent("Kawsar Ahmed");
      crs1.addStudent("Anowar Hossain");
      
      Course crs2 = new Course("Java");
      crs2.addStudent("Kader");
      crs2.addStudent("Rahima");

      //-----  C++ -----
      System.out.println("Course Name: "+crs1.getName());
      System.out.println("Number of students: "+crs1.getNumberOfStudents());
      displayStudents(crs1.getStudents());
        
      //----- Java -----    
      System.out.println("\nCourse Name: "+crs2.getName());
      displayStudents(crs2.getStudents());
      
    }
    
    public static void displayStudents(String[] students){
        for(int i = 0; i < students.length; i++){
            if(students[i] != null){
                System.out.println(students[i]);
            }else{
                break;
            }
        }
    }
}