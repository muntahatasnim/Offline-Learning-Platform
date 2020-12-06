import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TakeInput {
    int In;

    public TakeInput() {
        JFrame frame = new JFrame("Take Input");
        //frame.getContentPane().setBackground(Color.GRAY);
        frame.setSize(1500, 1500);
        frame.setLayout(null);
        frame.setVisible(true);



        JLabel Label = new JLabel(new ImageIcon("C:\\Users\\Muntaha\\IdeaProjects\\PROJECT(OOP JAVA)Final Version\\src\\Input.jpg"));
        frame.setContentPane(Label);
        Label.setSize(1500, 1500);
        JLabel label = new JLabel();
        label.setText("When u are done taking input--Press Enter");
        frame.getContentPane().add(label);
        label.setForeground(Color.YELLOW);
        label.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        label.setBounds(400, 150, 700, 80);
        frame.add(label);


        JTextField textField = new JTextField();
        textField.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        textField.setBounds(450, 50, 500, 60);
        frame.add(textField);
        textField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                String input = textField.getText();
                In = Integer.parseInt(input);
                OutputInFrame ob = new OutputInFrame(In);
                output out = new output();
                out.start();
                try {
                    out.join();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });



        JButton back = new JButton("Back");
        back.setBackground(Color.YELLOW);
        back.setForeground(Color.GREEN);
        back.setFont(new Font("Comic Sans MS",Font.BOLD,30));
        back.setBounds(550,250,200,50);
        back.addActionListener(new ButtonListener());
        frame.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                frame.dispose();
            }
        });

    }
}
