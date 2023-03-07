/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ejercicios_18al21;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio20 {

    public static void main(String[] args) {
        int[] v = new int[9];
        int[][] m = new int[3][3];
        Scanner leer = new Scanner(System.in);
        int num;

        int comp2 = 0;
        do {

            boolean comp = false;
            do {

                System.out.println("ingresa un valor del 1 al 9");
                num = leer.nextInt();

                if (num >= 0 && num <= 9) {

                    comp = true;
                }
               

            } while (comp == false);
            
            System.out.println("comprobacion 1");
            
            for (int i = comp2; i <= comp2; i++) {
                v[i] = num;
                
            }
            comp2 = comp2 + 1;
        } while (comp2 <= 8);

        System.out.println("comprobacion 2");

        int comp3 = 0;
        do {
            int comp4 = 0;
            for (int i = 0; i <= 2; i++) {

                for (int j = 0; j <= 2; j++) {
                    m[i][j] = v[comp4];
                    comp4 = comp4 + 1;
                }

            }
            comp3 = comp3 + 1;
        } while (comp3 <= 2);

        System.out.println("comprobacion 3");

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {

                System.out.print(m[i][j] + " | ");
            }
            System.out.println("");
        }
    }

}
