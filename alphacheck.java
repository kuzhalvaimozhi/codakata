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
public class alphacheck{
    public static void main(String[] args)
    {
        System.out.println("enter a character");
        Scanner s=new Scanner(System.in);
       String m=s.next();
     
           
        char a=m.charAt(0);
       if(m.length()<2)
       {
        if((a<90&&a>65)||(a>97&&a<122))
            {
             System.out.println("The input is an alphabet");
         
            }
        else
        {
             System.out.println("The input is not an alphabet");
        }
        }
       else
       {
           System.out.println("The input should be an single digit or alphabet");
        
       }
    
    }      
}
