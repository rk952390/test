import java.util.Scanner;
public class loop_pyramid_pattern_19 {
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the number of the n:");
            int n = sc.nextInt();

            for(int i=1;i<=n; i++ )
            {
                // space 
                for(int j=1;j<=n-i;j++)
                {
                    System.out.print(" ");
                }

                for(int k=1; k<=(2*i-1); k++)
                {
                    System.out.print("*");

                }

                System.out.println();
            }
        }

    }
}
