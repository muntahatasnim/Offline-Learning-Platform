import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;

public class Filewrite_armstrong {

    Filewrite_armstrong() {
        JFrame frame=new JFrame("Enter user name");
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(1500,1500);

        JLabel Label = new JLabel(new ImageIcon("C:\\Users\\Muntaha\\IdeaProjects\\PROJECT(OOP JAVA)Final Version\\src\\Green.jpg"));
        frame.setContentPane(Label);



        JTextField username=new JTextField();
        username.setBounds(300,200,300,100);
        username.setFont(new Font("Comic Sans MS", Font.BOLD, 27));
        frame.add(username);

        JLabel name=new JLabel("Enter your name:");
        name.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
        name.setBounds(300,300,300,100);
        name.setForeground(Color.WHITE);
        frame.add(name);


        JButton press=new  JButton ("OK");
        press.setBackground(Color.BLACK);
        press.setForeground(Color.WHITE);
        press.setFont(new Font("Comic Sans MS", Font.BOLD, 27));
        press.setBounds(400,410,100,100);
        frame.add(press);

        //frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //press.addActionListener(new ButtonListenerfile());
        press.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ev) {
                try{
                    String filename=username.getText()+"armstrong";

                    //File file=new File(filename);


                    new Quiz_armstrong(filename);
                    //fw.write("Welcome to javaTpoint.");
                    //fw.close();

                }catch(Exception e){System.out.println(e);}
            }
        });
    }
}