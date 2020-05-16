import javax.swing.*;

public class AdditionPanel extends MyPanel {


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

        centerGridLayout.add(labelName);
        centerGridLayout.add(textFieldName);
        centerGridLayout.add(labelSurname);
        centerGridLayout.add(textFieldSurname);
        centerGridLayout.add(labelStudyMajor);
        centerGridLayout.add(studyMajorList);
        centerGridLayout.add(labelYearOfStudy);
        centerGridLayout.add(textFieldYearOfStudy);
        centerGridLayout.add(labelAverageGrades);
        centerGridLayout.add(labelEmpty);
        centerGridLayout.add(textFieldAverageGrades);
        centerGridLayout.add(buttonApply);

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

        panel.add(centerGridLayout);

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
