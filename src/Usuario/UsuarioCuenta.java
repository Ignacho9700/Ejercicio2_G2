/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

import Banco.Cuenta;
import java.util.Scanner;

/**
 *
 * @author ignac
 */
public class UsuarioCuenta {
    public Cuenta AltaCuenta(){
        Cuenta c1 = new Cuenta();
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el numero de cuenta");
        c1.setNumeroCuenta(leer.nextInt());
        System.out.println("ingrese el DNI");
        c1.setDNI(leer.nextInt());
        System.out.println("ingrese el saldo actual");
        c1.setSaldoActual(leer.nextDouble());
        return c1;
    }
      public void ingresar(Cuenta c1){
          Scanner leer = new Scanner(System.in);
        System.out.println("cuanto dinero desea ingresar?Su saldo actual es "+c1.getSaldoActual());
        Double ingreso=leer.nextDouble(); 
          System.out.println("saldo total " +(ingreso+c1.getSaldoActual()));
          c1.setSaldoActual(c1.getSaldoActual()+ingreso);
    }
        public void retirar(Cuenta c1){
          Scanner leer = new Scanner(System.in);
        System.out.println("cuanto dinero desea retirar?Su saldo actual es "+c1.getSaldoActual());
        Double retiro=leer.nextDouble(); 
        if(retiro<c1.getSaldoActual()){
          System.out.println("saldo total " +(c1.getSaldoActual()-retiro));
          c1.setSaldoActual(c1.getSaldoActual()-retiro);
    }else{
            System.out.println("supera el saldo actual");
        }
        }
      public void extraccion(Cuenta c1){
          Scanner leer = new Scanner(System.in);
        System.out.println("cuanto dinero desea retirar?Su saldo actual es y solo puede retirar un 20% del mismo "+c1.getSaldoActual());
        Double extraer=leer.nextDouble(); 
        if(extraer<=c1.getSaldoActual()/100*20){
            
         
          System.out.println("saldo total " +(c1.getSaldoActual()-extraer));
          c1.setSaldoActual(c1.getSaldoActual()-extraer);
          
    }else{
            System.out.println("supera el 20%");
        }
}
      public void saldo(Cuenta c1){
          Scanner leer = new Scanner(System.in);
          System.out.println("saldo actual"+c1.getSaldoActual());
              }      
       public void datos(Cuenta c1){
          Scanner leer = new Scanner(System.in);
          System.out.println("Datos (DNI"+c1.getDNI()+") Numero de cuenta("+c1.getNumeroCuenta()+") Saldo actual("+c1.SaldoActual+")");
              }       
}