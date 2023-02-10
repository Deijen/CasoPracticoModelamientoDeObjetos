
package Ejercicio3.Modelos;


/**
 * NOTA: Para el desarrollo de este ejercicio, se tuvieron en cuenta los 
 * siguientes links a la hora de desarrollar el algoritmo quick sort
 * 
 * https://www.youtube.com/watch?v=yXy7WzgUaSA
 * https://puntocomnoesunlenguaje.blogspot.com/2012/12/java-quicksort.html
 * @author Diego Posada
 */
public class Numero { 
    private int  listaNumeros[] ; 

    
    public Numero() {
        this.listaNumeros = new int[5]; //El tamaño del vector es de cinco
    }
    
   
    
   
    
    /**
    * Método para realizar el algoritmo burbuja.
    * NOTA: Se deben hacer -1 itéraciones en el for interno para que no se desborde
    * 
    * 
    * @param arreglo, arreglo que se pasa por parámetro al cual se le aplicará 
    * el algoritmo de ordenamiento.
    */
    public void bubbleSort(int[] arreglo){
        int aux =0;
        
            for(int i =0; i<arreglo.length ; i++){
                for(int j =0; j < arreglo.length -1; j++){
                    
                    if(arreglo[j] > arreglo[j+1]){
                        aux = arreglo[j];
                        arreglo[j] = arreglo[j+1];
                        arreglo[j+1] = aux;
                        
                    }
                }
            } 
            System.out.println("--------------------");
            for(int i=0; i<arreglo.length; i++){  //ciclo para mostrar el array
                System.out.println(arreglo[i]);
            }
            System.out.println("--------------------");
   
    }
    
    //--------------------------ESPACIO-QUICK-SORT----------------------------//
    
    
    /***
    * Algoritmo quickSort.NOTA: Para el desarrollo de este algoritmo, se tomó como referencia el 
 algoritmo del siguiente link: https://puntocomnoesunlenguaje.blogspot.com/2012/12/java-quicksort.html
     * @param A, Arreglo que se pasa por parámetro
     * @param izq, indice que realiza la busqueda del lado izquiero.
     * @param der, indice que realiza la busqueda del lado derecho.
    */
    
  public  void quicksort(int A[], int izq, int der) {

  int pivote=A[izq]; // tomamos primer elemento como pivote
  int i=izq;         // i realiza la búsqueda de izquierda a derecha
  int j=der;         // j realiza la búsqueda de derecha a izquierda
  int aux;
 
  while(i < j){                          // mientras no se crucen las búsquedas                                   
     while(A[i] <= pivote && i < j) i++; // busca elemento mayor que pivote
     while(A[j] > pivote) j--;           // busca elemento menor que pivote
     if (i < j) {                        // si no se han cruzado                      
         aux= A[i];                      // los intercambia
         A[i]=A[j];
         A[j]=aux;
     }
   }
   
   A[izq]=A[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
   A[j]=pivote;      // los menores a su izquierda y los mayores a su derecha
   
   if(izq < j-1)
      quicksort(A,izq,j-1);          // ordenamos subarray izquierdo
   if(j+1 < der)
      quicksort(A,j+1,der);          // ordenamos subarray derecho
    
   
}
    
    
   
    
    
    
    
    
    
}
