import javax.swing.*;
import java.awt.*;

public class AdditionPanel extends MyPanel {


    JLabel labelName = new JLabel("Imie: ");
    JLabel labelSurname = new JLabel("Nazwisko: ");
    JLabel labelStudyMajor = new JLabel("Kierunek Studiów: ");
    JLabel labelYearOfStudy = new JLabel("Rok Studiów: ");
    JLabel labelAverageGrade = new JLabel("Średnia Ocen: ");
    JLabel labelEmpty = new JLabel();
    String myRegex = "[A-Za-zżźćńółęąśŻŹĆĄŚĘŁÓŃ]*";


    JTextField textFieldName = new JTextField(25);
    JTextField textFieldSurname = new JTextField(25);
    JComboBox studyMajorList = new JComboBox(StudyMajors.values());
    JFormattedTextField textFieldYearOfStudy = new JFormattedTextField();
    JFormattedTextField textFieldAverageGrade = new JFormattedTextField();
    EmptyTextFieldException emptyTextFieldException = new EmptyTextFieldException();

    JButton buttonApply = new JButton("Zatwierdź");

    public AdditionPanel(StudentsTableModel studentsTableModel){

        centerGridLayout.add(labelName);
        centerGridLayout.add(textFieldName);
        centerGridLayout.add(labelSurname);
        centerGridLayout.add(textFieldSurname);
        centerGridLayout.add(labelStudyMajor);
        centerGridLayout.add(studyMajorList);
        centerGridLayout.add(labelYearOfStudy);
        centerGridLayout.add(textFieldYearOfStudy);
        centerGridLayout.add(labelAverageGrade);
        centerGridLayout.add(textFieldAverageGrade);
        centerGridLayout.add(labelEmpty);
        centerGridLayout.add(buttonApply);
        textFieldName.setEditable(true);
        textFieldSurname.setEditable(true);
        textFieldName.setEditable(true);
        addListenerForStudentAdd(studentsTableModel);

    }



    public JTextField getTextFieldName() {
        return textFieldName;
    }

    public JTextField getTextFieldSurname() {
        return textFieldSurname;
    }

    public JFormattedTextField getTextFieldYearOfStudy() {
        return textFieldYearOfStudy;
    }

    public JFormattedTextField getTextFieldAverageGrade() {
        return textFieldAverageGrade;
    }

    public void display(JPanel panel){

        panel.add(centerGridLayout, BorderLayout.CENTER);

        }

        public Object[] getStudent(){
            return new Object[] {getTextFieldName().getText(),
                    getTextFieldSurname().getText(),
                    studyMajorList.getSelectedItem(),
                    Integer.parseInt(getTextFieldYearOfStudy().getText()),
                    Double.parseDouble(getTextFieldAverageGrade().getText())};
        }

        public void addListenerForStudentAdd(StudentsTableModel studentsTableModel){
        buttonApply.addActionListener(actionEvent -> {
            try {
                if (getTextFieldName().getText().isEmpty() || getTextFieldSurname().getText().isEmpty() || getTextFieldYearOfStudy().getText().isEmpty() || getTextFieldAverageGrade().getText().isEmpty()) {
                    throw emptyTextFieldException;
                }else if(!getTextFieldName().getText().matches(myRegex) || !getTextFieldSurname().getText().matches(myRegex)){
                    try {
                        throw new NumberFormatException();
                    }catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(panel, "Wpisz poprawne dane.", "Błąd", JOptionPane.WARNING_MESSAGE);
                    }

                } else {
                    studentsTableModel.addRow(getStudent());
                }
            }catch (EmptyTextFieldException e){
                emptyTextFieldException.showWarning(getPanel());
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(panel, "Wpisz poprawne dane.", "Błąd", JOptionPane.WARNING_MESSAGE);
            }
        });
        }
}
