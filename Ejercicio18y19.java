/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ejercicios_18al21;

/**
 *
 * @author Usuario
 */
public class Ejercicio18y19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] m = new int[3][3];

        for (int i = 0; i <= m.length - 1; i++) {
            for (int j = 0; j <= m.length - 1; j++) {

                m[i][j] = (int) (Math.random() * 9);
                System.out.print(m[i][j] + " | ");

            }
            System.out.println("");
        }

        System.out.println("");

        for (int j = 0; j <= m.length - 1; j++) {
            for (int i = 0; i <= m.length - 1; i++) {

                System.out.print(m[i][j] + " | ");

            }
            System.out.println("");
        }

    }

}
