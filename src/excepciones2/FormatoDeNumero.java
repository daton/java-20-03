
package excepciones2;

public class FormatoDeNumero {
    
    public static void main(String[] args) {
     //Esta excepcion es muy importante cuando alimentamos
     //datos en una campo de Texto por medio de Java.
     String falsoNumero="4";
     //Lo transformamos a  un numero entereo usando la clase
     //wrapper (envoltorio) Integer
     
  int numero=     Integer.parseInt(falsoNumero);
   //  float x=Float.parseFloat(falsoNumero);
  
  
          int producto=2*numero;
          System.out.println("El doble del numero es "+producto);
    }
 
}
