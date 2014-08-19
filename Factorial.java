import java.io.*;
import java.util.*;
class Factorial
{
 public static void main(String arg[])
 {
  Scanner sc=new Scanner(System.in);
  long n,i,temp=1;
  n=sc.nextLong();
  for(i=1;i<=n;i++)
  {
   temp=temp*i;
  }
System.out.println(temp);
 }
}
