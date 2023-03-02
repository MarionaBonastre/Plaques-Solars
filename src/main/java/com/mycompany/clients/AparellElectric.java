package com.mycompany.clients;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mariona
 */
public class AparellElectric {
    public String descripcio;
    public double potenciaAparrellElectric;
    public boolean ences;
    
    public AparellElectric(String descripcio,double potencia,boolean ences){
        this.descripcio=descripcio;
        this.ences=false;//es igual a false ja que es boolean.
        this.potenciaAparrellElectric=potencia;
    }
    
    
    //getters
    public String obtenir_descripcio(){
        return descripcio;
    }
    public double obternir_potenciaAparrellElectric(){
        return potenciaAparrellElectric;
    }
    public boolean obternir_ences(){
        return ences;
    }
    


        
    }


