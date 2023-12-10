/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BloqueIII;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class BloqueIII {

    public static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //1. Los comentarios mienten
        //MAL
        //cadena indica el nombre de la persona
        String cadena = "Francisco";
        cadena = "Madrid";
        System.out.println(cadena);

        //2. Codigo Autoexplicativo
        //MAL
        System.out.println("Numero 1: ");
        int a = sc.nextInt();
        System.out.println("Numero 2: ");
        int b = sc.nextInt();

        int r = a + b;

        //BIEN
        System.out.println("Escibe cuantos coches hay: ");
        int coches = sc.nextInt();
        System.out.println("Escibe cuantas motos hay: ");
        int motos = sc.nextInt();

        int ruedas = (coches * 4) + (motos * 2);

    }

    //4. Dicen que hace el codigo, no como
    
    //MAL
    public static int obtenerNumPlazasPorParkingPorTipoVehiculoMal(int numParking, int tipoVehiculo) {
        //Esta funcion coge el valor obtenido de las dos variables y las compara con el array bidimensional para sacar el valor que hay en la celda concreta
        int[][] parkings = new int[4][4];
        return parkings[numParking - 1][tipoVehiculo - 1];
    }

    //BIEN
    public static int obtenerNumPlazasPorParkingPorTipoVehiculoBien(int numParking, int tipoVehiculo) {
        //Esta funcion obtiene el valor de la celda concreta con las dos variables
        int[][] parkings = new int[4][4];
        return parkings[numParking - 1][tipoVehiculo - 1];
    }

}
