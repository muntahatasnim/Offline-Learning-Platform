
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login {

    public String username = "", password = "";

    public login() {
        JFrame frame = new JFrame("login");
        frame.setSize(300, 150);
       // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // placeComponents(frame);
        frame.setVisible(true);

        frame.setLayout(null);

        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10, 10, 80, 25);
        frame.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100, 10, 160, 25);
        frame.add(userText);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 40, 80, 25);
        frame.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 40, 160, 25);
        frame.add(passwordText);

        JButton Button = new JButton("");
        Button.setBounds(10, 80, 80, 25);
        frame.add(Button);

        JButton registerButton = new JButton("register");
        registerButton.setBounds(180, 80, 80, 25);
        frame.add(registerButton);

        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                FileWriter fw = null;
                username = userText.getText() + " ";
                password = passwordText.getText();
                try {

                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(username);
                System.out.println(password);
                try {
                    fw = new FileWriter("D:\\PROJECT(OOP JAVA)Final Version\\User name and Pass Data\\UsernameAndPass.txt");
                    //  fw.write("hello");
                    fw.write(username);
                    // fw.close();

                    fw.write(password);
                    fw.write(System.getProperty("line.separator"));
                    //  fw.write("Hello");
                    fw.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //System.out.println(password);
            }
        });
        Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                FindNameAndPassword ob = new FindNameAndPassword();
                ob.check(username, password);
            }
        });
    }
    public static void main(String[] args) {
        new login();
    }
}
