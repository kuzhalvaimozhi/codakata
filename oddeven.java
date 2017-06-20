
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KAVITHA
 */
public class oddeven {
    public static void main(String[] args)
    {
        System.out.println("enter a number");
        Scanner s=new Scanner(System.in);
        try
        {
        int a=s.nextInt();
        if(a%2==0)
        {
            System.out.println("The entered number is an even number");
        }
        else
        {
             System.out.println("The entered number is an odd number");
        }
        }
        catch(Exception ex)
        {
        System.out.println("Input should be an integer");
            
        }
    }
}
