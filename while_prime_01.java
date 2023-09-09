import java.util.Scanner;
public class while_prime_01
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the number:");
            int num = sc.nextInt();
            int i=2;
            while(i<=num)
            {
                if(num%i==0)
                {
                    System.out.println("not prime");
                    break;
                }
                else
                {
                    System.out.println("yes prime:");
                    break;
                }

            }
            i=i+1;
        }

    }
}