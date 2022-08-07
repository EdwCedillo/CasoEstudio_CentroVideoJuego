/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto1centrovideojuego;

import java.util.ArrayList;

/**
 *
 * @author edwin cedillo
 */
public class Proyecto1CentroVideoJuego {

    public static void main(String[] args) {
        System.out.println("Tarea 1:Modelo de Clases");
        /* Ingreso de data, comprobacion modelo de clase*/
        Empleado gerente = new Empleado("255521","Andres", "Cedillo","001", "Gerente");
        gerente.mostrarDatoPantalla();
        Jugador participante = new Jugador("123", "edwCed", "1555","Edwin", "Barzallo");//Objeto1 de la clase Jugador
        participante.mostrarDatoPantalla();  
        
        Jugador participante2 = new Jugador("456", "Grwow", "4856","Andres", "Cede");//Objeto2 de la clase Jugador 
        participante2.mostrarDatoPantalla();  
        
        ArrayList <Jugador> listaParticipantes = new ArrayList(); //Instancio la coleccion de tipo Jugador
        listaParticipantes.add(participante);//Guardo el objeto1 en la coleccion de tipo jugador
        listaParticipantes.add(participante2);//Guardo el objeto1 en la coleccion de tipo jugador
        ArrayList <Juego> listaJuegos = new ArrayList();//Instancio la coleccion de tipo Juego
        
        Juego miJuego = new Juego("0001", "Halo", 2, listaParticipantes);// Objeto de tipo Juego
        miJuego.mostrarDatoPantalla(listaParticipantes.size(), listaParticipantes);// Datos generales en pantalla de mi Objeto Juego
        miJuego.getPartida().resultadoPartida(listaParticipantes.size(), listaParticipantes);//LLenado resultados de la partida Jugada
        miJuego.getPartida().mostrarResultadoPartida();//Impresion por consoloa de resultados
        listaJuegos.add(miJuego);// guardo el objeto juego en mi colleccion
        listaJuegos.get(0).getNombreJuego();// utilizando metodos de la clase
        
    }
}
