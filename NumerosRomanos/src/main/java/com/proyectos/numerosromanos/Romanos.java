/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectos.numerosromanos;

import java.util.Scanner;

public class Romanos {
public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String Unidad[]={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
      String Decena[]={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
      String Centena[]={"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM","M"};
      System.out.println("Ingresa un número entre 1 y 1000");
      int N = sc.nextInt();
      if(N > 0 && N<=1000){
      int u=N%10;
      int d=(N/10)%10;
      int c=N/100;
      if(N>=100){
          System.out.println("En romano es: ");
          System.out.println(Centena[c]+Decena[d]+Unidad[u]);
      }else{
          if(N>=10){
              System.out.println("En romano es: ");
              System.out.println(Decena[d]+Unidad[u]);          
          }else{
              System.out.println("En romano es: ");
              System.out.println(Unidad[N]);          
          }          
      }          
    } 
      else {
     System.out.println("El número no esta dentro del rango, favor de intentarlo nuevamente");
     }
  }
}
