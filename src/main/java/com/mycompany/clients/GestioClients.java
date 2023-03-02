package com.mycompany.clients;


import com.mycompany.clients.Casa;
import java.util.ArrayList;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author mariona
 */
public class GestioClients {

    private static int potenciaAparrellElectric;
    private static int potenciaAparatElectric;
    private static int potenciaAparellElectric;
    
    //new array list

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //llamamos al constructor con el new

        //declaramos una variable tipo string donde almacenaremos lo que ponga por consola.
        String consola = "";

        // printamos
        System.out.println("Et donem la benvinguda al sistema Endolls Solars, S.L.");

        /*Hacemos un bucle con el while utilizando equalsIgnoreCase:
        (este metodo ignora mayusculas, minusculas y compara dos cadenas de texto si son iguales)
        *cuando el usuario ponga quit el programa finalizara. 
        Al finalizar saldra en pantalla:
        Has finalitzat el programa: Endolls Solars.
         */
        
        ArrayList<Casa> casas = new ArrayList();
        
        //quit
        while (!consola.equalsIgnoreCase("quit")) {
            System.out.println(">");
            consola = scanner.nextLine();

            String[] nomSplit = consola.split(" ");

            /*
            *Si el valor introducido no llega a 4 palabras saldra el texto, 
            ya que es el mínimo para registrar una casa es 4.
             */
            
            //addCasa
            if (nomSplit.length != 3) {
                System.out.println("Falta informació: Has de introduir el nif, el nom i la superficie.");
            } /*
            *Extraemos los parámetros con el split: el NIF, nombre y la superficie de la casa.
             */ else {
                String nif = nomSplit[1];
                String nom = nomSplit[2];
                //convertimos el int por un string con parseInt
                int superficie = Integer.parseInt(nomSplit[3]);
                
                //Comprobamos que la superficie de la casa sea mayor que 10.
                if (superficie < 10) {
                    System.out.println("La superficie de la casa ha de ser mes gran que 10.");
                }                
                //creamos una nueva instancia de casa con los datos poporcionados.
                Casa unaCasa = new Casa(nif, nom, superficie);
                casas.add(unaCasa);                               
                System.out.println("Casa amb NIF " + nif + " afegida.");
                
                               
            } //addPlaca            
            if (nomSplit[0].equalsIgnoreCase("addPlaca")) {
            if (nomSplit.length != 5) {
            System.out.println("Falta informació: Has d'introduir el NIF, la superfície, el preu i la potència.");
            }  
            
            else {
                String nif = nomSplit[1];
                int superficiePlaquesSolars = Integer.parseInt(nomSplit[2]);
                int preu = Integer.parseInt(nomSplit[3]);
                int potenciaPlaquesSolars = Integer.parseInt(nomSplit[4]);                
                                
                //Declaramos casa con valor nulo, y una variable bool casaExiste en valor false.
                //En el for, recorremos todas las casas en el ArrayList casas.El indice i empieza en 0 y
                //se incrementa en cada iteración hasta que alcanza el tamaño de casas.
                //En if (c.getNif().equals(nif)) :Verificamos si el NIF de la casa c es igual al NIF buscado nif.
                //En casa = c;: Si el NIF de la casa c es igual al NIF buscado nif, asigna la casa c a la variable casa.
                //En casaExiste = true;: Asigna el valor true a la variable casaExiste para indicar que se ha encontrado una casa con el NIF buscado.               
                Casa casa = null;
                boolean casaExiste = false;
                
                for (int i = 0; i < casas.size(); i++) {
                Casa c = casas.get(i);
                
                if (c.getNif().equals(nif)) {
                casa = c;
                casaExiste = true; }
                
                }
                  if (!casaExiste) {
                    System.out.println("No existeix cap casa amb aquest NIF.");
                } else if (superficiePlaquesSolars > casa.getSuperficie()) {
                    System.out.println("La superficie de les plaques no pot ser més gran que la superficie de la casa.");
                } else {
                    PlaquesSolars unaPlaca = new PlaquesSolars(superficiePlaquesSolars, preu, potenciaPlaquesSolars);
                    casa.addPlacaSolar(superficiePlaquesSolars, preu, potenciaPlaquesSolars);
                    System.out.println("Placa afegida correctament a la casa amb NIF " + nif + ".");
                } 
                  
                //AddAparell 
                if (nomSplit[0].equalsIgnoreCase("addAparell")) {             
                    if (nomSplit.length != 4) {
                        System.out.println("Falta informació: Has de introduir el nif, la potencia i el nom.");
                } else {
                    String nif = nomSplit[1];
                    int potenciaAparrellElectric = Integer.parseInt(nomSplit[2]);
                    String descripcio = nomSplit[3];
                     
                    if (potenciaAparellElectric <= 0) {
                       System.out.println("La potència ha de ser més gran que 0.");

                }else {
                    AparellElectric aparell = new AparellElectric(descripcio, potenciaAparrellElectric, false);
                    casa.addAparell(nif, potenciaAparrellElectric, false);
                    System.out.println("Aparell afegit correctament a la casa amb NIF " + nif + ".");
                    }
                  }
                }
                
                //onCasa [nif]
                if (nomSplit[0].equalsIgnoreCase("onCasa")) {
                    if (nomSplit.length != 2) {
                        System.out.println("Falta informació: Has d'introduir el nif de la casa.");
                } else {
                    String nif = nomSplit[1];
                        
                    }
                }

            scanner.close();
            System.out.println("Has finalitzat el programa: Endolls Solars.");
            }       
            }
        }
    }
}


