import java.io.*;

import java.util.*;

public class filereader

{

public static void main(String args[]) throws Exception

   {

   int tokencount;

   FileReader fr=new FileReader("D:\\PROJECT(OOP JAVA)Final Version\\User name and Pass Data\\UsernameAndPass.txt");

   BufferedReader br=new BufferedReader(fr);

   String s;

   int linecount=0;

   String line;

   String words[]=new String[500];

                                while ((s=br.readLine())!=null)

                                        {

                                        linecount++;

                                        int indexfound=s.indexOf("hello");

                                                                     if (indexfound>-1)

                                                                     {

 System.out.println("\n");

 System.out.println("Word was found at position::" +indexfound+ "::on line"+linecount);

System.out.println("\n");

 line=s;

System.out.println(line);

int idx=0;

StringTokenizer st= new StringTokenizer(line);

tokencount= st.countTokens();

System.out.println("\n");

System.out.println("Number of tokens found" +tokencount); System.out.println("\n");                                             

 for (idx=0;idx<tokencount;idx++)                                                                                                    {

 words[idx]=st.nextToken();

System.out.println(words[idx]);

                                                           }

                                                            }

                                        }

   fr.close();

   }

}