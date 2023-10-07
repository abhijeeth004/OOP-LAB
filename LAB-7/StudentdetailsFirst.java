import java.util.Scanner;
class Student_Detail
{
    String name;
    int id;
    // constructor initialization//
    static String college_name="MIT";
    Student_Detail(String s,int id){
        this.id=id;
        this.name=s;
    }
// function to display details
    void display_details(){
        System.out.println("College: "+college_name);
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
    }
}

public class StudentdetailsFirst{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name and id:");
        Student_Detail s1=new Student_Detail(sc.nextLine(), sc.nextInt());
        sc.nextLine();
        System.out.println("Enter the name and id:");
        Student_Detail s2=new Student_Detail(sc.nextLine(), sc.nextInt());
        sc.nextLine();
        s1.display_details();
        s2.display_details();     
        sc.close();   
    }
}
