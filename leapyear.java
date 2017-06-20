
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
public class leapyear {
    public static void main(String[] args)
    {
        System.out.println("enter an year");
        Scanner s=new Scanner(System.in);
       
        int a=s.nextInt();  
     
       if(a%100==0)
       {
           if(a%400==0)
           {
           System.out.println("It is a Leap year");
           }
            else
       {
           System.out.println("It is not a Leap year");
        
       }
       }
       else if(a%4==0)
           {
           System.out.println("It is a Leap year");
           }
       else
       {
           System.out.println("It is not a Leap year");
        
       }
           
           
        }
      
    }

