import java.util.ArrayList;
import java.util.List;
public class Course {
    private String subject;
    private int grade;

    public Course(String subject, int grade) {
        this.subject = subject;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return subject;
    }

    public int getgrade() {
        return grade;
    }
    public void setgrade(int grade) {
        this.grade = grade;
    }
}
