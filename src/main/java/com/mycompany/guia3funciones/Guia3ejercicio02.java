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
public class Guia3ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Diseñe una función que pida el nombre y la edad de N personas e
        imprima los datos de las personas ingresadas por teclado 
e indique si son mayores o menores de edad. Después de cada persona, 
        el programa debe preguntarle al usuario 
si quiere seguir mostrando personas y frenar cuando el usuario ingrese
        la palabra “No”.
 */
        
        Scanner leer = new Scanner(System.in);
        String nombre;
        int edad;
        String confirmacion;
        
        
        do{
            System.out.println("Ingrese el nombre de la persona");
        nombre=leer.next();
        System.out.println("Ingrese la edad");
        edad=leer.nextInt();
        mostrarDatos(nombre, edad);
            System.out.println("Desea seguir agregando personas?");
            confirmacion=leer.next();
            confirmacion= confirmacion.toLowerCase();
            
            
        } while(!(confirmacion.equals("no")));
        
        
        
        
        
    }
    
    public static void mostrarDatos(String nombre, int edad){
        System.out.println("El nombre ingresado es: " + nombre);
        if (edad > 18 ){
            System.out.println("Es mayor de edad");
        }else {
            System.out.println("No es mayor de edad");
        }
        
        
        
        
    }
}
