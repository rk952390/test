// 1234567
//1234567
//1234567
//1234567
//1234567
//1234567
//1234567



import java.util.Scanner;
public class loop_pattern_21 {
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the number=");
            int n = sc.nextInt();

            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=n;j++)
                {
                    System.out.print(" ");  // only ised for space
                    System.out.print(j);
                }
                System.out.println(" ");
            }
        }

    }
}
