/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

public class Cubo extends Cuadrado{
    public Double Volumen(){
        return Math.pow(this.lado, 3);
    }
    
    @Override
    public Double Perimetro(){
        return this.lado*12;
    }
     
    public Double Area(){
        return (6*(lado*lado));
    }
    
}
