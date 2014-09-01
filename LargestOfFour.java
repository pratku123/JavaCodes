import java.io.*;
import java.util.*;
class Lar4
{
 public static void main(String arg[])
 {
   int a,b,c,d,max;
   Scanner sc=new Scanner(System.in);
   a=sc.nextInt();b=sc.nextInt();c=sc.nextInt();d=sc.nextInt();
   max=a;
   if(b>max)
   max=b;
   if(c>max)
   max=c;
   if(d>max)
   max=d;
   System.out.println(max);
 }
}
