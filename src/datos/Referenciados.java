/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author juan_
 */
public class Referenciados {
    
    public static void main(String args[]){
        //Vamos a ver aqui en esta clase al referenciado
        //mas importantes. TODOS LOS TIPOS DE DATOS REFERENCIADOS
        //SON LOS QUE SE CONSTUYEN POR MEDIO DE UNA CLASE
        //EL REFERENCIADO MAS IMPORTANTE ES EL String
        String mensaje="Hola mundo";
        String falsoNumero="5";
        int verdaderoNumero=5;
        int suma=10+verdaderoNumero;
        //El siguiente es incorrecto proque no se puede asignar
        //un string a un primario
       // int malo=10+falsoNumero;
       
       //Generalmente un texto siempre recibe String
       //aun cuando tu escribas un numero
       //siempre tienes que convertirlo a el numerico 
       //primario
       
        int numeroPromovido=Integer.parseInt(falsoNumero);
        
    }
    
}
