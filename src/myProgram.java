import javax.swing.*;

public class myProgram {
    public static void main(String[] args) {
        String name, message;
        double m1, m2, m3, m4, m5, avg;
        name = JOptionPane.showInputDialog("Enter your name");

        m1 = Double.parseDouble(JOptionPane.showInputDialog("Enter mark 1:")); //! JOptionPane.showInputDialog always returns the user's input as a String, that's why we are parsing the string as double data type for further process.
        m2 = Double.parseDouble(JOptionPane.showInputDialog("Enter mark 2:"));
        m3 = Double.parseDouble(JOptionPane.showInputDialog("Enter mark 3:"));
        m4 = Double.parseDouble(JOptionPane.showInputDialog("Enter mark 4:"));
        m5 = Double.parseDouble(JOptionPane.showInputDialog("Enter mark 5:"));
        avg = m1 + m2 + m3 + m4 + m5 / 5;

        message = "Hello" + name + ".\n" + "Your average mark is :" + avg;
        System.out.println(message);

        JOptionPane.showMessageDialog(null, message); //! Null means it doesn't have a specific parent component for this dialog box.
    }
}
