import java.io.*;
import java.util.*;
class Fibonacci
{
public static void main(String arg[])
{
   long temp,i,n,t,f,s;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the term Number:");
   n=sc.nextLong();
   f=0;s=1;
   if(n==1)
   System.out.print(f);
   else if(n==2)
   System.out.print(f+" "+s);
   else
   {
     System.out.print(f+" "+s+" ");
     for(i=1;i<=n-2;i++)
     {
       temp=s; 
       s=s+f;
       System.out.print(s+" ");
       f=temp; 
     }
   }

}
}
