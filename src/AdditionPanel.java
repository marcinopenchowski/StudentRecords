import javax.swing.*;
import java.awt.*;

public class AdditionPanel extends MyPanel {


    JLabel labelName = new JLabel("Imie: ");
    JLabel labelSurname = new JLabel("Nazwisko: ");
    JLabel labelStudyMajor = new JLabel("Kierunek Studiów: ");
    JLabel labelYearOfStudy = new JLabel("Rok Studiów: ");
    JLabel labelEmpty = new JLabel();


    JTextField textFieldName = new JTextField(25);
    JTextField textFieldSurname = new JTextField(25);
    JComboBox studyMajorList = new JComboBox(StudyMajors.values());
    JFormattedTextField textFieldYearOfStudy = new JFormattedTextField();

    JButton buttonApply = new JButton("Zatwierdź");

    public AdditionPanel(StudentsModel studentsModel){

        centerGridLayout.add(labelName);
        centerGridLayout.add(textFieldName);
        centerGridLayout.add(labelSurname);
        centerGridLayout.add(textFieldSurname);
        centerGridLayout.add(labelStudyMajor);
        centerGridLayout.add(studyMajorList);
        centerGridLayout.add(labelYearOfStudy);
        centerGridLayout.add(textFieldYearOfStudy);
        centerGridLayout.add(labelEmpty);
        centerGridLayout.add(buttonApply);
        textFieldName.setEditable(true);
        textFieldSurname.setEditable(true);
        textFieldName.setEditable(true);
        addListenerForStudentAdd(studentsModel);

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


    public void display(JPanel panel){

        panel.add(centerGridLayout, BorderLayout.CENTER);

        }

        public Object[] getStudent(){
            return new Object[] {getTextFieldName().getText(),
                    getTextFieldSurname().getText(),
                    studyMajorList.getSelectedItem(),
                    Integer.parseInt(getTextFieldYearOfStudy().getText())};
        }

        public void addListenerForStudentAdd(StudentsModel studentsModel){
        buttonApply.addActionListener(actionEvent -> {

            Object[] student = getStudent();
            studentsModel.addRow(student);
        });
        }
}
