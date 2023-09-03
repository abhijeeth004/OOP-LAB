import java.util.Scanner;
class Prime1D
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int a[]=new int[10];
  int i,n,s=0;
  System.out.println("Enter the number of elements ");
  n=sc.nextInt();
  System.out.println("enter the elements:");
  for(i=0;i<n;i++)
  a[i]=sc.nextInt();
  for(i=0;i<n;i++)
  {
  s=1;
  for(int j=2;j<a[i];j++)
   {
    if(a[i]%j==0)
     {
      s=0;
      break;
      }
     }
    if(s==1)
    System.out.println(a[i]+" ");
   }
  }
}
