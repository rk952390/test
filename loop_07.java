// find out the series
//s= 1-2+3-3.......n

import java.util.Scanner;
public class loop_07 {
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the number=");
            int num = sc.nextInt();
            int i = 1;
            int series= 0 ;

            while(i<=num)
            {
                if(i%2==0)
                {
                    series= series - i;

                }
                else
                {
                    series = series + i;
                }   
                System.out.print(series);
                i=i+1;
            }
        }
        


    }
}
