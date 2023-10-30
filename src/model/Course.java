package model;

public class Course {
    int courseid;
    String courseName;

    public Course() {
    }

    public Course(int courseid, String courseName) {
        this.courseid = courseid;
        this.courseName = courseName;
    }

    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseid=" + courseid +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
