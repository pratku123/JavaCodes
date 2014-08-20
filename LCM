import java.io.*;
import java.util.*;
class LCM
{
 int calc(int a,int b)
 {
   int temp,i;
    for(i=1;i<=b;i++)
    { 
      temp=a*i;
      if(temp%b==0)
      {
        return temp;  
      }
    }  
return 1; 
 }
public static void main(String arg[])
{
 LCM a=new LCM();
 Scanner sc=new Scanner(System.in);
 int n,ele,temp=1,i;
System.out.println("Enter the number of elements:");
   n=sc.nextInt();
System.out.println("Enter the numbers:");
 for(i=0;i<n;i++)
 {
   ele=sc.nextInt();
   temp=a.calc(temp,ele);
 }
  System.out.println(temp);

}

}
