/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prgitejemplo;

/**
 * @author MFB
 */
public class GitAux {
    
    public void metodoAlumno1(){
        System.out.println("metodo 1");
	System.out.println("modificado por alumno1"); // alumnno1
    }
    
    public void metodoAlumno2(){
        System.out.println("metodo 2");
	System.out.println("modifcado por alumno 2"); // alumno 2
    }
    
    public void metodoComunitario(){
        // Comentario incluido para pruebas
	System.out.println("Aqui escribimos todos");
	// modificaciones alumno1
	System.out.println("Alumno 1 inserta esta sentencia");
	//modificaciones alumno 2
	System.out.println("Alumno 2 inserta esta sentencia");
    }

    public void testGitAux(){
    	// metodo rama testing
    	System.out.println("Metodo de testing");
    }
}
