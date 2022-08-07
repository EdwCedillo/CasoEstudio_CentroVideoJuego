/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1centrovideojuego;

/**
 *
 * @author edwin cedillo
 */
public class Empleado extends Persona{//la clase Empleado hereda de la clase Persona
    private String idEmpleado;
    private String cargo;
    
    public Empleado(String cedula, String nombre, String apellido, String idEmpleado, String cargo){//Constructor
        super(cedula, nombre, apellido);//Constructor de la clase Padre
        this.idEmpleado=idEmpleado;
        this.cargo= cargo;
    }

    /* Metodos*/
    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public void mostrarDatoPantalla(){
        System.out.println(" ***Datos Empleado***");
        System.out.println("Nombre: " + getNombre()+ " Apellido: " + getApellido() + " Cargo: "+ getCargo() );
    }
            
}
