/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area;
import java.util.*;
/**
 *
 * @author PC import java.util.*;Scanner k=new Scanner(System.in);
 */
public class Area {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner k=new Scanner(System.in);
        float A=k.nextFloat();
        float B=k.nextFloat();
        float C=k.nextFloat();
        float TRIANGULO=(A*C)/2;
        double pi=3.14159;
        double CIRCULO=C*C*pi;
        double TRAPEZIO=((A+B)/2)*C;
        double QUADRADO=B*B;
        double RETANGULO=A*B;
        System.out.print("TRIANGULO: ");
        System.out.printf("%.3f", TRIANGULO);
        System.out.println();
        System.out.print("CIRCULO: ");
        System.out.printf("%.3f", CIRCULO);
        System.out.println();
        System.out.print("TRAPEZIO: ");
        System.out.printf("%.3f", TRAPEZIO);
        System.out.println();
        System.out.print("QUADRADO: ");
        System.out.printf("%.3f", QUADRADO);
        System.out.println();
        System.out.print("RETANGULO: ");
        System.out.printf("%.3f", RETANGULO);
        System.out.println();
    }
    
}
