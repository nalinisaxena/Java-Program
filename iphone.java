class spark
{
spark()
{
System.out.println("first");
}
 void spark_info()
 {
  System.out.println("android technology");
  }
}

class android extends spark
{
 android()
{
System.out.println("android cons");
}

 void android_info()
 {
  System.out.println("latest technology");
  }
}
class iphone extends spark
{
 iphone()
{
System.out.println("iphone cons");
}
 void iphone_info()
 {
 System.out.println("iphone tecnolhgy");
 }
public static void main(String args[])
{
iphone i=new iphone();
i.spark_info();
i.iphone_info();
android a=new android();
a.android_info();
}
}
