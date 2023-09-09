import java.util.Scanner;
public class for_prime_02 {
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the number=");
            int num = sc.nextInt();
            for(int i = 2; num<=num-1; i++)
            {
                if(num%i==0)
                {
                    System.out.println("not prime:");
                    //break;
                }

                else
                {
                    System.out.println("yes prime:");
                    //break;
                }

            }
        }


    }
}
