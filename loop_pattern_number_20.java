import java.util.Scanner;
public class loop_pattern_number_20 {
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.print("enter the number=");
            int n = sc.nextInt();

            for(int i=1; i<=n; i++)
            {
                for(int j=1; j<=n; j++)
                {
                    System.out.print(" ");
                    System.out.print(i+j-1);
                }
                System.out.println(" ");
            }
        }

    }
}
