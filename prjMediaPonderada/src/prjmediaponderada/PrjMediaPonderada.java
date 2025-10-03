/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjmediaponderada;

import java.util.Scanner;

/**
 *
 * @author jorge.tavares
 */
public class PrjMediaPonderada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            CalcularMediaPonderada();
               
    }
    static void CalcularMediaPonderada() {
           float n1,n2,n3,n4;
        
        // entrada
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe a primeira nota: ");
        n1 = scanner.nextFloat();
        System.out.println("Informe a segunda nota: ");
        n2 = scanner.nextFloat();
        System.out.println("Informe a terceira nota: ");
        n3 = scanner.nextFloat();
        System.out.println("Informe a quarta nota: ");
        n4 = scanner.nextFloat();
               
        // Processamento
        /* 
        Média Pondeara: (x1 * p1 + ... =+ xn * pn) / p1 + ... + pn
        */
        float somaPonderada = (n1 * 1) + (n2 * 2) + (n3 * 3) + (n4 *4); 
        float somaPeso = 1 + 2 + 3 + 4;
        
        float mediaPonderada = somaPonderada / somaPeso;
        
        // Saida
        
        System.out.println("A média ponderada é " + mediaPonderada); 
        
}

}