package main;


import java.util.Scanner;

public class NewClass {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        
        int valores[] = {};
        int i = 0;
        int num;
        int rate1 = 0;
        int rate2 = 0;
        int rate3 = 0;
        int rate4 = 0;
        
        do{
            num = entrada.nextInt();
            if(num>=0){
                valores[i] = num;    
            }
            i++;
        }while(num >= 0);
        
        for(int j=0; j>i; j++){
            if(valores[i]>=0 && valores[i]<=25){
                rate1++;
            }
            else if(valores[i]>=26 && valores[i]<=50){
                rate2++;
            }
            else if(valores[i]>=51 && valores[i]<=75){
                rate3++;
            }
            else if(valores[i]>=76 && valores[i]<=100){
                rate4++;
            }
        }
        
        System.out.println("[0,25] = " + rate1);
        System.out.println("[26,50] = " + rate2);
        System.out.println("[51,75] = " + rate3);
        System.out.println("[76,100] = " + rate4);
        
    }
}