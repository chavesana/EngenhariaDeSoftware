/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package engenharia.de.software;

/**
 *
 * @author ana
 */
public class JavaApplication1 {

    public static void main(String[] args) {
        JavaApplication1 r = new JavaApplication1();
        System.out.println("Resposta do item a) do 4): " + r.x(4, 2));
        System.out.println("Resposta do item a) do 5): " + r.y(6));
        System.out.println("OLA!");
    }
 
	int y(int n){
        if(n >= 0 && n <=2)
                return n;
        else 
                return y(n-1) + y(n-2) + y(n-3);
    }
        
        
        int x(int n, int m){
                if (n == m || n == 0)
                    return 1;
                else
                    return x(n-1, m) + x(n-1, m+1);
            } 



}