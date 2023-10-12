class CmdArg
{  
 public static boolean lastDigit(int a,int b)
{
  int ln1,ln2;
  ln1=(a%10);
  ln2(b%10);
  if(ln1==ln2)
  {
   return true;
  }
  else
  {
   return false;
  }
}

     public static void main (String ar[])
     {
    System.out.println(lastDigit(48,8));
      System.out.println(lastDigit(5,76));
     System.out.println(lastDigit(71,21));
 }
}
 
