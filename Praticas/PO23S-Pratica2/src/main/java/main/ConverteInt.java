package main;

import java.util.Locale;
import java.util.Scanner;

public class ConverteInt {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        Locale.setDefault(Locale.ENGLISH);
        
        double valor;
        valor = entrada.nextDouble();

        int valorInt = (int) valor;

        System.out.println(valorInt);
    }
}
