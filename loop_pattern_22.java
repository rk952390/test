import java.util.Scanner;
public class loop_pattern_22 {
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the number=");

            int n = sc.nextInt();
            for(int i=1; i<=n; i++)
            {
                for(int j=1; j<=n; j++)
                {
                    if((i+j)%2==0)
                    {
                        System.out.print(1);
                    }
                    else
                    {
                        System.out.print(2);
                    }

                }
                System.out.println();
            }
        }


    }
}
