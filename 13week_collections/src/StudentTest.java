import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Student{
    private String name;
    private int korean, english, math;

    public Student(String name, int korean, int english, int math)
    {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }



    public int getKorean() {
        return korean;
    }
    public int setKorean() {
        return korean+10;
    }

    public int getEnglish() {
        return english;
    }

    public int getMath() {
        return math;
    }

    static ArrayList<Student> students = new ArrayList<>(List.of(
            new Student("지호진", 100, 99, 100),
            new Student("오석진", 80, 81, 83),
            new Student("박재수", 90, 75, 87),
            new Student("노경두", 91, 100, 90),
            new Student("박춘규", 89, 87, 71)
    ));
}

public class StudentTest {
    public static void main(String[] args) {
        System.out.println("국어점수 평균: " + StudentTest.average(Student.students, a -> a.getKorean()));
        System.out.println("영어점수 평균: " + StudentTest.average(Student.students, a -> a.getEnglish()));
        System.out.println("수학점수 평균: " + StudentTest.average(Student.students, a -> a.getMath()));
    }

    static double average(ArrayList<Student> std, Function<Student, Integer> avr)
    {
        double sum = 0.0;

        for (Student x : std)
            sum += avr.apply(x);
        return sum/std.size();
    }
}
