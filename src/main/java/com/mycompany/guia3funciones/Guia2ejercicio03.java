/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.guia3funciones;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia2ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Crea una aplicación que a través de una función nos convierta 
        una cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, 
        la cantidad de euros y la moneda a convertir que será una cadena, este no 
devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
i. * 0.86 libras es un 1 €
ii. * 1.28611 $ es un 1 €
iii. * 129.852 yenes es un 1 € */
        Scanner leer = new Scanner(System.in);
        String moneda;
        double monto;
        System.out.println("Ingresa el monto a convertir");
        monto=leer.nextDouble();
        System.out.println("Elige el tipo de moneda a convertir segun las opciones");
        System.out.println("1_Libras");
        System.out.println("2_Dolar");
        System.out.println("3_Yenes");
        moneda=leer.next();
        
        convertir(monto, moneda);
        
    }
    
    public static void convertir( double monto , String moneda){
        double resultado;
        if (moneda.equals("1") || (moneda.equals("2"))||
                (moneda.equals("3"))){
            switch(moneda){
            case "1":
                resultado = monto * 0.86;
                System.out.println("El total en libras es: " + resultado);
                break;
            case "2":
                resultado = monto * 1.28611;
                System.out.println("El total en dolares es: " +resultado);
                break;
            case "3":
                resultado = monto * 129.852;
                System.out.println("El total en Yenes es: " + resultado);
                
        }
        
                
        }
        
    }
    
}
