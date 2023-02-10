
package Ejercicio5.Modelos;

/**
 *
 * @author Diego Posada
 */
public class Avion extends Vehiculo{ 
   
    private int numTurbinas; 

    public Avion(int numTurbinas, int matricula, int numPasajeros, boolean EsTripulado, int numRuedas, int fechaMatriculacion, String desplazamiento, int numPuertas) {
        super(matricula, numPasajeros, EsTripulado, numRuedas, fechaMatriculacion, desplazamiento, numPuertas);
        this.numTurbinas = numTurbinas; 
        
        if(this.numRuedas<20){
            throw new IllegalArgumentException("Número de ruedas inválido.");
        }
        
        if(this.matricula < 0){
            throw new IllegalArgumentException("Número de mátricula inválido.");
        } 
        
        if(this.numPuertas <0 || this.numPuertas>6){
            throw new IllegalArgumentException("Número de puertas inválido.");
        } 
        
        if(this.numPasajeros < 0 || this.numPasajeros> 200){
            throw new IllegalArgumentException("Número de pasajeros inválidos. "
                    + "Debe ser mayor a 0 y menor a 200");
        } 
        
        
        
        
    }

    public int getNumTurbinas() {
        return numTurbinas;
    }

    public void setNumTurbinas(int numTurbinas) {
        this.numTurbinas = numTurbinas;
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

    
    @Override
    public String toString(){
         return "\nMatricula del vehículo: " + this.matricula
                + "\nNúmero de turbinas "  + this.numTurbinas
                + "\nNúmero de pasajeros: " + this.numPasajeros 
                + "\nMétodo de desplazamiento: " + this.desplazamiento
                + "\nNúmero de ruedas " + this.numRuedas
                + "\nFecha de matricula " + this.fechaMatriculacion
                + "\nNúmero de puertas: "  + this.numPuertas;
    
    }
    
    
    
    
    
    
}
