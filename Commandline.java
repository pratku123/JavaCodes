import java.io.*;
import java.util.*;
class Commandline
{
 static int fact(int a)
 {
   if(a==0)
   return 1;
   else
   return a*fact(a-1);

 }
public static void main(String arg[])
{
 int i;
int a[]=new int[13];
int f[]=new int[13];
for(i=0;i<10;i++)
{
 a[i]=Integer.parseInt(arg[i]);
 f[i]=fact(a[i]);
}
System.out.println("The factorials are:");
for(i=0;i<10;i++)
System.out.println(a[i]+"="+f[i]);

}

}
