// * * * * * *
// *         *
// *         *  
// *         *
// * * * * * *

public class loop_pattern_14 {
    public static void main(String args[])
    {
        //  for rows
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=6; j++)
            {
                if(i==1 || j==1 || i==5 || j==6 )
                {
                    System.out.print(" * ");
                }
                else
                {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
            
        } 
    

    }
    
}
