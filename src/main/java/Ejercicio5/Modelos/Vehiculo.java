
package Ejercicio5.Modelos;

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
    protected int numPuertas; 

    public Vehiculo(int matricula, int numPasajeros, boolean EsTripulado, int numRuedas, int fechaMatriculacion, String desplazamiento, int numPuertas) {
        this.matricula = matricula;
        this.numPasajeros = numPasajeros;
        this.EsTripulado = EsTripulado;
        this.numRuedas = numRuedas;
        this.fechaMatriculacion = fechaMatriculacion;
        this.desplazamiento = desplazamiento;
        this.numPuertas = numPuertas;
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

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getMatricula() {
        return matricula;
    }
    
    
    
    








}
