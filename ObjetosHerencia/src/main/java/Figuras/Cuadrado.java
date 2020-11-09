/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

public class Cuadrado {
        protected double lado = 0;  //protected para no usar super!

    public void Lado1(double ladito){
        this.lado = ladito;
    }

    public Double Lado(){
        return this.lado;
    }    
    //Función para calcular el area
    public Double Area(){
        return Math.pow(this.lado, 2);
    }

    public Double Perimetro(){
        return this.lado * 4;
    }

    public Cuadrado (){
        this.lado = 0;
    }
     
    public Cuadrado(double ladito){
        this.lado = ladito;
    }
    
}
