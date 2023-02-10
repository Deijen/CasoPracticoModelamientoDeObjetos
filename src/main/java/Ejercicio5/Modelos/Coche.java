
package Ejercicio5.Modelos;

/**
 *
 * @author Diego Posada
 */
public class Coche extends Vehiculo{ 
    private String color; //color del coche 

    public Coche(String color, int matricula, int numPasajeros, boolean EsTripulado, int numRuedas, int fechaMatriculacion, String desplazamiento, int numPuertas) {
        super(matricula, numPasajeros, EsTripulado, numRuedas, fechaMatriculacion, desplazamiento, numPuertas);
        this.color = color; 
        
        if(this.numRuedas > 4 || this.numRuedas<3){
            throw new IllegalArgumentException("Número de ruedas inválido.");
        }
        
        if(this.matricula < 0){
            throw new IllegalArgumentException("Número de mátricula inválido.");
        } 
        
        if(this.numPuertas > 4){
            throw new IllegalArgumentException("Número de puertas inválido.");
        } 
        
        if(this.numPasajeros > 6){
            throw new IllegalArgumentException("Cuidado te para la policia.");
        }
        
    } 

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
    
    
    
    /**
    *  
    */
    @Override
    public String toString(){
        return "\nMatricula del vehículo: " + this.matricula
                + "\nColor del vehículo: " + this.color 
                + "\nNúmero de pasajeros: " + this.numPasajeros 
                + "\nMétodo de desplazamiento: " + this.desplazamiento
                + "\nNúmero de ruedas " + this.numRuedas
                + "\nFecha de matricula " + this.fechaMatriculacion
                + "\nNúmero de puertas: "  + this.numPuertas;
    
    }
    

    
    
    
    
    
    
    
    
   

    
    
    
    
}
