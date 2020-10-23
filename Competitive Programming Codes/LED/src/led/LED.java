/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package led;

import java.util.*;

/**
 *
 * @author PC
 */
public class LED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner k = new Scanner(System.in);
        int led[] = new int[10];
        led[0] = 6;
        led[1] = 2;
        led[2] = 5;
        led[3] = 5;
        led[4] = 4;
        led[5] = 5;
        led[6] = 6;
        led[7] = 3;
        led[8] = 7;
        led[9] = 6;
        int test = k.nextInt();
        for (int c = 0; c < test; c++) {
            String x = k.next();
            char[] digits = new char[10];
            digits = x.toCharArray();
            int sum = 0;
            for (int i = 0; i < digits.length; i++) {
                if ('0' == digits[i]) {
                    sum = led[0] + sum;
                } else if ('1' == digits[i]) {
                    sum = led[1] + sum;
                } else if ('2' == digits[i]) {
                    sum = led[2] + sum;
                } else if ('3' == digits[i]) {
                    sum = led[3] + sum;
                } else if ('4' == digits[i]) {
                    sum = led[4] + sum;
                } else if ('5' == digits[i]) {
                    sum = led[5] + sum;
                } else if ('6' == digits[i]) {
                    sum = led[6] + sum;
                } else if ('7' == digits[i]) {
                    sum = led[7] + sum;
                } else if ('8' == digits[i]) {
                    sum = led[8] + sum;
                } else if ('9' == digits[i]) {
                    sum = led[9] + sum;
                }
            }
            System.out.println(sum + " leds");

        }

    }
}
