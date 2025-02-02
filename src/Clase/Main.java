package Clase;
/**
 * Clase principal que contiene el método main y la lógica para operar con la cuenta bancaria.
 * @author SOFIA MARTINEZ GARCIA
 */

public class Main {

    public static void main(String[] args) {
       //Método principal que inicia la ejecución del programa.
        operativa_cuenta(2300.0f);
    }
    /**
     * Método que realiza operaciones sobre una cuenta bancaria.
     * Crea una cuenta, muestra el saldo, intenta retirar una cantidad y luego ingresa la misma cantidad.
     */
    public static void operativa_cuenta(float cantidad) {
        CCuenta cuenta1;
        double saldoActual;
        
// Creación de una cuenta bancaria con un titular, número de cuenta, saldo inicial y tipo de interés
        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        // Obtiene el saldo actual de la cuenta y lo muestra en consola
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);
// Intenta retirar la cantidad especificada, manejando posibles excepciones
        try {
            cuenta1.retirar(cantidad);
        } catch (Exception e) {
            System.out.println("Fallo al retirar");
        }
// Intenta ingresar la cantidad especificada, manejando posibles excepciones
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidad);
        } catch (Exception e) {
            System.out.println("Fallo al ingresar");
        }
    }
}
