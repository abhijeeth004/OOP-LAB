import java.util.Scanner;
class Employee
{
    String name;
    String city;
    long salary;
    double da;
    double hre;
    double total;
    void getData(String n,String c,long s,double d,double h)

    {
        name=n;
        city=c;
        salary=s;
        da=d;
        hre=h;
    }
    void Calculate()
    {
         total=salary+salary*da/100+salary*hre/100;
    }
    void display()
    {
        System.out.println("The total salary is:"+total);
    }
}
    class Hero
    {
        public static void main(String args[]) {
            String n,c;
            long s;
            Scanner sc=new Scanner(System.in);
            int num;
            System.out.println("enter the number of emplyees");
            num=sc.nextInt();
            for(int i=0;i<num;i++)
            {System.out.println("Enter name and CIty originated:");
            n=sc.nextLine();
            c=sc.nextLine();
            System.out.println("Enter the salary:");
            s=sc.nextLong();

            int d,h;
            System.out.println("Enter the dearnerss and home rent allownace:");
            h=sc.nextInt();
            d=sc.nextInt();
            double d1=d/100;
            double h1=h/100;
            Employee ob=new Employee();
            ob.getData(n,c,s,d1,h1);
            ob.Calculate();
            ob.display();}
        }
    }
    
