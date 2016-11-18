/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tspgenetico;

import Objetos.Individuo;
import Objetos.Poblacion;

/**
 *
 * @author Roberto Cruz Leija
 */
public class TSPGenetico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aux [][]= new int[][]{{0,5,4,6},{5,0,34,100},{4,34,0,11},{6,100,11,0}};
        Individuo.matrizDistancias = aux;
       
        GeneticoV1 g1 = new GeneticoV1(5, 100, 0.4);
        g1.
                evoluciona();
        
        System.out.println();
        //System.out.println(ruta1.getFitness());
    }
    
}
