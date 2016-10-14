
import java.util.*;


class Avg
{

int roll;
String name;
float m;
Scanner sc=new Scanner(System.in);

void acc()
{
System.out.println("enter the roll_no");
roll=sc.nextInt();

System.out.println("enter the name");
name=sc.nextLine();
name=sc.nextLine();

System.out.println("enter the marks");
m=sc.nextFloat();
}

void dis()
{

System.out.println("Roll no is"+roll+"\n name is"+name+"\n marks is"+m);

}
public static void main(String args[])
{
Avg a=new Avg();
a.acc();
a.dis();

}
}
