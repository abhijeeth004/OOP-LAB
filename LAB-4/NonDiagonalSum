import java.util.Scanner;
class NonDiagonalSum
{
 public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   int n,m,i,k=0;
   int j,t;
   int arr[][]=new int[10][10];
   System.out.println("Enter the order of the matrix :");
   m=sc.nextInt();
   n=sc.nextInt();
   System.out.println("enter the elements:");
   for(i=0;i<m;i++)
   {
    for(j=0;j<n;j++)
    {
     arr[i][j]=sc.nextInt();
    
    }
    }
     for(i=0;i<m;i++)
   {
    for(j=0;j<n;j++)
    { 
      System.out.print(" "+arr[i][j]);
      }
     System.out.println();
     }
   for(i=0;i<m;i++)
   {
    for(j=0;j<m;j++)
    {
     if(i!=j)
     {
     System.out.print(" the non diagonal elements are "+arr[i][j]);
     
      k=arr[i][j]+k;
     }
     }
     System.out.println(" ");
     }

     System.out.println("Sum="+k);
     
    
   }
 }
