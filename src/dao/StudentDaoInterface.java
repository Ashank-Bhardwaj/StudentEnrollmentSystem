package dao;

import model.Student;

public interface StudentDaoInterface {
    public boolean enrollStudent(Student s);
    public boolean deleteEnrollment(int rollNo);
    public boolean updateEnrollment(int rollNo, int courseId);
    public boolean showStudentById(int rollNo);
}
