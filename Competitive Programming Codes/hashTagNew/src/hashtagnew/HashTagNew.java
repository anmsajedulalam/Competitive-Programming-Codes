/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashtagnew;
import java.util.*;
/**
 *
 * @author PC
 */
public class HashTagNew {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner k=new Scanner(System.in);
        String x=k.nextLine();
        String[] words = x.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            // You may want to check for a non-word character before blindly
            // performing a replacement
            // It may also be necessary to adjust the character class
            words[i] = words[i].replaceAll("[^\\w]", "");
        }
        System.out.print("#");
         for (int i = 0; i < words.length; i++){
             System.out.print(words[i]);
         }
         System.out.println();
    }
    
}
