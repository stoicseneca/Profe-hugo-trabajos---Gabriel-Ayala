/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_de_vehículos;

/**
 *
 * @author SENA
 */
public class Principal {
    public static void main(String[] args) {
        vehiculo vehiculo1 = new Coche();
        vehiculo vehiculo2 = new Motocicleta();
        vehiculo vehiculo3 = new Bicicleta();

        vehiculo1.mover();
        vehiculo2.mover();
        vehiculo3.mover();
    }
}
