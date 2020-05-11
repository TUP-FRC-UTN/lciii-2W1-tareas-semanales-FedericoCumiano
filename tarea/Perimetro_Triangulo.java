package perimetro_triangulo;

import java.util.Scanner;

public class Perimetro_Triangulo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el lado 1: ");
        float lado1 = sc.nextFloat();
        
        System.out.println("Ingrese el lado 2: ");
        float lado2 = sc.nextFloat();
        
        System.out.println("Ingrese el lado 3: ");
        float lado3 = sc.nextFloat();
        
        Lados l = new Lados (lado1, lado2, lado3);
        l.setLado1(lado1);
        l.setLado2(lado2);
        l.setLado3(lado3);
        
        System.out.println(l);
        System.out.println("El perimetro del triangulo es: " + l.calcularPerimetro());
        
    }
    
}
