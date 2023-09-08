  class Complex
{
  int real,imaginary;
  Complex(int r,int i)
  {
      real=r;
      imaginary=i;
  }
  void add(int a,Complex c1)
  {
      Complex res=new Complex(a+c1.real,c1.imaginary);
      System.out.println("The sum is: "+res.real+"+"+res.imaginary+"i");
            
  }
  void add(Complex c1,Complex c2)
  {
      Complex res=new Complex(c1.real+c2.real,c1.imaginary+c2.imaginary);
      System.out.println("The sum is: "+res.real+"+"+res.imaginary+"i");
  }
  
}
public class Complexnum {
    public static void main(String args[])
    {
    Complex ob1=new Complex(14,12);
    Complex ob2= new Complex(10,13);
    Complex ob3= new Complex(0,0);
    ob3.add(ob1,ob2);
    ob3.add(1,ob1);
    }
    
    
    
}
