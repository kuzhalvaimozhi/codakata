
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
public class noofdigits {
    public static void main(String[] args)
    {
        System.out.println("enter an number");
        Scanner s=new Scanner(System.in);
          int a=s.nextInt();
          int b=a;
          int sum=0;
          while(a>0)
          {
              sum++;
            a=a/10;
          }
        System.out.println("no of digits in " +b+ "is"+ sum  );
         
        }
      
    }

