
package studentdatabaseapp;

import java.util.Scanner;

public class StudentDataBaseApp {

    public static void main(String[] args) {
      
       // Ask how many new students we want to add
        Scanner in = new Scanner(System.in);
         
        System.out.print("Enter number of new students to enroll : ");
        int numOfStudents = in.nextInt();
        
        Student[] students = new Student[numOfStudents];
      
        
       
       // Create n number of new student 
        for (int n = 0; n < numOfStudents; n++) {
            
        students [n] = new Student();
        students[n].enroll();
        students[n].payTution();
       
            
        }
        
        for (int n = 0; n < numOfStudents ; n++) {
            
             System.out.println(students[n].toString());
             
        }
    }
    
}
