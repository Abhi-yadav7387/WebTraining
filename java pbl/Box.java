class Box
{    
    int height,width,depth;
     Box(int h,int w,int d)
     {
   height=0;
   width=0;
   depth=0;
     }

void volume()
{
   int volume=height*width*depth;
   System.out.println("The volume is :"+volume);
}
  public static void main (String ar[])
  {
    Box obj=new Box(2,3,4);
    obj.volume();
  }
}
  
