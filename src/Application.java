import dao.StudentDaoImpl;
import dao.StudentDaoInterface;
import model.Student;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Application app=new Application();
        app.menu();
    }

    private void menu(){
        Scanner sc=new Scanner(System.in);

        StudentDaoInterface dao=new StudentDaoImpl();
        System.out.println("Welcome to Student Enrollment System");
        while(true){
            System.out.println(
                    "\n1.Course Enrollment" +
                    "\n2.View Enrollment" +
                    "\n3.Update Enrollment" +
                    "\n4.Delete Enrollment"+
                    "\n5.Exit");
            System.out.println("Enter choice");
            int ch=sc.nextInt();
            switch (ch){
                case 1:
                    System.out.println("\n1001 - Cloud" +
                            "\n 1002 - Java" +
                            "\n 1003 - .Net" +
                            "\n 1004 - ReactJS" +
                            "\n 1005 - Python"
                            );
                    System.out.println("Select course id from above courses: ");
                    int courseId=sc.nextInt();
                    System.out.println("Enter your first name: ");
                    String fName=sc.next();
                    System.out.println("Enter your last name: ");
                    String lName=sc.next();
                    System.out.println("Enter your date of birth: ");
                    String dob=sc.next();
                    System.out.println("Enter your Roll No: ");
                    int roll=sc.nextInt();
                    System.out.println("Enter your location: ");
                    String location=sc.next();

                    Student student=new Student(fName,lName,dob,roll,location,courseId);
                    boolean ans=dao.enrollStudent(student);
                    if(ans)
                        System.out.println("Record inserted Successfully!!!");
                    else
                        System.out.println("something went wrong, please try again");

                    break;
                case 2:
                    System.out.println("Enter Roll No of student to view enrollment ");
                    int rollNoView=sc.nextInt();
                    dao.showStudentById(rollNoView);

                    break;
                case 3:
                    System.out.println("Update Student Enrollment");
                    System.out.println("\n1001 - Cloud" +
                            "\n 1002 - Java" +
                            "\n 1003 - .Net" +
                            "\n 1004 - ReactJS" +
                            "\n 1005 - Python"
                    );

                    System.out.println("Enter your Roll No to view enrollment details: ");
                    int rollNo = sc.nextInt();

                    dao.showStudentById(rollNo);

                    System.out.println("Enter course id from the courses above to update enrollment: ");
                    int newCourseId=sc.nextInt();

                    boolean flag=  dao.updateEnrollment(rollNo,newCourseId);

                    if(flag)
                        System.out.println("Course updated successfully");
                    else
                        System.out.println("Something went wrong...");
                    break;
                case 4:
                    System.out.println("Delete Student");
                    System.out.println("Enter Roll No to delete");
                    int rollNoDelete=sc.nextInt();
                    boolean ff=dao.deleteEnrollment(rollNoDelete);
                    if(ff)
                        System.out.println("Record deleted successfully...");
                    else
                        System.out.println("Something went wrong");
                    break;
                case 5:
                    System.out.println("Thank You for using Student Enrollment System!!!");
                    System.exit(0);
                default:
                    System.out.println("Please enter valid choice..");
            }
        }
    }
}
