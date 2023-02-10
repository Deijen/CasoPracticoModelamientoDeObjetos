/***/
package Ejercicio2;

/**
 *
 * @author Diego Posada 
 * 
 * Pregunta ejercicio 2: ¿Es posible ejecutar un programa en java que contenga 
 * varias clases con métodos main? En caso positivo, ¿cómo se determina el punto 
 * de entrada a un programa? 
 * 
 * Respuesta:La respuesta es depende. A la hora de ejecutar un programa java con 
 * varios métodos main por medio del boton Run project ubicado en la barra de 
 * tareas (o presionando f6),el compilador no ejecutará el programa y lanzará 
 * un error y una excepción. El error es debido a que no se pudo cargar una 
 * clase main (punto de entrada), y la excpeción es del tipo 
 * ClassNotFoundException. No obstante, si el usuario mediante la ide selecciona 
 * la clase que desea ejecutar puede hacerlo dando click derecho en la clase 
 * con el método main que quiera ejecutar y luego presionando la opción run file. 
 * 
 * Por otro lado, para que el compilador pueda ejecutar un método main de varios 
 * métodos main por medio del boton Run project (o presionando f6), para ello 
 * se deben seguir los siguientes pasos: 
 * 
 * 1) Ubicarse en el proyecto (en este caso, nuestro proyecto se llama
 * "CasoPracticoModelamientoDeObjetos", y seleccionar la opción "propiedades"
 * 
 * 2) En la ventana de project properties, seleccionar la opción run. 
 * 
 * 3) Una vez en la opción run, ubicarse en donde dice "Main class". Seleccionar
 * Browse y a continuación se mostrarán todas las clases que possen un método 
 * main. Desde ahí, el programador podrá escoger la clase main que desee ejecutar. 
 * 
 *PDT: Para este ejercicio, se seleccionó la clase main de la carpeta Ejercicio1
 */
public class Vista_1 { 
    public static void main(String[] args){
   // punto de entrada del programa
   System.out.print("Hola Mundo1!");
    }
    
}
