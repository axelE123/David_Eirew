import java.util.ArrayList;
import java.util.List;

public class Student {
    //fields
    private String firstname;
    static int idnum = 1;
    private int studentnum;
    List<Course> courses = new ArrayList<>();

    //A constructor for Student
    public String toString() {
        return firstname;
    }
    public Student(String firstname) {
        this.firstname = firstname;
        studentnum = idnum;
        idnum++;
    }

    //methods
    //This method prints out a student and their info
    public String displaycourses() {
        String coursestring = "";
        for (Course block : courses){
            coursestring = coursestring+block.toString()+"\n";
        }
        return coursestring.substring(0,coursestring.length()-1);
    }
    public void deletecourse(int i) {
        courses.remove(i);
    }
    public void addcourse(Course course) {
        courses.add(course);
    }
    //setters and getters
    public double getstudentavg() {
        double total = 0;
        for (Course block : courses){
            total = total + block.getgrade();
        }
        return total/courses.size();
    }
    public String getfirstname() {
        return firstname;
    }
    public int getstudentnum() {
        return studentnum;
    }
    public void setfirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setstudentnum(int studentnum) {
        this.studentnum = studentnum;
    }
}
