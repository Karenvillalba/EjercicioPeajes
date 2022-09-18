package com.karen.peaje;

import java.util.Scanner;

public class Peajes {

    public static void main(String[] args) {
        int peaje_moto = 2000;
        int peaje_auto = 6000;
        int peaje_camion = 16000;
        int peaje_bus = 12000;
        int tipo_vehiculo = 0;

        Scanner leer = new Scanner(System.in);
        System.out.println("Seleccione el tipo de vehiculo: ");
        System.out.println("\t1.- Moto");
        System.out.println("\t2.- Auto");
        System.out.println("\t3.- Camion");
        System.out.println("\t4.- Bus");
        System.out.print("\t: ");
        do {

            tipo_vehiculo = Integer.parseInt(leer.nextLine());
        } while (tipo_vehiculo < 1 || tipo_vehiculo > 4);
        if (tipo_vehiculo == 1) {
            System.out.println("Su peaje a pagar es: " + peaje_moto);
        }
        if (tipo_vehiculo == 2) {
            System.out.println("Su peaje a pagar es: " + peaje_auto);
        }
        if (tipo_vehiculo == 3) {
            System.out.println("Su peaje a pagar es: " + peaje_camion);
        }
        if (tipo_vehiculo == 4) {
            System.out.println("Su peaje a pagar es: " + peaje_bus);
        }
        leer.close();
    }

}
