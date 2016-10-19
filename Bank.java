import java.util.*;
 class Bank
 {
  int ab,ia;
  void deposit()
  {
   System.out.println("enter the amount ");
   Scanner sc=new Scanner(System.in);
   int dp=sc.nextInt();
   ab=ab+dp;
   System.out.println("now avilibale balnce is: "+ ab);
  }
public static void main(String args[])
{
 Bank b=new Bank();

b.ab=0;
 System.out.println("enter the initial amount");
 Scanner sc=new Scanner(System.in);
 b.ia=sc.nextInt();
System.out.println("now aviliable balance is:"+b.ia);
b.ab=b.ab+b.ia;
 b.deposit();
}
}