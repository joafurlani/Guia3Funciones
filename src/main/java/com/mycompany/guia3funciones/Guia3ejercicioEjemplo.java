/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia3funciones;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia3ejercicioEjemplo {

    public static void main(String[] args) {
        /* Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
la siguiente manera: cada vocal se reemplaza por el carácter que se indica en
la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios.
a e i o u
@ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la
codificación correspondiente. Utilice la estructura “según” para la
transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
*/
        
     Scanner leer = new Scanner(System.in);
     String fraseIngresada;
        System.out.println("Ingrese frase a codificar");
        fraseIngresada = leer.nextLine();
        fraseIngresada= fraseIngresada.toLowerCase();
        String retorno= cambiar(fraseIngresada);
        System.out.println(retorno);
        
        
    }
    
   public static String cambiar(String frase){
       String frase2= "";
       String letra = "";
       for (int i = 0; i <= frase.length()- 1; i++){
           if (frase.substring(i, i + 1).equals("a") ||
                   frase.substring(i, i + 1).equals("e") ||
                   frase.substring(i, i + 1).equals("i") ||
                   frase.substring(i, i + 1).equals("o") ||
                   frase.substring(i, i + 1).equals("u") ){
               switch (frase.substring(i, i + 1)){
                   case "a":
                       letra= "@";
                       break;
                   case "e":
                       letra = "#";
                       break;
                   case "i":
                       letra = "$";
                       break;
                   case "o":
                       letra = "%";
                       break;
                   case "u":
                       letra = "^";
                       break;
               }
           }else {
               letra= frase.substring(i , i + 1);
           }
           frase2 = frase2.concat(letra);         
       }
       
       return frase2;
   }
}

/*
public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String palabra;
        do {
            System.out.println("Ingrese una palabra o frase que termine con un punto:");
            palabra = leer.nextLine();
        } while (!palabra.endsWith("."));
        cambiarLetras(palabra);
    }

    public static void cambiarLetras(String palabra) {
        //a = @ - e = # - i = $ - o = % - u = *
        String palabraAuxiliar = "";
        for (int i = 0; i < palabra.length(); i++) {
            switch (palabra.substring(i, i + 1)) {
                case "a":
                case "A":
                    palabraAuxiliar = palabraAuxiliar.concat("@");
                    break;
                case "e":
                case "E":
                    palabraAuxiliar = palabraAuxiliar.concat("#");
                    break;
                case "i":
                case "I":
                    palabraAuxiliar = palabraAuxiliar.concat("$");
                    break;
                case "o":
                case "O":
                    palabraAuxiliar = palabraAuxiliar.concat("%");
                    break;
                case "u":
                case "U":
                    palabraAuxiliar = palabraAuxiliar.concat("*");
                    break;
                default:
                    palabraAuxiliar = palabraAuxiliar.concat(palabra.substring(i, i + 1));
            }
        }
        System.out.println("La palabra cambiada es: " + palabraAuxiliar);
    }
}
*/