/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author SENA
 */
public class Principal {
    public static void main(String[] args){
        Estudiante estudiante=new Estudiante(123, 3.5f,"Andres","Ruiz",23);
        Estudiante estudiante2=new Estudiante(345, 4.5f,"Sebas","Ruiz",26);
        
        estudiante.mostrarDatos();
        System.out.println("");
        estudiante2.mostrarDatos();
    }
}
3