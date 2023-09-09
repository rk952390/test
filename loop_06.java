import java.util.Scanner;
public class loop_06 {
    public static void main(String args[])
    {
       try (Scanner sc = new Scanner(System.in)) {
        System.out.print("enter the number=");
            int num = sc.nextInt();
            int sum = 0;
            int digit = 0;
            int temp;
            int even=0;
            int count_even=0;
            int odd = 0;
            int count_odd=0;

            while(num!=0)
            {
                temp = num%10;
                num = num/10;
                sum=sum + temp;
                digit= digit+1;

                if(temp%2==0)
                {
                    even=even+temp;
                    count_even = count_even+1; 
                }
                else
                {
                    odd = odd+temp;
                    count_odd = count_odd+1;

                }

                
            }
            System.out.println("sum of all digit =" + sum);

            System.out.println("all digit=" + digit);

            System.out.println(" sum of all even ="+ even );
            System.out.println("count of all even= " + count_even);

            System.out.println("sum of all odd=" + odd);
            System.out.println("count of all odd="+count_odd);
            
            num=num+1;
    }


    }
    
}
