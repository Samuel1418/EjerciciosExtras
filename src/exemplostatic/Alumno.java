/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplostatic;

/**
 *
 * @author Samuel
 */
public class Alumno {

    private String nome;
    private float nota;
    private int numeroReferencia; //variable de instancia
    public static int referencia = 6220; //Variable de clase comun a todos los objetos que empieza en el numero indicado. No es propia a cada uno de nosotros
    Direccion direccion1 = new Direccion() {
    };

    public Alumno() {
        numeroReferencia = ++referencia; // ASI SE SUMA UNO CADA VEZ
    }

    public Alumno(String nome, float nota, String a, String d) {
        this.nome = nome;
        this.nota = nota;
        direccion1.setEmail(a);
        direccion1.setTelefono(d);
        numeroReferencia = ++referencia; // con tal de poner esto aqui no hay que ponerlo dentro de los parentesis del construcror. 
    }                           //De la forma que esta arriba, cuando querramos ver el valor del primer alumno con el numReferencia lo veremos ya que primero se suma al referencia y luego se muestra

//    public void setNumReferencia(int refe){
//    numReferencia=refe;
//    }
    public int getreferencia() { //Método no estatico que accede a una variable estática
        return referencia;
    }

    public void amosar() {
        System.out.println("nome " + nome + "; nota " + nota + "; referencia " + numeroReferencia);
    }

    //siempre que se hace una variable estatica hay que llamarla con el nombreClase.nomMetodo
//    public static String getNome(){
//    return nome; //error por ser variable no estatica
//    }
    public float getNota() {
        return nota;
    }

    public void setDatosEmail(String i) {
        direccion1.setEmail(i);
    }

    public void setDatosTelf(String r) {
        direccion1.setTelefono(r);
    }

    public void setNota(float a) {
        this.nota = a;
    }

    public void setNome(String l) {
        this.nome = l;
    }

    public void amosar2() {
        System.out.println("nome " + nome + "; \nnota " + nota + "; \nreferencia " + numeroReferencia + "\nTelefono " + direccion1.getTelefono() + "\nEmail " + direccion1.getEmail());
    }
}
