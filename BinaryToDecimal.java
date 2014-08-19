import java.io.*;
import java.util.*;
class Binarytodecimal
{
public static void main(String a[])
{
  long temp=0,i=0,n;
   Scanner sc=new Scanner(System.in);
   n=sc.nextLong();
   while(n>0)
   {
    if(n%10==1)
    temp=temp+(long)Math.pow(2,i);
    n=n/10; 
    i++;
   }
   System.out.println(temp);

}


}
