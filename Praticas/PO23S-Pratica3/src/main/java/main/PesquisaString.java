package main;

import java.util.Scanner;

//Faça um programa em Java que leia dois parâmetros da entrada padrão, 
//sendo o primeiro um texto qualquer e o segundo uma palavra de pesquisa. 
//O programa deve contar quantas vezes a palavra de pesquisa aparece no 
//texto e imprimir na saída padrão. A saída deve obedecer a seguinte formatação:
//
//Considerando texto = "Meu primeiro programa em Java imprime Java." e 
//pesquisa = "Java", o programa deve imprimir:
//Java=2

public class PesquisaString {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        
        String texto = entrada.nextLine();
        String pesquisa = entrada.nextLine();
        int contaAparece = 0;
        int IndicePesquisa = 0;
        
        while(IndicePesquisa != -1){
            if(texto.indexOf(pesquisa, IndicePesquisa) != -1){
                IndicePesquisa = texto.indexOf(pesquisa, IndicePesquisa);
                IndicePesquisa = texto.indexOf(pesquisa, IndicePesquisa+1);
                contaAparece++;
            }else{
                break;
            }
        }
        System.out.println(pesquisa+"="+contaAparece);
    }
}