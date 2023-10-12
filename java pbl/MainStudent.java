class Student
{
//data member declaration
    int roll_no;
    String stud_name;
    long mob_no;
    String addr;
 //member function definition
   void GetStudents()
{
   System.out.println("Roll NO :"+roll_no+
    "\nStudent Name : "+stud_name+
     "\nMobile No :"+mob_no+
      "\nAddress :"+addr);
  }
    
}

    class MainStudent
{

   public static void main (String ar[])
   {
       Student s1=new Student();
       s1.roll_no=11;
       s1.stud_name="Abhi";
       s1.mob_no= 7387690;
       s1.addr="behind_cocsit";
       s1.GetStudents();
   }
}


