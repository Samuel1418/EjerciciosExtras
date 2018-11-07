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
public class ExemploStatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Alumno alumno1 = new Alumno("Ana", 10f, "manuelito@hotmail.com", "722290090");
        alumno1.amosar();
        Alumno alumno2 = new Alumno("Pepe", 8f, "pepe@gmail.com", "685147529");
        alumno2.amosar();
        alumno1.amosar();
        System.out.println("referencia " + alumno1.getreferencia());

        alumno1.amosar2();

        Alumno alumno3 = new Alumno() {
        };
        alumno3.setNome("Arturo");
        alumno3.setNota(8f);
        alumno3.setDatosEmail("hola@gmail.com");
        alumno3.setDatosTelf("636363596");
        alumno3.amosar2();

    }

}
