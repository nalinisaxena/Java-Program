class Cons_Demo
{
int id;
String name;

Cons_Demo(int i,String n)

{
id=i;
name=n;
}

Cons_Demo(Cons_Demo c)
{
id=c.id;
name=c.name;
}
void display()
{
System.out.println(id+" "+name);
}
public static void main(String args[])
{
Cons_Demo cd=new Cons_Demo(1,"nalini");
Cons_Demo cd1=new Cons_Demo(cd);
cd.display();
cd1.display();

}
}
