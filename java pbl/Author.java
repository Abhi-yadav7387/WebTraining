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
class AuthorMain
{
           public static void main (String a[])
           {
            Author a1=new Author("Bill Gates","bill@gmail.com",'M');
          }
}
}