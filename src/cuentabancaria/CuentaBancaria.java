/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancaria;
import java.lang.Object;
import java.time.LocalDate;

/**
 *
 * @author JESUS
 */
public class CuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Object CuentaBancaria = new Object();
                               
        final double DEFAULT_MAX_DESCUBIERTO= 0.0; // Constante
        final double DEFAULT_SALDO= 0.0; // Constante
        final double MAX_SALDO= 5.0; // Constante
        final int MIN_YEAR= 1900; // Constante
        final double MAX_EMBARGO= 100.0; // Constante
        final double MIN_EMBARGO= 0.0; // Constante
        final double MAX_DESCUBIERTO= -2000.0; // Constante
        boolean isEmbargada= (false|true); // Variable
        long getDiasCuenta= 55; // Variable
        int getNumCuentasEmbargadas= 0; // Variable
        double porcentajeEmbargo= 1.0; // Variable
        double IllegalArgumentException= -1.0; // ¿Variable?
        
        System.out.println("1.- Descubierto máximo permitido al crear una cuenta: " + MAX_DESCUBIERTO + " euros" ); // Constant Field Values
        System.out.println("" );
        System.out.println("2.- Embargo mínimo de una cuenta: " + MIN_EMBARGO + " %" ); // Constant Field Values
        System.out.println("" );
        System.out.println("3.- Embargo máximo de una cuenta: " + MAX_EMBARGO + " %" ); // Constant Field Values
        System.out.println("" );
        System.out.println("4.- Año mínimo para la creación de una cuenta: " + MIN_YEAR + " d. C." ); // // Constant Field Values
        System.out.println("" );
        System.out.println("5.- Saldo máximo para una cuenta:: " + MAX_SALDO + "E7 euros" ); // // Constant Field Values
        System.out.println("" );
        System.out.println("6.- Saldo inicial por omisión para una cuenta:: " + DEFAULT_SALDO + " euros" ); // // Constant Field Values
        System.out.println("" );
        System.out.println("7.- Límite de descubierto por omisión para una cuenta: " + DEFAULT_MAX_DESCUBIERTO + " euros"); // // Constant Field Values
        System.out.println("" );
        System.out.println("8.- Fecha actual: " + LocalDate.now()); // Class
        System.out.println("");
        System.out.println("9.-La cuenta está embargada: " + isEmbargada); // Indica si la cuenta está embargada
        System.out.println("");
        System.out.println("10.-Antigüedad de la cuenta (número de días): " + getDiasCuenta); // Obtiene la antigüedad de la cuenta en días
        System.out.println("");
        System.out.println("11-número de cuentas embargadas: " + getNumCuentasEmbargadas); // Obtiene el número de cuentas embargadas en el momento actual
        System.out.println("");
        System.out.println("12.- Porcentaje de embargo (mayor que 0.00 y hasta 100.0 como máximo): " + porcentajeEmbargo + " %" ); // Embargo de una cuenta
        System.out.println("");
         System.out.println("13.- Si el porcentaje de embargo no es válido: " + IllegalArgumentException + " %" ); // Embargo de una cuenta
        System.out.println("");
        
 }
}
 
