
package Ejercicio4.Modelos;

import java.util.ArrayList;

/**
 * La clase ControlFerry es la encargada de llevar un control de los vehículos 
 * que va a transportar, en donde tendrá un listado de vehículos
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
    *Método para buscar un vehículo. 
     * @param id, identificador del vehículo a buscar. 
     * @return  v, retorna un objeto de la clase vehículo si encuentra el id
     * 
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
    * Método para agregrar un vehículo. 
     * @param v, se recibe por parámetro un objeto de tipo Vehiculo
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
    
  
    
    
}
