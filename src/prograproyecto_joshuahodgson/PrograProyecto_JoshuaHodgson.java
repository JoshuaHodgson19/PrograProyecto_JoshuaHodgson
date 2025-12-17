/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prograproyecto_joshuahodgson;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author joshuahodgson
 */
public class PrograProyecto_JoshuaHodgson {
    static Scanner entrada=new Scanner(System.in);
    static String [][]tablero;
    static ArrayList<String>hJugadas;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenidos a TIC TAC TOE");
        System.out.println("1.Jugar");
        System.out.println("2.Salir");
        int opcion=entrada.nextInt();
        switch (opcion) {
            case 1:
                InicioDeJuego();
                break;
            case 2:
                System.out.println("Hasta la proxima..");
                break;
            default:
                System.out.println("Opcion no reconocida");
        }
    }
    public static void InicioDeJuego(){
    tablero=new String [3][3];
        for (int i = 0; i <3; i++) {
            for (int j = 0; j < 3; j++) {
             tablero[i][j]=" ";   
            }
        }hJugadas=new ArrayList<>();
        Jugador_1 jugadorx=new Jugador_1();
        jugadorx.nombre="jugador 1";
        jugadorx.simbolo="X";
        Jugador_1 jugador0=new Jugador_1();
        jugador0.nombre="jugador 2";
        jugador0.simbolo="0";
        Jugador_1 jugadoract=jugadorx;
        boolean juegoact=true;
        while (juegoact) {
            mostrarTablero();
            System.out.println("Cuando sea su turno ingrese numeros del 0 al 2");
            System.out.println("Turno de "+jugadoract.nombre+jugadoract.simbolo);
            System.out.println("Ingrese la fila");
            int fila=entrada.nextInt();
            System.out.println("Ingrese la columna");
            int colum=entrada.nextInt();
            if (tablero[fila][colum].equals(" ")) {
                tablero[fila][colum]=jugadoract.simbolo;
                if (Ganador(jugadoract.simbolo)) {
                    mostrarTablero();
                    System.out.println("GANASTE "+jugadoract.nombre);
                    juegoact=false;
                    ReiniciodeJuego();
                }else if (tablerofull()) {
                    mostrarTablero();
                    System.out.println("TERMINO EN UN EMPATE");
                    juegoact=false;
                    ReiniciodeJuego();
                }else{
                    if ( jugadoract==jugadorx) {
                        jugadoract=jugador0;
                    }else{
                    jugadoract=jugadorx;
                    }
                }
            }
            else{
                System.out.println("Esa posicion ya esta ocupada");
            }
        }
    }
    public static void mostrarTablero(){
//        System.out.println("-------");
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j]+"|");
            }
            System.out.println();
            System.out.println("-------");
        }
       
    }
     public static boolean Ganador(String simbolo){
         for (int i = 0; i <3; i++) {
             if (tablero[i][0].equals(simbolo)&& tablero[i][1].equals(simbolo)&&tablero[i][2].equals(simbolo)) {
               return true;  
             }
         }
         for (int i = 0; i < 3; i++) {
             if (tablero[0][i].equals(simbolo)&& tablero[1][i].equals(simbolo)&&tablero[2][i].equals(simbolo)) {
                 return true;            
             }
         }
         if (tablero[0][0].equals(simbolo)&& tablero[1][1].equals(simbolo)&&tablero[2][2].equals(simbolo)) {
         return true;
         }
         if (tablero[0][2].equals(simbolo)&& tablero[1][1].equals(simbolo)&&tablero[2][0].equals(simbolo)) {
         return true;
         }
        return false; 
     }
     public static boolean tablerofull(){
         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                 if (tablero[i][j].equals(" ")) {
                     return false;
                 }
             }
         }
        return true;
     
     }
     public static void ReiniciodeJuego(){
         System.out.println("Desea jugar otra vez?");
         System.out.println("1.Si");
         System.out.println("2.No");
         int opcion=entrada.nextInt();
         if (opcion==1) {
             InicioDeJuego();
         }else{
             System.out.println("Fin del juego");
         }
     }
}
