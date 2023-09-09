import java.util.Scanner;
public class loop_series_08 {
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner (System.in)) {
			System.out.println("enter the number for series:");
			int num = sc.nextInt();
			int series=0;

			for(int i=1; i<=num; i++)
			{
			    if(i%2==0)
			    {
			        series= series-i;
			    }

			    else
			    {
			        series = series +i;
			    }
			}

			//series= 1-2+3_4+5  n=5 here then answer equal to 3
			System.out.print("final answer of the series="+series);
		}

    }
}
