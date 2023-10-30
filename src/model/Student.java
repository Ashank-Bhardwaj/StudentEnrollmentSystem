package model;

public class Student {
    private String firstName;
    private String lastName;
    private String dob;
    private int rollNo;
    private String location;
    private int courseId;

    public Student() {
    }

    public Student(String firstName, String lastName, String dob, int rollNo, String location, int courseId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.rollNo = rollNo;
        this.location = location;
        this.courseId = courseId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob='" + dob + '\'' +
                ", rollNo='" + rollNo + '\'' +
                ", location='" + location + '\'' +
                ", courseId='" + courseId + '\'' +
                '}';
    }
}
