class A
{
 void display()
 {
  System.out.println("hiiii");
 }
}

 public class Super_method extends A
 {
  void display()
  {
   super.display();
   System.out.println("helloooo");
  }
 public static void main(String args[])
 {
  Super_method  sd=new Super_method();
  sd.display();
 }
}
  
