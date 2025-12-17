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
        System.out.println("Bienvenidos a X-0");
        System.out.println("1.Jugar");
        System.out.println("2.Salir");
        int opcion=entrada.nextInt();
        switch (opcion) {
            case 1:
                
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
    }
}
