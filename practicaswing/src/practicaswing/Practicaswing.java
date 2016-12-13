package practicaswing;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.UIManager;

public class Practicaswing extends JFrame {

    JTextField user = new JTextField(15);
    JPasswordField phone = new JPasswordField(15);
    JButton clean = new JButton("Limpiar");
    JButton accept = new JButton("Aceptar");
    
    JTextArea result = new JTextArea(4, 20);
    
    String[]  genders = {"Masculino", "Femenino"};
    JComboBox genderBox = new JComboBox(genders);

    public Practicaswing() {
        super("Validar Usuario");
        setSize(300, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        JLabel usernameLabel = new JLabel("Usuario:   ");
        JLabel phoneLabel = new JLabel("Telefono: ");
        JLabel genderLabel = new JLabel("Genero:                                 ");
        JLabel resultLabel = new JLabel("Result: ");

        //set the name to components
        usernameLabel.setName("lblName");
        phoneLabel.setName("lblPhone");
        genderLabel.setName("lblGender");
        resultLabel.setName("lblResult");
        
        user.setName("username");
        phone.setName("phone");
        genderBox.setName("gender");
        clean.setName("clean");
        accept.setName("ok");
        
        result.setLineWrap(true);
        result.setWrapStyleWord(true);
        result.setEnabled(false);

        panel.setName("Form");
        panel.add(usernameLabel);
        panel.add(user);
        panel.add(phoneLabel);
        panel.add(phone);
        panel.add(genderLabel);
        panel.add(genderBox);
        panel.add(resultLabel);
        panel.add(result);
        panel.add(clean);
        panel.add(accept);
        add(panel);
        setVisible(true);
    }

    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }

    public static void main(String[] args) {
        Practicaswing.setLookAndFeel();
        Practicaswing val = new Practicaswing();
    }

}
