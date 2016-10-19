import java.util.*;

class Avg
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name of student");

String name=sc.nextLine();

System.out.println("enter the marks of three subject");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();

double avg=(a+b+c)/3;

System.out.println(name);
System.out.println("avg marks of " +name+" is "+avg);

}
}