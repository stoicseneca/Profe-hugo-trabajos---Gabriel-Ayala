/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca_Gestion;

/**
 *
 * @author SENA
 */
public class Revista extends Material {
    private final String nombreRevista;

    public Revista(String titulo, String autor, int anioPublicacion, String nombreRevista) {
        super(titulo, autor, anioPublicacion);
        this.nombreRevista = nombreRevista;
    }

    public String obtenerNombreRevista() {
        return nombreRevista;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Nombre de la revista: " + nombreRevista);
    }
}
