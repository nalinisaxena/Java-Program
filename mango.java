class fruit
{
  fruit()
{
System.out.println("this is base class cons");
}
 void fruit_juice()
 {
  System.out.println("thisis fruite juice");
  }
}

class mango extends fruit
{
 mango()
 {
 System.out.println("this is dervied class cons");
 }
 void mago_juice()
 {
   System.out.println("this is mango juice");
  }
public static void main(String args[])
 {
   mango m=new mango();
   m.fruit_juice();
   m.mago_juice();
}
}