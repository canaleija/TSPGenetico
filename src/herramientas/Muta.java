/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herramientas;

import Objetos.Individuo;
import java.util.Random;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Muta {
    
    public static Individuo mutaIntercambioPaP(Individuo ind){
    
        // rango 1 - long del genotipo 
        Random ran = new Random();
        int pos1 = 0, pos2 =0;
        do{
        pos1 =1+ran.nextInt(ind.getGenotipo().length-1);
        pos2 =1+ran.nextInt(ind.getGenotipo().length-1);
        }while(pos1==pos2);
        
        // realizar el intercambio 
        int aux = ind.getGenotipo()[pos1];
        ind.getGenotipo()[pos1]= ind.getGenotipo()[pos2];
        ind.getGenotipo()[pos2]=aux;
        
        ind.calculaFitness();
        return ind;
    }
    
}
