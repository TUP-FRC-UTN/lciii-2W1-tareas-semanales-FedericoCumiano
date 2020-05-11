package ejercicio_equipo;

import java.util.Scanner;

public class Ejercicio_Equipo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese nombre: ");
        String nombre = sc.nextLine();
        
        System.out.println("Ingrese los puntos: ");
        int puntos = sc.nextInt();
        
        System.out.println("Ingrese los partidos ganados: ");
        int part_ganados = sc.nextInt();
        
        System.out.println("Ingrese los partidos empatados: ");
        int part_empatados = sc.nextInt();
        
        System.out.println("Ingrese los partidos perdidos: ");
        int part_perdidos = sc.nextInt();
        
        System.out.println("Ingrese los goles realizados: ");
        int goles_realizados = sc.nextInt();
        
        System.out.println("Ingrese los goles recibidos: ");
        int goles_recibidos = sc.nextInt();
        
        System.out.println("Ingrese la posicion: ");
        int posicion = sc.nextInt();
        
        Equipo p = new Equipo(nombre, puntos, part_ganados, part_empatados, part_perdidos, goles_realizados, goles_recibidos, posicion);
        System.out.println(p);
    }
    
}
