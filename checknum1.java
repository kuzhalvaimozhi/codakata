
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
public class checknum1 {
    public static void main(String[] args)
    {
        System.out.println("enter a number");
        Scanner s=new Scanner(System.in);
        try
        {
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
        catch(Exception ex)
        {
        System.out.println("Input should be an integer");
            
        }
    }
}
