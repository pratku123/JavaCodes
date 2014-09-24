//Use of labels in java

import java.io.*;
class Labels
{
int x;
Labels()
{
}
Labels(int x)
{
  this.x=x;
}
public static void main(String arg[])
{
  int i,j;
  L1:
   for(i=1;i<10;i++)
   {
    for(j=1;i<7;j++)
    {
     System.out.println(i+" "+j);
     if(j%3==0)
      break;
     if(i%5==0)
     break L1;
    }
   }

}
}
