/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_7;
import java.util.Arrays;

/**
 *
 * @author Daniel Salinas
 */
public class Actividad_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = {20, 3, 1, 3, 7, -11, 43};
        Quicksort.ordenar(vector, 0, vector.length-1);
        System.out.println(Arrays.toString(vector));
    }
    
}
