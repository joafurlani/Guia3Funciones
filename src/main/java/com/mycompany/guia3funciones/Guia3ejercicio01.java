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
public class Guia3ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea una aplicación que le pida dos números al usuario y este pued
        a elegir entre sumar, 
restar, multiplicar y dividir. La aplicación debe tener una función
        para cada operación matemática
y deben devolver sus resultados para imprimirlos en el main.  */
        
        Scanner leer = new Scanner (System.in);
        double resultado;
        System.out.println("Ingresa el primer numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segndo numero");
        int num2 = leer.nextInt();
        
        System.out.println("Indique la operacion que desea realizar"
                + "1 Sumar"
                + "2 Restar"
                + "3 Dividir"
                + "4 Multiplicar");
                              
        int opcion = leer.nextInt();
        
        switch (opcion){
            case 1:
                resultado= sumar(num1 , num2);
                System.out.println("El resultado es: " + resultado);
                break;
            case 2 :
                resultado=restar(num1,num2);
                System.out.println("El resultado es: " + resultado);
                break;
            case 3:
                resultado=dividir(num1, num2);
                System.out.println("El resultado es: " + resultado);
                break;
            case 4:
                resultado=multiplicar(num1 , num2);
                System.out.println("El resultado es: " + resultado);
                break;
            default:
                System.out.println("De 1 a 4");
        }
    }
    
    
    
    public static int sumar(int num1, int num2){
        return num1 + num2;
    }
    
    public static int restar(int num1, int num2){
     
        return num1 - num2;
    }
    public static int dividir(int num1, int num2){
     
        return num1 / num2;
    }
    public static int multiplicar(int num1, int num2){
        
        return num1 * num2;
    }
}
