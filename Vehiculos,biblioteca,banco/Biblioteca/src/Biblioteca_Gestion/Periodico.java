/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca_Gestion;

/**
 *
 * @author SENA
 */
public class Periodico extends Material {
    private final String nombrePeriodico;

    public Periodico(String titulo, String autor, int anioPublicacion, String nombrePeriodico) {
        super(titulo, autor, anioPublicacion);
        this.nombrePeriodico = nombrePeriodico;
    }

    public String obtenerNombrePeriodico() {
        return nombrePeriodico;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Nombre del periodico: " + nombrePeriodico);
    }
}
