package cuentas;

/**
 * Gestión de la cuenta y su saldo para varias acciones sobre la misma.
 * @since 11-02-2021
 * @version 1.0
 * @author Noelia
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor d la clase principal
     */
    public CCuenta() {
        
    }

    /**
     *
     * @param nom nombre
     * @param cue cuenta
     * @param sal saldo de la cuenta
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     *
     * @return retorna el saldo.
     */
    public double estado() {
        return saldo;
    }

    /**
     *
     * @param cantidad
     * @throws Exception en caso de saldo negativo
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }

    /**
     *
     * @param cantidad
     * @throws Exception en caso de que el saldo sea menor a la cantidad a retirar
     * o si la cantidad es negativa.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }

    /**
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @return cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     *
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     *
     * @return Tipo de interes
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @param cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     *
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     *
     * @param tipoInterés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

}
