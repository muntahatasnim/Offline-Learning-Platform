import javax.swing.*;
import java.awt.*;
import java.io.PrintStream;


class palindromeNumber extends Thread{  
    int num,temp; 
    public palindromeNumber(int num)
    {
        this.num=num;
       
    }
 public void run(){
  int result,sum=0;    
      temp=num;
  while(num>0){    
   result=num%10;  //getting remainder  
   sum=(sum*10)+result;    
   num=num/10;    
  }    
  if(temp==sum)    
   System.out.println("This is an Palindrome number ");    
  else    
   System.out.println("This is not an Palindrome Number");  
     System.out.println("Process finished with exit code 0.");  
}  
}



public class PalindromeOutput_inFrame extends JPanel {
    armstrongnumber ob;
    public static int num;
    private JTextArea textArea = new JTextArea(15, 30);
    private Palindrome_OutputStream taOutputStream =new Palindrome_OutputStream (textArea, "Output");

    public PalindromeOutput_inFrame() {
    }

    public PalindromeOutput_inFrame(int num) {
        this.num = num;
        setLayout(new BorderLayout());
        add(new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER));
        System.setOut(new PrintStream(taOutputStream));
      palindromeNumber ob = new palindromeNumber(num);
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
        frame.getContentPane().add(new PalindromeOutput_inFrame(num));
        frame.pack();
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void addthread() {
        createAndShowGui();
    }
}



