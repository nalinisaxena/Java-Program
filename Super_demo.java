class Supervar
{
 int speed=50;
}

 class Super_demo extends Supervar
 {
  int speed=100;
    void display()
    {
     System.out.println(super.speed);
     System.out.println(speed);
    }
     public static void main(String args[])
    {
     Super_demo sd=new Super_demo();
     sd.display();
    }
  }

  
