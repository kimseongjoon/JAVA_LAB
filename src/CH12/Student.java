package CH12;

import java.util.Objects;

public class Student {
    private String studentId;
    private String studentName;

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return studentId + ":" + studentName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentId, student.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
        //return Integer.parseInt(studentId);
    }
}
