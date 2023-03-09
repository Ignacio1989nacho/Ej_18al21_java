/*/
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
public class Ejercicio21 {

     public static void main(String[] args) {
        int[][] m = new int[10][10];
        int[][] p = new int[3][3];
        int[] v = new int[9];
        String [] v_row = new String [9];
        int [] v_colum = new int [9];
        
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i <= m.length - 1; i++) {
            for (int j = 0; j <= m.length - 1; j++) {

                m[i][j] = (int) (Math.random() * 9);
                System.out.print(m[i][j] + " | ");

            }
            System.out.println("");
        }
        int cont = 0;
        
        do {
            System.out.println("Ingresa 9 numeros para la matriz:");
            //int num = leer.nextInt();

            for (int i = 0; i <  9; i++) {
                int num = leer.nextInt();
                v[i] = num;

                cont = cont + 1;
            }
        } while (cont == 8);
        
        for (int i = 0; i < 9; i++) {
            System.out.print(v[i]+"-");
        }
        System.out.println("");
        int sum = 0;
        for (int i = 0; i < p.length ; i++) {
            for (int j = 0; j < p.length ; j++) {
                p[i][j] = v[sum];
                sum = sum + 1;
            }
           
        }

        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p.length; j++) {
                System.out.print(p[i][j]+" | ");
                
            }
            System.out.println("");
        }
        
        
        
        boolean found = false;
        int row = -1, col = -1;
        int n = 0;
        
        
        for (int i = 0; i <= m.length - p.length; i++) {
            for (int j = 0; j <= m[i].length - p[0].length; j++) {
                boolean match = true;
           
                for (int k = 0; k < p.length; k++) {
                    for (int l = 0; l < p[k].length; l++) {
                        if (p[k][l] != m[i + k][j + l]) {
                            match = false;
                            break;
                        }else{
                        
                        v_row[n] = (String.valueOf(k)+" "+String.valueOf(l));
                        n = n + 1;
                       
                        }
                    }
                    if (!match) {
                        break;
                    }
                }
                if (match) {
                    found = true;
                    row = i;
                    col = j;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (found) {
            System.out.println("La submatriz P se encuentra en la matriz M en la fila " + row + " y la columna " + col);
        } else {
            System.out.println("La submatriz P no se encuentra en la matriz M");
        }
        for (int i = 0; i < v_row.length-1; i++) {
            System.out.print(v_row[i]+" | ");
        }
    }
}
