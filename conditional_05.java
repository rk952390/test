import java.util.Scanner;
public class conditional_05 {
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the nmber=");
            int num= sc.nextInt();

            if(num%2==0 && num%3==0)
            {
                System.out.println("yes number is even and divisible by 3:");
            }
            else
            {
                System.out.println("not number is not  divisible by 3:");

            }
        }

        
    }
}
