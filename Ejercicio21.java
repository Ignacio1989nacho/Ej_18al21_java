/*/
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ejercicios_18al21;

/**
 *
 * @author Usuario
 */
public class Ejercicio21 {

    public static void main(String[] args) {
        System.out.println("--------");
        int[][] m = mm();
        int[][] p = pp();
        int[] v = vv(m, p);

        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " | ");

        }

    }
    
/////////////////// relleno y mostrar matriz 10 x 10 //////////////////
    public static int[][] mm() {
        
        int[][] mm = new int[10][10];

        for (int i = 0; i < mm.length; i++) {
            for (int j = 0; j < mm.length; j++) {
                mm[i][j] = (int) (Math.random() * 2);
            }
        }

        for (int i = 0; i < mm.length; i++) {
            for (int j = 0; j < mm.length; j++) {
                System.out.print(mm[i][j]);
            }
            System.out.println("");
        }
        
        System.out.println("");
        return mm;
    }
    
//////////////// relleno y mostrar matriz 3 x 3 ///////////////
    public static int[][] pp() {

        int[][] pp = new int[3][3];

        for (int i = 0; i < pp.length; i++) {
            for (int j = 0; j < pp.length; j++) {
                pp[i][j] = 1;
            }
        }

        for (int i = 0; i < pp.length; i++) {
            for (int j = 0; j < pp.length; j++) {
                System.out.print(pp[i][j]);                
            }
            System.out.println("");
        }
        
        System.out.println("");
        return pp;
    }
    
/////////// valor vecctor /////////////////
    public static int[] vv(int[][] mm, int[][] pp) {
        int[] vv = new int[10];
        int cont = 0;
        int cont2 = 0;
        int cont3 = 0;

        for (int i = 0; i < mm.length; i++) {
            for (int j = 0; j < mm.length; j++) {
                if (pp[cont][cont2] == mm[i][cont3]) {
                    vv[i] = mm[i][cont3];
                } else {
                    vv[i] = -1;
                }
                cont2 = cont2 + 1;
                cont3 = cont3 + 1;
                if (cont2 == 3) {
                    cont = cont + 1;
                    cont2 = 0;
                }
                if (cont == 3) {
                    cont = 0;
                }
                if (cont3 == 10) {
                    cont3 = 0;
                }
            }
        }
        
        return vv;
    }
}
