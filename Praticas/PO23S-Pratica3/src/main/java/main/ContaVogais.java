package main;

import java.util.Scanner;

//Faça um programa em Java para ler um número arbitrário de strings 
//(frases compostas por palavras e espaços em branco) da entrada padrão. 
//A entrada não deve usar acentuação nas palavras! A leitura deve ser encerrada
//ao ler a string "FIM" (todas as letras maiúsculas). Na sequência, conte e imprima
//o número de vogais contidas nas strings recebidas da entrada padrão.
//
//Dica 1: seu programa deve contar vogais em maiúsculo e minúsculo.
//Dica 2: comparação de caracteres é diferente da comparação de string (usar método equals).
//Dica 3: a saída do seu programa deve obedecer a formatação mostrada abaixo. 

public class ContaVogais {
    public static void main(String args[]){   
        Scanner entrada = new Scanner(System.in);
        
        int vogalA =0, vogalE =0, vogalI =0, vogalO =0, vogalU =0;        
        String frase = new String();
        Character letraFrase;
        
        do{
            frase = entrada.nextLine();    
            for(int i=0; i<frase.length(); i++){
                letraFrase = (frase.toLowerCase()).charAt(i);
                if(letraFrase.equals('a')){
                    vogalA++;
                }else if(letraFrase.equals('e')){
                    vogalE++;
                }else if(letraFrase.equals('i')){
                    vogalI++;
                }else if(letraFrase.equals('o')){
                    vogalO++;
                }else if(letraFrase.equals('u')){
                    vogalU++;
                }
            }
        }while(!frase.equals("FIM"));
        
        System.out.printf("a=%d \ne=%d \ni=%d \no=%d \nu=%d",vogalA,vogalE,vogalI,vogalO,vogalU);
    }
}