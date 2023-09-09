import java.util.Scanner;
public class condisional_03 {
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("enter the number=");
            int num= sc.nextInt();
            if(num%2==0)
            {
                System.out.println("yes even is:" + num);
                
            }
            else{
                System.out.println("odd number is" + num);
               
            }
        }

    }
}
