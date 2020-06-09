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
        //Para usar la herencia vamos a crear un Arreglo de Figuras
        Figura []figuras=new Figura[3];
        //AQUI VIENE LA MAGIA!!! PORQUE EN ESE ARREGLO PODEMOS
        //AGREGAR elemento DE LOS SUBTIPOS.
        //Creamos un triangulo
        Triangulo t1=new Triangulo();
        t1.altura=6;
        t1.base=5;
        //Un Cuadrado
        Cuadrado c1=new Cuadrado();
        c1.setLado(5); 
        //Generamo un circulo
        Circulo cir1=new Circulo();
        cir1.r=5.2f;
        //Ahora llenamos los 3 elementos de nuesto arreglo con ellas
        figuras[0]=t1;
        figuras[1]=c1;
        figuras[2]=cir1;
        
        //La ventaja esta en que al invoca el metodo solo necesitas
        //un solo tipo: EL  SUPER TIPO
        for(Figura f:figuras){
            System.out.println("El area es: "+f.calcularArea());
        }
        
        
        

    }
    
   

}
