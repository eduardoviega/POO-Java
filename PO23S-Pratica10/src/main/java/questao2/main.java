package questao2;
import java.util.Scanner;
import java.util.InputMismatchException;
/*
Implemente um programa em Java que tente ler 10 números de ponto flutuante da entrada padrão, 
sendo que as entradas podem não ser válidas (caracteres, símbolos, etc).
O programa deve verificar quais entradas são válidas e calcular a média aritmética considerando 10 
elementos, ou seja, os elementos inválidos devem ser considerados com valor zero no cálculo da média.

Por fim, imprimir na saída padrão o resultado. A saída deve conter a seguinte mensagem: 
"Entradas aceitas: X, média: Y"
em que X é a quantidade de números lidos válidos e Y é a média aritmética.

Input                   Result
1 1 1 1 1 1 a a a a     Entradas aceitas: 6, média: 0.60
a a a a a 1 1 1 1 1     Entradas aceitas: 5, média: 0.50
a b c d e f g h i j     Entradas aceitas: 0, média: 0.00
1 2 3 4 5 6 7 8 9 10    Entradas aceitas: 10, média: 5.50
0 0 0 0 0 0 0 0 0 0     Entradas aceitas: 10, média: 0.00
*/


public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int aceitas = 10;
        float media = 0;
        float inserido[] = new float[10];
        for(int i=0; i<10; i++){
            try{
                inserido[i] = entrada.nextFloat();
            }catch(InputMismatchException e){
                aceitas--;
                entrada.next();
            }
        }
        for(int i=0; i<10; i++){
            media += inserido[i];
        }
        media /= 10;
        System.out.println("Aceitas:"+aceitas);
        System.out.println("Média:"+media);
    }
}
