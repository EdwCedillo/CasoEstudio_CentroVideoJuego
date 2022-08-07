/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1centrovideojuego;

/**
 *
 * @author edwin cedillo
 */
public class RegistroPuntaje {
    private PartidaDelJuego partida;
    private Jugador participante;
    private int puntaje;

    public RegistroPuntaje(PartidaDelJuego partida, Jugador participante, int puntaje) { //Constructor de la clase
        this.partida = partida;
        this.participante = participante;
        this.puntaje = puntaje;
    }
    /*Metodos de la clase*/
    public PartidaDelJuego getPartida() {
        return partida;
    }

    public void setPartida(PartidaDelJuego partida) {
        this.partida = partida;
    }

    public Jugador getParticipante() {
        return participante;
    }

    public void setParticipante(Jugador participante) {
        this.participante = participante;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
    
}
