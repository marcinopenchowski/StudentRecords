import javax.swing.*;
import java.awt.*;
import java.text.NumberFormat;

public class AdditionPanel extends MyPanels{

    JPanel gridLayout = new JPanel();
    JLabel labelName = new JLabel("Imie: ");
    JLabel labelSurname = new JLabel("Nazwisko: ");
    JLabel labelStudyMajor = new JLabel("Kierunek Studiów: ");
    JLabel labelYearOfStudy = new JLabel("Rok Studiów: ");
    JLabel labelAverageGrades = new JLabel("Średnia Ocen: ");
    JLabel labelEmpty = new JLabel();


    JTextField textFieldName = new JTextField(25);
    JTextField textFieldSurname = new JTextField(25);
    JComboBox studyMajorList = new JComboBox(StudyMajors.values());
    JFormattedTextField textFieldYearOfStudy = new JFormattedTextField();
    JTextField textFieldAverageGrades = new JTextField(5);

    JButton buttonApply = new JButton("Zatwierdź");

    public AdditionPanel(StudentsList studentsList){
        gridLayout.setLayout(new GridLayout(0, 2));
        gridLayout.add(labelName);
        gridLayout.add(textFieldName);
        gridLayout.add(labelSurname);
        gridLayout.add(textFieldSurname);
        gridLayout.add(labelStudyMajor);
        gridLayout.add(studyMajorList);
        gridLayout.add(labelYearOfStudy);
        gridLayout.add(textFieldYearOfStudy);
        gridLayout.add(labelAverageGrades);
        gridLayout.add(labelEmpty);
        gridLayout.add(textFieldAverageGrades);
        gridLayout.add(buttonApply);

        textFieldName.setEditable(true);
        textFieldSurname.setEditable(true);
        textFieldName.setEditable(true);
        textFieldAverageGrades.setEditable(false);
        addListenerForStudentAdd(studentsList);

    }



    public JTextField getTextFieldName() {
        return textFieldName;
    }

    public JTextField getTextFieldSurname() {
        return textFieldSurname;
    }

    public JComboBox getStudyMajorList() {
        return studyMajorList;
    }

    public JFormattedTextField getTextFieldYearOfStudy() {
        return textFieldYearOfStudy;
    }

    public JTextField getTextFieldAverageGrades() {
        return textFieldAverageGrades;
    }

    public void display(JPanel panel){

        panel.add(gridLayout);

        }

        public Student getStudent(){
            return new Student(getTextFieldName().getText(),
                    getTextFieldSurname().getText(),
                    (StudyMajors)studyMajorList.getSelectedItem(),
                    Integer.parseInt(getTextFieldYearOfStudy().getText()));
        }

        public void addListenerForStudentAdd(StudentsList studentsList){
        buttonApply.addActionListener(actionEvent -> {

            Student student = getStudent();
            studentsList.addStudent(student);
            System.out.println(studentsList);

        });
        }
}
