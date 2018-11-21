/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraordenador;

import javax.swing.JOptionPane;

/**
 *
 * @author Samuel
 */
public class Ordenador {
    int var;
    Cpu procesador;
    Rato raton;
    Monitor monit;
    Teclado tecl;
    
    public Ordenador(){
    
    }
    
    
    
    
    
    
    public void visualizarDatos(){
   
   raton= new Rato();
   raton.setModelo(JOptionPane.showInputDialog(null, "introduzca la marca del raton"));            
      int choice = JOptionPane.showOptionDialog(null, 
      "Es un raton inalambrico?", 
      "Salir?", 
      JOptionPane.YES_NO_OPTION, 
      JOptionPane.QUESTION_MESSAGE, 
      null, null, null);
if (choice==JOptionPane.YES_OPTION){
   raton.setInalambrico(true);
 }
      else{
    raton.setInalambrico(false);
   }    
    monit= new Monitor();
    monit.setMarca(JOptionPane.showInputDialog(null, "introduzca la marca del monitor"));
    monit.setPulgadas(Float.parseFloat(JOptionPane.showInputDialog(null,"Introduzca las pulgadas del monitor")));
    procesador = new Cpu();
    procesador.setNucleos(Integer.parseInt(JOptionPane.showInputDialog(null, "introduzca nucleos del procesador")));
    procesador.setRam(Integer.parseInt(JOptionPane.showInputDialog(null, "introduzca memoria RAM del ordenador")));
    tecl = new Teclado();
    tecl.setNumTeclas(Integer.parseInt(JOptionPane.showInputDialog(null, "introduzca numero de teclas del teclado")));
    
        System.out.println("El raton es de marca "+raton.getModelo()+"\nEl monitor de es marca "+monit.getMarca()+" y tiene "+monit.getPulgadas()+"\nEl procesdor tiene "+procesador.getNucleos()+" nucleos y esta acompañado de "+procesador.getRam()+" Gb de memoria RAM");
    
    }
    
    public void verPrecio(){  
double praton;
if (raton.isInalambrico()==true)
      praton=1.5;
else
praton=1;
    System.out.println("El monitor del raton es "+(monit.getPulgadas()*12)+"\nEl precio del procesdor es "+(procesador.getRam()*5)+"\nEl precio del teclado es "+(tecl.getNumTeclas()*0.7)+"\nEl precio del raton es "+praton);
    }
    
    
}
