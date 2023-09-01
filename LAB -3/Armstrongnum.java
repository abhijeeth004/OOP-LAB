import java.util.Scanner;
class Armstrongnum
{
 public static void main(String args[])
  {
   int n,r,s=0,p;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number:");
   n=sc.nextInt();
   int k=n;
   while(n!=0)
    {
     r=n%10;
     s=(r*r*r)+s;
     p=n/10;
     n=p;
    }
if(k==s)
System.out.println("the number "+k+" is an armstrong number");
else
System.out.println("the number "+k+" is not an armstrong number");
  }
}
