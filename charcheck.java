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
public class charcheck{
    public static void main(String[] args)
    {
        System.out.println("enter a character");
        Scanner s=new Scanner(System.in);
       
        char a=s.next().charAt(0);
        if(Character.isAlphabetic(a))
        {
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
        {
            System.out.println("The entered character is vowel");
        }
        else
        {
             System.out.println("The entered character is consonant");
        }
        }
        else
        {
             System.out.println("Input should be an character");
      
        }
    }
      
}
