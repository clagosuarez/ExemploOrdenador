/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploordenador;

import java.util.Scanner;

/**
 *
 * @author clagosuarez
 */
public class ExemploOrdenador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Tipo: ");
        String tipo = sc.nextLine();
        System.out.println("Marca: ");
        String marca = sc.nextLine();
        System.out.println("Pulgadas: ");
        float pulgadas = sc.nextFloat();
        System.out.println("Velocidade: ");
        int velocidade = sc.nextInt();
        System.out.println("Memoria: ");
        int memoria = sc.nextInt();
        
        Ordenador asus = new Ordenador(new Rato(tipo), new Pantalla(marca, pulgadas), new Cpu(velocidade, memoria));
        asus.amosar();
    }
    
}
