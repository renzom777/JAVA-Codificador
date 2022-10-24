/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.codificador;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class JAVACodificador2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        String palabra;
        frase="";
        do {            
            System.out.println("Ingrese caracteres");
            palabra=leer.nextLine();
            frase=frase.concat(palabra+" ");
        } while (!".".equals(palabra));
        String frase1=frase.replace("a","@").replace("e","#").replace("i","$").replace("o","%").replace("u","*");
        System.out.println(frase1);
    }
}
