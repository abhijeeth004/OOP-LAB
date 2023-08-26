import java.util.Scanner;
class numloop
{
 public static void main(String args[])
  {
   int n,i,j,c=1;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the no. of rows:");
   n=sc.nextInt();
   for(i=1;i<=n;i++)
    {
     for(j=1;j<=i;j++)
      {
       System.out.print(c+" ");
       c++;
      }
     System.out.println(" ");

     }
   }
 }