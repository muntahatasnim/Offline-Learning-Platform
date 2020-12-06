
import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderExample {

    public static void main(String args[]) throws Exception {
      FileReader fr = new FileReader("C:\\Users\\Muntaha\\IdeaProjects\\PROJECT(OOP JAVA)Final Version\\Muntaha") ;
       BufferedReader br=new BufferedReader(fr);
       String line=br.readLine();
       while(line!=null)
       {
           l1.addElement(line);
            }
        }
    }
}
