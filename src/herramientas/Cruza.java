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
public class Cruza {
    
    public static Individuo cruzaKernelBinario(Individuo padre, Individuo madre){
        // generar un kernel binario 
        int kernel [] = new int[padre.getGenotipo().length];
        crearKernel(kernel);  
        int g1 [] = new int[kernel.length];
        int g2 [] = new int[kernel.length];
        // generar la cruza
        do{
           crearKernel(kernel); 
           for(int x=0; x < kernel.length;x++){
             if (kernel[x]==1){
               g1[x]=madre.getGenotipo()[x];
               g2[x]=padre.getGenotipo()[x];
             }else{
               g1[x] = padre.getGenotipo()[x];
               g2[x] = madre.getGenotipo()[x];
             
             }
           }
           System.out.println();
        }while(!validaHijos(g1, g2));
        
        Individuo h1 = new Individuo(g1);
        Individuo h2 = new Individuo(g2);
        
        if (h1.getFitness()<h2.getFitness()){
          return h1;
        }else{
        return h2;
        }
       
    }
    
    public static boolean validarGenotipo (int[] genotipo){
    for (int x = 1; x < genotipo.length-1;x++){
           for (int y = x + 1; y < genotipo.length;y++){
              if (genotipo[x]==genotipo[y]){
                 return false;
              }
           }
        }
     return true;
    }
    
    public static boolean validaHijos(int[] genotipo1,int[] genotipo2){
      return validarGenotipo(genotipo2)&&validarGenotipo(genotipo1);
    }

    private static void crearKernel(int[] kernel) {
        Random ran = new Random();
        for(int x=0; x < kernel.length;x++)
            kernel[x]= ran.nextInt(2);
    }
    
}
