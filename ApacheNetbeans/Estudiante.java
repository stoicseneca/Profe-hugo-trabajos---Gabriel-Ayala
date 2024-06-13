
package proyecto1;

public class Estudiante extends Persona{
    
    private int codigoestudiante;
    private float notaFinal;
    
    public Estudiante(int codigoestudiante, float notaFinal, String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
        
        this.codigoestudiante = codigoestudiante;
        this.notaFinal = notaFinal;
    }
    public void mostrarDatos(){
        System.out.println("Nombre: " + getNombre() + "\nApellido: " + getApellido() + "\nEdad: " + getEdad() + "\nCodigo del estudiante: " + codigoestudiante +"\nnota final: " + 
                notaFinal);
    }
    
}
