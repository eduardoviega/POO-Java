package main;

import java.util.Scanner;

//Faça um programa em Java que leia um número inteiro N > 1 da entrada 
//padrão, e a seguir leia N valores inteiros e armazene em um vetor. 
//
//Na sequência calcule a média aritmética desses valores e imprima na 
//saída padrão a média calculada (com duas casas decimais) e, nas linhas 
//seguintes, somente os valores maiores que a média calculada.
//
//Imprima os valores maiores que a média calculada na ordem em que 
//foram inseridos no vetor.
//
//Dica:
// - No Java é possível formatar a saída impressa com a instrução printf.
// - Exemplo: System.out.printf("%.2f\n", media);

public class MediaAritmetica {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        
        int tam = entrada.nextInt();
        int vet[] = new int[tam];
        double media = 0;
        
        for(int i=0; i<tam; i++){
            vet[i] = entrada.nextInt();
            media += vet[i]; 
        }
        media = media/tam;
        System.out.printf("%.2f\n",media);
        for(int i=0; i<tam; i++){
            if(vet[i] > media){
                System.out.println(vet[i]);
            } 
        }
    }
}