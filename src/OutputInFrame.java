import javax.swing.*;
import java.awt.*;
import java.io.PrintStream;


class armstrongnumber extends Thread {
    int num;
    int copy;
    int total = 0;


    public armstrongnumber(int num) {
        this.num = num;
        copy = num;
    }


    public void run() {
        int temp;
        int digits = (int) (Math.log10(num) + 1);
        while (num != 0) {
            temp = num % 10;
            total = (int) (total + Math.pow(temp, digits));
            num /= 10;
        }
        if (total == copy) {
            System.out.println("Yes This Is an Armstrong Number");

        } else {
            System.out.println("No,This is not an Armstrong Number");
        }
        System.out.println("\nProcess finished with exit code 0.");
    }
}


public class OutputInFrame extends JPanel {
    armstrongnumber ob;
    public static int n;
    private JTextArea textArea = new JTextArea(15, 30);
    private GetOutputStream taOutputStream =new GetOutputStream(textArea, "Output");

    public OutputInFrame() {
    }

    public OutputInFrame(int n) {
        this.n = n;
        setLayout(new BorderLayout());
        add(new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER));
        System.setOut(new PrintStream(taOutputStream));
        armstrongnumber ob = new armstrongnumber(n);
        ob.start();
        try {
            ob.join();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    public static void createAndShowGui() {
        JFrame frame = new JFrame("Output");
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new OutputInFrame(n));
        frame.pack();
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void addthread() {
        createAndShowGui();
    }
}



