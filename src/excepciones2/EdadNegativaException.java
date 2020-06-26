/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones2;

/**
 *
 * @author juan_
 */
public class EdadNegativaException extends Exception{
    
    public EdadNegativaException(){
        super("NO existen edades negativas");
    }
}
