package main;

import java.util.Scanner;

public class NumNegativo {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        
        switch (num) {
            case 1:
                System.out.println(num + " - Caixa");
                break;
            case 2:
                System.out.println(num + " - Financiamento");
                break;
            case 3:
                System.out.println(num + " - Empréstimo");
                break;
            case 4:
                System.out.println(num + " - Produtor Rural");
                break;
            case 5:
                System.out.println(num + " - Abertura de Contas");
                break;
            case 6:
                System.out.println(num + " - Falar com o Gerente");
                break;
            default:
                System.out.println(num + " - Opção Inexistente");
        }
    }
}