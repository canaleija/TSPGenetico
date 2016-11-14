/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Poblacion {
    
    private int n;
    private int id;
    private ArrayList<Individuo> poblacion;
    private Individuo mejor;
    private Individuo peor;
    
    // construir

    public Poblacion(ArrayList<Individuo> poblacion) {
        // clonar la población 
        this.poblacion = (ArrayList<Individuo>)poblacion.clone();
        this.n = poblacion.size();
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the poblacion
     */
    public ArrayList<Individuo> getPoblacion() {
        return poblacion;
    }

    /**
     * @return the mejor
     */
    public Individuo getMejor() {
        this.mejor = this.poblacion.get(0);
        for (int x=1; x < this.poblacion.size();x++){
           if (this.poblacion.get(x).getFitness()<this.mejor.getFitness()){
             this.mejor = this.poblacion.get(x);
           }
        }
        return mejor;
    }

    /**
     * @return the peor
     */
    public Individuo getPeor() {
        return peor;
    }
    
    public Individuo getAleatorio (){
    Random ran = new Random();
    return this.poblacion.get(ran.nextInt(this.poblacion.size()));
    
    }
    
    
    
    
    
    
    
}
