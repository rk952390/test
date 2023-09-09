import java.util.Scanner;
public class loop_power_10 {
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the number of a=");
            int a= sc.nextInt();
            
            System.out.println("enter the number of b=");
            int b= sc.nextInt();

            int  ans=1;

            for(int i=1;i<=b; i++)
            {
                ans= a*ans;
            }
            System.out.println("answer of power="+ans);
        }
        
       

    }
}
