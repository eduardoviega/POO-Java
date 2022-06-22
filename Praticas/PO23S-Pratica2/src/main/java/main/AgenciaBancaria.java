package main;

import java.util.Scanner;

public class AgenciaBancaria {
    public static void main(String args[]) {
        
        int conta = 0;
        int num = 0; 
        int soma = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        do{
            num = entrada.nextInt();
            if(num>0){
                soma += num;    
            }
            conta++;
        }while(num >= 0);
        
        System.out.println("Quantidade = " + conta);
        System.out.println("Soma = " + soma);
        
    }
}