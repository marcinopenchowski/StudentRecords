import javax.swing.*;


public class EmptyTextFieldException extends RuntimeException{

    public void showWarning(JPanel panel){
        JOptionPane.showMessageDialog(panel, "Wypełnij wszystkie pola formularza.", "Błąd", JOptionPane.WARNING_MESSAGE);
    }
}
