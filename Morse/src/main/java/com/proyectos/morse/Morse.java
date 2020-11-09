/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectos.morse;

import java.util.Scanner;

/**
 *
 * @author ale-s
 */
public class Morse {
    static String[] abecedario = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L",
                  "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", 
                  "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
                  " " };

    static String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
            ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
            "-----", " " };
    static Scanner scanner = new Scanner(System.in); 
    public static void main(String args[]) {
                System.out.println("Inserta una frase/ palabra (en mayusculas) para convertir a morse: ");
    	String palabra = scanner.nextLine();
                
                aMorse(palabra);
                System.out.println("  ");
                System.out.println("Por favor inserta codigo morse para convertir a texto: ");
                String morsep = scanner.nextLine();
                aAbc(morsep);
                System.out.println(" ");
    }
    
    // funcion para decifrar el codigo morse
    public static void aAbc(String usuario_morse){
        String[] vector_morse = usuario_morse.split(" ");
        System.out.println(" ");
        // este ciclo es para interactura con cada uno de los valores que no da el usuario
        for(int i=0 ; i<vector_morse.length; i++){
            // este ciclo lo usamos para comparar lo que no dio el usuario y nuestro vector de los codigos morse
            for(int j=0; j<morse.length ;j++){
                if(vector_morse[i].equals(morse[j])){
                    // con esto ponemos el indice que corresponde al valor en el abecedario
                    System.out.print(abecedario[j]);
                }
            }
            // solucion para poner los espacios 
            if(vector_morse[i].equals("")){
                System.out.print(" ");
                i++;
            }
        }
    }
    
    // funcion para crear el codigo morse
    public static void aMorse(String usuario){
         // este ciclo es para interactura con cada uno de los valores que no da el usuario
        for(int i=0; i < usuario.length() ; i++){
            char aux = usuario.charAt(i);
            // este ciclo lo usamos para comparar lo que no dio el usuario y nuestro vector del abecedario
            for(int j=0; j<abecedario.length ;j++){
                if(String.valueOf(aux).equals(abecedario[j])) {
                    // con esto imprimimos el valor que corresponde del codigo morse
                    System.out.print(morse[j]+" ");
                }
            }
        }
    }
}
