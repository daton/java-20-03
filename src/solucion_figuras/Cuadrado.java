/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucion_figuras;


public class Cuadrado extends Figura{
 //Los atributos siempre van con el modificador private   
  private float lado; 
 

    @Override
    public float calcularArea() {
       float res=lado*lado;
       return res;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
  
}
