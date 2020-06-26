/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones2;


public class Validaciones {
    public static void validarEdadNoNegativa(int edad)throws EdadNegativaException{
        if(edad<0)throw  new EdadNegativaException();
    }
}
