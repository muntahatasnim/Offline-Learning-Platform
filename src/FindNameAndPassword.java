import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.xml.ws.BindingProvider;

public class FindNameAndPassword {

    public static boolean check(String username, String password) {

        BufferedReader reader;
        boolean flag = false;
        try {
            reader = new BufferedReader(new FileReader("D:\\PROJECT(OOP JAVA)Final Version\\User name and Pass Data\\UsernameAndPass.txt"));
            String line = reader.readLine();
            while (line != null) {

                StringTokenizer st = new StringTokenizer(line, " ");
                int countMatch = 0;
                if (st.nextToken().equals(username)) {
                    countMatch++;
                }
                if (st.nextToken().equals(password)) {
                    countMatch++;
                }
                if (countMatch == 2) {
                    flag = true;
                    break;
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return flag;
    }
}
