/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constrcuctores;

import javax.swing.JFrame;


public class Aplicacion {
    
    public static void main(String[] algo) {
        //Aqui dentro vamos a generar muchos objetos
        //A esto se le llama declaracion de la variable
        JFrame ventana=new JFrame("Primera app");//A la parte de la derecha tambien se le llama intanciacion
        System.out.println("El primer argumnto "+algo[0]);
        //A un objeto para que podamos interaccionar con el debemos mandarle
        //mensajes por medio de metodos
        ventana.setSize(400,400);
        
       // ventana.setVisible(true);
       
       //Vamos a generar un producto
       Producto p1=new Producto();
       p1.setNombre("Cheetos");
       //A proposito NO VAMOS A ASIGNAR VALORES A SUS ATRIBUTOS
       System.out.println("El nombre de este producto es "+p1.getNombre());
       System.out.println("El precio de este producto es "+p1.getPrecio());
        
       Abarrotes nose=new Abarrotes();
       nose.setNombre("Chocolate abuelita"); 
  
        
    }
    
}
