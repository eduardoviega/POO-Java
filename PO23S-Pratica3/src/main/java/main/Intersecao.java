package main;

import java.util.Scanner;

//Faça um programa em Java que leia dois conjuntos de número de 
//tamanho N>1 e imprima no console a interseção dos dois conjuntos, 
//ou seja, quais números estão em ambos os conjuntos.
//
//Entrada
// - Um número inteiro N representando o número de elementos de ambos os conjuntos.
// - N inteiros para o conjunto 1.
// - N inteiros para o conjunto 2.
//
//Saída
// - Lista de números que estão em ambos os conjuntos (interseção).

public class Intersecao {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        
        int tam = entrada.nextInt();
        int vet1[] = new int[tam];
        int vet2[] = new int[tam];
        
        for(int i=0; i<tam; i++){
            vet1[i] = entrada.nextInt();
        }
        for(int i=0; i<tam; i++){
            vet2[i] = entrada.nextInt();
        }
        
        for(int i=0; i<tam; i++){
            for(int j=0; j<tam; j++){
                if(vet1[i] == vet2[j]){
                    System.out.println(vet1[i]);
                }
            }
        }
    }
}