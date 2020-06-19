/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

public class Primarios {
    public static void main(String args[]){
        //Los primarios: integrales: 
        //byte, short, int, long
        byte b=2;
        //2 a la 8 =256
        //El siguiente es el short
        //2 a la 16=65536/2=32768
        short s=2;
        //El siguiente es el int este es el de defecto
        //2 a la 32
        int i=2;
        //El mas grande de los integrales long
        //2 a la 64
        long l=2;
       //En programcion de sistemas SIEMPRE se deben
       //cambiar datos de un tipo a otro.
     //  b=i;
       
       
       i=b;
       l=s;
       
       s=b;
       
       i=s;
     //  b=l;
       l=i;
  //    s=i;
    //Nota importante: Cuando asignan datos de
    //un tipo a otro se le denomina CASTING
    //En español se conoce como PROMOCION
    //Cuando no podemos promover de un tipo
    // de dato a otro por CUESTION DE TAMAÑO.
    //A ESTO SE LE DENOMINA ERROR DE CASTING
    
    //Hasta aqui los intregales
    //Continuamos con los flotantes (decimales)
    //El float es de 2 a la 32
    float f=2.0f;
    
    //El mas grande de esta pequeña familia double
    //El double e de 2 a 64
    //Nota: El double es el defecto cuando tu escribes
    //un decimal el codigo
    double d=2.0;
    
    
       
        
        
        
        
    }
}
