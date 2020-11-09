/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectos.objetosherencia;

import java.util.Scanner;
import Figuras.Cuadrado;
import Figuras.Cubo;

/**
 *
 * @author ale-s
 */
public class Objetos {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int opcion=0;
         //double lado=0;
         do{
             System.out.println("");
             System.out.println("Inserte una cantidad para medir un lado: ");
             double lado = sc.nextDouble();
            /* try{
                   
                   sc.nextLine();
                 }catch(Exception a){
                 a.printStackTrace();
            }*/
             do{
                 System.out.println("");
                 System.out.println("---BIENVENIDOS---");
                 System.out.println("");
                 System.out.println("Seleccione una opción deseada: ");
                 System.out.println("");
                 System.out.println("*****Cuadrado*****");
                 System.out.println("");
                 System.out.println("1 -  Área de un cuadrado");
                System.out.println("2 - Perímetro de un cuadrado");
                System.out.println("");
                System.out.println("*****Cubo*****");
                System.out.println("");
                System.out.println("3 - Volumen de un cubo");
                System.out.println("4 - Perímetro de un cubo");
                
                System.out.println("");
                System.out.println("0 - Salir del programa c:");
                System.out.println("");
                
                
                System.out.print('\u000C'); //Muestra en pantalla una flecha que indica el numero seleccionado
                 try{
                    opcion = sc.nextInt();
                    sc.nextLine();
                    
                }catch(Exception e){
                    e.printStackTrace();
                    
                }
                 
                
                 switch(opcion){
                     
                    default:
                        break;
             }
                 /*Cuadrado*/
                  if(opcion == 1 || opcion == 2){
                    Cuadrado cuadrado = new Cuadrado(lado);
                    if(opcion == 1){    
                        System.out.println("");
                        System.out.println("-Calculo del Área: Cuadrado-");
                        System.out.println("El área es: " + cuadrado.Area());
                        System.out.print(" \n\n");
                    }else{                   
                        System.out.println("");
                        System.out.println("-Calculo del Perímetro: Cuadrado-");
                        System.out.println("El área es: " + cuadrado.Perimetro());
                        System.out.print(" \n\n");
                    }
                    /*Cubo*/
                  }else if(opcion == 3 || opcion == 4){ 
                    Cubo cubo = new Cubo();
                    cubo.Lado1(lado);
                    if(opcion == 3){
                        System.out.println("");
                        System.out.println("-Calculo del Volumen: Cubo-");
                        System.out.println("El volumen es: " + cubo.Volumen());
                        System.out.print(" \n\n");
                    }else if(opcion == 4){
                        // Perimetro del cubo
                        System.out.println("");
                        System.out.println("Calculo del Perímetro: Cubo- ");
                        System.out.println("El área es: " + cubo.Perimetro()); 
                        System.out.print(" \n\n");
                    }
                    
             }
         }while(opcion != 5 && opcion != 0);  
       }while(opcion != 0);         
    }
}
