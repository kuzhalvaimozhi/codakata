
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
public class addnum {
    public static void main(String[] args)
    {
        System.out.println("enter an number");
        Scanner s=new Scanner(System.in);
          int a=s.nextInt();  
        int sum=a*(a+1)/2;
        System.out.println("sum of  first " +a+ " number is"+sum  );
         
        }
      
    }

