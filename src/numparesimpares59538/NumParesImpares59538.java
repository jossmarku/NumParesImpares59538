/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numparesimpares59538;

/**
 *
 * @author Personal
 */
public class NumParesImpares59538 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num = 0;
        int suma_Par = 0;
        int suma_Impar = 0;
        
        while (num <= 100) {
            if (num % 2 == 0) {
                suma_Par += num;
            } else {
                suma_Impar += num;
            }
        num++;
        }
        
        System.out.println("Suma de los números pares = " + suma_Par);
        System.out.println("Suma de los números impares = " + suma_Impar);
    }
    
}
