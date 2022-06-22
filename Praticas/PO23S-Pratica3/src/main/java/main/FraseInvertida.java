package main;

import java.util.Scanner;

//Faça um programa em Java que receba uma frase (string) da entrada 
//padrão e imprima essa frase invertida. Na próxima linha imprima o 
//comprimento dessa frase (número de caracteres).

public class FraseInvertida {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        
        String frase = entrada.nextLine();
        String fraseInv = new String();
        
        for(int i=frase.length()-1; i>=0; i--){
            fraseInv = fraseInv + frase.charAt(i);
        }
        System.out.println(fraseInv+"\n"+fraseInv.length());
    }
}