/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraordenador;

/**
 *
 * @author Samuel
 */
public class Rato {
  private  boolean inalambrico;
   private String modelo;
   

    
    public Rato(boolean inalambrico, String modelo) {
        this.inalambrico = inalambrico;
        this.modelo = modelo;
    }
    
    public Rato(){}

    public boolean isInalambrico() {
        return inalambrico;
    }

    public void setInalambrico(boolean inalambrico) {
        this.inalambrico = inalambrico;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    
}
