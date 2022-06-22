package questao3;

import java.util.Scanner;

//Implemente uma função static getTemperatura que recebe um vetor de temperaturas (double) e um índice (int) que 
//representa uma pesquisa sobre este vetor. Na sequência, a função deve retornar uma string informando a temperatura 
//referente ao índice informado ou uma mensagem de erro, caso o índice recebido esteja fora dos limites do vetor.
//A mensagem de erro deve ser elaborada acessando o método getMessage() do objeto que representa a exceção.

public class main {
    static String getTemperatura(double
        temperaturas[],int indice){
        try{
            return"Temperatura["+indice+"]: "+temperaturas[indice];
        }catch(Exception e){
            return"Erro! Dados da exceção: "+e.getMessage();
        }
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double temperaturas[] = {26.5, 25.3, 22, 20.5, 18, 15, 13.3};
        int indice = entrada.nextInt();
        System.out.println(getTemperatura(temperaturas, indice));
    }
}