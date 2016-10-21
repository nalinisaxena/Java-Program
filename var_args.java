class var_args
{
 void display(String... values)
 {
  for(String s:values)
  {
   System.out.println(s);
  }
   System.out.println(" ");
 }
 public static void main(String args[])
 {
  var_args vr=new var_args();
  vr.display("nalini","cmumbai");
  vr.display("neha","ajay");
 }
}
  
