package questao1;

import java.util.Scanner;

/*
Implemente um programa em Java que lê da entrada padrão um número inteiro, 
multiplica por dois, e escreve o resultado na saída padrão.
No entanto, use o tratamento de exceções do Java para validar a entrada. 
Caso a entrada não seja válida, imprima no console a mensagem: 
"Entrada Incorreta: informe somente inteiros."

Input	Result
2       4
dois    Entrada Incorreta: informe somente inteiros.
2.2     Entrada Incorreta: informe somente inteiros.
2,2     Entrada Incorreta: informe somente inteiros.
10      20
*/

public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        try{
            int num = entrada.nextInt();
            num *= 2;
            System.out.println(num);            
        }catch(Exception e){
            System.out.println("Entrada Incorreta: informe somente inteiros.");
        }
    }
}
