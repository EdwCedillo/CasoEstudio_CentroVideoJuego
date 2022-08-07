/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1centrovideojuego;

/**
 *
 * @author edwin cedillo
 */
public class Jugador extends Persona {//Clase Jugador hera de la clase persona
    private String idJugador;
    private String nickName;

    public Jugador(String idJugador, String nickName, String cedula, String nombre, String apellido) {//Constructor
        super(cedula, nombre, apellido);
        this.idJugador = idJugador;
        this.nickName = nickName;
    }

    /* Metodos */
    public String getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(String idJugador) {
        this.idJugador = idJugador;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    
    public void mostrarDatoPantalla(){
        System.out.println(" ***Datos Jugador***");
        System.out.println("Nombre: " + getNombre()+ " Apellido: " + getApellido() + " NickName: "+ getNickName());
    }
        
}
