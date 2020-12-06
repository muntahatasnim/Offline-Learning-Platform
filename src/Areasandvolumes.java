import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ButtonListener2 implements ActionListener {

    ButtonListener2() {
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Armstrong Number")) {
            System.out.println("Armstrong Number has been clicked");
        }
        if (e.getActionCommand().equals("Perfect Number")) {
            System.out.println("Perfect Number has been clicked");
        }
        if (e.getActionCommand().equals("Rational")) {
            System.out.println("Rational has been clicked");
        }
        if (e.getActionCommand().equals("Irrational")) {
            System.out.println("Irrational has been clicked");
        }
        if (e.getActionCommand().equals("Composite")) {
            System.out.println("Composite has been clicked");
        }
        if (e.getActionCommand().equals("Real")) {
            System.out.println("Real has been clicked");
        }
        if (e.getActionCommand().equals("Complex")) {
            System.out.println("Composite has been clicked");
        }
        if (e.getActionCommand().equals("Golden Ratio")) {
            System.out.println("Golden Ratio has been clicked");
        }
        if (e.getActionCommand().equals("Strong")) {
            System.out.println("Strong has been clicked");
        }
        if (e.getActionCommand().equals("Palindrome")) {
            System.out.println("Palindrome has been clicked");
        }
        if (e.getActionCommand().equals("Square")) {
            System.out.println("Square has been clicked");
        }
        if (e.getActionCommand().equals("Prime")) {
            System.out.println("Prime has been clicked");
        }
        if (e.getActionCommand().equals("Fibonacci")) {
            System.out.println("Fibonacci has been clicked");
        }
        if (e.getActionCommand().equals("Amicable")) {
            System.out.println("Amicable has been clicked");
        }
        if (e.getActionCommand().equals("Ideal")) {
            System.out.println("Ideal has been clicked");
        }
        if (e.getActionCommand().equals("Factorial")) {
            System.out.println("Factorial has been clicked");
        }
        if (e.getActionCommand().equals("Quiz")) {
            System.out.println("Quiz has been clicked");
        }
        if (e.getActionCommand().equals("Save Files")) {
            System.out.println("Save Files has been clicked");
        }
        if (e.getActionCommand().equals("View Files")) {
            System.out.println("View Files has been clicked");
        }

    }
}

public class Areasandvolumes {

    public Areasandvolumes() {
        JFrame m = new JFrame("Areas And Volumes");
        Font f = new Font("Comic Sans Ms", Font.BOLD, 36);
        JButton circlearea = new JButton("Circle Area");
        circlearea.addActionListener(new ButtonListener2());
        m.add(circlearea);
        JButton areaofsphere = new JButton("Sphere Area");
        areaofsphere.addActionListener(new ButtonListener2());
        m.add(areaofsphere);
        JButton volumeofsphere = new JButton("Sphere Volume");
        volumeofsphere.addActionListener(new ButtonListener2());
        m.add(volumeofsphere);
        JButton areaofsemicircle = new JButton("Semicircle Area");
        areaofsemicircle.addActionListener(new ButtonListener2());
        m.add(areaofsemicircle);
        JButton square = new JButton("Square Area");
        square.addActionListener(new ButtonListener2());
        m.add(square);
        JButton rectangle = new JButton("Rectangle Area");
        rectangle.addActionListener(new ButtonListener2());
        m.add(rectangle);
        JButton diagonalofsquare = new JButton("Square Diagonal");
        diagonalofsquare.addActionListener(new ButtonListener2());
        m.add(diagonalofsquare);
        JButton rightangledtriangle = new JButton("Right angled triangle Area");
        rightangledtriangle.addActionListener(new ButtonListener2());
        m.add(rightangledtriangle);
        JButton isoscelestriangle = new JButton("Isosceles triangle Area");
        isoscelestriangle.addActionListener(new ButtonListener2());
        m.add(isoscelestriangle);
        JButton triangle = new JButton("Triangle Area");
        triangle.addActionListener(new ButtonListener2());
        m.add(triangle);
        JButton equilateraltriangle = new JButton("Equialteral triangle Area");
        equilateraltriangle.addActionListener(new ButtonListener2());
        m.add(equilateraltriangle);
        JButton rhombus = new JButton("Rhombus Area");
        rhombus.addActionListener(new ButtonListener2());
        m.add(rhombus);
        JButton parallelogram = new JButton("Parallelogram Area");
        parallelogram.addActionListener(new ButtonListener2());
        m.add(parallelogram);
        JButton quadilateral = new JButton("Quadilateral Area");
        quadilateral.addActionListener(new ButtonListener2());
        m.add(quadilateral);
        JButton parallelpiped = new JButton("Parallelpiped Area");
        parallelpiped.addActionListener(new ButtonListener2());
        m.add(parallelpiped);
        JButton hyperbola = new JButton("Hyperbola");
        hyperbola.addActionListener(new ButtonListener2());
        m.add(hyperbola);
        JButton ellipse = new JButton("Ellipse");
        ellipse.addActionListener(new ButtonListener());
        m.add(ellipse);
        JButton parabola = new JButton("Parabola");
        parabola.addActionListener(new ButtonListener2());
        m.add(parabola);
        JButton areaofrightcircularcone = new JButton("Right circular cone Area");
        areaofrightcircularcone.addActionListener(new ButtonListener2());
        m.add(areaofrightcircularcone);
        JButton volumeofrightcircularcone = new JButton("Right circular cone Volume");
        volumeofrightcircularcone.addActionListener(new ButtonListener2());
        m.add(volumeofrightcircularcone);
        JButton volumeofrightcircularcylinder = new JButton("Cylinder Volume");
        volumeofrightcircularcylinder.addActionListener(new ButtonListener2());
        m.add(volumeofrightcircularcylinder);
        JButton areaofrightcircularcylinder = new JButton("Cylinder Area");
        areaofrightcircularcylinder.addActionListener(new ButtonListener2());
        m.add(areaofrightcircularcylinder);
        JButton quiz = new JButton("Quiz");
        quiz.addActionListener(new ButtonListener2());
        m.add(quiz);

        JButton save = new JButton("Save Files");
        save.addActionListener(new ButtonListener());
        m.add(save);
        JButton view = new JButton("View Files");
        view.addActionListener(new ButtonListener());
        m.add(view);
        circlearea.setBounds(10, 200, 400, 100);
        areaofsphere.setBounds(10, 330, 400, 100);
        volumeofsphere.setBounds(10, 460, 400, 100);
        areaofsemicircle.setBounds(10, 590, 400, 100);
        ellipse.setBounds(10, 720, 400, 100);
        rightangledtriangle.setBounds(10, 850, 400, 100);
        areaofrightcircularcylinder.setBounds(400, 720, 500, 100);
        volumeofrightcircularcylinder.setBounds(400, 200, 500, 100);
        volumeofrightcircularcone.setBounds(400, 330, 500, 100);
        areaofrightcircularcone.setBounds(400, 460, 500, 100);
        parabola.setBounds(400, 590, 500, 100);
        rhombus.setBounds(400, 850, 500, 100);
        square.setBounds(900, 200, 500, 100);
        hyperbola.setBounds(900, 330, 500, 100);
        parallelpiped.setBounds(900, 460, 500, 100);
        quadilateral.setBounds(900, 590, 500, 100);
        parallelogram.setBounds(900, 720, 500, 100);
        equilateraltriangle.setBounds(1400, 200, 500, 100);
        isoscelestriangle.setBounds(1400, 330, 500, 100);
        triangle.setBounds(1400, 460, 500, 100);
        diagonalofsquare.setBounds(1400, 590, 500, 100);
        rectangle.setBounds(1400, 720, 500, 100);
        quiz.setBounds(1400, 850, 500, 100);
        save.setBounds(1400, 1020, 500, 100);
        view.setBounds(1400, 1150, 500, 100);
        circlearea.setFont(f);
        areaofsphere.setFont(f);
        volumeofsphere.setFont(f);
        areaofsemicircle.setFont(f);
        areaofrightcircularcylinder.setFont(f);
        volumeofrightcircularcylinder.setFont(f);
        volumeofrightcircularcone.setFont(f);
        areaofrightcircularcone.setFont(f);
        parabola.setFont(f);
        ellipse.setFont(f);
        square.setFont(f);
        hyperbola.setFont(f);
        parallelpiped.setFont(f);
        quadilateral.setFont(f);
        parallelogram.setFont(f);
        equilateraltriangle.setFont(f);
        isoscelestriangle.setFont(f);
        triangle.setFont(f);
        diagonalofsquare.setFont(f);
        rectangle.setFont(f);
        quiz.setFont(f);
        save.setFont(f);
        view.setFont(f);
        rhombus.setFont(f);
        rightangledtriangle.setFont(f);
        m.add(circlearea);
        m.add(areaofsphere);
        m.add(volumeofsphere);
        m.add(volumeofsphere);
        m.add(areaofsemicircle);
        m.add(areaofrightcircularcylinder);
        m.add(volumeofrightcircularcylinder);
        m.add(volumeofrightcircularcone);
        m.add(areaofrightcircularcone);
        m.add(parabola);
        m.add(ellipse);
        m.add(square);
        m.add(hyperbola);
        m.add(parallelpiped);
        m.add(quadilateral);
        m.add(parallelogram);
        m.add(equilateraltriangle);
        m.add(isoscelestriangle);
        m.add(triangle);
        m.add(diagonalofsquare);
        m.add(rectangle);
        m.add(quiz);
        m.add(save);
        m.add(view);

        m.setSize(2, 200);
        m.setLayout(null);
        m.setVisible(true);
    }
}