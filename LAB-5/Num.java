import java.util.Scanner;
class Number
{
    private double num;
    Number(double n)
    {
        num=n;
    }
    boolean isZero()
    {
        if(num==0)
        {
            return true;
        }
        return false;
    }
    boolean isPositive()
    {
        if(num>0)
        {
            return true;
        }
        return false;
    }
    boolean isNegative()
    {
        if(num<0)
        {
            return true;
        }
        return false;
    }
    boolean isOdd()
    {
        if(num%2!=0)
        {
            return true;
        }
        return false;
    }
    boolean isEven()
    {
        if(num%2==0)
        {
            return true;
        }
        return false;
    }
    boolean isPrime()
      {
        int p=1;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                p=0;
                break;
            }
        }
        if(p==0)
        {
            return false;
        }
        else
        {
            return true;
        }   
    }
    boolean isArmstrong()
    {
        double n1=num;
        int cube;
        int sum=0;
        int digit;
        while(n1!=0)
        {
            digit=(int)n1%10;
            cube=digit*digit*digit;
            sum=sum+cube;
            n1=(int)n1/10;
        }
        if(num==sum)
        {
            return true;
        }
        else
         {
            return false;
        }

    }
}
class Num
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        double n;
        System.out.println("Enter the number:");
        n=sc.nextDouble();
        Number ob=new Number(n);
        boolean b=ob.isZero();
        boolean c=ob.isPositive();
        boolean d=ob.isNegative();
        boolean e=ob.isOdd();
        boolean f=ob.isEven();
        boolean g=ob.isPrime();
        boolean h=ob.isArmstrong();
        System.out.println("The number is a zero:-"+b);
        System.out.println("The number is a positive number:-"+c);
        System.out.println("The number is a negative number:-"+d);
        System.out.println("The number is a odd number:-"+e);
        System.out.println("The number is an even number:-"+f);
        System.out.println("The number is a prime number:-"+g);
        System.out.println("The number is an amstrong number:-"+h);
    }
}
