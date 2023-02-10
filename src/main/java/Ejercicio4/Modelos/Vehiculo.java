
package Ejercicio4.Modelos;

/**
 *
 * @author dipom
 */
public class Vehiculo {
    protected final int matricula; //No pueden haber dos matriculas iguales
    
    protected int numPasajeros; 
    protected boolean EsTripulado; 
    protected int numRuedas; //Colocar una excepción con el número de ruedas quizá
    protected int fechaMatriculacion; //
    protected String desplazamiento; //Medio por el cual se desplaza el vehículo

    /**
    * Constructor para los vehículos que no tengan rueda 
    */
    public Vehiculo(int matricula, int numPasajeros, boolean EsTripulado, int fechaMatriculacion, String desplazamiento) {
        this.matricula = matricula;
        this.numPasajeros = numPasajeros;
        this.EsTripulado = EsTripulado;
        this.fechaMatriculacion = fechaMatriculacion;
        this.desplazamiento = desplazamiento;
    }

    
    /**
    * Constructor para los vehículos que si tengan rueda 
    */
    public Vehiculo(int matricula, int numPasajeros, boolean EsTripulado, int numRuedas, int fechaMatriculacion, String desplazamiento) {
        this.matricula = matricula;
        this.numPasajeros = numPasajeros;
        this.EsTripulado = EsTripulado;
        this.numRuedas = numRuedas;
        this.fechaMatriculacion = fechaMatriculacion;
        this.desplazamiento = desplazamiento;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public boolean isEsTripulado() {
        return EsTripulado;
    }

    public void setEsTripulado(boolean EsTripulado) {
        this.EsTripulado = EsTripulado;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public int getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(int fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public String getDesplazamiento() {
        return desplazamiento;
    }

    public void setDesplazamiento(String desplazamiento) {
        this.desplazamiento = desplazamiento;
    }

    public int getMatricula() {
        return matricula;
    }
  
    /**
    * Métodos toString para mostrar la información de los vehículos 
    */
    public String toStringRuedas(){
        return "\nMatricula: " + this.matricula
                + "\nNúmero de pasajeros: " + this.numPasajeros 
                + "\nNúmero de ruedas: " + this.numPasajeros
                + "\nFecha de matricula: " + this.fechaMatriculacion //Cambiar por una fecha
                + "\nMétodo de desplazamiento: " + this.desplazamiento ;
    } 
    
    
    public String toStringSinRuedas(){
        return "\nMatricula: " + this.matricula
                + "\nNúmero de pasajeros: " + this.numPasajeros 
                + "\nFecha de matricula: " + this.fechaMatriculacion //Cambiar por una fecha
                + "\nMétodo de desplazamiento: " + this.desplazamiento ;
    } 
    
}
