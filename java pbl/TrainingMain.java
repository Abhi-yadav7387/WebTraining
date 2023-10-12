class Training
{
     void show()
      {
       System.out.println("List of all Training Program");
      }
}
class JavaProgram extends Training
{
       void show()
       {
        System.out.println("Java Training Duration is 2 Month");
        }
}
class TrainingMain
{
       public static void main (String ab[])
       {
       Training t1; //reference variable of super class
       t1=new Training();
       t1.show();
       t1=new JavaProgram();
       t1.show();
       }      
}


