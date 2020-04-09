import javax.swing.*;

public class InterfaceAdd {
    JLabel labelName = new JLabel("Imie: ");
    JLabel labelSurname = new JLabel("Nazwisko: ");
    JLabel labelStudyMajor = new JLabel("Kierunek Studiów: ");
    JLabel labelYearOfStudy = new JLabel("Rok Studiów: ");
    JLabel labelAverageGrades = new JLabel("Średnia Ocen: ");



    JTextField textFieldName = new JTextField(25);
    JTextField textFieldSurname = new JTextField(25);
    JComboBox studyMajorList = new JComboBox(StudyMajors.values());
    JTextField textFieldYearOfStudy = new JTextField(5);
    JTextField textFieldAverageGrades = new JTextField(5);

    JButton buttonApply = new JButton("Zatwierdź");


        public void creatingInterfaceAdd(JPanel panel){
            labelName.setBounds(150, 10, 150, 25);
            labelSurname.setBounds(150, 45, 150, 25);
            labelStudyMajor.setBounds(150, 80, 150, 25);
            labelYearOfStudy.setBounds(150, 115, 150, 25);
            labelAverageGrades.setBounds(150, 150, 150, 25);
            textFieldName.setBounds(260, 10, 200, 25);
            textFieldName.setEditable(true);
            textFieldSurname.setBounds(260, 45, 200, 25);
            textFieldSurname.setEditable(true);
            studyMajorList.setBounds(260, 80, 200, 25);
            textFieldName.setEditable(true);
            textFieldYearOfStudy.setBounds(260, 115, 35, 25);
            textFieldAverageGrades.setEditable(false);
            textFieldAverageGrades.setBounds(260, 150, 35, 25);

            buttonApply.setBounds(260, 185, 100, 25);

            panel.add(labelName);
            panel.add(textFieldName);
            panel.add(labelSurname);
            panel.add(textFieldSurname);
            panel.add(labelStudyMajor);
            panel.add(studyMajorList);
            panel.add(labelYearOfStudy);
            panel.add(textFieldYearOfStudy);
            panel.add(labelAverageGrades);
            panel.add(textFieldAverageGrades);
            panel.add(buttonApply);
        }
}
