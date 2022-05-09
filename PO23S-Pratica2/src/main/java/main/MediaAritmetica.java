package main;

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        
        double valor1, valor2, valor3, valor4;
        
        valor1 = entrada.nextDouble();
        valor2 = entrada.nextDouble();
        valor3 = entrada.nextDouble();
        valor4 = entrada.nextDouble();
        
        double media = (valor1 + valor2 + valor3 + valor4) / 4;

        System.out.println(media);
    }
}