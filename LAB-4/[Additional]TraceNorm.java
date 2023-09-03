import java.util.Scanner;
class TraceNorm
{
 public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   int n,m,j,i,k=0;
   int arr[][]=new int[10][10];
   System.out.println("Enter the order of the matrix :");
   m=sc.nextInt();
   n=sc.nextInt();
   System.out.println("enter the elements:");
   for(i=0;i<m;i++)
   for(j=0;j<n;j++)
   arr[i][j]=sc.nextInt();
   for(i=0;i<m;i++)
   for(j=0;j<m;j++)
    {
     if(i==j)
      k=arr[i][j]+k;
     }
    int p=0;
    for(i=0;i<m;i++)
    for(j=0;j<n;j++)
    {
     p=arr[i][j]*arr[i][j] +p;
     }
    int q=(int)Math.sqrt(n);
    System.out.println("Trance="+k+"Norm="+q);
   }
}
    
