
package Ejercicio1.Modelos;

/**
 *
 * @author Diego Posada
 * Clase que contiene los atributos de un planeta
 */
public class Planeta { 
    private final int idPlaneta; //La id de un planeta no se puede repetir
    private double masa; 
    private double densidad; 
    private double diametro; 
    private double distanciaAlSol;  
    private String nombre;

    
    /**
    * Constructor de la clase Planeta 
    * 
     * @param idPlaneta, identificador del planeta
     * @param masa, masa del planeta
     * @param densidad, densidad del planeta
     * @param diametro, diametro del planeta
     * @param distanciaAlSol, distancia al sol del planeta
     * @param nombre, nombre del planeta
    */
    public Planeta(int idPlaneta, double masa, double densidad, double diametro, double distanciaAlSol, String nombre) {
        this.idPlaneta = idPlaneta;
        this.masa = masa;
        this.densidad = densidad;
        this.diametro = diametro;
        this.distanciaAlSol = distanciaAlSol;
        this.nombre = nombre;
    }

    /**
    * Getters y setters
    */
    public int getIdPlaneta() {
        return idPlaneta;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getDensidad() {
        return densidad;
    }

    public void setDensidad(double densidad) {
        this.densidad = densidad;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getDistanciaAlSol() {
        return distanciaAlSol;
    }

    public void setDistanciaAlSol(double distanciaAlSol) {
        this.distanciaAlSol = distanciaAlSol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Override
    public String toString(){
        return "\nIdentificador: " + this.idPlaneta
                + "\nMasa: " + this.masa + " Kg"
                + "\nDensidad: " + this.densidad + " cm3"
                + "\nDiámetro: " + this.diametro + " Kilometros"
                + "\nDistancia al sol: " + this.distanciaAlSol + " Kilometros"
                + "\nNombre del planeta: " + this.nombre;
              
    
    
    }
    
    
    
    
}
