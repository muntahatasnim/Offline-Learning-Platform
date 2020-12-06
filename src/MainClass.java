import java.util.StringTokenizer;

public class MainClass {

  public static void main(String args[]) {
    String in = "a=a;" + "a=a";

    StringTokenizer st = new StringTokenizer(in, "=;");
    while (st.hasMoreTokens()) {
      String key = st.nextToken();
      String val = st.nextToken();
      if(key.equals(val))
            System.out.println("hehe");
      System.out.println(key + "\t" + val);
    }
  }
}