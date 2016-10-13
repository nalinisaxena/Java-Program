import java.util.*;

class ControlFlowDemo
{
public static void main(String args[])
{
int a,ch;
String op;
char op1;

Scanner sc=new Scanner(System.in);
System.out.println("Enter the int");
a=sc.nextInt();

do
{
System.out.println("1. square");
System.out.println("2. cube");
System.out.println("enter the choice");
ch=sc.nextInt();
switch(ch)
{
case 1: System.out.println("square is"+(a*a));
break;
case 2: System.out.println("cube is"+(a*a*a));
break;
default: System.out.println("Invalid choice");
}
System.out.println("do u want to continue");
op=sc.nextLine();
op=sc.nextLine();
op1=op.charAt(0);
}
while(op1=='y');
}
}
