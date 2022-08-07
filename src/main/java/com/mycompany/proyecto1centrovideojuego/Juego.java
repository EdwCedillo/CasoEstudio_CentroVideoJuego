/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1centrovideojuego;

import java.util.ArrayList;

/**
 *
 * @author edwin cedillo
 */
public class Juego {
    private String idJuego;
    private String nombreJuego;
    //private ArrayList <PartidaDelJuego> partida; //Lo optimo es realizar una coleccion de tipo partidaDeJuego, ya que cada tipo de juego puede tener de 1 a varias partidas
    private PartidaDelJuego partida;//para simplificar el ejercicio y el llenado de datos lo ponemos que cada juego tiene una sola partida
    
    public Juego(String idJuego, String nombreJuego, int numParticipantes, ArrayList<Jugador> participantes) {//Constructor de la clase
        this.idJuego = idJuego;
        this.nombreJuego = nombreJuego;
        //partida = new ArrayList(); //instanciamos la coleccion de partida
        partida = new PartidaDelJuego(1,numParticipantes, 5,participantes);//Instanciamos la partida dentro del constructor de la clase Juego, predefinimos el tiempo
        
    }
    
    /*Metodos*/
    public String getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(String idJuego) {
        this.idJuego = idJuego;
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public PartidaDelJuego getPartida() {
        return partida;
    }

    public void setPartida(PartidaDelJuego partida) {
        this.partida = partida;
    }
    
    public void mostrarDatoPantalla(int numParticipantes,ArrayList<Jugador> participantes ){
        System.out.println(" ***Datos Juego***");
        System.out.println(" Codigo Juego: "+ getIdJuego() + " Nombre del Juego: " + getNombreJuego() );
        
    }
        
  
    
}
