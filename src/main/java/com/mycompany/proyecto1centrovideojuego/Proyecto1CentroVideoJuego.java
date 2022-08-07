/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto1centrovideojuego;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author edwin cedillo
 */
public class Proyecto1CentroVideoJuego {

    public static void main(String[] args) {
          
        //System.out.println("Tarea 1:Modelo de Clases");
        /* Ingreso de data, comprobacion modelo de clase*/
        /*
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
        */
        
        int opcionP=0;//variable para opcion menu principal
        boolean premiacion = false; //variable para validar si los partipantes jugaron
        Scanner entrada = new Scanner(System.in);//Instanciamos un objeto de la clase Scanner, para ingreso de datos por consola
        System.out.println("\t CASO DE ESTUDIO ");
        ArrayList <Jugador> listaParticipantes = new ArrayList(); //Instancio la coleccion de tipo Jugador
        ArrayList <Juego> listaJuegos = new ArrayList();//Instancio la coleccion de tipo Juego
        /*Creamos por defecto 2 tipo de videoJuego, para simplificar el ejercicio*/
        Juego miJuego1 = new Juego("0001", "Halo", listaParticipantes.size(), listaParticipantes);// Objeto de tipo Juego
        Juego miJuego2 = new Juego("0002", "CorreCaminos", listaParticipantes.size(), listaParticipantes);// Objeto de tipo Juego
        listaJuegos.add(miJuego1);//guardamos en la coleccion juegos
        listaJuegos.add(miJuego2);//guardamos en la coleccion juegos
            do{
                try {
                    presentacionMenu(1);//Llamo a mi metodo de menu de opciones con la opcion1
                    opcionP = entrada.nextInt();
                    
                    switch(opcionP){//opcion principal
                        case 1: //Jugadores
                            
                            int opcion1=0; //variable para manejo de sub-menu
                            do{
                                try{
                                    presentacionMenu(2); //Llamo a mi metodo de menu de opciones con la opcion2
                                    opcion1=entrada.nextInt();
                                    
                                    switch(opcion1){//Opcion de jugadores
                                        
                                        case 1://crear jugador
                                            //Por simplificacion del ejercicio no pido los datos por consola
                                            Jugador participante1 = new Jugador("123", "edwCed", "1555","Edwin", "Barzallo");//Objeto1 de la clase Jugador
                                            Jugador participante2 = new Jugador("124", "car98", "1556","Andres", "Cardenas");//Objeto2 de la clase Jugador 
                                            Jugador participante3 = new Jugador("125", "grutan", "1557","Sebastian", "Briceno");//Objeto2 de la clase Jugador 
                                            Jugador participante4 = new Jugador("126", "tecnicas", "1558","Nicolas", "Tenorio");//Objeto2 de la clase Jugador 
                                                listaParticipantes.add(participante1);//Guardo el objeto1 en la coleccion de tipo jugador
                                                listaParticipantes.add(participante2);//Guardo el objeto1 en la coleccion de tipo jugador
                                                listaParticipantes.add(participante3);//Guardo el objeto1 en la coleccion de tipo jugador
                                                listaParticipantes.add(participante4);//Guardo el objeto1 en la coleccion de tipo jugador
                                                System.out.println("Se inscribieron con exito los jugadores!!");
                                            break;
                                        case 2://lista jugadores
                                            
                                            for(int i=0; i<listaParticipantes.size(); i++){
                                                System.out.println("Jugador:"+ (i+1) );
                                                listaParticipantes.get(i).mostrarDatoPantalla();
                                            }
                                            
                                            break;
                                        case 3://buscar jugadores
                                            String nick;
                                            int aux=-1;//variable auxiliar para saaber la posicion de la lista jugadores
                                            System.out.println("Ingrese nickName del Jugador:");
                                          
                                            nick = entrada.next();
                                            
                                            for(int i=0; i<listaParticipantes.size(); i++){
                                                if( listaParticipantes.get(i).getNickName().equalsIgnoreCase(nick)){
                                                   //System.out.println(" Si esta en la Lista de Jugadores Inscritos");
                                                   aux=i;//guardo la posicion que se encuentra el objeto jugador
                                                }
                                            }
                                            if(aux>=0)//aux es mayor a cero es porque encontro a jugador, por tanto  muestra sus datos
                                               listaParticipantes.get(aux).mostrarDatoPantalla();
                                            else
                                               System.out.println("No esta en la Lista de Jugadores Inscritos");
                                            break;
                                        
                                        case 4://eliminar jugadores
                                            
                                            int aux1=-1;//variable auxiliar para saaber la posicion de la lista jugadores
                                            System.out.println("Ingrese nickName del Jugador a eliminar:");
                                            nick = entrada.next();
                                            for(int i=0; i<listaParticipantes.size(); i++){
                                                if( listaParticipantes.get(i).getNickName().equalsIgnoreCase(nick)){
                                                   //System.out.println(" Si esta en la Lista de Jugadores Inscritos");
                                                   aux1=i;//guardo la posicion que se encuentra el objeto jugador
                                                }
                                            }
                                            if(aux1>=0){//aux es mayor a cero es porque encontro a jugador, por tanto  muestra sus datos
                                               listaParticipantes.get(aux1).mostrarDatoPantalla();
                                               listaParticipantes.remove(aux1);// se elimina el objeto en la posicion dada
                                               System.out.println("Jugador eliminado de la lista");
                                            }else{
                                                System.out.println("No esta en la Lista de Jugadores Inscritos");
                                            }
                                            break;                               

                                        case 5://salir menu jugador
                                            System.out.println("Fin del Sub-menu Jugador");
                                            
                                            break;
                                    }
                                    
                                }catch (InputMismatchException ex) { //manejo de excepciones como para validar
                                    System.out.println("Opcion Incorrecta!!");
                                    entrada.nextLine();
                                }
                            }while(opcion1 != 5);
                            
                            break;
                            
                            
                        case 2: //listas de juegos
                            int opcion2=0;
                            do{
                                try {
                                    presentacionMenu(3);//Llamo a mi metodo de menu de opciones con la opcion 3
                                    opcion2=entrada.nextInt();
                                    switch(opcion2){
                                        
                                        case 1:// listas de juegos
                                            for(int i=0; i<listaJuegos.size(); i++){
                                                System.out.println("Juego:"+ (i+1) );
                                                listaJuegos.get(i).mostrarDatoPantalla(listaParticipantes.size(), listaParticipantes);
                                            }
                                            
                                            break;
                                        case 2://jugar->resultador
                                            
                                            for(int i=0; i<listaJuegos.size(); i++){
                                                System.out.println("Resultado del Juego"+ (i+1) );
                                                listaJuegos.get(i).mostrarDatoPantalla(listaParticipantes.size(), listaParticipantes);
                                                listaJuegos.get(i).getPartida().resultadoPartida(listaParticipantes.size(), listaParticipantes);//LLenado resultados de la partida Jugada
                                                listaJuegos.get(i).getPartida().mostrarResultadoPartida();//Impresion por consoloa de resultados
                                            }
                                            premiacion = true; //los participantes jugaron para premiar
                                            break;
                                        case 3:// salir del menu
                                            System.out.println("Fin del Sub-menu Juego");
                                            break;
                                        
                                    }
                                    
                                }catch (InputMismatchException ex) { //manejo de excepciones como para validar
                                    System.out.println("Opcion Incorrecta!!");
                                    entrada.nextLine();
                                }
                                
                            }while(opcion2 != 3);
                            
                            
                            
                            break;
                        case 3: //premiacion
                            
                            Empleado gerente = new Empleado("255521","Andres", "Cedillo","001", "Gerente");
                            gerente.mostrarDatoPantalla();
                            if(premiacion==true){
                                int mayor=listaJuegos.get(0).getPartida().listaPuntaje.get(0).getPuntaje();//Obtengo el puntaje de la primera posicion
                                int pos=0;//que posicion
                                for(int i=0; i<listaJuegos.get(0).getPartida().listaPuntaje.size(); i++){
                                    if( listaJuegos.get(0).getPartida().listaPuntaje.get(i).getPuntaje() > mayor ){//para saber quien obtuvo el mayor puntaje de la partida
                                        mayor = listaJuegos.get(0).getPartida().listaPuntaje.get(i).getPuntaje();
                                        pos=i;
                                    }   
                                }
                                
                                System.out.println("El premio es para el Jugador:" + listaJuegos.get(0).getPartida().listaPuntaje.get(pos).getParticipante().getNickName());//en este caso juego 1
                                System.out.println("Puntaje:"+mayor);
                            }else{
                                System.out.println(" Los participantes no juegan todavia!!");
                            }
                            
                            break;
                            
                        case 4:  //Salida del programa
                            presentacionMenu(5); //Llamo a mi metodo de menu de opciones con la opcion 5
                            break;     
                    }
                    
                    
                    
                } catch (InputMismatchException ex) { //manejo de excepciones como para validar
                    System.out.println("Opcion Incorrecta!!");
                    entrada.nextLine();
                }
                
                

            }while(opcionP != 4);
    }
    
        /*Metodos*/
    
        public static void presentacionMenu(int valor){//Metodo para presentacion menu
        
        switch(valor){
            case 1:
                System.out.println("\n***MENU PRINCIPAL***\nCENTRO VIDEO JUEGOS\n1.Jugadores\n2.Juegos\n3.Premiacion\n4.Salir del Programa");
                break;
                
            case 2:
                System.out.println("\n*** SUB-MENU JUGADORES***\n1.Crear Jugador\n2.Listar Jugadores\n3.Buscar Jugador\n4. Eliminar Jugador \n5.Salir del SubMenu JUGADORES");
                break;
            
            case 3:
                System.out.println("\n***SUB-MENU JUEGOS***\n1. Listas de juegos \n2.Jugar \n3.Salir del SubMenu JUEGOS");
                break;
                
            case 4:
                System.out.println("\n***PREMIACION ***\nElija la Opcion:");
                break;
            
            case 5:
                System.out.println("\n***FIN DEL PROGRAMA***");
                break;    
        }
    }
    
       
}
