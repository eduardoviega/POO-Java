package questao2;

import java.util.Scanner;

//Para padronizar o cálculo da área de figuras geométricas (quadrado, retângulo, triângulo, etc) foi definida a interface Java abaixo. 
//Toda classe que define uma figura geométrica deve implementar essa interface.
//
//public interface AreaCalculavel {
//    public double calcularArea();
//}
//
//Implemente as classes Quadrado, Retangulo e Triangulo para atender o caso de teste abaixo. 
//Use como referências as seguintes expressões para calcular a área da figura:
//
//Quadrado: lado * lado;
//Retângulo: base * altura;
//Triângulo: (base * altura) / 2;
//Observação: não é necessário definir a interface AreaCalculavel na resposta, ela já está disponível no código-fonte da questão.

public class Main {
    public static void main(String args[]){
//      Teste 1:
        Scanner scan = new Scanner(System.in);
        double lado, base, altura;

        lado = scan.nextDouble();
        AreaCalculavel q = new Quadrado(lado);

        lado = scan.nextDouble();
        altura = scan.nextDouble();
        AreaCalculavel r = new Retangulo(lado,altura);

        base = scan.nextDouble();
        altura = scan.nextDouble();
        AreaCalculavel t = new Triangulo(base,altura);

        System.out.println(q.calcularArea());
        System.out.println(r.calcularArea());
        System.out.println(t.calcularArea());
    
//      Teste 2:
//        Scanner scan = new Scanner(System.in);
//        double lado, base, altura;
//
//        lado = scan.nextDouble();
//        AreaCalculavel q = new Quadrado(lado);
//
//        lado = scan.nextDouble();
//        altura = scan.nextDouble();
//        AreaCalculavel r = new Retangulo(lado,altura);
//
//        base = scan.nextDouble();
//        altura = scan.nextDouble();
//        AreaCalculavel t = new Triangulo(base,altura);
//
//        System.out.println(q.calcularArea());
//        System.out.println(r.calcularArea());
//        System.out.println(t.calcularArea());
    
//      Teste 3:
//        Scanner scan = new Scanner(System.in);
//        double lado, base, altura;
//
//        lado = scan.nextDouble();
//        AreaCalculavel q = new Quadrado(lado);
//
//        lado = scan.nextDouble();
//        altura = scan.nextDouble();
//        AreaCalculavel r = new Retangulo(lado,altura);
//
//        base = scan.nextDouble();
//        altura = scan.nextDouble();
//        AreaCalculavel t = new Triangulo(base,altura);
//
//        System.out.println(q.calcularArea());
//        System.out.println(r.calcularArea());
//        System.out.println(t.calcularArea());
    }
}