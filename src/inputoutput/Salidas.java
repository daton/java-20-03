
package inputoutput;

import java.io.*; 

public class Salidas {
    
    public static void main(String[] args) {
        //La siguiente clase vamos a generar un objeto de tipo String
        //de tipo serializado para saber cómo hace esta serializacion en 
        //automatico el navegador web con los Strings.
        //Primero generamos un objeto a guardar
        String objeto="Mi primer objeto serializado con Java Campos JC";
        
        //Primero generamos el archivo
        File file=new File("archivaldo");
        try{
        //Segundo paso muy importante: Vamos a indicar el sentido de la información
        //Si saldra informacion o entrara informacion a nuestra clase.
        //En este sale informacion hacia tu PC laptop salida==escritura
        FileOutputStream fos=new FileOutputStream(file);
        
        //El tercer paso es escribir el objeto ya.
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        //Escribimos el objeto qu en este caso es el String que se llama objeto
        oos.writeObject(objeto);
        //Cerramos los archivos
        oos.close();
        fos.close();
        System.out.println("Archivo generado con exito");
        
        }catch(FileNotFoundException e){   
            System.out.println("Algo malo ocurrio "+e.getMessage());  
        }
        catch(IOException e){ 
             System.out.println("Algo malo ocurrio "+e.getMessage());
        }
        
        
    }
    
}
