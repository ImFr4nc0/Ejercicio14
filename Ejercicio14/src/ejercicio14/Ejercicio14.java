/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;
import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        System.out.println("Ingrese un numero:");
        Scanner entrada = new Scanner(System.in);
        double numero1 = entrada.nextDouble();
        double cuadrado = Math.pow(numero1, 2);
        double cubo = Math.pow(numero1, 3);
        
        System.out.println("El cuadrado es: " + cuadrado);
        System.out.println("El cubo es: " + cubo);
    }
    
}
