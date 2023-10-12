
class Vehicle
{
   String Model_Name;
   Void display()
   {
    System.out.println("Model Name is :"+Model_Name);
   }


class Buses extends Vehicle
{
  
    String p_no;
    void display()
    {
     super.display();
     System.out.println("Passing No is :"+p_no);
    }
}
class Categories extends Buses
{
     String cat;
     
     void display()
     {
     super.display();
       System.out.println("Categories :"+cat);
     }
}
class VehicleMain
{
     public static void main (String ab[])
     {
        Categories c1=new Categories();
        c1.Model_Name="TATA";
        c1.p_no="MH02 U4456";
        c1.cat="AC";
        c1.display();
     }
}