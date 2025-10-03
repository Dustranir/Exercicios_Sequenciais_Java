/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjdesconto;

import java.util.Scanner;

/**
 *
 * @author jorge.tavares
 */
public class PrjDesconto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float valorProduto;        
        Scanner scanner = new Scanner (System.in);        
        System.out.println("Insira o valor do produto: ");
        valorProduto= scanner.nextFloat();        
        float formulaDesconto = (9f / 100f) * valorProduto;
        float valorAtualizado = valorProduto - formulaDesconto;
        
        System.out.println ("O valor do produto e de: " + valorAtualizado + " R$");
        
        scanner.close();
    }
    
}
