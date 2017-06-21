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
    public class largernum {
        public static void main(String[] args)
        {
            System.out.println("enter three integers");
            Scanner s=new Scanner(System.in);
           try
           {
            int a=s.nextInt();  
            int b=s.nextInt();
            int c=s.nextInt();
             if(a>b)
                {
                 if(a>c)
                 {
                  System.out.println(a+"is larger ");
                   }
                 else
                 {

                  System.out.println(c+"is larger ");
                  }

                }
             else if(b>c)
            {
                System.out.println(b+"is larger ");
                      }
             else
             {
                 System.out.println(c+"is larger ");

             }
           }
           catch(Exception ex)
           {
               System.out.println("input should be an integer ");

           }
        }

    }
