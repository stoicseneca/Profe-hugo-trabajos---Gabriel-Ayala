/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentabancaria;

public class Principal {
    public static void main(String[] args) {
        // Crear una cuenta bancaria
        Cuenta_Bancaria cuenta = new Cuenta_Bancaria(777, "Juan Felipez", 1000.0);

        // Acceder a los atributos y métodos de la cuenta
        System.out.println("Numero de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("Titular de la cuenta: " + cuenta.getNombreTitular());
        System.out.println("Saldo inicial: " + cuenta.getSaldo());

        // Realizar operaciones
        cuenta.depositar(500.0);
        cuenta.retirar(200.0);
        cuenta.retirar(2000.0); // Esto debería generar un error
    }
}







