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
public class JAVACodificador1 {

    /**
     * @param args the command line arguments
     */
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
        String retorno=transf(frase);
        System.out.println(retorno);
        }
    public static String transf(String frase) {
        String a="";
        for (int i = 0; i < frase.length(); i++) {
            String b=frase.substring(i,i+1);
            switch (b) {
                case "a":
                    a=a.concat("@");
                    break;
                case "e":
                     a=a.concat("#");
                    break;
                case "i":
                     a=a.concat("$");
                    break;
                case "o":
                     a=a.concat("%");
                    break;
                case "u":
                     a=a.concat("*");
                    break;
                default:
                    a=a.concat(b);
        }
        }
        return a;
    }
    
}
