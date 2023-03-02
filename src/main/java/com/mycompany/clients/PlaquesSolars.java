package com.mycompany.clients;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mariona
 */
public class PlaquesSolars {
    public int superficiePlaquesSolars;
    public float preu;
    public int potenciaPlaquesSolars;
    
    public PlaquesSolars(int superficiePlaquesSolars,float preu,int potenciaPlaquesSolars){
        this.potenciaPlaquesSolars=potenciaPlaquesSolars;
        this.preu=preu;
        this.superficiePlaquesSolars=superficiePlaquesSolars;
    }
    
     //getters
    public double obtenir_superficiePlaquesSolars(){
        return superficiePlaquesSolars;
    }
    public double obtenir_preu(){
        return preu;
    }
    public double obtenir_potencia(){
        return potenciaPlaquesSolars;
    }
}
