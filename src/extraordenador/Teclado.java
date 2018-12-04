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
public class Teclado {
private    int numTeclas;

    public Teclado(int numTeclas) {
        this.numTeclas = numTeclas;
    }

    public Teclado(){}
    
    public int getNumTeclas() {
        return numTeclas;
    }

    public void setNumTeclas(int numTeclas) {
        this.numTeclas = numTeclas;
    }
        
}
