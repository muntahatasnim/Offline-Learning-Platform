import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PalindromeNumber {

    public PalindromeNumber() {
        //new frame
        JFrame frame = new JFrame();
        frame.setTitle("Palindrome Number");
        frame.setSize(1500, 1500);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        //textarea to show file elements
        JTextArea txt1 = new JTextArea();
        txt1.setForeground(Color.BLACK);
        txt1.setBackground(Color.LIGHT_GRAY);
        txt1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        frame.add(txt1);


        //take input and check number
        JButton check_number = new JButton("Check A Number");
        check_number.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        check_number.setBackground(Color.black);
        check_number.setBounds(800, 200, 200, 50);
        check_number.setForeground(Color.white);
        txt1.add(check_number);
        check_number.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                new Palindrome_TakeInput();
            }
        });


        //quiz on armstrong number
        JButton quiz = new JButton("Quiz");
        quiz.setBackground(Color.black);
        quiz.setBounds(800, 270, 200, 50);
        quiz.setForeground(Color.white);
        quiz.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        txt1.add(quiz);
        quiz.addActionListener(new ButtonListener());
        quiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {

                new Palidrome_Filewrite();
            }
        });


        //back option
        JButton back = new JButton("Back");
        back.setBounds(800, 340, 200, 50);
        txt1.add(back);
        back.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setFont(new Font("Comic Sans MS", Font.BOLD, 27));
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                frame.dispose();
            }
        });


        //opening calculator
        JButton calculate = new JButton("Open Calculator");
        calculate.setBackground(Color.black);
        calculate.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        calculate.setBounds(800, 410, 200, 50);
        calculate.setForeground(Color.white);
        txt1.add(calculate);
        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                new Calculator();
            }
        });

        //fileread and show on JFrame
        try {
            FileReader reader = new FileReader(new File("D:\\PROJECT(OOP JAVA)Final Version\\src\\Palindrome.txt"));
            BufferedReader bf = new BufferedReader(reader);
            try {
                txt1.read(bf, null);
            } catch (IOException e) {
                System.out.println(e);
            }
            frame.getContentPane().setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
