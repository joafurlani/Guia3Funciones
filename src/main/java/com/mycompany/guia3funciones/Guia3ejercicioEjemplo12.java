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
public class Guia3ejercicioEjemplo12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea un procedimiento EsMultiplo que reciba los dos números pasados
        por el
usuario, validando que el primer número múltiplo del segundo e imprima si el
primer número es múltiplo del segundo, sino informe que no lo son.*/
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el primer numero ");
        int num1=leer.nextInt();
        System.out.println("Ingresa el segundo numero");
        int num2=leer.nextInt();
        multiplo(num1,num2);
        
        
    }
    
    public static void multiplo(int num1, int num2){
        if (num1< num2){
            if(num2 % num1 == 0){
                System.out.println("El primer numero es multiplo");
            }else {
                System.out.println("El primer numero no es multiplo");
            }
            
        }else if( num1 == num2 ){
                    System.out.println("Los numeros son iguales");
           }else {
               if(num1 % num2 == 0){
                   System.out.println("El segundo numero es multiplo");   
           }else {
                   System.out.println("El segundo numero no es multiplo"); 
               }       
           }
    }
}
