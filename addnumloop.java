
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
public class addnumloop {
    public static void main(String[] args)
    {int sum=0;
        System.out.println("enter no of integers:");
        Scanner s=new Scanner(System.in);
          int n=s.nextInt();
          for(int i=0;i<n;i++)
          {
               int a=s.nextInt();
                sum=sum+a;
              
          }
        System.out.println("sum of n numbers "+ sum  );
         
        }
      
    }

