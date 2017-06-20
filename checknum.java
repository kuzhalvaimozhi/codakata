
import java.util.Scanner;

public class checknum {
    public static void main(String[] args)
    {
        System.out.println("enter a number");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a==0)
        {
            System.out.println("The entered number is zero");
        }
        else if(a>0)
        {
            System.out.println("The entered number is positive");            
        }
        else
        {
        
            System.out.println("The entered number is negative");
        }
    }
}
