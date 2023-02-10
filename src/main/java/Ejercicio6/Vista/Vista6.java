
package Ejercicio6.Vista;

import javax.swing.JOptionPane;
import java.util.Vector;
/**
 *
 * @author Diego Posada
 */
public class Vista6 {
    
    public static void main(String[] args){
     
       
        Vector vector = new Vector();
        int numero; 
   
       numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero")); 
       vector.addElement(numero);
             
        for(int i=0; i< vector.size(); i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero")); 
            vector.addElement(numero);
            System.out.println(vector.elementAt(i) + "\t");
        
            if(vector.get(i) == vector.get(i+1)){
        
                break;
            }
        }
    
    }
    
}
