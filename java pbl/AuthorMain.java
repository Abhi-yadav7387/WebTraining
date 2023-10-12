class Author {
              String name;
              String email;
              char gender;
              
              
              Author(String name,String email,char gender)
              {
            	  this.name=name;
            	  this.email=email;
            	  this.gender=gender;
               System.out.println("Name :"+name+
                                   "\nEmail :"+email+
                                   "\nGender :"+gender);
              }
}
class AuthorMain
{
           public static void main (String a[])
           {
            Author a1=new Author("Bill Gates","bill@gmail.com",'M');
            Runtime r1=Runtime.getRuntime();
            System.out.println("\nDe-llocated Memory :"+r1.freeMemory());
            r1.gc();
          }
}
