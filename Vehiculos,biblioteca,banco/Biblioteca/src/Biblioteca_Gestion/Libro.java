/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca_Gestion;

/**
 *
 * @author SENA
 */
public class Libro extends Material {
    private final int numPaginas;

    public Libro(String titulo, String autor, int anioPublicacion, int numPaginas) {
        super(titulo, autor, anioPublicacion);
        this.numPaginas = numPaginas;
    }

    public int obtenerNumPaginas() {
        return numPaginas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Numero de paginas: " + numPaginas);
    }
}
