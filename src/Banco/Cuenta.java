/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author ignac
 */
public class Cuenta {
    public int NumeroCuenta;
    public int DNI;
    public double SaldoActual;

    public Cuenta() {
    }

    public Cuenta(int NumeroCuenta, int DNI, double SaldoActual) {
        this.NumeroCuenta = NumeroCuenta;
        this.DNI = DNI;
        this.SaldoActual = SaldoActual;
    }

    public int getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(int NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public double getSaldoActual() {
        return SaldoActual;
    }

    public void setSaldoActual(double SaldoActual) {
        this.SaldoActual = SaldoActual;
    }
    
    
  
    
}
