/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3.Vista;
import java.util.ArrayList; 
import Ejercicio3.Modelos.Numero; 
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author dipom
 */
public class Vista3 { 
    
   public static void main(String[] args){
   // punto de entrada del programa
   Numero n = new Numero(); 
   int opcion; 
   int[] lista = new int [5];
   boolean salir = false;
   
   do{
       opcion= Integer.parseInt(JOptionPane.showInputDialog(null, "Escoja una opcion: "
                    + "\n1) Llenar arreglo"
                    + "\n2) Borrar arreglo (no es necesario. Borrar)"
                    + "\n3) Ordenar por método burbuja"
                    + "\n4) Ordenar por quick sort"
                    + "\n5) Salir" )); 
       
       
       switch (opcion) {
           case 1:
              
               for (int i=0; i<lista.length; i++){ 
                int numAl =(int)(Math.random() * 10 +1);
                lista[i] = numAl;
                //JOptionPane.showMessageDialog(null, listaNumeros[i]);
                System.out.println(lista[i]);
                System.out.println("-----------");
               
        } 
               System.out.println("-----------");
               JOptionPane.showMessageDialog(null, "La matriz se encuentra en consola");
                   
               
               
               break; 
           case 2:
               
               break;
               
           case 3:
               n.bubbleSort(lista);
               break; 
               
           case 4:
               
               int izq = 0; 
               int der = lista.length -1;
               n.quicksort(lista, izq, der); 
               for(int i =0; i<lista.length; i++){
                   System.out.println(lista[i]);
               }
               
               break;
               
           case 5:
               salir = true;
               break;
           
       }
   
   
   
   }while(!salir);
    
   
   
   
   
   
   
   }
    
    
    
    
}
