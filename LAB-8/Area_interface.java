import java.util.Scanner;
public class Area_interface {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth of rectangle : ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        rectangle1 r1 = new rectangle1(l,b);
        System.out.println("Area of rectangle : "+r1.area());
        sc.nextLine();
        System.out.print("Enter radius of circle : ");
        double r = sc.nextDouble();
        circle1 c1 = new circle1(r);
        System.out.println("Area of rectangle : "+c1.area());
    }
}

interface Shape1{
    double area();
}

class rectangle1 implements Shape1{

    private double l,b;

    public rectangle1(double l,double b){
        this.l=l;
        this.b=b;
    }

    @Override
    public double area() {
        return l*b;
    }
}

class circle1 implements Shape1{

    private double r;

    public circle1(double r){
        this.r=r;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(r,2);
    }
}
