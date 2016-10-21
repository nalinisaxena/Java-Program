class addition
{
  void add(int... a)
  {
   int n=a.length;
  
   if(n==0)
   { 
    System.out.println("zero");
   }
   else if(n==1)
   {
    System.out.println(a[0]);
   }
   else
   {
    int sum=0;
    
    for(int i=0;i<n;i++)
    {
     sum+=a[i];
    }
    System.out.println(sum);
   }
 }
}
  class add_var
  {
  public static void main(String args[])
  {
   addition ad=new addition();
   ad.add(new int[0]);
   ad.add(new int[]{10});
   ad.add(new int[]{10,20});
   ad.add(new int[]{10,20,30});
  }
}

