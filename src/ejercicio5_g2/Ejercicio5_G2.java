/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_g2;

import Banco.Cuenta;
import Usuario.UsuarioCuenta;
import java.util.Scanner;

/**
 *
 * @author ignac
 */
public class Ejercicio5_G2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta */
        UsuarioCuenta cs = new UsuarioCuenta();
        Cuenta c1 = cs.AltaCuenta();
        Scanner leer = new Scanner(System.in);
      
        int opcion = 0;
        do {
            System.out.println("Elija una opcion");
            System.out.println("1 Ingresar dinero");
            System.out.println("2 retirar dinero");
            System.out.println("3 Extraccion rapida");
            System.out.println("4 Consultar saldo");
            System.out.println("5 Ver datos");
            System.out.println("6 Salir");
            opcion = leer.nextInt();
            switch (opcion) {

                case 1:
                    cs.ingresar(c1);
                    break;
                case 2:
                    cs.retirar(c1);
                    break;
                case 3:
                    cs.extraccion(c1);
                    break;
                case 4:
                    cs.saldo(c1);
                    break;
                case 5:
                    cs.datos(c1);
                    break;
                case 6:
                    break;
            }
        } while (opcion != 6);

    }

}


