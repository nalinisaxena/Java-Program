class demo
{
 int id;
 demo()
 {
  System.out.println("this is base class");
 }
 demo(int i)
 {
  id=i;
 }
 void display()
 {
  System.out.println(id);
 }
}

  class Super_cons extends demo
  {
   Super_cons()
   {
    System.out.println("this is derived class");
   }
   

  }

  class Super4 extends Super_cons
   {
    Super4()
    {
     System.out.println("this is third class");
    }
    public static void main(String args[])
    {
     Super4 s=new Super4(20);
     s.display();
    }
   }
