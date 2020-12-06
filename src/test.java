class book{ 
 int pages;
book(int a) {
   pages=a;}
}

class novel extends book{
String name;
novel(int i,String k){
    super(i);
    name=k;}
}

class mystry extends novel{
String writer;
mystry(int i, String j, String k){
    super(i,j);
    writer=k;	}
void show()	{
   System.out.println(name);
   System.out.println(writer);
   System.out.println(super.pages);}
}

public  class test{
 public static void main(String args[]) {
mystry M=new mystry(1200,"abc","xyz");
M.show();}
}

