import java.util.*;

class ArrayRunDemo
{
public static void main(String a[])
{

Scanner sc=new Scanner(System.in);

for(int i=0;i<5;i++)
{
System.out.println("enter the number");

a[i]=sc.nextInt();
}
System.out.println("Display array");

for(int i=0;i<5;i++)
{
System.out.println(a[i]);
}

}


}
