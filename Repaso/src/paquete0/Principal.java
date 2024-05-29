/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete0;

import java.util.Scanner;
import paquete1.Club;
import paquete1.Jugador;
import paquete2.EscrituraSecuencialClub;
import paquete2.LecturaSecuencialClub;
import paquete3.EscrituraSecuencialJugador;
import paquete3.LecturaSecuencialJugador;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        while (bandera) {
            System.out.printf("%s\n%s\n%s\n%s\n%s\n",
                    "Opciones",
                    "1) Ingrese Club",
                    "2) Listar Club",
                    "3) Ingrese Jugador",
                    "4) Listar Jugador");
            int opcion = entrada.nextInt();
            if (opcion == 1) {
                agregarClubs;
            } else {
                if (opcion == 2) {
                    verClubs();
                } else {
                    if (opcion == 3) {
                        agregarJugador();
                        
                    } else {
                        if (opcion == 4) {
                            verJugadores();
                        } else {
                            System.out.println("Opción incorrecta");
                        }
                    }

                }

            }

            entrada.nextLine();
            System.out.println("Desea salir del proceso. Ingrese:  si");
            String salida = entrada.nextLine();
            if (salida.equals("si")) {
                bandera = false;
            }
        }
    }

    public static void agregarClubs() {
        
    }

    public static void verClubs() {
        
    }

    public static boolean agregarJugador() {
        
    }

    public static void verJugadores() {
        
    }

}
