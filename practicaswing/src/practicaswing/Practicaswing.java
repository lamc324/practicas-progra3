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
    
    String[]  generos = {"Masculino", "Femenino"};
    JComboBox generoBox = new JComboBox(generos);

    public Practicaswing() {
        super("Validar Usuario");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        JLabel usernameLabel = new JLabel("Usuario:   ");
        JLabel phoneLabel = new JLabel("Telefono: ");

        //set the name to components
        usernameLabel.setName("lblUsername");
        phoneLabel.setName("lblPhone");
        user.setName("username");
        phone.setName("phone");
        clean.setName("limpiar");
        accept.setName("aceptar");

        panel.setName("Form");
        panel.add(usernameLabel);
        panel.add(user);
        panel.add(phoneLabel);
        panel.add(phone);
        panel.add(generoBox);
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
