//Program to find the largest and the second largest of n terms
import java.io.*;
import java.util.*;
class Lar20
{
  public static void main(String arg[])
  {
   int a[]=new int[50];
   int n,i,m=-100,max=-100;
   Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of terms:");
   n=sc.nextInt();
System.out.println("Enter the terms:");
   for(i=0;i<n;i++)
   {
    a[i]=sc.nextInt();
    if(a[i]>max)
    max=a[i];
   }
   for(i=0;i<n;i++)
   {
     if(a[i]>m&&a[i]!=max)
     m=a[i];
   }
   System.out.println("The largest term is:"+max+" and second largest is:"+m);
  }
}
