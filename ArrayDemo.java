import java.util.*;

class ArrayDemo
{
public static void main(String args[])
{
int a[]={12,34,56,43,78};
System.out.println("Display array");
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
int max=a[0];
for(int i=1;i<a.length;i++)
{
if(max<a[i])
{
max=a[i];
}
}
System.out.println("Max element is"+max);

int search;
System.out.println("enter the search element" );
Scanner sc=new Scanner(System.in);

search=sc.nextInt();
for(int i=0;i<a.length;i++)
{
if(a[i]==search)
{
System.out.println("position is"+(i+1));
break;

}
}
int sum=0;
for(int i=0;i<a.length;i++)
{
sum=sum+a[i];
}
System.out.println("sum="+sum);
}
}
