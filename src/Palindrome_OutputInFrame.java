
import sun.net.www.content.audio.x_aiff;
import java.util.*;
import java.util.Scanner;


class palindrome extends Thread{  
    int n,temp; 
    public palindrome(int n)
    {
        this.n=n;
       
    }
 public void run(){
  int r,sum=0;    
      temp=n;
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("This is an Palindrome number ");    
  else    
   System.out.println("This is not an Palindrome Number");    
}  
}

