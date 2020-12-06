 import java.io.*;
 import java.awt.*;
 import java.util.*;
 import javax.swing.*;
 import java.awt.event.*;
 import javax.swing.table.*;

   public class stack extends AbstractTableModel {
    Vector data;
    Vector columns;
    public stack() {
String line;
data = new Vector();
columns = new Vector();
int count = 0;
try {
    FileInputStream fis = new FileInputStream("C:\\Users\\Muntaha\\IdeaProjects\\PROJECT(OOP JAVA)Final Version\\src\\Score.txt");
    BufferedReader br = new BufferedReader(new InputStreamReader(fis));
    StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
    while (st1.hasMoreTokens()) {
    columns.addElement(st1.nextToken());
    count++;
    }
    while ((line = br.readLine()) != null) {
    StringTokenizer st2 = new StringTokenizer(line, " ");
    for (int i = 0; i < count; i++) {
        if (st2.hasMoreTokens())
        data.addElement(st2.nextToken());
        else
        data.addElement("");
    }
    }
    br.close();
} catch (Exception e) {
    e.printStackTrace();
}
}
    public int getRowCount() {
            return data.size() / getColumnCount();
    }

    public int getColumnCount() {
            return columns.size();
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
            return (String) data.elementAt((rowIndex * getColumnCount())
                            + columnIndex);
    }

     public String getColumnName(int i){
         return (String)columns.get(i);
              }


      public static void main(String s[]) {
            stack model = new stack();
            JTable table = new JTable();
            table.setModel(model);
           JScrollPane scrollpane = new JScrollPane(table);
            JPanel panel = new JPanel();
            panel.add(scrollpane);
            JFrame frame = new JFrame();
            frame.add(panel, "Center");
            frame.pack();
            frame.setVisible(true);
         }
      }