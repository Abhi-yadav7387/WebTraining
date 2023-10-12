class Demo 
{
   void sum(int a,int b)
   {
   System.out.println("Addition of :"+(a+b));
  }
}
class Demo1 extends Demo
{
   int sum(int c,long d)
   {
   //super.sum(55,34);
   System.out.println("Subtraction of :"+(c-d));
   }
}
class DemoMain
{
    public static void main(String ar[])
    {
     Demo1 d1=new Demo1();
     d1.sum(20,30);
     d1.sum(45.43.00f);
    }
}
 