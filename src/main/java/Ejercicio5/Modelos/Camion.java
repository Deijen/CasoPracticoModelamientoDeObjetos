
package Ejercicio5.Modelos;

/**
 *
 * @author Diego Posada
 */
public class Camion extends Vehiculo {
    private int altura; 
    private int pesoCarga; 

    public Camion(int altura, int pesoCarga, int matricula, int numPasajeros, boolean EsTripulado, int numRuedas, int fechaMatriculacion, String desplazamiento, int numPuertas) {
        super(matricula, numPasajeros, EsTripulado, numRuedas, fechaMatriculacion, desplazamiento, numPuertas);
        this.altura = altura;
        this.pesoCarga = pesoCarga; 
        
        if(this.numRuedas > 4 || this.numRuedas<3){
            throw new IllegalArgumentException("Número de ruedas inválido.");
        }
        
        if(this.matricula < 0){
            throw new IllegalArgumentException("Número de mátricula inválido.");
        } 
        
        if(this.numPuertas > 2){
            throw new IllegalArgumentException("Número de puertas inválido.");
        } 
        
        if(this.numPasajeros > 2){
            throw new IllegalArgumentException("La cabina del camión solo admite dos personas.");
        }
        
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPesoCarga() {
        return pesoCarga;
    }

    public void setPesoCarga(int pesoCarga) {
        this.pesoCarga = pesoCarga;
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
                + "\nAltura del camión: "  + this.altura
                + "\nPeso de la carga: " + this.pesoCarga
                + "\nNúmero de pasajeros: " + this.numPasajeros 
                + "\nMétodo de desplazamiento: " + this.desplazamiento
                + "\nNúmero de ruedas " + this.numRuedas
                + "\nFecha de matricula " + this.fechaMatriculacion
                + "\nNúmero de puertas: "  + this.numPuertas;
    
    }
    
}
