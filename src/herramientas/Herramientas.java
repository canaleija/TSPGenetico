/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herramientas;

import Objetos.Individuo;
import Objetos.Poblacion;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Herramientas {
    
    public static int [] generaGenotipoAleatorio(int ci,int numC){
      int aux[] = new int[numC];
      // agregamos la ciudad inicial al genotipo
      aux[0]
              = ci;
      Random ran = new Random();
      // agregar de forma aleatoria el resto de la ciudades 
      // garantizando que no se repitan
      int i=1;
      boolean auxs=false;
      while(i<numC){
          int auxC = ran.nextInt(numC+1);
          auxs = false;
          for (int y = 0; y <= i;y++){
            if (auxC==aux[y]){
                auxs=true;
                break;
            }
            //auxs = false;
        }
          if(!auxs){
             aux[i] = auxC;
             i++;
             
          }
      }

      return aux;
    }
    
    public static Poblacion generarPoblacionIncial(int n,int ci,int numC){
      
        ArrayList<Individuo> coleccion = new ArrayList<>();
        
        for (int x=0; x<n;x++ ){
        coleccion.add(new Individuo(generaGenotipoAleatorio(ci, numC)));
       
        }
        Poblacion aux = new Poblacion(coleccion);
        
        return aux;
    
    }
    
   
    
}
