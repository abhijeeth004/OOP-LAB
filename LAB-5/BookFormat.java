import java.util.Scanner;
class Book
{
    String title;
    String author;
    long edition;
    int i=1;
    Book(String t,String a,long ef)
    {
        title=t;
        author=a;
        edition=ef;
    }
    void file()
    {
        while(i<=6)
        {
            System.out.println("Book-"+i);
            System.out.println("The title, the name of the author and the edition fields are: "+title+","+author+","+edition);
            i++;
        } 
    }
    void find(Time ob)
    {
        if(ob.author=="Harry")
        {
            System.out.println("Found the book");
            System.out.println("The title, the name of the author and the edition fields are: "+ob.title+","+ob.author+","+ob.edition);
        }
    }

}
class BookFormat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String t[]=new String[6];
        String a[]=new String[6];
        long ef[]=new Long[6];
        System.out.println("Enter the title ,the author and the edition fields of the book:");
        for(int i=0;i<6;i++)
        {
            t[i]=sc.nextLine();
            a[i]=sc.nextLine();
            ef[i]=sc.nextLong();
        }
        Book ob1=new Book(t[0],a[0],ef[0]);
        ob1.file();
        Book ob2=new Book(t[1],a[1],ef[1]);
        ob2.file();
        Book ob3=new Book(t[2],a[2],ef[2]);
        ob3.file();
        Book ob4=new Book(t[3],a[3],ef[3]);
        ob4.file();
        Book ob5=new Book(t[4],a[4]ef[4]);
        ob5.file();
        Book ob6=new Book(t[5],a[5],ef[5]);
        ob6.file();
        Book f=new Book;
        f.find(ob1);
        f.find(ob2);
        f.find(ob3);
        f.find(ob4);
        f.find(ob5);
        f.find(ob6);
    }
}
