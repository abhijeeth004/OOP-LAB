import java.util.Scanner;
class Matrixmultiplication
{
    public static void main(String args[]) 
    {
        int m,n;
        int p,q;
        int k;
        int i,j;
        System.out.println("Enter the dimensions of 1st matrix:");
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        System.out.println("Enter the elements of 1st matrix:");
        int a[][]=new int[10][10];
        int b[][]=new int[10][10];   
        int c[][]=new int[10][10];     
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the dimensions of 2nd matrix:");
        p=sc.nextInt();
        q=sc.nextInt();
        System.out.println("Enter the elements of 2nd matrix:");
        for(i=0;i<p;i++)
        {
            for(j=0;j<q;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        if(n==p)
        {
            for(i=0;i<m;i++)
            {
                for(j=0;j<q;j++)
                {
                    for(k=0;k<n;k++)
                    {
                    
                        c[i][j]+=(a[i][k]*b[k][j]);
                    }
                }
            }
            System.out.println("The matrix after multiplication of 2 matrices is:");
            for(i=0;i<m;i++)
            {
                for(j=0;j<q;j++)
                { 
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
        }
        else 
        {
            System.out.println("Multiplication not possible");
        }
    }
}
