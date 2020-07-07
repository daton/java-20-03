/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuestionario;

import java.util.*;

public class Aplicacion {

    public static void main(String[] args) {
        //Con el modelo construido debemos representar uestra pregunta
        //y mostrarala
        //Primero creamos las opciones
        Opcion op1 = new Opcion();
        op1.setTitulo("Londres");
        op1.setCorrecta(false);

        Opcion op2 = new Opcion();
        op2.setTitulo("Roma");
        op2.setCorrecta(false);

        Opcion op3 = new Opcion();
        op3.setTitulo("Paris");
        op3.setCorrecta(true);

        Opcion op4 = new Opcion();
        op4.setTitulo("Oslo");
        op4.setCorrecta(false);

        //Sigue el arreglo de opcion
        Opcion[] opciones = {op1, op2, op3, op4};
        Pregunta p1 = new Pregunta();
        p1.setTitulo("¿Cual es la capital de Francia");
        p1.setOpciones(opciones);

        //Vamos a adaptar el cuestioanario a lo que ya teniamos
        Cuestionario c = new Cuestionario();
        //Creamos el list de preguntas
        List<Pregunta> preguntas = new ArrayList<>();
        //Se agrega a este list la unica prgunta que tenemos
        preguntas.add(p1);
        //A este list le vamos a proporcionar el valor del correspondiente
        //cuestioanrio
        c.setPreguntas(preguntas);

        for (Pregunta p : preguntas) {

            System.out.println(p.getTitulo());
            for (Opcion o : opciones) {
                System.out.println(o.getTitulo() + " " + o.isCorrecta());
            }
        }
        

    }

}
