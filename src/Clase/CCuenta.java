package Clase;
/**
 * Clase que representa una cuenta bancaria.
 * Esta clase permite gestionar los atributos y operaciones de una cuenta,
 * como el nombre del titular, número de cuenta, saldo y tipo de interés.
 * @author SOFIA MARTINEZ GARCIA
 */
public class CCuenta {
// Estas son variables de instancia que almacenan la información básica de la cuenta bancaria
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }
/**
     * Constructor de la clase CCuenta con parámetros.
     * Inicializa los atributos de la cuenta con los valores proporcionados.
     *
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de cuenta.
     * @param sal Saldo inicial de la cuenta.
     * @param tipo Tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
//Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInterés() {
        return tipoInterés;
    }

    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

        public double estado()
    {
        return saldo;
    }
/**
     * Realiza un ingreso en la cuenta, aumentando el saldo.
     * 
     * @param cantidad La cantidad a ingresar.
     * @throws Exception Si la cantidad a ingresar es negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
/**
     * Realiza un retiro de la cuenta, disminuyendo el saldo.
     *
     * @param cantidad La cantidad a retirar.
     * @throws Exception Si la cantidad a retirar es negativa o si no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
