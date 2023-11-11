import java.util.Scanner;
public class AbstractArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth of rectangle : ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        rectangle r = new rectangle(l,b);
        System.out.println("Area of rectangle : "+r.cal());

        sc.nextLine();
        System.out.println("Enter radius of circle : ");
        double ra = sc.nextDouble();
        circle c = new circle(ra);
        System.out.println("Area of circle : "+c.cal());

    }
}

abstract class Shape{
    abstract double cal();
}

class rectangle extends Shape{
    private double l,b;

    public rectangle(double l,double b){
        this.l=l;
        this.b=b;
    }
    @Override
    double cal(){
        return l*b;
    }
}

class circle extends Shape{
    private double r;

    public circle(double r){
        this.r=r;
    }
    @Override
    double cal(){
        return Math.PI*Math.pow(r,2);
    }
}
