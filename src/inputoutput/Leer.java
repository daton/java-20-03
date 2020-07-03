/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputoutput;

import java.io.*;
//Ya hasta aqui termina la serializacion con el ejemplo basico
public class Leer {

    public static void main(String[] args) {
        //Para Leer es lo mismo pero a la inversa
        //Poner el archivo que vamos a leer

        File file = new File("archivaldo");
        try {
            //Indicamos el sentido de la informacion en este caso es leer, es decir de entrada
            FileInputStream fis = new FileInputStream(file);

            //Leemos el contendio
            ObjectInputStream ois = new ObjectInputStream(fis);
            //Ahora si leemos. ESTE RENGLON ES MUY COMPLEJO
            String recobrado = (String) ois.readObject();
            //Ya termino el rengln dificil ahora si, vemos el contenido
            System.out.println(recobrado);
            

        } catch (FileNotFoundException e) {
    System.out.println("Algo malo ocurrrio "+e.getMessage());
        } catch (IOException e) {
   System.out.println("Algo malo ocurrrio "+e.getMessage());
        } catch (ClassNotFoundException e) {
   System.out.println("Algo malo ocurrrio "+e.getMessage());
        }
    }

}
