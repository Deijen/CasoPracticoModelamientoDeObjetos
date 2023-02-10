
package Ejercicio5.Vista;

import Ejercicio5.Modelos.ControlFerry;
//import Ejercicio5.Modelos.Vehiculo;
import Ejercicio5.Modelos.Avion;
import Ejercicio5.Modelos.Camion;
import Ejercicio5.Modelos.Coche;
import javax.swing.JOptionPane;

/**
 *
 * @author dipom
 */
public class Vista5 {
     public static void main(String[] args){
         ControlFerry cf = new ControlFerry();
         
         int opcion; //Variable para el switch
         boolean salida = false; //Variable para salir del doWhile 
         
         
         do{
         
             opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Escoga una opción: "
                 + "\n1) Crear vehículos"
                 + "\n2) Buscar vehículo (No se pide. Se puede hacer después)"
                 + "\n3) Determinar tipo vehículo"
                 + "\n4) Salir "));  
             
             
             switch (opcion) {
                 case 1:
                    Avion av1 = new Avion(4, 1, 100, true, 20, 1, "Aire", 5);
                    if(cf.agregarVehiculo(av1) == true){
                         System.out.println("Vehículo agregado con éxito");
                     }
                     else{
                         System.out.println("Ya existe un vehíclo con la matricula ingresada");
                     }
                    
                    Avion av2 = new Avion(4, 2, 150, true, 20, 1, "Aire", 5);
                    if(cf.agregarVehiculo(av2) == true){
                         System.out.println("Vehículo agregado con éxito");
                     }
                     else{
                         System.out.println("Ya existe un vehíclo con la matricula ingresada");
                     }
                    
                    Camion cam1 = new Camion(50, 100, 3, 2, true, 4, 2, "tierra", 2);
                    if(cf.agregarVehiculo(cam1) == true){
                         System.out.println("Vehículo agregado con éxito");
                     }
                     else{
                         System.out.println("Ya existe un vehíclo con la matricula ingresada");
                     }
                    
                    Coche co1 = new Coche("Rojo", 4, 4, true, 4, 3, "Tierra", 4);
                    if(cf.agregarVehiculo(co1) == true){
                         System.out.println("Vehículo agregado con éxito");
                     }
                     else{
                         System.out.println("Ya existe un vehíclo con la matricula ingresada");
                     }
                    
                    break;
                
                 case 2: 
                     
                     
                     
                     break; 
                     
                     
                 case 3:
                     int matricula; 
                     matricula = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la matricula del vehículo"));
                     cf.determinarTipoVehiculo(matricula);
                     break;
                     
                 case 4: 
                     salida = true;
                     break;
             }
         }while(salida != true);
         
         
         
         
         
     }
}
