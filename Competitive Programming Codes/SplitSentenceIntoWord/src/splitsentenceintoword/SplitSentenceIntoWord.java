/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splitsentenceintoword;

/**
 *
 * @author PC
 */
public class SplitSentenceIntoWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "This is a sample sentence.";
        String[] words = s.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            // You may want to check for a non-word character before blindly
            // performing a replacement
            // It may also be necessary to adjust the character class
            words[i] = words[i].replaceAll("[^\\w]", "");
        }
         for (int i = 0; i < words.length; i++){
             System.out.print(words[i]+" ");
         }
         System.out.println();
    }

}
