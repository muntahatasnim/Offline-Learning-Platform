
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ButtonListener implements ActionListener {

    ButtonListener() {
    }

    public void actionPerformed(ActionEvent e) {

    }
}

public class Menu {

    public Menu() {
       JFrame m = new JFrame("Menu");
        JLabel label = new JLabel(new ImageIcon("C:\\Users\\Muntaha\\IdeaProjects\\PROJECT(OOP JAVA)Final Version\\src\\Menu.jpg"));
        label.setSize(1900, 1400);
        m.setContentPane(label);
        Font f = new Font("Comic Sans Ms", Font.BOLD, 36);
        JButton Numbers = new JButton("Special Numbers");
        Numbers.addActionListener(new ButtonListener());
        Numbers.setBackground(Color.CYAN);
        Numbers.setForeground(Color.BLACK);
        Numbers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                new special_numbers();
                System.out.println(Numbers.getActionCommand());
            }
        });

        JButton AreasandVolumes = new JButton("Areas And Volumes");

        AreasandVolumes.addActionListener(new ButtonListener());
        AreasandVolumes.setBackground(Color.CYAN);
        AreasandVolumes.setForeground(Color.black);
        m.add(AreasandVolumes);
        AreasandVolumes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                new Areasandvolumes();
            }
        });

        JButton BasicDataStructure = new JButton("Basic Data Structure");
        BasicDataStructure.addActionListener(new ButtonListener());
        BasicDataStructure.setBackground(Color.CYAN);
        BasicDataStructure.setForeground(Color.BLACK);
        m.add(BasicDataStructure);
        JButton MathematicalOperations = new JButton("Number Theory");
        MathematicalOperations.addActionListener(new ButtonListener());
        MathematicalOperations.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                //new NumberTheory();
            }
        });
        MathematicalOperations.setBackground(Color.CYAN);
        MathematicalOperations.setForeground(Color.BLACK);
        m.add(MathematicalOperations);
        JButton Series = new JButton("Series");
        Series.addActionListener(new ButtonListener());
        Series.setBackground(Color.CYAN);
        Series.setForeground(Color.BLACK);
        m.add(Series);
        Numbers.setFont(f);
        AreasandVolumes.setFont(f);
        BasicDataStructure.setFont(f);
        MathematicalOperations.setFont(f);
        Series.setFont(f);
        Numbers.setBounds(400, 150, 500, 100);
        AreasandVolumes.setBounds(400, 250, 500, 100);
        BasicDataStructure.setBounds(400, 350, 500, 100);
        MathematicalOperations.setBounds(400, 450, 500, 100);
        Series.setBounds(400, 550, 500, 100);
        m.add(Numbers);
        m.add(AreasandVolumes);
        m.add(BasicDataStructure);
        m.add(MathematicalOperations);
        m.add(Series);
        m.setSize(2000, 2000);
        m.setLayout(null);
        m.setVisible(true);
    }
}
