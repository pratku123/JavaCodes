import java.io.*;
import java.util.*;
class HCF
{
 int calc(int a,int b)
 {
   if(a==0||b==0)
    return 1;
   else if(a==b)
    return a;
   else if(a>b)
   {
     if(a%b==0)
      return b;
     else
     return calc(b,a%b);
   }
   else if(b>a)
   {
     if(b%a==0)
       return a;
     else
      return calc(a,b%a);
   }
   return 1;
 }
 public static void main(String arg[])
 {
  int gcd,n,i,ele;
  Scanner sc=new Scanner(System.in);
  HCF h=new HCF();
  System.out.println("Enter the number of terms:");
  n=sc.nextInt();
  System.out.println("Enter the numbers:");
  gcd=sc.nextInt();
  for(i=1;i<n;i++)
  {
   ele=sc.nextInt();
   gcd=h.calc(gcd,ele);
  }
  System.out.println(gcd);
 }

}
