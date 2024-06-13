/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca_Gestion;

/**
 *
 * @author SENA
 */
public class Material {
    private final String titulo;
    private final String autor;
    private final int anioPublicacion;
    private boolean prestado;

    public Material(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.prestado = false;
    }

    public String obtenerTitulo() {
        return titulo;
    }

    public String obtenerAutor() {
        return autor;
    }

    public int obtenerAnioPublicacion() {
        return anioPublicacion;
    }

    public void mostrarInformacion() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de publicacion: " + anioPublicacion);
    }

    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println("El material ha sido prestado.");
        } else {
            System.out.println("El material ya está prestado.");
        }
    }

    public void devolver() {
        if (prestado) {
            prestado = false;
            System.out.println("El material ha sido devuelto.");
        } else {
            System.out.println("El material no estaba prestado.");
        }
    }
}


