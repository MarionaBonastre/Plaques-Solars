/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.clients;

import java.util.ArrayList;

/**
 *
 * @author mariona
 */
//Primer de tot inicialitzarem cada clase Casa,PlaquesSolars i AparellElectric.
public class Casa {

    private String nif;
    private String nom;
    private boolean interruptor;
    private int superficie;
    private ArrayList<PlaquesSolars> placasSolares;
    private ArrayList<AparellElectric> aparatosElectricos;

    //constructor
    public Casa(String nif, String nom, int superficie) {
        this.nom = nom;
        this.nif = nif;
        this.interruptor = true;
        this.superficie = superficie;
        this.placasSolares = new ArrayList<>();
        this.aparatosElectricos = new ArrayList<>();
  
    }

    public String getNom() {
        return this.nom;
    }

    public String getNif() {
        return this.nif;
    }

    public int getSuperficie() {
        return this.superficie;
    }

    public boolean getInterruptor() {
        return this.interruptor;
    }
    
    public void addPlacaSolar(int superficiePlaquesSolars, int preu, int potenciaPlaquesSolars) {
        PlaquesSolars unaPlaca = new PlaquesSolars(superficiePlaquesSolars, preu,potenciaPlaquesSolars);
        this.placasSolares.add(unaPlaca);
    }
    
    public void addAparell(String descripcio, double potenciaAparrellElectric, boolean ences){
    AparellElectric aparell = new AparellElectric(descripcio, potenciaAparrellElectric, ences);
    this.aparatosElectricos.add(aparell);
    }
}

