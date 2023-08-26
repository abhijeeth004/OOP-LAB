import java.util.Scanner;
class sin
{
 public static void main(String args[])
  {
   int i,j,n;
   double s=0,x,y;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the value of x: ");
   x=sc.nextDouble();
   y=x*3.1415/180;
   System.out.println("enter interations to be carried out:");
   n=sc.nextInt();
   int f;
   for(i=0; i<=n; i++)
    {
            f = 1;
            for(j=2; j<=2*i+1; j++){
                f*=j;
    }
   s+=Math.pow(y,2*i+1)*Math.pow(-1,i)/f;
   }
   System.out.println("Sin("+x+")="+s);
  }
}       



















