/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletinextraacabadoen2;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class Operacion {
    private int numIntroducido;
    private int contador = 0;
    public void num2(){
    Scanner ler = new Scanner(System.in);
    System.out.println("Si desea dejar de añadir numeros añada un numero negativo por favor");
    while(numIntroducido>=0){
              if(numIntroducido%10==2)  //Si el número acaba en dos
                 contador++;       //esta variable contendrá cuántos números acabados en 2 se han leído.
              System.out.print("Introduce un número entero: ");
              numIntroducido = ler.nextInt();    
}
  System.out.print("Los numeros acabados en 2 fueron: "+ contador);
}
}
