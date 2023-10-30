package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import db.DBConnection;
import model.Student;

public class StudentDaoImpl implements StudentDaoInterface{
    @Override
    public boolean enrollStudent(Student s) {
        boolean flag=false;
        try{
            Connection con= DBConnection.createConnection();
            String query="insert into student(Roll_No,First_name,Last_name,DOB, Location, Course_id) value(?,?,?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(query);
            pst.setInt(1,s.getRollNo());
            pst.setString(2,s.getFirstName());
            pst.setString(3,s.getLastName());
            pst.setString(4,s.getDob());
            pst.setString(5,s.getLocation());
            pst.setInt(6,s.getCourseId());
            pst.executeUpdate();
            flag=true;
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deleteEnrollment(int rollNo) {
        boolean flag=false;
        try{
            Connection con=DBConnection.createConnection();
            String query="delete from student where Roll_no="+rollNo;
            PreparedStatement pst=con.prepareStatement(query);
            pst.executeUpdate();
            flag=true;

        }
        catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean updateEnrollment(int rollNo, int courseId) {
        boolean flag=false;
        try{
            Connection con= DBConnection.createConnection();
            String query="update student set course_id= ? where Roll_no= ?";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setInt(1,courseId);
            ps.setInt(2,rollNo);
            ps.executeUpdate();
            flag=true;
        }catch (Exception ex){
            ex.printStackTrace();
        }

        return flag;
    }

    @Override
    public boolean showStudentById(int rollNo) {
        boolean flag=false;
        try{

            Connection con=DBConnection.createConnection();
            String query="select First_Name,Last_Name,Roll_No,DOB,Location,Course_Name from student NATURAL JOIN course where Roll_No="+rollNo;
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                System.out.println("First Name: "+rs.getString(1)+"\n" +
                        "Last Name: "+rs.getString(2)+"\n" +
                        "Roll NO: "+rs.getString(3)+"\n" +
                        "DOB: "+rs.getString(4)+"\n" +
                        "Location:"+rs.getString(5)+"\n"+
                        "Course Name:"+rs.getString(6)
                );
                System.out.println("----------------------------------");
                flag=true;

            }

        }
        catch (Exception ex){
            ex.printStackTrace();
        }

        return flag;    }
}
