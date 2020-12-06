
import java.awt.Font;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;


public class special_numbers {

    public special_numbers() {
        //new frame
        JFrame frame = new JFrame("Special Numbers");
        //background image
        JLabel label = new JLabel(new ImageIcon("C:\\Users\\Muntaha\\IdeaProjects\\PROJECT(OOP JAVA)Final Version\\src\\Menu.jpg"));
        label.setSize(2000, 2000);
        frame.setContentPane(label);
        //font style,size
        Font font = new Font("Comic Sans Ms", Font.BOLD, 36);

        //button armstrong
        JButton armstrong = new JButton("Armstrong");
        armstrong.setBackground(Color.CYAN);
        armstrong.setForeground(Color.BLACK);
        armstrong.addActionListener(new ButtonListener());
        frame.add(armstrong);
        armstrong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                new Armstrong();
            }
        });

        //button perfect
        JButton perfect = new JButton("Perfect");
        perfect.setBackground(Color.CYAN);
        perfect.setForeground(Color.BLACK);
        perfect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                // new ShowIntroPerfectNumber();
            }
        });
        perfect.addActionListener(new ButtonListener());
        frame.add(perfect);

        //button rational
        JButton rational = new JButton("Rational");
        rational.setBackground(Color.CYAN);
        rational.setForeground(Color.BLACK);
        rational.addActionListener(new ButtonListener());
        frame.add(rational);

        //button irrational
        JButton irrational = new JButton("Irrational");
        irrational.setBackground(Color.CYAN);
        irrational.setForeground(Color.BLACK);
        irrational.addActionListener(new ButtonListener());
        frame.add(irrational);

        //composite button
        JButton composite = new JButton("Composite");
        composite.setBackground(Color.CYAN);
        composite.setForeground(Color.BLACK);
        composite.addActionListener(new ButtonListener());
        composite.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                // new ShowIntroComposite();
            }
        });
        frame.add(composite);


        //button real
        JButton real = new JButton("Real");
        real.setBackground(Color.CYAN);
        real.setForeground(Color.BLACK);
        real.addActionListener(new ButtonListener());
        frame.add(real);


        //button complex
        JButton complex = new JButton("Complex");
        complex.setBackground(Color.CYAN);
        complex.setForeground(Color.BLACK);
        complex.addActionListener(new ButtonListener());
        complex.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                //  new ShowIntroComplex();
            }
        });
        frame.add(complex);

        //button golden ratio
        JButton goldenratio = new JButton("Golden Ratio");
        goldenratio.setBackground(Color.CYAN);
        goldenratio.setForeground(Color.BLACK);
        goldenratio.addActionListener(new ButtonListener());
        frame.add(goldenratio);


        //button palindrome
        JButton palindrome = new JButton("Palindrome");
        palindrome.setBackground(Color.CYAN);
        palindrome.setForeground(Color.BLACK);
        frame.add(palindrome);
       palindrome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                  new PalindromeNumber();
            }
        });


        //button strong
        JButton strong = new JButton("Strong");
        strong.setBackground(Color.CYAN);
        strong.setForeground(Color.BLACK);
        strong.addActionListener(new ButtonListener());
        frame.add(strong);


        //button square
        JButton square = new JButton("Square");
        square.setBackground(Color.CYAN);
        square.setForeground(Color.BLACK);
        square.addActionListener(new ButtonListener());
        frame.add(square);


        //button prime
        JButton prime = new JButton("Prime");
        prime.setBackground(Color.CYAN);
        prime.setForeground(Color.BLACK);
        prime.addActionListener(new ButtonListener());
        frame.add(prime);


        //button fibonacchi
        JButton fibonacci = new JButton("Fibonacci");
        fibonacci.setBackground(Color.CYAN);
        fibonacci.setForeground(Color.BLACK);
        fibonacci.addActionListener(new ButtonListener());
        frame.add(fibonacci);


        //amicable
        JButton amicable = new JButton("Amicable");
        amicable.setBackground(Color.CYAN);
        amicable.setForeground(Color.BLACK);
        amicable.addActionListener(new ButtonListener());
        frame.add(amicable);
        amicable.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                //new ShowIntroAmicableNumber();
            }
        });


        //button ideal
        JButton ideal = new JButton("Ideal");
        ideal.setBackground(Color.CYAN);
        ideal.setForeground(Color.BLACK);
        ideal.addActionListener(new ButtonListener());
        frame.add(ideal);

        //button factorial
        JButton factorial = new JButton("Factorial");
        factorial.setBackground(Color.CYAN);
        factorial.setForeground(Color.BLACK);
        factorial.addActionListener(new ButtonListener());
        frame.add(factorial);


        //button quiz
        JButton quiz = new JButton("Quiz");
        quiz.setBackground(Color.CYAN);
        quiz.setForeground(Color.BLACK);
        quiz.addActionListener(new ButtonListener());
        quiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                // new Quiznumbers();
            }
        });
        frame.add(quiz);


        //button save files
        JButton save = new JButton("Save Files");
        save.setBackground(Color.CYAN);
        save.setForeground(Color.BLACK);
        save.addActionListener(new ButtonListener());
        frame.add(save);


        //button view files
        JButton view = new JButton("View Files");
        view.setBackground(Color.CYAN);
        view.setForeground(Color.BLACK);
        view.addActionListener(new ButtonListener());
        frame.add(view);


        //button back
        JButton back = new JButton("Back");
        back.setBackground(Color.CYAN);
        back.setForeground(Color.BLACK);
        back.addActionListener(new ButtonListener());
        frame.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                frame.dispose();
            }
        });


        //1st column
        armstrong.setBounds(10, 200, 300, 50);
        perfect.setBounds(10, 250, 300, 50);
        rational.setBounds(10, 300, 300, 50);
        irrational.setBounds(10, 350, 300, 50);
        composite.setBounds(10, 400, 300, 50);
        frame.add(armstrong);
        frame.add(perfect);
        frame.add(rational);
        frame.add(irrational);
        frame.add(composite);
        armstrong.setFont(font);
        perfect.setFont(font);
        rational.setFont(font);
        irrational.setFont(font);
        composite.setFont(font);


        //2nd Column
        real.setBounds(320, 200, 300, 50);
        complex.setBounds(320, 250, 300, 50);
        goldenratio.setBounds(320, 300, 300, 50);
        strong.setBounds(320, 350, 300, 50);
        palindrome.setBounds(320, 400, 300, 50);
        frame.add(real);
        frame.add(complex);
        frame.add(goldenratio);
        frame.add(strong);
        frame.add(palindrome);
        real.setFont(font);
        complex.setFont(font);
        strong.setFont(font);
        palindrome.setFont(font);
        goldenratio.setFont(font);

        //3rd column
        square.setBounds(630, 200, 300, 50);
        prime.setBounds(630, 250, 300, 50);
        fibonacci.setBounds(630, 300, 300, 50);
        amicable.setBounds(630, 350, 300, 50);
        ideal.setBounds(630, 400, 300, 50);
        frame.add(square);
        frame.add(prime);
        frame.add(fibonacci);
        frame.add(amicable);
        frame.add(ideal);
        square.setFont(font);
        prime.setFont(font);
        fibonacci.setFont(font);
        amicable.setFont(font);
        ideal.setFont(font);

        //4th column
        factorial.setBounds(940, 200, 300, 50);
        quiz.setBounds(940, 250, 300, 50);
        save.setBounds(940, 300, 300, 50);
        view.setBounds(940, 350, 300, 50);
        back.setBounds(940, 400, 300, 50);
        frame.add(factorial);
        frame.add(quiz);
        frame.add(save);
        frame.add(view);
        frame.add(back);
        factorial.setFont(font);
        quiz.setFont(font);
        save.setFont(font);
        view.setFont(font);
        back.setFont(font);


        //frame size,layout,make_visible
        frame.setSize(1300, 1500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}