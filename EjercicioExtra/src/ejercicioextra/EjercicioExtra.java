/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra;
import java.util.Scanner;

public class EjercicioExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        final double Pi=3.14;
        System.out.println("Introduzca radio del circulo");
        Scanner ler = new Scanner(System.in);
        double radio;
       radio= ler.nextDouble();
       System.out.println("longitud del círculo "+(2*Pi*radio)+"\nÁrea del circulo "+(Pi*radio*radio)+"\nVolumen del círculo "+(4/3*Pi*radio*radio*radio));
        
        
        
        
        
    }
    
}
