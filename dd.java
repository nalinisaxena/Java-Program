class dd
  {
   public static void main(String args[])
  { 
   int arr[]=new int[5];
   for(int i=0;i<args.length;i++)
  {
   arr[i]=Integer.parseInt(args[i]);
  }
   for(int i=0;i<args.length;i++)
  {
   System.out.println("array element is:"+arr[i]);


}
}
}