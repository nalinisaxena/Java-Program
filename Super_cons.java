class demo
{
 demo()
 {
  System.out.println("this is base class");
 }
}

  class Super_cons extends demo
  {
   Super_cons()
   {
    System.out.println("this is derived class");
   }
    public static void main(String args[])
    {
     Super_cons s=new Super_cons();
    }
   }
 
