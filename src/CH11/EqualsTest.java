package CH11;

import java.util.Objects;

class Student {
    int studentID;
    String studentName;

    // 자동생성 생성자
    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", studentName='" + studentName + '\'' +
                '}';
    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true; // 1. 주소값이 같은면 같다.
//        if (o == null || getClass() != o.getClass()) return false; // 2. 주소값이 없거나, 클래스명이 틀리명 false
//        Student student = (Student) o; // 스튜던트 클래스로 다운캐스팅
//        return studentID == student.studentID &&
//                Objects.equals(studentName, student.studentName);
//    }

    @Override
    public int hashCode() {
        // 학생아이디로 리턴
        return studentID;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student std = (Student) obj; // 다운캐스팅
            if (this.studentID == std.studentID) {
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }

}

public class EqualsTest {
    public static void main(String[] args) {
        Student lee = new Student(100, "이상원");
        Student lee2 = lee; // 주소복사
        Student sang = new Student(100, "이상원");

        if (lee == lee2) { // 같다 연산자로 비교
            System.out.println("lee와 lee2의 주소는 같습니다.");
        } else {
            System.out.println("lee와 lee2의 주소는 틀립니다.");
        }

        if (lee.equals(lee2)) { // lee와 lee2 객체가 같은가?
            System.out.println("lee와 lee2의 주소는 같습니다.");
        } else {
            System.out.println("lee와 lee2의 주소는 틀립니다.");
        }

        // 서로 다른 객체일때
        if (lee == sang) { // lee와 lee2 객체가 같은가?
            System.out.println("lee와 sang의 주소는 같습니다.");
        } else {
            System.out.println("lee와 sang의 주소는 틀립니다.");
        }

        if (lee.equals(sang)) { // lee와 lee2 객체가 같은가?
            System.out.println("lee와 sang의 주소는 같습니다.");
        } else {
            System.out.println("lee와 sang의 주소는 틀립니다.");
        }
    }
}
