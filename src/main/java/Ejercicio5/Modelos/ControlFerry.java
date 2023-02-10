
package Ejercicio5.Modelos;

import java.util.ArrayList;

/**
 *
 * @author Diego Posada
 */
public class ControlFerry {
     private ArrayList <Vehiculo> listaVehiculo; 

    
    /**
    * Constructor por defecto que inicializa el arrayList 
    */
    public ControlFerry() {
        this.listaVehiculo = new ArrayList();
    }
    
    
    /**
    * Método para buscar un Vehículo. 
    * 
     * @param id, identificador del vehículo
     * @return v, objeto de tipo Vehiculo
    */
    public Vehiculo buscarVehiculo(int id){
        for(Vehiculo v : listaVehiculo){
            if(v.getMatricula() == id){
                return v;
            }  
        }
         return null;
    }
    
    /**
    * Método para agregar un vehículo. 
     * @param v, recibe por parámetro un objeto de tipo Vehículo.
     * @return true si el vehículo fue agregado o false si el vehículo no fue agregado
    */
    public boolean agregarVehiculo(Vehiculo v){
    
        if(this.buscarVehiculo(v.getMatricula())== null){
            listaVehiculo.add(v);
            return true; 
        }
        else
            return false;
    } 
    
    
    /**
    * Método para determinar el tipo de vehículo según el número de pasajeros 0
    * número de puertas,
    */
    public void determinarTipoVehiculo(int id){
        for(Vehiculo v: listaVehiculo){
            if(v.getMatricula()== id){
                if(v.getNumPasajeros()>=100){
                    System.out.println("Es un avión");
                }
                
                else if(v.getNumPuertas()<=2){
                    System.out.println("Es un camión");
                } 
                
                
                else if((v.getNumPuertas() >2 && v.getNumPuertas()<6) && v.getNumRuedas() ==4 ){
                    System.out.println("Es un coche"); 
                    
                }
                
                
            }
        }
    
    }
    
}
