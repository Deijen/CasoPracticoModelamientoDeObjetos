
package Ejercicio1.Modelos;

import java.util.ArrayList;

/**
 *
 * @author Diego Posada
 * Clase que contiene la lógica para los métodos
 * La clase SistemaSolar tiene un ArrayList de planetas
 */
public class SistemaSolar { 
    private ArrayList<Planeta> sistemaPlanetario;
    private final double constanteGravitacion = 6.67; //El valor es elevado a la 10^-11
    
    
    /**
    * Constructor de la clase SistemaSolar
    */
    public SistemaSolar() {
        this.sistemaPlanetario = new ArrayList();
    }
    
    /**
    * Método para buscar planetas
     * @param id, sirve para buscar el planeta
     * @return true si encuentra el planeta, o false si no lo encuentra.
    */
    public boolean buscarPlaneta(int id){
        for(Planeta p: sistemaPlanetario){
            if(p.getIdPlaneta() == id){
                return true;
                
            }
        }
        return false;
    } 
    
    
    /**
    * Método para agregar plaentas.Este método usa el método buscarPlaneta 
    * para validar que no se repitan planetas. 
    * 
    * @param p1, se recibe el planeta que se va a agregar 
    * @return true si el planeta fue agregado, o false si el planeta no fue 
    * agregado
    */
    public boolean agregarPlaneta(Planeta p1){
        if(buscarPlaneta(p1.getIdPlaneta()) == false){
            sistemaPlanetario.add(p1);
            return true;
        }
        else
            return false;
    }
    
    /**
    * Método para calcular la atracción gravitatoria entre dos cuerpos cualesquiera.
    * 
     * @param id1, identificador del primer planeta
     * @param id2, identificador del segundo planeta
     * @return F, viene siendo la formula para calcular la atracción gravitatoria 
     * entre dos planetas
    */
    public double calculoAtraccionGravitatoria( int id1, int id2, 
            double distanciaEntreCuertpos){
        
        double masa1 =0;
        double masa2 =0;
        double F; //Fuerza de atracción gravitatoria 
        
        for(Planeta p1: sistemaPlanetario){
            if(p1.getIdPlaneta() == id1){
             masa1 = p1.getMasa();
            }
        } 
        
        for(Planeta p2: sistemaPlanetario){
            if(p2.getIdPlaneta() == id2){
                masa2 = p2.getMasa();
            }
        } 
        
        F = ((this.constanteGravitacion) * (masa1 * masa2) / ((distanciaEntreCuertpos) * (distanciaEntreCuertpos)));
        return F;
    } 
    
    
    
}
