/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_7;

/**
 *
 * @author Daniel Salinas
 */
public class Quicksort {
    public static void ordenar (int ramon[], int inicio, int fin){
        int izq, der, pivote, aux; // variables auxiliar y de los extremos del arreglo
        izq = inicio; der = fin; //mis indicadores al principio y al final
        pivote = ramon[(inicio+fin)/2]; //pivote se coloca en el centro del inicio y fin
        do{
            while(ramon[izq]<pivote){ // mientras la posicion izquierda sea menor al pivote
                izq++;   //aumentamos en 1 el valor
            }
            while(ramon[der]>pivote){ //mientas la derecha sea mayor al pivote
                der--;  //disminuye en 1 el valor
            }
            if(izq<=der){  //si se "cruzan" las posiciones
                aux=ramon[izq]; //se captura en variable auxiliar la posicion izquierda
                ramon[izq]=ramon[der]; //y se "switchean" los valores de izquierda y derecha
                ramon[der]=aux;      // el valor capturado en auxiliar se coloca en la posicion derecha
                izq++; 
                der--;
            }    
        } while (izq <= der); //todo lo anterior se realiza mientras las posiciones no se crucen
        if(inicio < der){ // en cuanto se cruzan reiniciamos todo 
            ordenar(ramon, inicio, der); //se ordena la mitad izquierda del arreglo
         }
        if(izq < fin){ //se arregla la otra mitad
            ordenar(ramon, izq, fin);
        }        
            }
        
        }

