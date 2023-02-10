
package Ejercicio4.Vista;
import Ejercicio4.Modelos.ControlFerry;
import Ejercicio4.Modelos.Vehiculo;
import javax.swing.JOptionPane;
/**
 *
 * @author dipom
 */
public class Vista4 {
     public static void main(String[] args){
         ControlFerry cf = new ControlFerry();
         
         int opcion; //Variable para el switch
         boolean salida = false; //Variable para salir del doWhile 
         
         
         do{
         
             opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Escoga una opción: "
                 + "\n1) Crear vehículos"
                 + "\n2) Buscar vehículo"
                 + "\n3) Salir "));  
             
             
             switch (opcion) {
                 case 1:
                     Vehiculo v1 = new Vehiculo(1, 4, true, 4, 1, "tierra");
                     if(cf.agregarVehiculo(v1) == true){
                         System.out.println("Vehículo agregado con éxito");
                     }
                     else{
                         System.out.println("Ya existe un vehíclo con la matricula ingresada");
                     }
                     
                     Vehiculo v2 = new Vehiculo(2, 15, false, 2, "Agua");
                     if(cf.agregarVehiculo(v2) == true){
                         System.out.println("Vehículo agregado con éxito");
                     }
                     else{
                         System.out.println("Ya existe un vehíclo con la matricula ingresada");
                     }
                    
                     Vehiculo v3 = new Vehiculo(3, 250, true, 3, "Aire");
                     if(cf.agregarVehiculo(v3) == true){
                         System.out.println("Vehículo agregado con éxito");
                     }
                     else{
                         System.out.println("Ya existe un vehíclo con la matricula ingresada");
                     }
                     
                     Vehiculo v4 = new Vehiculo(4, 4, true, 4, 4, "tierra");
                     if(cf.agregarVehiculo(v4) == true){
                         System.out.println("Vehículo agregado con éxito");
                     }
                     else{
                         System.out.println("Ya existe un vehíclo con la matricula ingresada");
                     }
                     Vehiculo v5 = new Vehiculo(5, 2, true, 5, "Agua");
                     if(cf.agregarVehiculo(v5) == true){
                         System.out.println("Vehículo agregado con éxito");
                     }
                     else{
                         System.out.println("Ya existe un vehíclo con la matricula ingresada");
                     }
                     
                     Vehiculo v6 = new Vehiculo(6, 100, false, 6, "Aire");
                     if(cf.agregarVehiculo(v6) == true){
                         System.out.println("Vehículo agregado con éxito");
                     }
                     else{
                         System.out.println("Ya existe un vehíclo con la matricula ingresada");
                     }
                     
                     Vehiculo v7 = new Vehiculo(7, 8, true, 7, "Tierra");
                     if(cf.agregarVehiculo(v7) == true){
                         System.out.println("Vehículo agregado con éxito");
                     }
                     else{
                         System.out.println("Ya existe un vehíclo con la matricula ingresada");
                     }
                     
                     Vehiculo v8 = new Vehiculo(8, 12, false, 8, "Agua");
                     if(cf.agregarVehiculo(v8) == true){
                         System.out.println("Vehículo agregado con éxito");
                     }
                     else{
                         System.out.println("Ya existe un vehíclo con la matricula ingresada");
                     }
                     Vehiculo v9 = new Vehiculo(9, 160, true, 9, "Aire");
                     if(cf.agregarVehiculo(v9) == true){
                         System.out.println("Vehículo agregado con éxito");
                     }
                     else{
                         System.out.println("Ya existe un vehíclo con la matricula ingresada");
                     }
                     Vehiculo v10 = new Vehiculo(10, 5, false, 10, "Tierra");
                     if(cf.agregarVehiculo(v10) == true){
                         System.out.println("Vehículo agregado con éxito");
                     }
                     else{
                         System.out.println("Ya existe un vehíclo con la matricula ingresada");
                     }
                     
                     break;
                
                 case 2: 
                     int matricula; 
                     
                     matricula = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la matricula del vehículo a buscar"));
                     if(cf.buscarVehiculo(matricula) == null){
                         System.out.println("La matricula no existe.");
                     }
                     else{
                         if(cf.buscarVehiculo(matricula).getNumRuedas() != 0){
                             JOptionPane.showMessageDialog(null, cf.buscarVehiculo(matricula).toStringRuedas());
                         }
                         else{
                             JOptionPane.showMessageDialog(null, cf.buscarVehiculo(matricula).toStringSinRuedas());
                         }
                     }
                     break; 
                     
                 case 3: 
                     salida = true;
                     break;
             }
         }while(salida != true);
         
         
         
         
         
     }
}
