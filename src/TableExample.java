import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.*;    
public class TableExample {    
    JFrame f;    
    TableExample() throws FileNotFoundException, IOException{    
    f=new JFrame();    
    String data[][]=new String[100][100];
    String column[]=new String[100];
    FileReader fw=new FileReader("C:\\Users\\Muntaha\\IdeaProjects\\PROJECT(OOP JAVA)Final Version\\src\\Score.txt");
    BufferedReader br=new BufferedReader(fw);
    String line=br.readLine();
        System.out.println(line);
    int i=0;
    while(line !=null)
    {
        StringTokenizer token=new StringTokenizer(line," ");
        String s1,s2;
        while(token.hasMoreTokens()){
        s1=token.nextToken();
            System.out.println(s1);
        s2=token.nextToken();
            System.out.println(s2);
        data[i++][]=token.nextToken();
    line=br.readLine();
        }
        
    }
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,40,300,300);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(600,400);    
    f.setVisible(true);    
}     
public static void main(String[] args) throws FileNotFoundException, IOException {    

    new TableExample();    
}    
}  