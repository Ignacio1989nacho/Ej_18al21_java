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
public class pruebaEjercicio20 {

    public static void main(String[] args) {

        int[] vec = v();
        int[][] c = m(vec);
        int[][] total = c1(c);
        boolean magic = mag(c);

        System.out.println("tu cuadrado magico es: " + magic);

    }

    public static int[] v() {
        String p = "";
        int[] v = new int[9];

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

            for (int i = comp2; i <= comp2; i++) {
                v[i] = num;

            }
            comp2 = comp2 + 1;
        } while (comp2 <= 8);
        p += "Comprobacion 1";
        return v;
    }

    public static int[][] m(int[] vec) {
        String v1 = "";
        int[][] m = new int[3][3];
        int comp3 = 0;
        do {
            int comp4 = 0;
            for (int i = 0; i <= 2; i++) {

                for (int j = 0; j <= 2; j++) {
                    m[i][j] = vec[comp4];
                    comp4 = comp4 + 1;
                }

            }
            comp3 = comp3 + 1;
        } while (comp3 <= 2);
        v1 += "comprobacion 2";
        return m;
    }

    public static int[][] c1(int[][] c) {

        int[][] c1 = new int[3][3];

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {

                System.out.print(c[i][j] + " | ");
            }
            System.out.println("");
        }
        return c1;

    }

    public static boolean mag(int[][] c) {

        boolean mag = false;
        int colum = 0;
        int fila = 0;
        int diag = 0;

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 3; j++) {
                colum = colum + c[i][j];

            }

        }

        for (int j = 0; j < 1; j++) {
            for (int i = 0; i < 3; i++) {
                fila = fila + c[i][j];

            }

        }
        
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 3; j++) {
               diag = diag + c[i+1][j]; 
                
            }
            
        }
        
        if (colum == fila && fila == diag && diag == colum) {
            mag = true;
        } 
        
        return mag;
    }
}
