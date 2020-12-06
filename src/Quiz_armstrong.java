import java.awt.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Quiz_armstrong extends JFrame implements ActionListener {
    JPanel panel;
    JPanel panelresult;
    JRadioButton choice1;
    JRadioButton choice2;
    JRadioButton choice3;
    JRadioButton choice4;
    ButtonGroup bg;
    JLabel lblmess;
    JButton btnext;
    String[][] qpa;
    String[][] qca;
    int qaid;
    HashMap<Integer, String> map;
    String name;

    Quiz_armstrong(String str) {
        name = str;

        initializedata();

        setTitle("Quiz Program");
        setSize(1500, 1500);
        setLocation(0, 0);
        setResizable(false);


        Container cont = getContentPane();
        cont.setLayout(null);
        cont.setBackground(Color.GRAY);



        choice1 = new JRadioButton("Choice1", false);
        choice1.setFont(new Font("Comic Sans Ms",Font.BOLD,30));
        choice1.setBackground(Color.yellow);
        choice2 = new JRadioButton("Choice2", false);
        choice2.setFont(new Font("Comic Sans Ms",Font.BOLD,30));
        choice2.setBackground(Color.yellow);
        choice3 = new JRadioButton("Choice3", false);
        choice3.setFont(new Font("Comic Sans Ms",Font.BOLD,30));
        choice3.setBackground(Color.yellow);
        choice4 = new JRadioButton("Choice4", false);
        choice4.setFont(new Font("Comic Sans Ms",Font.BOLD,30));
        choice4.setBackground(Color.yellow);
        bg = new ButtonGroup();
        bg.add(choice1);
        bg.add(choice2);
        bg.add(choice3);
        bg.add(choice4);



        lblmess = new JLabel("Choose a correct anwswer");
        lblmess.setForeground(Color.BLUE);
        lblmess.setFont(new Font("Comic Sans MS", Font.BOLD, 30));



        btnext = new JButton("Next");
        btnext.setBackground(Color.MAGENTA);
        btnext.setForeground(Color.BLUE);
        btnext.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        btnext.addActionListener(this);



        panel = new JPanel();
        panel.setBackground(Color.pink);
        panel.setLocation(10, 10);
        panel.setSize(1500, 700);
        panel.setLayout(new GridLayout(6, 10));
        panel.add(lblmess);
        panel.add(choice1);
        panel.add(choice2);
        panel.add(choice3);
        panel.add(choice4);
        panel.add(btnext);



        cont.add(panel);

        setVisible(true);

        qaid = 0;
        readqa(qaid);

    }

    public void actionPerformed(ActionEvent e) {

        if (btnext.getText().equals("Next")) {
            if (qaid < 3) {

                map.put(qaid, getSelection());
                qaid++;
                readqa(qaid);
            } else {
                map.put(qaid, getSelection());
                btnext.setText("Show answers");

            }
        } else if (btnext.getText().equals("Show answers"))
            new report();


    }


    public void initializedata() {

        //qpa stores pairs of question and its possible answers
        qpa = new String[5][5];

        qpa[0][0] = "Which of the following is an Armstrong Number?";
        qpa[0][1] = "311";
        qpa[0][2] = "371";
        qpa[0][3] = "103";
        qpa[0][4] = "12";

        qpa[1][0] = "Is 1643 an armstrong number?";
        qpa[1][1] = "Yes.";
        qpa[1][2] = "No.";


        qpa[2][0] = "Which sequence is an armstrong number between 1 to 1000";
        qpa[2][1] = "2,34 ,67,153,370";
        qpa[2][2] = "0, 1, 153, 370, 371, 407 ";
        qpa[2][3] = "3,45,82,98,123,676";
        qpa[2][4] = "None";

        qpa[3][0] = "Which is an armstrong number?";
        qpa[3][1] = "12345";
        qpa[3][2] = "24454";
        qpa[3][3] = "54748";
        qpa[3][4] = "18321";


        //qca stores pairs of question and its correct answer
        qca = new String[13][2];

        qca[0][0] = "Which of the following is an Armstrong Number?";
        qca[0][1] = "371";

        qca[1][0] = "Is 1643 an armstrong number?";
        qca[1][1] = "No.";

        qca[2][0] = "Which sequence is an armstrong number between 1 to 1000?";
        qca[2][1] = "0, 1, 153, 370, 371, 407 ";

        qca[3][0] = "Which is an armstrong number?";
        qca[3][1] = "54748";


        //create a map object to store pairs of question and selected answer
        map = new HashMap<Integer, String>();

    }

    public String getSelection() {
        String selectedChoice = null;
        Enumeration<AbstractButton> buttons = bg.getElements();
        while (buttons.hasMoreElements()) {
            JRadioButton temp = (JRadioButton) buttons.nextElement();
            if (temp.isSelected()) {
                selectedChoice = temp.getText();
            }
        }
        return (selectedChoice);
    }


    public void readqa(int qid) {
        lblmess.setText("  " + qpa[qid][0]);
        choice1.setText(qpa[qid][1]);
        choice2.setText(qpa[qid][2]);
        choice3.setText(qpa[qid][3]);
        choice4.setText(qpa[qid][4]);
        choice1.setSelected(true);
    }

    public void reset() {
        qaid = 0;
        map.clear();
        readqa(qaid);
        btnext.setText("Next");
    }

    public int calCorrectAnswer() {
        int qnum = 4;
        int count = 0;
        for (int qid = 0; qid < qnum; qid++)
            if (qca[qid][1].equals(map.get(qid))) count++;
        return count;
    }

    class report {
        report() {
            JFrame frame = new JFrame("Answers");
            // JLabel Label = new JLabel(new ImageIcon("C:\\Users\\Muntaha\\IdeaProjects\\Java Final Assignment\\src\\Output.jpg"));
            //frame.setContentPane(Label);
            frame.setSize(1550, 800);
            frame.getContentPane().setBackground(Color.GREEN);
            frame.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    dispose();
                    reset();
                }
            });
            Draw d = new Draw();
            frame.add(d);

            frame.setVisible(true);
        }


        class Draw extends Canvas {
            public void paint(Graphics g) {
                File file = new File(name);
                FileWriter fw = null;
                try {
                    fw = new FileWriter(file);
                } catch (IOException ex) {
                    Logger.getLogger(Quiz_armstrong.class.getName()).log(Level.SEVERE, null, ex);
                }
                int qnum = 4;
                int x = 50;
                int y = 50;
                String line = null;
                for (int i = 0; i < qnum; i++) {
                    //print the 1st column

                    g.setFont(new Font("Comic Sans MS", Font.BOLD, 27));
                    g.drawString(i + 1 + ". " + qca[i][0], x, y);
                    line = " " + qca[i][0];
                    try {
                        fw.write(line + System.getProperty("line.separator"));
                        fw.write(System.getProperty("line.separator"));
                    } catch (Exception e) {

                    }

                    y += 30;
                    g.setFont(new Font("Comic Sans MS", Font.BOLD, 27));
                    g.drawString("      Correct answer:" + qca[i][1], x, y);
                    line = " " + qca[i][1];
                    try {
                        fw.write(line + System.getProperty("line.separator"));
                        fw.write(System.getProperty("line.separator"));
                    } catch (Exception e) {

                    }
                    y += 30;
                    g.drawString("      Your answer:" + map.get(i), x, y);
                    line = " " + map.get(i);
                    try {
                        fw.write(line + System.getProperty("line.separator"));
                        fw.write(System.getProperty("line.separator"));
                    } catch (Exception e) {

                    }
                    y += 30;
                    //print the 2nd column
                    if (y > 800) {
                        y = 20;
                        x = 850;
                    }

                }


                //Show number of correct answers
                int numc = calCorrectAnswer();
                g.setColor(Color.BLACK);
                g.setFont(new Font("Comic Sans MS", Font.BOLD, 27));
                g.drawString("Number of correct answers:" + numc, 100, 500);
                String k = "  " + "Number of correct answers:" + numc + '\n';
                try {
                    fw.write(k + System.getProperty("line.separator"));
                    fw.close();
                } catch (Exception e) {

                }


            }
        }

    }


}