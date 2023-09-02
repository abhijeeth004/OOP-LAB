import java.util.Scanner;
class Symmetric
 {
  public static void main(String args[])
  {
   int m,n,i,j,k=1;
   int arr[][]=new int[10][10];
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the order of the matrix:");
   m=sc.nextInt();
   n=sc.nextInt();
   if(m==n)
   {
    System.out.println("Enter the elements:");
    for(i=0;i<m;i++)
    for(j=0;j<n;j++)
     arr[i][j]=sc.nextInt();
     for(i=0;i<m;i++)
     for(j=0;j<n;j++)
     {
      if(arr[i][j]!=arr[j][i])
      {
       k=0;
       break;
       }
      }
     if(k==1)
     System.out.println("It is a symmetric matrix");
    else
     System.out.println("It is not a symmetric matrix");
    }
    else
    System.out.println("It is not a square matrix");
   }
}
