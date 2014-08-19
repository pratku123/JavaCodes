import java.io.*;
import java.util.*;
import java.math.*;
class Decimaltobinary
{
 public static void main(String a[])
 {
   Scanner sc=new Scanner(System.in);
   long n;
   n=sc.nextLong();
   long temp=0;
   long i=0;
   while(n>0)
   {
     if(n%2==1)
     temp=temp+(long)Math.pow(10,i);
     i++; 
     n=n/2;
   }
   System.out.println(temp);
 }
}
