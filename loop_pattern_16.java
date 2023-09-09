//  *
//  * * 
//  * * *
//  * * * *
//  * * * * *


import java.util.Scanner;
public class loop_pattern_16 {
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
        }
       // System.out.println(" eneter the number=");
        //int n = sc.nextInt();
        // outer loop
        for(int i=1;i<= 5; i++)
        {
            // inner loop

            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
