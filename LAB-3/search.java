import java.util.Scanner;

 class search
 {
  public static void main(String[] args){
        int a, srch,i=0,j=0;
        int s[]={1,2,3,1,2,1,5,6,7};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value to be searched");
        srch=sc.nextInt();
        for(i=0;i<9;i++)
        {
            if(s[i]==srch) 
            {
                System.out.println("the value lies at "+"s["+(i)+"]");
            }
        }
        for (int val : s) {
            if(val == srch) System.out.print("s[" + j + "] ");
            j++;
        }
    }
 }
