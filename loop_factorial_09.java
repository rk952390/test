import java.util.Scanner;
public class loop_factorial_09 {
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.print("enter the number for factorial=");
            int num = sc.nextInt();
            int fact=1;
            for(int i=1;i<=num;i++)
            {
                fact=fact*i;
            }
             System.out.println("factorial="+fact);
        }
        

    }

}
