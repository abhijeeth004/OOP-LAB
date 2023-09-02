import java.util.Scanner;
class MagicSquare
{
public static void main(String args[])
{
int a[][]=new int[10][10];
int rs[]=new int[10];
int cs[]=new int[10];
int i,j,n,s=1,ps,ns;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of square matrix(1 input)");
n=sc.nextInt();
System.out.println("Print the elements:");
for(i=0;i<n;i++)
for(j=0;j<n;j++)
a[i][j]=sc.nextInt();
for(i=0;i<n;i++)
{
rs[i]=0;
s=1;
for(j=0;j<n;j++)
{
rs[i]+=a[i][j];
}
if(rs[i]!=rs[0])
{
s=0;
break;
}
}
if(s==1)
{
for(j=0;j<n;j++)
{
s=1;
cs[i]=0;
for(i=0;i<n;i++)
{
cs[j]+=a[i][j];
}
if(cs[j]!=cs[0])
{
s=0;
break;
}
}
}
if(s==1)
{
ps=0;
s=1;
for(i=0;i<n;i++)
for(j=0;j<n;j++)
if(i==j)
ps+=a[i][j];
if(ps!=rs[0])
{
s=0;
}
}
if(s==1)
{
ns=0;
s=1;
for(i=0;i<n;i++)
for(j=0;j<n;j++)
if(i==n-j-1)
ns+=a[i][j];
if(ns!=cs[0])
{
s=0;
}
}
if(s==1)
System.out.println("It is a magic square");
else
System.out.println("It is not a magic square");
}
}
