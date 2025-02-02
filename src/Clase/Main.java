package Clase;

public class Main {

    public static void main(String[] args) {
        operativa_cuenta(2300.0f);
    }

    public static void operativa_cuenta(float cantidad) {
        CCuenta cuenta1;
        double saldoActual;
        
//este es el primer cambio
        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);

        try {
            cuenta1.retirar(cantidad);
        } catch (Exception e) {
            System.out.println("Fallo al retirar");
        }

        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidad);
        } catch (Exception e) {
            System.out.println("Fallo al ingresar");
        }
    }
}
