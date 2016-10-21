class fruite
{
  fruite()
  {
  System.out.println("base class");
  }
  void fruite_juice()
 {
  System.out.println("this isfruite juice");
 }
}

class mango extends fruite
{
  mango()
  {
 System.out.println("derived class");
  }
  void mango_juice()
  {
   System.out.println("this is mango juice");
  }
}

class milkshake extends mango
{
 milkshake()
{
 System.out.println("third class");
}

  void milkjuice()
  {
  System.out.println("this is mango shake");
  }
  public static void main(String args[])
  {
   milkshake m=new milkshake();
   m.fruite_juice();
  m.mango_juice();
  m.milkjuice();
}
}