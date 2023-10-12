class Colleges
 {
     int c_code;
     void GetList()
     {
  	   System.out.println("COCSIT" +c_code);
     }

}

class Cocsit extends  Colleges
{
    String  c_name;
    void GetC_Name()
    {
      System.out.println("College Name :" +c_name);
    }
}

class CollegeMain
{
    public static void main(String ar[])
    {
     Cocsit c1=new Cocsit();
     c1.c_code= 365;
     c1.c_name="College of Computer Science And IT";
     c1.GetList();
     c1.GetC_Name();
    }
}
