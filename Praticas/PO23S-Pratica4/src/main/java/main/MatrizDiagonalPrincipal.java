package main;

import java.util.Scanner;

public class MatrizDiagonalPrincipal {
    
    public static void printDiagonalPrincipal(int matriz[][]) {
        int tam = matriz.length;
        int vet[] = new int[tam];
        int k = 0;
        for(int j=0; j<tam; j++){
            vet[j] = matriz[k][k];
            k++;
            System.out.printf("%d ",vet[j]);
        }
    }
    
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int tam = entrada.nextInt();
        int matriz[][] = new int[tam][tam];

        for (int i=0; i<tam; i++){
            for (int j=0; j<tam; j++){
                matriz[i][j] = entrada.nextInt();
            }
        }
        printDiagonalPrincipal(matriz);
    }
}