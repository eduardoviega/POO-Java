package main;

public class CalculaMaior {
    
    public static double maior(double num1, double num2, double num3, double num4){
        double numMaior;
        if(num1>num2 && num1>num3 && num1>num4){
            numMaior = num1;
        }else if(num2>num3 && num2>num4){
            numMaior = num2;
        }else if(num3>num4){
            numMaior = num3;
        }else{
            numMaior = num4;
        }
        return numMaior;
    }
    
    public static void main(String args[]){
        double n = maior(1, 2, 3, 4);
        System.out.printf("%.1f", n);
    }
}