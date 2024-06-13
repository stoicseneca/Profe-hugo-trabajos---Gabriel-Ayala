/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca_Gestion;

/**
 *
 * @author SENA
 */
public class Principal {
    public static void main(String[] args) {
        Libro libro = new Libro("El senor de los anillos", "J.R.R. Tolkien", 1954, 1000);
        libro.mostrarInformacion();
        libro.prestar();
        libro.devolver();

        Revista revista = new Revista("National Geographic", "National Geographic Society", 2021, "Junio");
        revista.mostrarInformacion();
        revista.prestar();

        Periodico periodico = new Periodico("The New York Times", "The New York Times Company", 2021, "11 de junio");
        periodico.mostrarInformacion();
        periodico.devolver();
    }
}

