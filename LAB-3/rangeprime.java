import java.util.Scanner;
class rangeprime
{
 public static void main(String args[])
  {
   int m,n,i,s=1,j;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the lower limit:");
   m=sc.nextInt();
   System.out.println("Enter the upper limit:"); 
   n=sc.nextInt();
   if(m<2)
   System.out.println("2");
   for(i=m+1;i<n;i++)
    {
     s=1;
     for(j=2;j<i;j++)
      {
      if(i%j==0)
       {
        s=0;
        break;
       }
      }
     if(s==1)
      System.out.println(i+" ");
    }
   }
}
