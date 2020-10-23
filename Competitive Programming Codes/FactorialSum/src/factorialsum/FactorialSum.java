/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialsum;
import java.util.*;
/**
 *
 * @author PC
 */
public class FactorialSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner k=new Scanner(System.in);
        while(true)
        {
        int factorialSum=0;
        int x=k.nextInt();
        int y=k.nextInt();
        factorialSum=fact(x)+fact(y);
        System.out.println(factorialSum);
        }
    }
    public static int fact(int n) {
        int factorial=1;
        for(int i=1;i<=n;i++)
        {
            factorial=i*factorial;
        }
        return factorial;
    }
}
