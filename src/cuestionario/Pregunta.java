/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuestionario;

//Cuando una clase (Pregunta) se compone de otras clase (Opcion) 
//a esto en orientacion a objetos se le conoce como patrones DE DISEÑO
//creacionales, a este creacional se le llama: COMPOSICION-AGREGACIÓN.
public class Pregunta {
   private String titulo;
   private Opcion opciones[];

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Opcion[] getOpciones() {
        return opciones;
    }

    public void setOpciones(Opcion[] opciones) {
        this.opciones = opciones;
    }
}
