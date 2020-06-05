/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucion_figuras;

/**
 *
 * @author juan_
 */
public class ArregloTriangulos {
    
    public static void main(String[] args) {
        //Creamos el arreglo de tipo Triangulo
        Triangulo triangulos[]=new Triangulo[3];
        Triangulo tr1=new Triangulo();
        tr1.base=5;
        tr1.altura=6;
      //  T2 base =8.4 altura =7
        //T3 base =6 altura=13.5
        Triangulo tr2=new Triangulo();
        tr2.base=8.4f;
        tr2.altura=7;
        
        Triangulo tr3=new Triangulo();
          tr3.base=6;
          tr3.altura=13.5f;
        
          //El siguiente paso es agregarlos al arreglo:
          triangulos[0]=tr1;
          triangulos[1]=tr2;
          triangulos[2]=tr3;
          
          
        

     
    }
    
}
