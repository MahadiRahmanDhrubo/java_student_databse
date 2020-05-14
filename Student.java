
package studentdatabaseapp;

import java.util.Scanner;


public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = " ";
    private int tutionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;
    
    
    
    
    // Constructor : prompt user to enter students name and year
    public Student()
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter Student First Nmae = ");
        this.firstName = in.nextLine();
        
        System.out.print("Enter Student Last Nmae = ");
        this.lastName = in.nextLine();
        
        System.out.print("1 - Freshman\n2 - Junior\n3 - Senior\nEnter Student Class Level : ");
        this.gradeYear = in.nextInt();
       
        
        setStudentID();
        
        // System.out.println(firstName + " " + lastName + " " + gradeYear + " "+ studentID);
    }
    
    
    // Generate an ID
    private void  setStudentID()
    {
        // Grade level + ID
        id++;
        this.studentID =  gradeYear + "" + id;
    }
    
    
    // Enroll in courses
    public void enroll()
    {
        //Get inside a loop ,user hits 0
        do{
        System.out.print(" Enter course to enroll(Q to quit) : ");
        Scanner in = new Scanner(System.in);
        String course = in.nextLine();
        
        if(!course.equals("Q"))
        {
            courses = courses + "\n " + course;
            tutionBalance = tutionBalance + costOfCourse;
        }
        else
        {
          
            break;
        }
     } while(1 != 0);
        
        //System.out.println("ENROLLED IN : "+courses);
       // System.out.println("TUTION BALANCE  : "+tutionBalance);
    }
    
    // View balance
    public void viewBalance()
    {
        System.out.println("Your balance is : TK " + tutionBalance);
    }
    
    // Pay tution 
    public void payTution()
    {
        viewBalance();
        
        System.out.print("Enter your payment = TK ");
        
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        
        tutionBalance = tutionBalance - payment;
        System.out.println("Thank you for your payment of TK " +payment);
        viewBalance();
    }
    
    
    // Show status
    public String toString()
    {
       return "Name : "+ firstName + " "+ lastName +
               "\nGrade level : "+gradeYear +
               "\nStudent ID : "+ studentID +
               "\nCourses Enrolled : "+ courses +
               "\nBalance : TK "+ tutionBalance;
               
    }
    
    
}
