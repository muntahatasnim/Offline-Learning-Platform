public class Drip extends Thread
{
    public static void main(String[] args) {
   Thread t1=new Thread(new Drip());
   t1.start();
   t1.join();
   for(int i=0;i<1000;i++)
   {
       System.out.println(Thread.currentThread().getName()+"");
   }
   

public void run()
 {
     for(int i=0;i<1000;i++)
     {
         System.out.println(Thread.currentThread().getName()+"");
     }
 }
}
}