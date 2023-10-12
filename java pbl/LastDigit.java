class CmdArg
{  
 pubic static void lastDigit(int a,int b)
{
  int ln1,ln2;
  ln1=(a%10);
  ln2(b%10);
  if(ln1==ln2)
  {
    System.out.println("True");
  }
  else
  {
    System.out.println("False");
  }
}
     public static void main (String ar[])
     {
     lastDigit(48,8);
     lastDigit(5,76);
     lastDigit(71,21);
 }
}
 
