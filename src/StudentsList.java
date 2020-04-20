import java.util.ArrayList;

public class StudentsList extends ArrayList<Student> {
    ArrayList<Student> studentArrayList = new ArrayList<Student>();

    public ArrayList<Student> getStudentArrayList() {
        return studentArrayList;
    }

    public void setStudentArrayList(ArrayList<Student> studentArrayList) {
        this.studentArrayList = studentArrayList;
    }
}
