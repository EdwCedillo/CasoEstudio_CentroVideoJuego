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
public class PartidaDelJuego {
    
    private int numPartida;//Numeracion de la partida
    private int numJugador;//Cantidad de Jugadores de la Partida
    private double tiempoPartida;
    public ArrayList<RegistroPuntaje> listaPuntaje;

    public PartidaDelJuego(int numPartida, int numJugador, double tiempoPartida) { //Constructor de la clase Partida del Juego
        this.numPartida = numPartida;
        this.numJugador = numJugador;
        this.tiempoPartida = tiempoPartida;
    }
    
    public PartidaDelJuego(int numPartida, int numJugador, double tiempoPartida, ArrayList<Jugador> participantes) { 
        this.numPartida = numPartida;
        this.numJugador = numJugador;
        this.tiempoPartida = tiempoPartida;
        listaPuntaje = new ArrayList();
        //resultadoPartida(numPartida, participantes);//Empieza la partida, los resultados del juego
        //mostrarResultadoPartida();
    }
    
    /* Metodos*/
    public int getNumPartida() {
        return numPartida;
    }

    public void setNumPartida(int numPartida) {
        this.numPartida = numPartida;
    }

    public int getNumJugador() {
        return numJugador;
    }

    public void setNumJugador(int numJugador) {
        this.numJugador = numJugador;
    }

    public double getTiempoPartida() {
        return tiempoPartida;
    }

    public void setTiempoPartida(double tiempoPartida) {
        this.tiempoPartida = tiempoPartida;
    }
    
    
    public void resultadoPartida(int numPartida, ArrayList<Jugador> participantes){
        RegistroPuntaje puntos;
        /* Llenado de Datos del Registro de Puntaje*/
        for(int i=0; i<participantes.size(); i++){
            //int numero = (int)(Math.random()*(X-Y+1)+Y;/* Forma para generar numeros aleatorios x=desde y=hasta*/ Utilizo para generar Puntos al azar
            int numero = (int)(Math.random()*(1-100+1)+100);
            puntos=new RegistroPuntaje(this, participantes.get(i), numero);//Instancia de la clase Registro de Puntaje, cada iteracion es un nuevo objeto de registro puntaje
            listaPuntaje.add(puntos);//Los guarda en la colleccion de Objeto 
        }
    }
    public void mostrarResultadoPartida(){
        for(int i=0; i<listaPuntaje.size(); i++){
            //Revisar el trabajo falta
            
            System.out.println("Lista de Resultados de la Partida");
            System.out.println("Numero de Partida: "+ listaPuntaje.get(i).getPartida().getNumPartida());
            System.out.println("Jugador: "+ listaPuntaje.get(i).getParticipante().getNickName()+ " Puntaje: "+listaPuntaje.get(i).getPuntaje());
        }
    }
}
