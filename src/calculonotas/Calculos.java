/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculonotas;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class Calculos {
    private double nota1;
    private double nota2;
    private double notaPractico;
    private double numBoletinsTotales;
    private int numeroBoletines;
    private int notaBoletines;
    Scanner ler= new Scanner(System.in);
    public double darNota1(){
        System.out.println("Introduzca la nota del primer examen");
       this.nota1 =ler.nextDouble();
       return this.nota1;
        
    }
    public double darNota2(){
        System.out.println("Introduzca la nota del segundo examen");
        this.nota2 =ler.nextDouble(); 
       return this.nota2; 
    }
    public double darNotaPractico(){
        System.out.println("Indique nota del examen practico");
        this.notaPractico=ler.nextDouble();     
        return this.notaPractico;
    }
    public void darNotaBoletines(){
        System.out.println("introduzca umero de boletines realizados");
        this.numeroBoletines= ler.nextInt();
        System.out.println("Introduzaca numero de boletines totales");
        this.numBoletinsTotales=ler.nextDouble();
        if(this.numeroBoletines/this.numBoletinsTotales*100>=90){
        System.out.println("La nota de los boletines es: 2");
        this.notaBoletines=2;
        }
        else if((this.numeroBoletines/this.numBoletinsTotales)*100<90&&(this.numeroBoletines/this.numBoletinsTotales)*100>=70){
        System.out.println("La nota de los boletines es: 1");
        this.notaBoletines=1;
        }
        else if(this.numeroBoletines/this.numBoletinsTotales*100<70){
            System.out.println("La nota de los boletines es: 0");
        this.notaBoletines=0;  
    }
    }
    
    public void calculoMedia(){ //Hago aqui el bucle for llamando a los otros metodos dentro del mismo para que se haga con el numero justo que quiero
        int contador;
        System.out.println("Introduzca numero de alumnos de los que desea calcular la media");
        int numA=ler.nextInt();
        for(contador=0;contador<numA;contador++)
        {
        darNota1();
        darNota2();
        darNotaPractico();
        darNotaBoletines();
        int notaMEdia=(int) ((((this.nota1+this.nota2)/2)*0.4)+(this.notaPractico*0.4)+(this.notaBoletines));
        System.out.println("La media del trimestre es: "+notaMEdia);
        }
    }
    
}
