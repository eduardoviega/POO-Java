package main;

import java.util.Locale;
import java.util.Scanner;

//Faça um programa em Java que receba um número inteiro, um número 
//de ponto flutuante e uma palavra (String). Na sequência, 
//imprima os valores lidos na saída padrão, um valor por linha.

public class Linha {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int num = entrada.nextInt();
        float numb = entrada.nextFloat();
        String str = entrada.next();
        
        System.out.println(num);
        System.out.println(numb);
        System.out.println(str);
    }
}