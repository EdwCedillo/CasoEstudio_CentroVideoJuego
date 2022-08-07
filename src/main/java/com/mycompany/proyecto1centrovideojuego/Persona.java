/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1centrovideojuego;

/**
 *
 * @author edwin cedillo
 */
public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    
    public Persona(String cedula, String nombre, String apellido){//Constructor 
        this.cedula=cedula;
        this.nombre=nombre;
        this.apellido =apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
}
