class Employee
{
   int emp_id;
   String emp_name;
   float emp_sal;
     
   Employee()        //default constructor
   {
         emp_id=1001;
         emp_name="Yadav Amar";
         emp_sal=12000.00f;
         System.out.println("Employee Def ID : "+emp_id+
                            "\nEmployee Def name :"+emp_name+
                            "\nEmployee Def Sal :"+emp_sal);
  
   }
           //parameterised constructor
   Employee(int emp_id,String emp_name,float emp_sal)
   {
         this.emp_id=emp_id;
         this.emp_name=emp_name;
         this.emp_sal=emp_sal;
  
   }
      void EmpDetails()
      {  
            System.out.println("Employee ID :"+emp_id+
                                "\nEmployee Name :"+emp_name+
                                "\nEmployee Salary :"+emp_sal);

        }
}
 class EmployeeMain
{
    public static void main (String ab[])
    {
        Employee e1=new Employee();
        Employee e2=new Employee(101,"cocsit",35000.00f);
        e1.EmpDetails();
    }
}