import java.io.*;
class A
{
 int x;
A()
{
System.out.println("In the default constructor");
}

 A(int x)//parameterised constructor
 {
System.out.println("In the parameterised constructor");
   this.x=x;
 }
A(A a)
{
 x=a.x;
System.out.println("In the copy constructor");
}
 void disp()
 {
  System.out.println("The disp function"+x);
 }
 public static void main(String arg[])
 {
   A a1=new A();
   A a2=new A(4);
   A a3=new A(a2);  
 }
}
