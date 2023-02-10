
package Ejercicio1.Vista;

import Ejercicio1.Modelos.Planeta; 
import Ejercicio1.Modelos.SistemaSolar; 
import javax.swing.JOptionPane;
/**
 * NOTA: El programa se puede optimizar agregando ciclos do while
 * @author dipom
 */
public class Vista1 {
    
    

    public static void main(String[] args) {
        int id_buscar1;
        int id_buscar2;
        /**
        * Variables que se usarán en caso de solicitar ingreso de texto 
        * (parámetros)
        * int idPlaneta;  
        *double masa; 
        *double densidad; 
        *double diametro; 
        *double distanciaAlSol;  
        *String nombre;
        */
        
        /**
        * NOTA: Se tomó como referencia los valores reales de los planetas, pero
        * no son los valores exactos, ya que estos se encuentran en unidades muy 
        * grandes.
        * 
        * 
        * 
        */
        SistemaSolar ss = new SistemaSolar();
        
        Planeta p1 = new Planeta(1, 5.972, 5.51, 12.742, 150000, "Tierra");
        if(ss.agregarPlaneta(p1)){
            System.out.println("Planeta agregado");
        }
        else{
            System.out.println("El planeta ya existe");
        }
        Planeta p2 = new Planeta(2, 6.39, 3.93, 6.779, 249000, "Marte"); 
        if(ss.agregarPlaneta(p2)){
            System.out.println("Planeta agregado");
        }
        else{
            System.out.println("El planeta ya existe");
        }
        
        Planeta p3 = new Planeta(3, 9.43, 2.077, 946,371446, "Ceres"); 
        if(ss.agregarPlaneta(p3)){
            System.out.println("Planeta agregado");
        }
        else{
            System.out.println("El planeta ya existe");
        }
        
        Planeta p4 = new Planeta(4, 1.898, 1.33, 139.820, 778000, "Jupiter");
        if(ss.agregarPlaneta(p4)){
            System.out.println("Planeta agregado");
        }
        else{
            System.out.println("El planeta ya existe");
        }
        
        
        
        
        do{
        id_buscar1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el id del primer planeta"));
        id_buscar2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el id del segundo planeta"));
        if(id_buscar1 == id_buscar2){
            JOptionPane.showMessageDialog(null, "Es el mismo planeta. Ingresar los datos nuevamente");
        } 
        }while(id_buscar1 == id_buscar2);
        
        
        
        if((ss.buscarPlaneta(id_buscar2) && ss.buscarPlaneta(id_buscar2)) == false){
            System.out.println("Error, un planeta no existe");
        }
        else{
            double distancia_entre_planetas; 
        distancia_entre_planetas = Double.parseDouble(JOptionPane.showInputDialog(null, 
                    "Ingrese la distancia entre los planetas")); 
       
        JOptionPane.showMessageDialog(null, ss.calculoAtraccionGravitatoria(id_buscar1, id_buscar2, distancia_entre_planetas) + " Kilometros");
        }
        
                
           
    }

}
