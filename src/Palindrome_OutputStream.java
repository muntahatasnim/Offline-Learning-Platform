import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.OutputStream;

public class Palindrome_OutputStream extends OutputStream {

    private final JTextArea textArea;
    private final StringBuilder stringBuilder = new StringBuilder();
    private String title;

    public Palindrome_OutputStream( JTextArea textArea, String title) {
        this.textArea = textArea;
        this.title = title;

    }

    public void flush() {
    }

    public void close() {
    }


    public void write(int b) throws IOException {

        if (b == '\n') {
            final String text = stringBuilder.toString() + "\n";
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    textArea.append(text);
                }
            });
            stringBuilder.setLength(0);
            textArea.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
            textArea.setForeground(Color.BLACK);
            textArea.setBackground(Color.YELLOW);
            return;
        }

        stringBuilder.append((char) b);
    }
}