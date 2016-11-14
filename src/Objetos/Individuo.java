/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Individuo {
    
    private int [] genotipo;
    private double fitness;
    private int ciudadInicio;
    public static int[][]matrizDistancias;

    public Individuo (int numCiudades, int ciudadInicio){
        this.genotipo = new int[numCiudades];
        this.ciudadInicio = ciudadInicio;
        this.fitness = -1;
    }
    public Individuo(int[] genotipo) {
        this.genotipo = genotipo.clone();
        this.ciudadInicio = genotipo[0];
        this.fitness = -1;
    }

    /**
     * @return the genotipo
     */
    public int[] getGenotipo() {
        return genotipo;
    }

    /**
     * @param genotipo the genotipo to set
     */
    public void setGenotipo(int[] genotipo) {
        this.genotipo = genotipo;
    }

    /**
     * @return the fitness
     */
    public double getFitness() {
        if (this.fitness == -1){
         calculaFitness();
        }
       
        return fitness;
    }

    /**
     * @param fitness the fitness to set
     */
    public void setFitness(double fitness) {
        this.fitness = fitness;
    }

    /**
     * @return the ciudadInicio
     */
    public int getCiudadInicio() {
        return ciudadInicio;
    }

    /**
     * @param ciudadInicio the ciudadInicio to set
     */
    public void setCiudadInicio(int ciudadInicio) {
        this.ciudadInicio = ciudadInicio;
    }

    private void calculaFitness() {
        // tendria que recorrer el genotipo
        this.fitness = matrizDistancias[this.ciudadInicio][this.genotipo[this.genotipo.length-1]];
        for (int x=0; x< this.genotipo.length-1;x++){
            this.fitness += matrizDistancias[this.genotipo[x]][this.genotipo[x+1]];
            System.out.println();
        }
        // y la matriz de distancias e ir acumulando
       
        
    }
    
    
    
    
}
