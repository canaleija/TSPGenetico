/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tspgenetico;

import Objetos.Individuo;
import Objetos.Poblacion;
import java.util.ArrayList;

/**
 *
 * @author Roberto Cruz Leija
 */
public class GeneticoV1 {
    
    private int tamPob;
    private int m;
    private double pM;
    private Poblacion poblacionPrincipal;

    public GeneticoV1(int tamPob, int m, double pM) {
        this.tamPob = tamPob;
        this.m = m;
        this.pM = pM;
    }
    
    public void evoluciona(){
    
        // poblacion inicial
        ArrayList<Individuo> aux = new ArrayList<>();
        aux.add(new Individuo(new int[]{0,2,3,1}));
        aux.add(new Individuo(new int[]{0,1,3,2}));
        aux.add(new Individuo(new int[]{0,3,2,1}));
        aux.add(new Individuo(new int[]{0,3,2,1}));
        aux.add(new Individuo(new int[]{0,1,2,3}));
        
        this.poblacionPrincipal = new Poblacion(aux);
        
        for (int m = 0; m < this.m;m++){
          // tenemos que garantizar la creación de una
          // población nueva
          ArrayList<Individuo> elementosNuevos = new ArrayList<>();
          for (int n=0; n < this.tamPob;n++){
                       
            // seleccion aleatorio
            Individuo madre = this.poblacionPrincipal.getMejor();
            Individuo padre = this.poblacionPrincipal.getAleatorio();
            // cruza
            Individuo hijo = herramientas.Cruza.cruzaKernelBinario(padre, madre);
            // muta
            if (0-1<=this.pM){
             mutamos(hijo);
            }
            
            // agregamos el ind a la nueva población
            elementosNuevos.add(hijo);
          
          }
          // inicializar mi poblacion principal con los 
          // nuevos elementos
          
          this.poblacionPrincipal = new Poblacion(elementosNuevos);    
          
        
        }
    }

    private Individuo cruzar(Individuo madre, Individuo padre) {
        // regresar un hijo valido
        return null;
    }
    
    
    
}
