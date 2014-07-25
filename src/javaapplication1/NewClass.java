/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author marcos
 */
public class NewClass 
{
    public static void teste(int n)
    {
        if(n == cinco())
            System.out.println("Seu número é 5, parabéns!!");
        else
            System.out.println("Que pena, você errou!");
    }
    
    public static int cinco()
    {
        return 5;
    }
}