import java.util.ArrayList;

public class StudentsList{
    ArrayList<Student> studentArrayList = new ArrayList<Student>();

    public void addStudent(Student student){
        studentArrayList.add(student);
    }

    public ArrayList<Student> getStudentArrayList() {
        return studentArrayList;
    }
}
